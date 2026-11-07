package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gm1 implements em1 {

    /* renamed from: v, reason: collision with root package name */
    public static final rj1 f5093v = new rj1(3);
    public final im1 s = new im1();

    /* renamed from: t, reason: collision with root package name */
    public volatile em1 f5094t;

    /* renamed from: u, reason: collision with root package name */
    public Object f5095u;

    public gm1(em1 em1Var) {
        this.f5094t = em1Var;
    }

    public final String toString() {
        Object objB = this.f5094t;
        if (objB == f5093v) {
            objB = androidx.camera.camera2.internal.v0.b("<supplier that returned ", String.valueOf(this.f5095u), ">");
        }
        return androidx.camera.camera2.internal.v0.b("Suppliers.memoize(", String.valueOf(objB), ")");
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public final Object mo7zza() {
        em1 em1Var = this.f5094t;
        rj1 rj1Var = f5093v;
        if (em1Var != rj1Var) {
            synchronized (this.s) {
                try {
                    if (this.f5094t != rj1Var) {
                        Object objMo7zza = this.f5094t.mo7zza();
                        this.f5095u = objMo7zza;
                        this.f5094t = rj1Var;
                        return objMo7zza;
                    }
                } finally {
                }
            }
        }
        return this.f5095u;
    }
}
