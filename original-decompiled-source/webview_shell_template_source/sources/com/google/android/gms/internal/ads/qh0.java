package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8386a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8387b;

    public qh0(lh0 lh0Var, w92 w92Var) {
        this.f8386a = 0;
        this.f8387b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8386a) {
            case 0:
                return new kn0((ii0) this.f8387b.zzb(), i70.f5591f);
            case 1:
                qn0 qn0Var = (qn0) this.f8387b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qn0Var, h70Var);
            case 2:
                ut0 ut0Var = (ut0) this.f8387b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(ut0Var, h70Var2);
            case 3:
                return new kn0((uj0) this.f8387b.zzb(), i70.f5592g);
            case 4:
                return new kn0((en0) this.f8387b.zzb(), i70.f5592g);
            case 5:
                return new wp0((cu0) this.f8387b.zzb());
            case 6:
                kq0 kq0Var = (kq0) this.f8387b.zzb();
                ih1.j(kq0Var);
                return kq0Var;
            case 7:
                wt0 wt0Var = (wt0) this.f8387b.zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new kn0(wt0Var, h70Var3);
            case 8:
                return new kn0((iw0) this.f8387b.zzb(), i70.f5592g);
            default:
                return new jf1((qf1) this.f8387b.zzb());
        }
    }

    public /* synthetic */ qh0(w92 w92Var, int i6) {
        this.f8386a = i6;
        this.f8387b = w92Var;
    }
}
