package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mr1 extends me {
    @Override // com.google.android.gms.internal.ads.me
    public final int a(kr1 kr1Var) {
        int i6;
        synchronized (kr1Var) {
            i6 = kr1Var.A - 1;
            kr1Var.A = i6;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void l(kr1 kr1Var, Set set) {
        synchronized (kr1Var) {
            try {
                if (kr1Var.f7492z == null) {
                    kr1Var.f7492z = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
