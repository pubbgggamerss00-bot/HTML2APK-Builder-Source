package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xq1 extends rq1 {
    @Override // com.google.android.gms.internal.ads.rq1
    public final uq1 a(cr1 cr1Var, uq1 uq1Var) {
        uq1 uq1Var2;
        synchronized (cr1Var) {
            try {
                uq1Var2 = cr1Var.f3649t;
                if (uq1Var2 != uq1Var) {
                    cr1Var.f3649t = uq1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uq1Var2;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final br1 b(cr1 cr1Var) {
        br1 br1Var;
        br1 br1Var2 = br1.f3257c;
        synchronized (cr1Var) {
            try {
                br1Var = cr1Var.f3650u;
                if (br1Var != br1Var2) {
                    cr1Var.f3650u = br1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return br1Var;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void c(br1 br1Var, br1 br1Var2) {
        br1Var.f3259b = br1Var2;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void d(br1 br1Var, Thread thread) {
        br1Var.f3258a = thread;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean e(cr1 cr1Var, uq1 uq1Var, uq1 uq1Var2) {
        synchronized (cr1Var) {
            try {
                if (cr1Var.f3649t != uq1Var) {
                    return false;
                }
                cr1Var.f3649t = uq1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean f(cr1 cr1Var, Object obj, Object obj2) {
        synchronized (cr1Var) {
            try {
                if (cr1Var.s != obj) {
                    return false;
                }
                cr1Var.s = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean g(cr1 cr1Var, br1 br1Var, br1 br1Var2) {
        synchronized (cr1Var) {
            try {
                if (cr1Var.f3650u != br1Var) {
                    return false;
                }
                cr1Var.f3650u = br1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
