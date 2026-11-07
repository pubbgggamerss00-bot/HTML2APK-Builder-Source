package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class uc2 extends q72 {

    /* renamed from: u, reason: collision with root package name */
    public final gb2 f9529u;

    /* renamed from: v, reason: collision with root package name */
    public final am0 f9530v;

    public uc2(xa2 xa2Var) {
        super(4);
        am0 am0Var = new am0();
        this.f9530v = am0Var;
        try {
            this.f9529u = new gb2(xa2Var, this);
            am0Var.b();
        } catch (Throwable th) {
            this.f9530v.b();
            throw th;
        }
    }

    public final long A() {
        this.f9530v.a();
        gb2 gb2Var = this.f9529u;
        gb2Var.N();
        if (gb2Var.z()) {
            ic2 ic2Var = gb2Var.f4982i0;
            return ic2Var.f5670k.equals(ic2Var.f5662b) ? j31.v(gb2Var.f4982i0.f5675p) : gb2Var.O();
        }
        gb2Var.N();
        if (gb2Var.f4982i0.f5661a.o()) {
            return gb2Var.f4984k0;
        }
        ic2 ic2Var2 = gb2Var.f4982i0;
        long j6 = 0;
        if (ic2Var2.f5670k.f7772d != ic2Var2.f5662b.f7772d) {
            return j31.v(ic2Var2.f5661a.e(gb2Var.h(), (cy) gb2Var.s, 0L).f3696j);
        }
        long j7 = ic2Var2.f5675p;
        if (gb2Var.f4982i0.f5670k.b()) {
            ic2 ic2Var3 = gb2Var.f4982i0;
            ic2Var3.f5661a.n(ic2Var3.f5670k.f7769a, gb2Var.F).f6185f.a(gb2Var.f4982i0.f5670k.f7770b).getClass();
        } else {
            j6 = j7;
        }
        ic2 ic2Var4 = gb2Var.f4982i0;
        ic2Var4.f5661a.n(ic2Var4.f5670k.f7769a, gb2Var.F);
        return j31.v(j6);
    }

    public final long B() {
        this.f9530v.a();
        return this.f9529u.O();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void c(int i6, long j6) {
        this.f9530v.a();
        this.f9529u.c(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int e() {
        this.f9530v.a();
        return this.f9529u.e();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int g() {
        this.f9530v.a();
        return this.f9529u.g();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int h() {
        this.f9530v.a();
        return this.f9529u.h();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int j() {
        this.f9530v.a();
        return this.f9529u.j();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int l() {
        this.f9530v.a();
        return this.f9529u.l();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final int n() {
        this.f9530v.a();
        return this.f9529u.n();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void p() {
        this.f9530v.a();
        this.f9529u.N();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long s() {
        this.f9530v.a();
        return this.f9529u.s();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long t() {
        this.f9530v.a();
        return this.f9529u.t();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final long u() {
        this.f9530v.a();
        return this.f9529u.u();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final zy v() {
        this.f9530v.a();
        return this.f9529u.v();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final w50 w() {
        this.f9530v.a();
        return this.f9529u.w();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final boolean x() {
        this.f9530v.a();
        return this.f9529u.x();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final void y() {
        this.f9530v.a();
        this.f9529u.N();
    }

    @Override // com.google.android.gms.internal.ads.q72
    public final boolean z() {
        this.f9530v.a();
        return this.f9529u.z();
    }
}
