package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6083a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6084b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6085c;

    public /* synthetic */ jj0(ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f6083a = i6;
        this.f6084b = ca2Var;
        this.f6085c = ca2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6083a) {
            case 0:
                return new ij0((mj0) this.f6084b.zzb(), ((lk0) this.f6085c).a());
            case 1:
                return new z50(((oc0) this.f6084b).a(), ((lk0) this.f6085c).a().f4211f);
            case 2:
                zzbo zzboVar = (zzbo) this.f6084b.zzb();
                i3.a aVar = (i3.a) this.f6085c.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new pq0(zzboVar, aVar, h70Var);
            case 3:
                return new uc1(((oc0) this.f6084b).a(), ((dd0) this.f6085c).zzb());
            default:
                return new ce1(((oc0) this.f6084b).a(), (he1) this.f6085c.zzb());
        }
    }
}
