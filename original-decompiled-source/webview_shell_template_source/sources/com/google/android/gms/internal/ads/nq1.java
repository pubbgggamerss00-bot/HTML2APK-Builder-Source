package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7491a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < 10; i6++) {
            bArr[i6 + 48] = (byte) i6;
        }
        for (int i7 = 0; i7 < 26; i7++) {
            byte b7 = (byte) (i7 + 10);
            bArr[i7 + 65] = b7;
            bArr[i7 + 97] = b7;
        }
        f7491a = bArr;
    }
}
