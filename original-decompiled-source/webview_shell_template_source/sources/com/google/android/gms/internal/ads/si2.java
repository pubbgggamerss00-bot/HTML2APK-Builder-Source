package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class si2 implements nh2, mh2 {
    public final nh2 s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8953t;

    /* renamed from: u, reason: collision with root package name */
    public mh2 f8954u;

    public si2(nh2 nh2Var, long j6) {
        this.s = nh2Var;
        this.f8953t = j6;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long a(long j6) {
        nh2 nh2Var = this.s;
        long j7 = this.f8953t;
        return nh2Var.a(j6 - j7) + j7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
        this.s.b(j6 - this.f8953t);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void c(long j6) {
        this.s.c(j6 - this.f8953t);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final /* bridge */ /* synthetic */ void d(ni2 ni2Var) {
        mh2 mh2Var = this.f8954u;
        mh2Var.getClass();
        mh2Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long e(long j6, tc2 tc2Var) {
        nh2 nh2Var = this.s;
        long j7 = this.f8953t;
        return nh2Var.e(j6 - j7, tc2Var) + j7;
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final void f(nh2 nh2Var) {
        mh2 mh2Var = this.f8954u;
        mh2Var.getClass();
        mh2Var.f(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long h(ak2[] ak2VarArr, boolean[] zArr, mi2[] mi2VarArr, boolean[] zArr2, long j6) {
        mi2[] mi2VarArr2 = new mi2[mi2VarArr.length];
        int i6 = 0;
        while (true) {
            mi2 mi2Var = null;
            if (i6 >= mi2VarArr.length) {
                break;
            }
            ri2 ri2Var = (ri2) mi2VarArr[i6];
            if (ri2Var != null) {
                mi2Var = ri2Var.f8648a;
            }
            mi2VarArr2[i6] = mi2Var;
            i6++;
        }
        nh2 nh2Var = this.s;
        long j7 = this.f8953t;
        long jH = nh2Var.h(ak2VarArr, zArr, mi2VarArr2, zArr2, j6 - j7);
        for (int i7 = 0; i7 < mi2VarArr.length; i7++) {
            mi2 mi2Var2 = mi2VarArr2[i7];
            if (mi2Var2 == null) {
                mi2VarArr[i7] = null;
            } else {
                mi2 mi2Var3 = mi2VarArr[i7];
                if (mi2Var3 == null || ((ri2) mi2Var3).f8648a != mi2Var2) {
                    mi2VarArr[i7] = new ri2(mi2Var2, j7);
                }
            }
        }
        return jH + j7;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void i(mh2 mh2Var, long j6) {
        this.f8954u = mh2Var;
        this.s.i(this, j6 - this.f8953t);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        long j6 = tb2Var.f9219a;
        sb2 sb2Var = new sb2();
        sb2Var.f8890b = tb2Var.f9220b;
        sb2Var.f8891c = tb2Var.f9221c;
        sb2Var.f8889a = j6 - this.f8953t;
        return this.s.j(new tb2(sb2Var));
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        long jZzb = this.s.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f8953t;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        long jZzc = this.s.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f8953t;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long zzd() {
        long jZzd = this.s.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f8953t;
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
