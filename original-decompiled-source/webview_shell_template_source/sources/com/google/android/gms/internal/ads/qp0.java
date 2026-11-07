package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qp0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8438a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f8439b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8440c;

    public /* synthetic */ qp0(oc0 oc0Var, ca2 ca2Var, int i6) {
        this.f8438a = i6;
        this.f8439b = oc0Var;
        this.f8440c = ca2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8438a) {
            case 0:
                return new z50(((oc0) this.f8439b).a(), ((lk0) this.f8440c).a().f4211f);
            default:
                return new iw0(((oc0) this.f8439b).a(), (cu0) this.f8440c.zzb());
        }
    }
}
