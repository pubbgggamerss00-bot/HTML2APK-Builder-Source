package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yi2 extends zi2 {
    public static void c(ArrayList arrayList, long[] jArr) {
        long j6 = 0;
        for (int i6 = 0; i6 < 2; i6++) {
            j6 += jArr[i6];
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            yn1 yn1Var = (yn1) arrayList.get(i7);
            if (yn1Var != null) {
                yn1Var.q(new xi2(j6, jArr[i7]));
            }
        }
    }
}
