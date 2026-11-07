package com.basitce.htmltoapk.data.apkgenerator;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.r;
import org.jf.dexlib2.analysis.RegisterType;
import qg.m;

/* loaded from: classes.dex */
public final class ConfigCrypto {
    private static final String AES_MODE = "AES/GCM/NoPadding";
    private static final int GCM_TAG_BITS = 128;
    private static final int KEY_LENGTH = 32;
    private static final int NONCE_LENGTH = 12;
    public static final ConfigCrypto INSTANCE = new ConfigCrypto();
    private static final byte[] K1 = {78, -109, -25, -11, -73, -33, -118, -118, 57, -95, -14, -32, 69, -1, 5, 7, RegisterType.UNINIT_REF, -105, 63, -50, -81, -9, 92, 24, -116, -115, -61, -15, -47, 10, 59, 124};
    private static final byte[] K2 = {-41, -6, -104, -111, 106, 121, 100, -127, -59, -76, -109, 56, 20, 109, 110, 102, 2, 101, 113, 106, 57, Byte.MAX_VALUE, -84, 72, 49, 91, -35, 34, 26, -48, 63, 29};
    private static final byte[] K3 = {93, -76, 20, 32, -4, -86, -91, 80, -121, -105, 4, -34, -105, -55, -24, -45, -5, 90, 74, -104, 10, -47, -92, -108, RegisterType.LONG_HI, 93, -122, 104, 22, 100, 52, -52};
    public static final int $stable = 8;

    private ConfigCrypto() {
    }

    private final byte[] deriveKey() {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = (byte) ((K1[i10] ^ K2[i10]) ^ K3[i10]);
        }
        return bArr;
    }

    public final byte[] decryptConfig(byte[] encrypted) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        r.e(encrypted, "encrypted");
        if (encrypted.length < 28) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byte[] bArrJ = m.j(encrypted, 0, 12);
        byte[] bArrJ2 = m.j(encrypted, 12, encrypted.length);
        Cipher cipher = Cipher.getInstance(AES_MODE);
        cipher.init(2, new SecretKeySpec(deriveKey(), "AES"), new GCMParameterSpec(128, bArrJ));
        byte[] bArrDoFinal = cipher.doFinal(bArrJ2);
        r.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final byte[] encryptConfig(byte[] plainText) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        r.e(plainText, "plainText");
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance(AES_MODE);
        cipher.init(1, new SecretKeySpec(deriveKey(), "AES"), new GCMParameterSpec(128, bArr));
        byte[] bArrDoFinal = cipher.doFinal(plainText);
        r.b(bArrDoFinal);
        int length = bArrDoFinal.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12 + length);
        System.arraycopy(bArrDoFinal, 0, bArrCopyOf, 12, length);
        r.b(bArrCopyOf);
        return bArrCopyOf;
    }
}
