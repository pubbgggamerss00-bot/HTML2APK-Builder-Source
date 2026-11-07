package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class pa2 implements lc2 {
    public mi2 A;
    public w[] B;
    public long C;
    public long D;
    public boolean F;
    public boolean G;
    public qc2 I;

    /* renamed from: t, reason: collision with root package name */
    public final int f8008t;

    /* renamed from: v, reason: collision with root package name */
    public rc2 f8010v;

    /* renamed from: w, reason: collision with root package name */
    public int f8011w;

    /* renamed from: x, reason: collision with root package name */
    public hd2 f8012x;

    /* renamed from: y, reason: collision with root package name */
    public el0 f8013y;

    /* renamed from: z, reason: collision with root package name */
    public int f8014z;
    public final Object s = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final ro0 f8009u = new ro0();
    public long E = Long.MIN_VALUE;
    public zy H = zy.f11601a;

    public pa2(int i6) {
        this.f8008t = i6;
    }

    public abstract void g(w[] wVarArr, long j6, long j7, oh2 oh2Var);

    public final void h(w[] wVarArr, mi2 mi2Var, long j6, long j7, oh2 oh2Var) {
        y5.r(!this.F);
        this.A = mi2Var;
        if (this.E == Long.MIN_VALUE) {
            this.E = j6;
        }
        this.B = wVarArr;
        this.C = j7;
        g(wVarArr, j6, j7, oh2Var);
    }

    public final boolean j() {
        return this.E == Long.MIN_VALUE;
    }

    public abstract String k();

    public abstract void l(long j6, long j7);

    public abstract boolean m();

    public abstract boolean n();

    public abstract int o(w wVar);

    public final int p(ro0 ro0Var, ja2 ja2Var, int i6) {
        mi2 mi2Var = this.A;
        mi2Var.getClass();
        int iB = mi2Var.b(ro0Var, ja2Var, i6);
        if (iB == -4) {
            if (ja2Var.a(4)) {
                this.E = Long.MIN_VALUE;
                return this.F ? -4 : -3;
            }
            long j6 = ja2Var.f6005f + this.C;
            ja2Var.f6005f = j6;
            this.E = Math.max(this.E, j6);
            return iB;
        }
        if (iB == -5) {
            w wVar = (w) ro0Var.s;
            wVar.getClass();
            long j7 = wVar.f9983r;
            if (j7 != Long.MAX_VALUE) {
                tk2 tk2Var = new tk2(wVar);
                tk2Var.f9335q = j7 + this.C;
                ro0Var.s = new w(tk2Var);
                return -5;
            }
        }
        return iB;
    }

    public final wa2 q(Exception exc, w wVar, boolean z6, int i6) {
        int iO;
        if (wVar == null || this.G) {
            iO = 4;
        } else {
            this.G = true;
            try {
                iO = o(wVar) & 7;
            } catch (wa2 unused) {
            } finally {
                this.G = false;
            }
        }
        return new wa2(1, exc, i6, k(), this.f8011w, wVar, wVar == null ? 4 : iO, z6);
    }

    public int r() {
        return 0;
    }

    public final el0 s() {
        el0 el0Var = this.f8013y;
        el0Var.getClass();
        return el0Var;
    }

    public ub2 t() {
        return null;
    }

    public final void u() {
        this.f8010v.getClass();
    }

    public final void v() {
        synchronized (this.s) {
            this.I = null;
        }
    }

    public abstract void x();

    public abstract void z(boolean z6, long j6);

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void w() {
    }

    @Override // com.google.android.gms.internal.ads.lc2
    public void b(int i6, Object obj) {
    }

    public void i(float f6, float f7) {
    }

    public void y(boolean z6, boolean z7) {
    }
}
