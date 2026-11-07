package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ok0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7801a;

    /* renamed from: b, reason: collision with root package name */
    public final ea2 f7802b;

    public /* synthetic */ ok0(ea2 ea2Var, int i6) {
        this.f7801a = i6;
        this.f7802b = ea2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7801a) {
            case 0:
                return new nk0(this.f7802b.zzb());
            case 1:
                return new kl0(this.f7802b.zzb());
            default:
                return new mm0(this.f7802b.zzb());
        }
    }
}
