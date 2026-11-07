package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zy1 {
    static {
        Charset.forName("UTF-8");
    }

    public static final r32 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i6] = (byte) cCharAt;
        }
        return r32.a(bArr);
    }

    public static final r32 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new yy1("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i6] = (byte) cCharAt;
        }
        return r32.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            if (bArr2[i6] != bArr[i6]) {
                return false;
            }
        }
        return true;
    }
}
