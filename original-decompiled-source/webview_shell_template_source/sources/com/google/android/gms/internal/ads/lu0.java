package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lu0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6854b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6855c;

    public /* synthetic */ lu0(ga2 ga2Var, ga2 ga2Var2, int i6) {
        this.f6853a = i6;
        this.f6854b = ga2Var;
        this.f6855c = ga2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f6853a) {
            case 0:
                return new ku0((ju0) this.f6854b.zzb(), (hc0) this.f6855c.zzb());
            default:
                return new y41((i3.a) this.f6854b.zzb(), ((lk0) this.f6855c).a());
        }
    }
}
