package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gg {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5032a = "0123456789abcdef".toCharArray();

    public static long a(double d7, DisplayMetrics displayMetrics) {
        return Math.round(d7 / displayMetrics.density);
    }

    public static byte[] b(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i6 = 0; i6 < length; i6 += 2) {
            bArr[i6 / 2] = (byte) (Character.digit(str.charAt(i6 + 1), 16) + (Character.digit(str.charAt(i6), 16) << 4));
        }
        return bArr;
    }
}
