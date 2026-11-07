package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gh2 implements nh2, mh2 {
    public final oh2 s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5048t;

    /* renamed from: u, reason: collision with root package name */
    public qh2 f5049u;

    /* renamed from: v, reason: collision with root package name */
    public nh2 f5050v;

    /* renamed from: w, reason: collision with root package name */
    public mh2 f5051w;

    /* renamed from: x, reason: collision with root package name */
    public long f5052x = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public final u1 f5053y;

    public gh2(oh2 oh2Var, u1 u1Var, long j6) {
        this.s = oh2Var;
        this.f5053y = u1Var;
        this.f5048t = j6;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long a(long j6) {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        nh2Var.b(j6);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void c(long j6) {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        nh2Var.c(j6);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final /* bridge */ /* synthetic */ void d(ni2 ni2Var) {
        mh2 mh2Var = this.f5051w;
        int i6 = j31.f5914a;
        mh2Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long e(long j6, tc2 tc2Var) {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.e(j6, tc2Var);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final void f(nh2 nh2Var) {
        mh2 mh2Var = this.f5051w;
        int i6 = j31.f5914a;
        mh2Var.f(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long h(ak2[] ak2VarArr, boolean[] zArr, mi2[] mi2VarArr, boolean[] zArr2, long j6) {
        long j7 = this.f5052x;
        long j8 = (j7 == -9223372036854775807L || j6 != this.f5048t) ? j6 : j7;
        this.f5052x = -9223372036854775807L;
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.h(ak2VarArr, zArr, mi2VarArr, zArr2, j8);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void i(mh2 mh2Var, long j6) {
        this.f5051w = mh2Var;
        nh2 nh2Var = this.f5050v;
        if (nh2Var != null) {
            long j7 = this.f5052x;
            if (j7 == -9223372036854775807L) {
                j7 = this.f5048t;
            }
            nh2Var.i(this, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        nh2 nh2Var = this.f5050v;
        return nh2Var != null && nh2Var.j(tb2Var);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long zzd() {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.zzd();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final ui2 zzh() {
        nh2 nh2Var = this.f5050v;
        int i6 = j31.f5914a;
        return nh2Var.zzh();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void zzk() {
        nh2 nh2Var = this.f5050v;
        if (nh2Var != null) {
            nh2Var.zzk();
            return;
        }
        qh2 qh2Var = this.f5049u;
        if (qh2Var != null) {
            qh2Var.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean zzp() {
        nh2 nh2Var = this.f5050v;
        return nh2Var != null && nh2Var.zzp();
    }
}
