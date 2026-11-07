package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import k4.i;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public class BaseMac extends MacSpi implements PBE {
    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int scheme;

    public BaseMac(Mac mac) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = mac;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() throws IllegalStateException, DataLengthException {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i10;
        CipherParameters cipherParametersMakePBEMacParameters;
        if (key == null) {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof PKCS12Key) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i11 = 256;
                    if (this.macEngine.getAlgorithmName().startsWith("GOST")) {
                        i10 = 6;
                    } else {
                        Mac mac = this.macEngine;
                        if (!(mac instanceof HMac) || mac.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA1)) {
                            i10 = 1;
                        } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                            i10 = 7;
                            i11 = BERTags.FLAGS;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                            i10 = 4;
                        } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                            i10 = 8;
                            i11 = 384;
                        } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                            i10 = 9;
                            i11 = 512;
                        } else {
                            if (!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                            }
                            i10 = 2;
                        }
                        i11 = 160;
                    }
                    cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i10, i11, pBEParameterSpec);
                } catch (Exception unused) {
                    throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (Exception unused2) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                cipherParametersMakePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        }
        KeyParameter keyParameter = cipherParametersMakePBEMacParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParametersMakePBEMacParameters).getParameters() : (KeyParameter) cipherParametersMakePBEMacParameters;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            cipherParametersMakePBEMacParameters = new ParametersWithIV(keyParameter, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new ParametersWithIV(new RC2Parameters(keyParameter.getKey(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            cipherParametersMakePBEMacParameters = new SkeinParameters.Builder(copyMap(((SkeinParameterSpec) algorithmParameterSpec).getParameters())).setKey(keyParameter.getKey()).build();
        } else if (algorithmParameterSpec == null) {
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        } else if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
            cipherParametersMakePBEMacParameters = GcmSpecUtil.extractAeadParameters(keyParameter, algorithmParameterSpec);
        } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        try {
            this.macEngine.init(cipherParametersMakePBEMacParameters);
        } catch (Exception e10) {
            throw new InvalidAlgorithmParameterException(i.a(e10, new StringBuilder("cannot initialize MAC: ")));
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b10) throws IllegalStateException {
        this.macEngine.update(b10);
    }

    public BaseMac(Mac mac, int i10, int i11, int i12) {
        this.macEngine = mac;
        this.scheme = i10;
        this.pbeHash = i11;
        this.keySize = i12;
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        this.macEngine.update(bArr, i10, i11);
    }
}
