package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ne0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7430a;

    /* renamed from: b, reason: collision with root package name */
    public final oc0 f7431b;

    public /* synthetic */ ne0(oc0 oc0Var, int i6) {
        this.f7430a = i6;
        this.f7431b = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7430a) {
            case 0:
                return pc1.a(this.f7431b.a());
            default:
                return new fw0(this.f7431b.a());
        }
    }
}
