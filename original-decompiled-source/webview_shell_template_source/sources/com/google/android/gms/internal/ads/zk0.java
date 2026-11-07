package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zk0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11324a;

    /* renamed from: b, reason: collision with root package name */
    public final ea2 f11325b;

    public /* synthetic */ zk0(ea2 ea2Var, int i6) {
        this.f11324a = i6;
        this.f11325b = ea2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f11324a) {
            case 0:
                yk0 yk0Var = new yk0(this.f11325b.zzb());
                yk0Var.f11018t = false;
                return yk0Var;
            case 1:
                return new xl0(this.f11325b.zzb());
            default:
                return new un0(this.f11325b.zzb());
        }
    }
}
