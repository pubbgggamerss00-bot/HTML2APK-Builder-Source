package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ol0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final ea2 f7808b;

    public /* synthetic */ ol0(ea2 ea2Var, int i6) {
        this.f7807a = i6;
        this.f7808b = ea2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7807a) {
            case 0:
                return new nl0(this.f7808b.zzb());
            default:
                return new rl0(this.f7808b.zzb());
        }
    }
}
