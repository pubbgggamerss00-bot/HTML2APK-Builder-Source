package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ha0 implements rn1, zr1 {
    public final /* synthetic */ boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5309t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5310u;

    public /* synthetic */ ha0(Object obj, Object obj2, boolean z6) {
        this.f5309t = obj;
        this.f5310u = obj2;
        this.s = z6;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        de1 de1Var = (de1) this.f5310u;
        de1Var.s(true);
        he1 he1Var = (he1) this.f5309t;
        he1Var.a(de1Var);
        if (this.s) {
            he1Var.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        he1 he1Var = (he1) this.f5309t;
        de1 de1Var = (de1) this.f5310u;
        if (de1Var.zzk()) {
            de1Var.g(th);
            de1Var.s(false);
            he1Var.a(de1Var);
            if (this.s) {
                he1Var.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rn1
    public lo1 zza() {
        ja0 ja0Var = (ja0) this.f5309t;
        String str = (String) this.f5310u;
        ro0 ro0Var = new ro0(8);
        ja0 ja0Var2 = true != this.s ? null : ja0Var;
        o80 o80Var = ja0Var.f5991x;
        yw1 yw1Var = new yw1(str, o80Var.f7634d, o80Var.f7635e, true, ro0Var);
        if (ja0Var2 != null) {
            yw1Var.d(ja0Var2);
        }
        return yw1Var;
    }
}
