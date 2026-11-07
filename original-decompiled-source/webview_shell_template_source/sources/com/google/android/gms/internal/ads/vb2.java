package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vb2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9792b;

    /* renamed from: c, reason: collision with root package name */
    public final mi2[] f9793c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9794d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9795e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9796f;

    /* renamed from: g, reason: collision with root package name */
    public wb2 f9797g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f9798i;

    /* renamed from: j, reason: collision with root package name */
    public final pa2[] f9799j;

    /* renamed from: k, reason: collision with root package name */
    public final fk2 f9800k;

    /* renamed from: l, reason: collision with root package name */
    public final hc2 f9801l;

    /* renamed from: m, reason: collision with root package name */
    public vb2 f9802m;

    /* renamed from: n, reason: collision with root package name */
    public ui2 f9803n;

    /* renamed from: o, reason: collision with root package name */
    public gk2 f9804o;

    /* renamed from: p, reason: collision with root package name */
    public long f9805p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.vg2] */
    public vb2(pa2[] pa2VarArr, long j6, fk2 fk2Var, u1 u1Var, hc2 hc2Var, wb2 wb2Var, gk2 gk2Var) {
        this.f9799j = pa2VarArr;
        this.f9805p = j6;
        this.f9800k = fk2Var;
        this.f9801l = hc2Var;
        oh2 oh2Var = wb2Var.f10148a;
        this.f9792b = oh2Var.f7769a;
        this.f9797g = wb2Var;
        this.f9803n = ui2.f9566d;
        this.f9804o = gk2Var;
        this.f9793c = new mi2[2];
        this.f9798i = new boolean[2];
        long j7 = wb2Var.f10149b;
        long j8 = wb2Var.f10151d;
        hc2Var.getClass();
        int i6 = oc2.f7705k;
        Pair pair = (Pair) oh2Var.f7769a;
        Object obj = pair.first;
        oh2 oh2VarA = oh2Var.a(pair.second);
        fc2 fc2Var = (fc2) hc2Var.f5331d.get(obj);
        fc2Var.getClass();
        hc2Var.f5334g.add(fc2Var);
        ec2 ec2Var = (ec2) hc2Var.f5333f.get(fc2Var);
        if (ec2Var != null) {
            ec2Var.f4224a.i(ec2Var.f4225b);
        }
        fc2Var.f4609c.add(oh2VarA);
        gh2 gh2VarE = fc2Var.f4607a.e(oh2VarA, u1Var, j7);
        hc2Var.f5330c.put(gh2VarE, fc2Var);
        hc2Var.k();
        this.f9791a = j8 != -9223372036854775807L ? new vg2(gh2VarE, j8) : gh2VarE;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    public final long a(gk2 gk2Var, long j6, boolean z6, boolean[] zArr) {
        pa2[] pa2VarArr;
        int i6 = 0;
        while (true) {
            boolean z7 = true;
            if (i6 >= gk2Var.f5083a) {
                break;
            }
            if (z6 || !gk2Var.a(this.f9804o, i6)) {
                z7 = false;
            }
            this.f9798i[i6] = z7;
            i6++;
        }
        int i7 = 0;
        while (true) {
            pa2VarArr = this.f9799j;
            if (i7 >= 2) {
                break;
            }
            pa2VarArr[i7].getClass();
            i7++;
        }
        k();
        this.f9804o = gk2Var;
        if (this.f9802m == null) {
            int i8 = 0;
            while (true) {
                gk2 gk2Var2 = this.f9804o;
                if (i8 >= gk2Var2.f5083a) {
                    break;
                }
                gk2Var2.b(i8);
                ak2 ak2Var = ((ak2[]) this.f9804o.f5085c)[i8];
                i8++;
            }
        }
        long jH = this.f9791a.h((ak2[]) gk2Var.f5085c, this.f9798i, this.f9793c, zArr, j6);
        for (int i9 = 0; i9 < 2; i9++) {
            pa2VarArr[i9].getClass();
        }
        this.f9796f = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f9793c[i10] != null) {
                y5.r(gk2Var.b(i10));
                pa2VarArr[i10].getClass();
                this.f9796f = true;
            } else {
                y5.r(((ak2[]) gk2Var.f5085c)[i10] == null);
            }
        }
        return jH;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    public final long b() {
        if (!this.f9795e) {
            return this.f9797g.f10149b;
        }
        long jZzb = this.f9796f ? this.f9791a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f9797g.f10152e : jZzb;
    }

    public final long c() {
        return this.f9797g.f10149b + this.f9805p;
    }

    public final ui2 d() {
        return this.f9803n;
    }

    public final gk2 e() {
        return this.f9804o;
    }

    public final gk2 f(zy zyVar) {
        ak2[] ak2VarArr;
        ui2 ui2Var = this.f9803n;
        oh2 oh2Var = this.f9797g.f10148a;
        fk2 fk2Var = this.f9800k;
        pa2[] pa2VarArr = this.f9799j;
        gk2 gk2VarE = fk2Var.e(pa2VarArr, ui2Var, oh2Var, zyVar);
        int i6 = 0;
        while (true) {
            int i7 = gk2VarE.f5083a;
            ak2VarArr = (ak2[]) gk2VarE.f5085c;
            if (i6 >= i7) {
                break;
            }
            if (gk2VarE.b(i6)) {
                if (ak2VarArr[i6] == null) {
                    pa2VarArr[i6].getClass();
                    z = false;
                }
                y5.r(z);
            } else {
                y5.r(ak2VarArr[i6] == null);
            }
            i6++;
        }
        for (ak2 ak2Var : ak2VarArr) {
        }
        return gk2VarE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    public final void g(zy zyVar) {
        this.f9795e = true;
        this.f9803n = this.f9791a.zzh();
        gk2 gk2VarF = f(zyVar);
        wb2 wb2Var = this.f9797g;
        long jMax = wb2Var.f10149b;
        long j6 = wb2Var.f10152e;
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        long jA = a(gk2VarF, jMax, false, new boolean[2]);
        long j7 = this.f9805p;
        wb2 wb2Var2 = this.f9797g;
        long j8 = wb2Var2.f10149b;
        this.f9805p = (j8 - jA) + j7;
        if (jA != j8) {
            wb2Var2 = new wb2(wb2Var2.f10148a, jA, wb2Var2.f10150c, wb2Var2.f10151d, wb2Var2.f10152e, wb2Var2.f10153f, wb2Var2.f10154g, wb2Var2.h);
        }
        this.f9797g = wb2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.nh2, java.lang.Object] */
    public final void h() {
        k();
        ?? r02 = this.f9791a;
        try {
            boolean z6 = r02 instanceof vg2;
            hc2 hc2Var = this.f9801l;
            if (z6) {
                hc2Var.d(((vg2) r02).s);
            } else {
                hc2Var.d(r02);
            }
        } catch (RuntimeException e6) {
            qs0.d("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.ni2, java.lang.Object] */
    public final boolean i() {
        if (this.f9795e) {
            return !this.f9796f || this.f9791a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean j() {
        if (this.f9795e) {
            return i() || b() - this.f9797g.f10149b >= -9223372036854775807L;
        }
        return false;
    }

    public final void k() {
        if (this.f9802m != null) {
            return;
        }
        int i6 = 0;
        while (true) {
            gk2 gk2Var = this.f9804o;
            if (i6 >= gk2Var.f5083a) {
                return;
            }
            gk2Var.b(i6);
            ak2 ak2Var = ((ak2[]) this.f9804o.f5085c)[i6];
            i6++;
        }
    }
}
