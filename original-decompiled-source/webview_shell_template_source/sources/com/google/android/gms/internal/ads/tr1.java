package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tr1 extends kr1 {
    public sr1 H;

    @Override // com.google.android.gms.internal.ads.cr1
    public final void h() {
        sr1 sr1Var = this.H;
        if (sr1Var != null) {
            sr1Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void t() {
        sr1 sr1Var = this.H;
        if (sr1Var != null) {
            try {
                sr1Var.f8998u.execute(sr1Var);
            } catch (RejectedExecutionException e6) {
                sr1Var.f8999v.f(e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void v(int i6) {
        this.D = null;
        if (i6 == 1) {
            this.H = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void s(int i6, Object obj) {
    }
}
