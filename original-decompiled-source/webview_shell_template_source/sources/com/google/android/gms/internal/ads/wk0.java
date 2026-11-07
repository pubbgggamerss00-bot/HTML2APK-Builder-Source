package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wk0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10211a;

    /* renamed from: b, reason: collision with root package name */
    public final ea2 f10212b;

    public /* synthetic */ wk0(ea2 ea2Var, int i6) {
        this.f10211a = i6;
        this.f10212b = ea2Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10211a) {
            case 0:
                return new uk0(this.f10212b.zzb());
            case 1:
                return new dl0(this.f10212b.zzb());
            case 2:
                return new fl0(this.f10212b.zzb());
            case 3:
                return new gm0(this.f10212b.zzb());
            case 4:
                return new an0(this.f10212b.zzb());
            case 5:
                return new hn0(this.f10212b.zzb());
            case 6:
                return new nn0(this.f10212b.zzb());
            case 7:
                return new sn0(this.f10212b.zzb());
            default:
                return new zd1(this.f10212b.zzb());
        }
    }
}
