package org.bouncycastle.openssl.bc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m3.a;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
class PEMUtilities {
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;

    static {
        HashMap map = new HashMap();
        KEYSIZES = map;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet2.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_CBC;
        hashSet2.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_CBC;
        hashSet2.add(aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_CBC;
        hashSet2.add(aSN1ObjectIdentifier4);
        map.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(192));
        map.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(128));
        map.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(192));
        map.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(256));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, Integers.valueOf(40));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, Integers.valueOf(192));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, Integers.valueOf(40));
    }

    public static byte[] crypt(boolean z10, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws PEMException {
        String str2;
        byte[] bArr3;
        KeyParameter key;
        BlockCipher blockCipherNewInstance;
        byte[] bArr4 = bArr2;
        PKCS7Padding pKCS7Padding = new PKCS7Padding();
        PKCS7Padding pKCS7Padding2 = null;
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            pKCS7Padding = null;
        } else {
            str2 = "CBC";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            str2 = "ECB";
            bArr3 = null;
        } else {
            bArr3 = bArr4;
        }
        if (str.endsWith("-OFB")) {
            str2 = "OFB";
        } else {
            pKCS7Padding2 = pKCS7Padding;
        }
        if (str.startsWith("DES-EDE")) {
            key = getKey(cArr, 24, bArr4, !str.startsWith("DES-EDE3"));
            blockCipherNewInstance = new DESedeEngine();
        } else if (str.startsWith("DES-")) {
            key = getKey(cArr, 8, bArr4);
            blockCipherNewInstance = new DESEngine();
        } else if (str.startsWith("BF-")) {
            key = getKey(cArr, 16, bArr4);
            blockCipherNewInstance = new BlowfishEngine();
        } else {
            int i10 = 128;
            if (str.startsWith("RC2-")) {
                if (str.startsWith("RC2-40-")) {
                    i10 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i10 = 64;
                }
                RC2Parameters rC2Parameters = new RC2Parameters(getKey(cArr, i10 / 8, bArr4).getKey(), i10);
                blockCipherNewInstance = new RC2Engine();
                key = rC2Parameters;
            } else {
                if (!str.startsWith("AES-")) {
                    throw new EncryptionException("unknown encryption with private key: ".concat(str));
                }
                if (bArr4.length > 8) {
                    byte[] bArr5 = new byte[8];
                    System.arraycopy(bArr4, 0, bArr5, 0, 8);
                    bArr4 = bArr5;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i10 = 192;
                    } else {
                        if (!str.startsWith("AES-256-")) {
                            throw new EncryptionException("unknown AES encryption with private key: ".concat(str));
                        }
                        i10 = 256;
                    }
                }
                key = getKey(cArr, i10 / 8, bArr4);
                blockCipherNewInstance = AESEngine.newInstance();
            }
        }
        if (str2.equals("CBC")) {
            blockCipherNewInstance = CBCBlockCipher.newInstance(blockCipherNewInstance);
        } else if (str2.equals("CFB")) {
            blockCipherNewInstance = CFBBlockCipher.newInstance(blockCipherNewInstance, blockCipherNewInstance.getBlockSize() * 8);
        } else if (str2.equals("OFB")) {
            blockCipherNewInstance = new OFBBlockCipher(blockCipherNewInstance, blockCipherNewInstance.getBlockSize() * 8);
        }
        try {
            BufferedBlockCipher bufferedBlockCipher = pKCS7Padding2 == null ? new BufferedBlockCipher(blockCipherNewInstance) : new PaddedBufferedBlockCipher(blockCipherNewInstance, pKCS7Padding2);
            if (bArr3 == null) {
                bufferedBlockCipher.init(z10, key);
            } else {
                bufferedBlockCipher.init(z10, new ParametersWithIV(key, bArr3));
            }
            int outputSize = bufferedBlockCipher.getOutputSize(bArr.length);
            BufferedBlockCipher bufferedBlockCipher2 = bufferedBlockCipher;
            byte[] bArr6 = new byte[outputSize];
            int iProcessBytes = bufferedBlockCipher2.processBytes(bArr, 0, bArr.length, bArr6, 0);
            int iDoFinal = iProcessBytes + bufferedBlockCipher2.doFinal(bArr6, iProcessBytes);
            if (iDoFinal == outputSize) {
                return bArr6;
            }
            byte[] bArr7 = new byte[iDoFinal];
            System.arraycopy(bArr6, 0, bArr7, 0, iDoFinal);
            return bArr7;
        } catch (Exception e10) {
            throw new EncryptionException("exception using cipher - please check password and data.", e10);
        }
    }

    public static KeyParameter generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i10) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        pKCS5S2ParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, i10);
        return (KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(getKeySize(str));
    }

    private static KeyParameter getKey(char[] cArr, int i10, byte[] bArr) throws PEMException {
        return getKey(cArr, i10, bArr, false);
    }

    public static int getKeySize(String str) {
        Map map = KEYSIZES;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        throw new IllegalStateException(a.a("no key size for algorithm: ", str));
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.getId().startsWith(PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
    }

    public static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_1.contains(aSN1ObjectIdentifier);
    }

    public static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
    }

    private static KeyParameter getKey(char[] cArr, int i10, byte[] bArr, boolean z10) throws PEMException {
        OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, 1);
        KeyParameter keyParameter = (KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i10 * 8);
        if (!z10 || keyParameter.getKey().length != 24) {
            return keyParameter;
        }
        byte[] key = keyParameter.getKey();
        System.arraycopy(key, 0, key, 16, 8);
        return new KeyParameter(key);
    }
}
