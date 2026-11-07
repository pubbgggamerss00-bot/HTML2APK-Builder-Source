package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: classes.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        private static byte[] convertPassword(int i10, PBEKeySpec pBEKeySpec) {
            return i10 == 2 ? PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword()) : (i10 == 5 || i10 == 4) ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static PBEParametersGenerator makePBEGenerator(int i10, int i11) {
            if (i10 == 0 || i10 == 4) {
                if (i11 == 0) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
                }
                if (i11 == 1) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                if (i11 == 5) {
                    return new PKCS5S1ParametersGenerator(new MD2Digest());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            if (i10 != 1 && i10 != 5) {
                if (i10 != 2) {
                    return new OpenSSLPBEParametersGenerator();
                }
                switch (i11) {
                    case 0:
                        return new PKCS12ParametersGenerator(DigestFactory.createMD5PRF());
                    case 1:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA1PRF());
                    case 2:
                        return new PKCS12ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                    case 3:
                        return new PKCS12ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                    case 4:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA256PRF());
                    case 5:
                        return new PKCS12ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                    case 6:
                        return new PKCS12ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                    case 7:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA224PRF());
                    case 8:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA384PRF());
                    case 9:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA512PRF());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
            switch (i11) {
                case 0:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createMD5PRF());
                case 1:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1PRF());
                case 2:
                    return new PKCS5S2ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                case 3:
                    return new PKCS5S2ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                case 4:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256PRF());
                case 5:
                    return new PKCS5S2ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                case 6:
                    return new PKCS5S2ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                case 7:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224PRF());
                case 8:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384PRF());
                case 9:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512PRF());
                case 10:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_224PRF());
                case 11:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_256PRF());
                case 12:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_384PRF());
                case 13:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_512PRF());
                case 14:
                    return new PKCS5S2ParametersGenerator(new SM3Digest(CryptoServicePurpose.PRF));
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i10, int i11, int i12, PBEParameterSpec pBEParameterSpec) {
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i10, i11);
            byte[] encoded = secretKey.getEncoded();
            pBEParametersGeneratorMakePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedMacParameters = pBEParametersGeneratorMakePBEGenerator.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != encoded.length; i13++) {
                encoded[i13] = 0;
            }
            return cipherParametersGenerateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12, int i13) {
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i10, i11);
            byte[] bArrConvertPassword = convertPassword(i10, pBEKeySpec);
            pBEParametersGeneratorMakePBEGenerator.init(bArrConvertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = i13 != 0 ? pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i12, i13) : pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i12);
            for (int i14 = 0; i14 != bArrConvertPassword.length; i14++) {
                bArrConvertPassword[i14] = 0;
            }
            return cipherParametersGenerateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12) {
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i10, i11);
            byte[] bArrConvertPassword = convertPassword(i10, pBEKeySpec);
            pBEParametersGeneratorMakePBEGenerator.init(bArrConvertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedMacParameters = pBEParametersGeneratorMakePBEGenerator.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != bArrConvertPassword.length; i13++) {
                bArrConvertPassword[i13] = 0;
            }
            return cipherParametersGenerateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            pBEParametersGeneratorMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = bCPBEKey.getIvSize() != 0 ? pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (cipherParametersGenerateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) cipherParametersGenerateDerivedParameters).getParameters()).getKey());
                    return cipherParametersGenerateDerivedParameters;
                }
                DESParameters.setOddParity(((KeyParameter) cipherParametersGenerateDerivedParameters).getKey());
            }
            return cipherParametersGenerateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            pBEParametersGeneratorMakePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return pBEParametersGeneratorMakePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static CipherParameters makePBEParameters(byte[] bArr, int i10, int i11, int i12, int i13, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i10, i11);
            pBEParametersGeneratorMakePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = i13 != 0 ? pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i12, i13) : pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i12);
            if (str.startsWith("DES")) {
                if (cipherParametersGenerateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) cipherParametersGenerateDerivedParameters).getParameters()).getKey());
                    return cipherParametersGenerateDerivedParameters;
                }
                DESParameters.setOddParity(((KeyParameter) cipherParametersGenerateDerivedParameters).getKey());
            }
            return cipherParametersGenerateDerivedParameters;
        }
    }
}
