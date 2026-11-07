package com.htmltoapk.template;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConfigCrypto {
    private static final String AES_MODE = "AES/GCM/NoPadding";
    private static final int GCM_TAG_BITS = 128;
    public static final ConfigCrypto INSTANCE = new ConfigCrypto();
    private static final byte[] K1 = {78, -109, -25, -11, -73, -33, -118, -118, 57, -95, -14, -32, 69, -1, 5, 7, 16, -105, 63, -50, -81, -9, 92, 24, -116, -115, -61, -15, -47, 10, 59, 124};
    private static final byte[] K2 = {-41, -6, -104, -111, 106, 121, 100, -127, -59, -76, -109, 56, 20, 109, 110, 102, 2, 101, 113, 106, 57, Byte.MAX_VALUE, -84, 72, 49, 91, -35, 34, 26, -48, 63, 29};
    private static final byte[] K3 = {93, -76, 20, 32, -4, -86, -91, 80, -121, -105, 4, -34, -105, -55, -24, -45, -5, 90, 74, -104, 10, -47, -92, -108, 13, 93, -122, 104, 22, 100, 52, -52};
    private static final int KEY_LENGTH = 32;
    private static final int NONCE_LENGTH = 12;

    private ConfigCrypto() {
    }

    private final byte[] deriveKey() {
        byte[] bArr = new byte[KEY_LENGTH];
        for (int i6 = 0; i6 < KEY_LENGTH; i6++) {
            bArr[i6] = (byte) ((K1[i6] ^ K2[i6]) ^ K3[i6]);
        }
        return bArr;
    }

    public final byte[] decryptConfig(InputStream inputStream) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        kotlin.jvm.internal.j.e("input", inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            f5.b.f(inputStream, byteArrayOutputStream, 8192);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.d("toByteArray(...)", byteArray);
            inputStream.close();
            if (byteArray.length < 13) {
                throw new IllegalArgumentException("Encrypted config is too short");
            }
            e5.i.f(12, byteArray.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, 0, 12);
            kotlin.jvm.internal.j.d("copyOfRange(...)", bArrCopyOfRange);
            int length = byteArray.length;
            e5.i.f(length, byteArray.length);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(byteArray, 12, length);
            kotlin.jvm.internal.j.d("copyOfRange(...)", bArrCopyOfRange2);
            Cipher cipher = Cipher.getInstance(AES_MODE);
            cipher.init(2, new SecretKeySpec(deriveKey(), "AES"), new GCMParameterSpec(GCM_TAG_BITS, bArrCopyOfRange));
            byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
            kotlin.jvm.internal.j.d("doFinal(...)", bArrDoFinal);
            return bArrDoFinal;
        } finally {
        }
    }

    public final byte[] encryptConfig(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        kotlin.jvm.internal.j.e("plainText", bArr);
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        Cipher cipher = Cipher.getInstance(AES_MODE);
        cipher.init(1, new SecretKeySpec(deriveKey(), "AES"), new GCMParameterSpec(GCM_TAG_BITS, bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        kotlin.jvm.internal.j.b(bArrDoFinal);
        int length = bArrDoFinal.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, 12 + length);
        System.arraycopy(bArrDoFinal, 0, bArrCopyOf, 12, length);
        kotlin.jvm.internal.j.b(bArrCopyOf);
        return bArrCopyOf;
    }
}
