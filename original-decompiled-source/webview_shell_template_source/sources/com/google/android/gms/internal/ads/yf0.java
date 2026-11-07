package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yf0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10954a;

    /* renamed from: b, reason: collision with root package name */
    public final qi0 f10955b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10956c;

    public /* synthetic */ yf0(qi0 qi0Var, ca2 ca2Var, int i6) {
        this.f10954a = i6;
        this.f10955b = qi0Var;
        this.f10956c = ca2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f10954a) {
            case 0:
                return new xf0(this.f10955b.a(), ((dd0) this.f10956c).zzb());
            default:
                return new qn0(this.f10955b.a(), (cf1) this.f10956c.zzb());
        }
    }
}
