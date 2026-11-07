package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class il0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5806a;

    /* renamed from: b, reason: collision with root package name */
    public final ea2 f5807b;

    public /* synthetic */ il0(ea2 ea2Var, int i6) {
        this.f5806a = i6;
        this.f5807b = ea2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f5806a) {
            case 0:
                return new hl0(this.f5807b.zzb());
            case 1:
                return new cm0(this.f5807b.zzb());
            case 2:
                return new km0(this.f5807b.zzb());
            case 3:
                return new in0(this.f5807b.zzb());
            default:
                return new pn0(this.f5807b.zzb());
        }
    }
}
