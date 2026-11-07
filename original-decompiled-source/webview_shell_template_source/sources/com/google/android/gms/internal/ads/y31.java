package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y31 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10824a;

    /* renamed from: b, reason: collision with root package name */
    public final y92 f10825b;

    public /* synthetic */ y31(y92 y92Var, int i6) {
        this.f10824a = i6;
        this.f10825b = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10824a) {
            case 0:
                return new x31((go0) this.f10825b.f10908a);
            default:
                return new t41(2, (oa1) this.f10825b.f10908a);
        }
    }
}
