package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hi2 extends sg2 {
    public final rn1 h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f5421i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5422j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5423k;

    /* renamed from: l, reason: collision with root package name */
    public long f5424l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5425m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5426n;

    /* renamed from: o, reason: collision with root package name */
    public o52 f5427o;

    /* renamed from: p, reason: collision with root package name */
    public tc f5428p;

    /* renamed from: q, reason: collision with root package name */
    public final v31 f5429q;

    public /* synthetic */ hi2(tc tcVar, rn1 rn1Var, v31 v31Var, iu1 iu1Var, int i6) {
        d0 d0Var = d0.H;
        this.f5428p = tcVar;
        this.h = rn1Var;
        this.f5429q = v31Var;
        this.f5421i = d0Var;
        this.f5422j = i6;
        this.f5423k = true;
        this.f5424l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void b(nh2 nh2Var) {
        ei2 ei2Var = (ei2) nh2Var;
        if (ei2Var.L) {
            for (li2 li2Var : ei2Var.I) {
                li2Var.l();
                if (li2Var.A != null) {
                    li2Var.A = null;
                    li2Var.f6757f = null;
                }
            }
        }
        sk2 sk2Var = ei2Var.A;
        xk2 xk2Var = sk2Var.f8974a;
        pk2 pk2Var = sk2Var.f8975b;
        if (pk2Var != null) {
            pk2Var.a(true);
        }
        xk2Var.execute(new t(16, ei2Var));
        xk2Var.f10624t.mo6zza(xk2Var.s);
        ei2Var.F.removeCallbacksAndMessages(null);
        ei2Var.G = null;
        ei2Var.f4309d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final synchronized void c(tc tcVar) {
        this.f5428p = tcVar;
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final nh2 e(oh2 oh2Var, u1 u1Var, long j6) {
        lo1 lo1VarZza = this.h.zza();
        o52 o52Var = this.f5427o;
        if (o52Var != null) {
            lo1VarZza.d(o52Var);
        }
        q8 q8Var = g().f9223b;
        q8Var.getClass();
        Uri uri = q8Var.f8246a;
        y5.k(this.f8934g);
        return new ei2(uri, lo1VarZza, new tg2((a1) this.f5429q.f9702t), this.f5421i, new cf2(this.f8931d.f3560b, oh2Var), new sh2(this.f8930c.f8939b, oh2Var), this, u1Var, this.f5422j, j31.s(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final synchronized tc g() {
        return this.f5428p;
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void o(o52 o52Var) {
        this.f5427o = o52Var;
        Looper.myLooper().getClass();
        y5.k(this.f8934g);
        s();
    }

    public final void r(boolean z6, long j6, boolean z7) {
        if (j6 == -9223372036854775807L) {
            j6 = this.f5424l;
        }
        if (!this.f5423k && this.f5424l == j6 && this.f5425m == z6 && this.f5426n == z7) {
            return;
        }
        this.f5424l = j6;
        this.f5425m = z6;
        this.f5426n = z7;
        this.f5423k = false;
        s();
    }

    public final void s() {
        long j6 = this.f5424l;
        boolean z6 = this.f5425m;
        boolean z7 = this.f5426n;
        tc tcVarG = g();
        zy pi2Var = new pi2(j6, j6, z6, tcVarG, z7 ? tcVarG.f9224c : null);
        if (this.f5423k) {
            pi2Var = new fi2(pi2Var);
        }
        p(pi2Var);
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void zzz() {
    }
}
