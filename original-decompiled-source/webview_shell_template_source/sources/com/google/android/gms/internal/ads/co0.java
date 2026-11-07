package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class co0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3627a;

    /* renamed from: b, reason: collision with root package name */
    public final bo0 f3628b;

    public /* synthetic */ co0(bo0 bo0Var, int i6) {
        this.f3627a = i6;
        this.f3628b = bo0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f3627a) {
            case 0:
                xa0 xa0Var = this.f3628b.f3235b;
                if (xa0Var == null) {
                    return null;
                }
                return xa0Var.u();
            default:
                return this.f3628b.f3235b;
        }
    }
}
