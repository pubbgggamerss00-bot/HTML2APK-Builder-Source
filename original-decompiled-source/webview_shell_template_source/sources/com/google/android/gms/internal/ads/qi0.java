package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qi0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8392a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8393b;

    public /* synthetic */ qi0(int i6, Object obj) {
        this.f8392a = i6;
        this.f8393b = obj;
    }

    public tb1 a() {
        tb1 tb1Var = (tb1) ((androidx.camera.view.b) this.f8393b).f675u;
        ih1.j(tb1Var);
        return tb1Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8392a) {
            case 0:
                sh0 sh0Var = (sh0) this.f8393b;
                return new pi0(new z50(((oc0) sh0Var.f8936b).a(), ((lk0) sh0Var.f8937c).a().f4211f));
            case 1:
                tb1 tb1Var = (tb1) ((androidx.camera.view.b) this.f8393b).f675u;
                ih1.j(tb1Var);
                return tb1Var;
            case 2:
                return ((jk0) this.f8393b).a();
            case 3:
                return ((mq0) this.f8393b).f7209a;
            case 4:
                return new qu0((uu) ((y92) this.f8393b).f10908a);
            case 5:
                return new n71(1, ((jk0) ((rc0) this.f8393b).f8608b).f6097c);
            default:
                return Boolean.valueOf(((q91) this.f8393b).f8279a.C);
        }
    }
}
