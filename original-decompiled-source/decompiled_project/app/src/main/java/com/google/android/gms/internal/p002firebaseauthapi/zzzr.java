package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzzr {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 / 16));
            sb.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                int iDigit = Character.digit(str.charAt(i11), 16);
                int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i10] = (byte) ((iDigit << 4) + iDigit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
