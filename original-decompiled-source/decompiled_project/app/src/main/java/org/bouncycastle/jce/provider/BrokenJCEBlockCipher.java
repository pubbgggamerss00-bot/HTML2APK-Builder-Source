package org.bouncycastle.jce.provider;

import i8.n;
import j2.y;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BrokenPBE;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
    }

    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException, BadPaddingException, IllegalBlockSizeException {
        byte[] bArr3;
        int i13;
        int iProcessBytes;
        if (i11 != 0) {
            bArr3 = bArr2;
            i13 = i12;
            iProcessBytes = this.cipher.processBytes(bArr, i10, i11, bArr3, i13);
        } else {
            bArr3 = bArr2;
            i13 = i12;
            iProcessBytes = 0;
        }
        try {
            return iProcessBytes + this.cipher.doFinal(bArr3, i13 + iProcessBytes);
        } catch (DataLengthException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (InvalidCipherTextException e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.cipher.getBlockSize();
    }

    public byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i10) {
        return this.cipher.getOutputSize(i10);
    }

    public AlgorithmParameters engineGetParameters() throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.getIV());
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidParameterSpecException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i11 == clsArr.length) {
                    break;
                }
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i11]);
                    break;
                } catch (Exception unused) {
                    i11++;
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    public void engineSetMode(String str) throws NumberFormatException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals("CBC")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(this.cipher.getUnderlyingCipher()));
            return;
        }
        if (upperCase.startsWith("OFB")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() == 3) {
                this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
                return;
            } else {
                this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                return;
            }
        }
        if (!upperCase.startsWith("CFB")) {
            throw new IllegalArgumentException(m3.a.a("can't support mode ", str));
        }
        this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
        if (upperCase.length() == 3) {
            this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
        } else {
            this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.cipher = new BufferedBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING") || upperCase.equals("ISO10126PADDING")) {
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else {
            if (!upperCase.equals("WITHCTS")) {
                throw new NoSuchPaddingException(n.d("Padding ", str, " unknown."));
            }
            this.cipher = new CTSBlockCipher(this.cipher.getUnderlyingCipher());
        }
    }

    public Key engineUnwrap(byte[] bArr, String str, int i10) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i10 == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i10 == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(y.a(i10, "Unknown key type "));
            } catch (NoSuchAlgorithmException e10) {
                throw new InvalidKeyException("Unknown key type " + e10.getMessage());
            } catch (NoSuchProviderException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (InvalidKeySpecException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            }
        } catch (BadPaddingException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (IllegalBlockSizeException e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        return this.cipher.processBytes(bArr, i10, i11, bArr2, i12);
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher, int i10, int i11, int i12, int i13) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        this.pbeType = i10;
        this.pbeHash = i11;
        this.pbeKeySize = i12;
        this.pbeIvSize = i13;
    }

    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[engineGetOutputSize(i11)];
        int iProcessBytes = i11 != 0 ? this.cipher.processBytes(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.cipher.doFinal(bArr2, iProcessBytes);
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (DataLengthException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (InvalidCipherTextException e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException, IllegalArgumentException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i11);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        this.cipher.processBytes(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }

    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
        CipherParameters rC5Parameters;
        CipherParameters cipherParameters;
        ParametersWithIV parametersWithIV;
        CipherParameters keyParameter;
        if (key instanceof BCPBEKey) {
            CipherParameters cipherParametersMakePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.getUnderlyingCipher().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            cipherParameters = cipherParametersMakePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (ParametersWithIV) cipherParametersMakePBEParameters;
                cipherParameters = cipherParametersMakePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                keyParameter = new KeyParameter(key.getEncoded());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                if (this.ivLength != 0) {
                    ParametersWithIV parametersWithIV2 = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.ivParam = parametersWithIV2;
                    keyParameter = parametersWithIV2;
                } else {
                    keyParameter = new KeyParameter(key.getEncoded());
                }
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC5Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                    parametersWithIV = new ParametersWithIV(rC5Parameters, rC2ParameterSpec.getIV());
                    this.ivParam = parametersWithIV;
                    cipherParameters = parametersWithIV;
                }
                cipherParameters = rC5Parameters;
            } else {
                if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                if (rC5ParameterSpec.getWordSize() != 32) {
                    throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                }
                if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                    parametersWithIV = new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                    this.ivParam = parametersWithIV;
                    cipherParameters = parametersWithIV;
                }
                cipherParameters = rC5Parameters;
            }
            cipherParameters = keyParameter;
        }
        CipherParameters cipherParameters2 = cipherParameters;
        if (this.ivLength != 0) {
            boolean z10 = cipherParameters instanceof ParametersWithIV;
            cipherParameters2 = cipherParameters;
            if (!z10) {
                if (secureRandom == null) {
                    secureRandom = CryptoServicesRegistrar.getSecureRandom();
                }
                if (i10 != 1 && i10 != 3) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
                byte[] bArr = new byte[this.ivLength];
                secureRandom.nextBytes(bArr);
                ParametersWithIV parametersWithIV3 = new ParametersWithIV(cipherParameters, bArr);
                this.ivParam = parametersWithIV3;
                cipherParameters2 = parametersWithIV3;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalArgumentException(y.a(i10, "unknown opmode: "));
                    }
                }
            }
            this.cipher.init(false, cipherParameters2);
            return;
        }
        this.cipher.init(true, cipherParameters2);
    }
}
