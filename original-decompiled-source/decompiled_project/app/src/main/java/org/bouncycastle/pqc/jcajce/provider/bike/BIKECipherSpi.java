package org.bouncycastle.pqc.jcajce.provider.bike;

import b.o;
import e.e;
import i8.n;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMExtractor;
import org.bouncycastle.pqc.crypto.bike.BIKEKEMGenerator;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
class BIKECipherSpi extends CipherSpi {
    private final String algorithmName;
    private BIKEParameters bikeParameters;
    private AlgorithmParameters engineParams;
    private BIKEKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private BCBIKEPrivateKey unwrapKey;
    private BCBIKEPublicKey wrapKey;

    public static class BIKE128 extends BIKECipherSpi {
        public BIKE128() {
            super(BIKEParameters.bike128);
        }
    }

    public static class BIKE192 extends BIKECipherSpi {
        public BIKE192() {
            super(BIKEParameters.bike192);
        }
    }

    public static class BIKE256 extends BIKECipherSpi {
        public BIKE256() {
            super(BIKEParameters.bike256);
        }
    }

    public static class Base extends BIKECipherSpi {
        public Base() throws NoSuchAlgorithmException {
            super("BIKE");
        }
    }

    public BIKECipherSpi(String str) throws NoSuchAlgorithmException {
        this.bikeParameters = null;
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e10) {
                throw Exceptions.illegalStateException(e10.toString(), e10);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(m3.a.a("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(n.d("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i10) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i10 != 3) {
            throw new InvalidKeyException("only SECRET_KEY supported");
        }
        try {
            BIKEKEMExtractor bIKEKEMExtractor = new BIKEKEMExtractor(this.unwrapKey.getKeyParams());
            byte[] bArrExtractSecret = bIKEKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, bIKEKEMExtractor.getEncapsulationLength()));
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            KeyParameter keyParameter = new KeyParameter(bArrExtractSecret);
            Arrays.clear(bArrExtractSecret);
            wrapper.init(false, keyParameter);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bIKEKEMExtractor.getEncapsulationLength(), bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(wrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
            Arrays.clear(keyParameter.getKey());
            return secretKeySpec;
        } catch (IllegalArgumentException e10) {
            throw new NoSuchAlgorithmException(n.c(e10, new StringBuilder("unable to extract KTS secret: ")));
        } catch (InvalidCipherTextException e11) {
            throw new InvalidKeyException("unable to extract KTS secret: " + e11.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws DestroyFailedException, IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            wrapper.init(true, new KeyParameter(secretWithEncapsulationGenerateEncapsulated.getSecret()));
            byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
            secretWithEncapsulationGenerateEncapsulated.destroy();
            byte[] encoded = key.getEncoded();
            byte[] bArrConcatenate = Arrays.concatenate(encapsulation, wrapper.wrap(encoded, 0, encoded.length));
            Arrays.clear(encoded);
            return bArrConcatenate;
        } catch (IllegalArgumentException e10) {
            throw new IllegalBlockSizeException(n.c(e10, new StringBuilder("unable to generate KTS secret: ")));
        } catch (DestroyFailedException e11) {
            throw new IllegalBlockSizeException("unable to destroy interim values: " + e11.getMessage());
        }
    }

    public BIKECipherSpi(BIKEParameters bIKEParameters) {
        this.bikeParameters = bIKEParameters;
        this.algorithmName = Strings.toUpperCase(bIKEParameters.getName());
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw Exceptions.illegalArgumentException(e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(o.a(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i10 == 3) {
            if (!(key instanceof BCBIKEPublicKey)) {
                throw new InvalidKeyException(o.a(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCBIKEPublicKey) key;
            this.kemGen = new BIKEKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else {
            if (i10 != 4) {
                throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
            }
            if (!(key instanceof BCBIKEPrivateKey)) {
                throw new InvalidKeyException(o.a(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCBIKEPrivateKey) key;
        }
        BIKEParameters bIKEParameters = this.bikeParameters;
        if (bIKEParameters != null) {
            String upperCase = Strings.toUpperCase(bIKEParameters.getName());
            if (upperCase.equals(key.getAlgorithm())) {
                return;
            }
            StringBuilder sbA = e.a("cipher locked to ", upperCase, " ");
            sbA.append(key.getAlgorithm());
            throw new InvalidKeyException(sbA.toString());
        }
    }
}
