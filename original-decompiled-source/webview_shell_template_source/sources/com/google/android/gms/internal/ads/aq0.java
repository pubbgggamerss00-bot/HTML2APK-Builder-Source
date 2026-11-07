package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class aq0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2825a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f2826b;

    /* renamed from: c, reason: collision with root package name */
    public final cd0 f2827c;

    public aq0(cd0 cd0Var, w92 w92Var) {
        this.f2827c = cd0Var;
        this.f2826b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f2825a) {
            case 0:
                gs0 gs0Var = (gs0) ((j00) this.f2827c.f3521b).f5892u;
                ih1.j(gs0Var);
                return new zp0(gs0Var, (i3.a) this.f2826b.zzb());
            default:
                ct0 ct0Var = (ct0) this.f2826b.zzb();
                gs0 gs0Var2 = (gs0) ((j00) this.f2827c.f3521b).f5892u;
                ih1.j(gs0Var2);
                return new gq0(ct0Var, gs0Var2);
        }
    }

    public aq0(w92 w92Var, cd0 cd0Var) {
        this.f2826b = w92Var;
        this.f2827c = cd0Var;
    }
}
