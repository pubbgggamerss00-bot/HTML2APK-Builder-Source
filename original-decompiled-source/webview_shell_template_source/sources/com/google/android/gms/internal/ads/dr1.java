package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, cr1 cr1Var, long j6, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(cr1Var, j6, obj, obj2)) {
            if (unsafe.getObject(cr1Var, j6) != obj) {
                return false;
            }
        }
        return true;
    }
}
