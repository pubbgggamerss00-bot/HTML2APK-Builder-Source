package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lq1 {
    public static void a(String str, long j6) {
        if (j6 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j6 + ") must be >= 0");
    }

    public static void b(boolean z6) {
        if (!z6) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
