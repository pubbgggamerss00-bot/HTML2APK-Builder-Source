package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vg2 implements nh2, mh2 {
    public final gh2 s;

    /* renamed from: t, reason: collision with root package name */
    public mh2 f9862t;

    /* renamed from: u, reason: collision with root package name */
    public ug2[] f9863u = new ug2[0];

    /* renamed from: v, reason: collision with root package name */
    public long f9864v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f9865w;

    public vg2(gh2 gh2Var, long j6) {
        this.s = gh2Var;
        this.f9865w = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.gms.internal.ads.nh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j6) {
        this.f9864v = -9223372036854775807L;
        boolean z6 = false;
        for (ug2 ug2Var : this.f9863u) {
            if (ug2Var != null) {
                ug2Var.f9560b = false;
            }
        }
        long jA = this.s.a(j6);
        if (jA == j6) {
            z6 = true;
        } else if (jA >= 0) {
            long j7 = this.f9865w;
            if (j7 == Long.MIN_VALUE || jA <= j7) {
            }
        }
        y5.r(z6);
        return jA;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
        this.s.b(j6);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void c(long j6) {
        this.s.c(j6);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final /* bridge */ /* synthetic */ void d(ni2 ni2Var) {
        mh2 mh2Var = this.f9862t;
        mh2Var.getClass();
        mh2Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long e(long j6, tc2 tc2Var) {
        if (j6 == 0) {
            return 0L;
        }
        long j7 = tc2Var.f9229a;
        long j8 = tc2Var.f9230b;
        long jMax = Math.max(0L, Math.min(j7, j6));
        long j9 = this.f9865w;
        long jMax2 = Math.max(0L, Math.min(j8, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j6));
        if (jMax != tc2Var.f9229a || jMax2 != j8) {
            tc2Var = new tc2(jMax, jMax2);
        }
        return this.s.e(j6, tc2Var);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final void f(nh2 nh2Var) {
        mh2 mh2Var = this.f9862t;
        mh2Var.getClass();
        mh2Var.f(this);
    }

    public final boolean g() {
        return this.f9864v != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.google.android.gms.internal.ads.nh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(ak2[] ak2VarArr, boolean[] zArr, mi2[] mi2VarArr, boolean[] zArr2, long j6) {
        int length = mi2VarArr.length;
        this.f9863u = new ug2[length];
        mi2[] mi2VarArr2 = new mi2[length];
        int i6 = 0;
        while (true) {
            mi2 mi2Var = null;
            if (i6 >= mi2VarArr.length) {
                break;
            }
            ug2[] ug2VarArr = this.f9863u;
            ug2 ug2Var = (ug2) mi2VarArr[i6];
            ug2VarArr[i6] = ug2Var;
            if (ug2Var != null) {
                mi2Var = ug2Var.f9559a;
            }
            mi2VarArr2[i6] = mi2Var;
            i6++;
        }
        long jH = this.s.h(ak2VarArr, zArr, mi2VarArr2, zArr2, j6);
        long j7 = (g() && j6 == 0) ? 0L : j6;
        this.f9864v = -9223372036854775807L;
        boolean z6 = true;
        if (jH != j7) {
            if (jH >= 0) {
                long j8 = this.f9865w;
                if (j8 != Long.MIN_VALUE && jH > j8) {
                    z6 = false;
                }
            }
        }
        y5.r(z6);
        for (int i7 = 0; i7 < mi2VarArr.length; i7++) {
            mi2 mi2Var2 = mi2VarArr2[i7];
            if (mi2Var2 == null) {
                this.f9863u[i7] = null;
            } else {
                ug2[] ug2VarArr2 = this.f9863u;
                ug2 ug2Var2 = ug2VarArr2[i7];
                if (ug2Var2 == null || ug2Var2.f9559a != mi2Var2) {
                    ug2VarArr2[i7] = new ug2(this, mi2Var2);
                }
            }
            mi2VarArr[i7] = this.f9863u[i7];
        }
        return jH;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void i(mh2 mh2Var, long j6) {
        this.f9862t = mh2Var;
        this.s.i(this, j6);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        return this.s.j(tb2Var);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        long jZzb = this.s.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j6 = this.f9865w;
            if (j6 == Long.MIN_VALUE || jZzb < j6) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        long jZzc = this.s.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j6 = this.f9865w;
            if (j6 == Long.MIN_VALUE || jZzc < j6) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long zzd() {
        if (g()) {
            long j6 = this.f9864v;
            this.f9864v = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j6;
        }
        long jZzd2 = this.s.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        y5.r(jZzd2 >= 0);
        long j7 = this.f9865w;
        y5.r(j7 == Long.MIN_VALUE || jZzd2 <= j7);
        return jZzd2;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final ui2 zzh() {
        return this.s.zzh();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void zzk() {
        this.s.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean zzp() {
        return this.s.zzp();
    }
}
