package m0;

import i0.l4;
import i0.y4;
import j2.a5;
import j2.b5;
import m0.e0;
import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;
import y2.q0;

/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final y4 f17547a;

    /* renamed from: b, reason: collision with root package name */
    public y2.v f17548b;

    /* renamed from: c, reason: collision with root package name */
    public eh.l<? super y2.c0, pg.f0> f17549c;

    /* renamed from: d, reason: collision with root package name */
    public i0.i2 f17550d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f17551e;

    /* renamed from: f, reason: collision with root package name */
    public y2.q0 f17552f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.s f17553g;

    /* renamed from: h, reason: collision with root package name */
    public j2.f2 f17554h;

    /* renamed from: i, reason: collision with root package name */
    public ph.i0 f17555i;

    /* renamed from: j, reason: collision with root package name */
    public a5 f17556j;

    /* renamed from: k, reason: collision with root package name */
    public y1.a f17557k;

    /* renamed from: l, reason: collision with root package name */
    public o1.c0 f17558l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.x1 f17559m;

    /* renamed from: n, reason: collision with root package name */
    public final x0.x1 f17560n;

    /* renamed from: o, reason: collision with root package name */
    public long f17561o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f17562p;

    /* renamed from: q, reason: collision with root package name */
    public long f17563q;

    /* renamed from: r, reason: collision with root package name */
    public final x0.x1 f17564r;

    /* renamed from: s, reason: collision with root package name */
    public final x0.x1 f17565s;

    /* renamed from: t, reason: collision with root package name */
    public int f17566t;

    /* renamed from: u, reason: collision with root package name */
    public y2.c0 f17567u;

    /* renamed from: v, reason: collision with root package name */
    public r2 f17568v;

    /* renamed from: w, reason: collision with root package name */
    public final c f17569w;

    /* renamed from: x, reason: collision with root package name */
    public final a f17570x;

    public static final class a implements q {
        public a() {
        }

        @Override // m0.q
        public final boolean a(long j10, e0 e0Var) {
            i0.i2 i2Var;
            x2 x2Var = x2.this;
            if (!x2Var.i() || x2Var.k().f33682a.f27761b.length() == 0 || (i2Var = x2Var.f17550d) == null || i2Var.d() == null) {
                return false;
            }
            d(x2Var.k(), j10, false, e0Var);
            return true;
        }

        @Override // m0.q
        public final boolean b(long j10, e0 e0Var) {
            i0.i2 i2Var;
            x2 x2Var = x2.this;
            if (!x2Var.i() || x2Var.k().f33682a.f27761b.length() == 0 || (i2Var = x2Var.f17550d) == null || i2Var.d() == null) {
                return false;
            }
            o1.c0 c0Var = x2Var.f17558l;
            if (c0Var != null) {
                o1.c0.b(c0Var);
            }
            x2Var.f17561o = j10;
            x2Var.f17566t = -1;
            x2Var.f(true);
            d(x2Var.k(), x2Var.f17561o, true, e0Var);
            return true;
        }

        @Override // m0.q
        public final void c() {
        }

        public final void d(y2.c0 c0Var, long j10, boolean z10, e0 e0Var) {
            x2 x2Var = x2.this;
            x2Var.o(t2.j0.b(x2.a(x2Var, c0Var, j10, z10, false, e0Var, false)) ? i0.v1.f13648c : i0.v1.f13647b);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<y2.c0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17572a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(y2.c0 c0Var) {
            return pg.f0.f21461a;
        }
    }

    public static final class c implements i0.b3 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i0.b3
        public final void a(long j10) {
            x2 x2Var;
            long j11;
            l4 l4VarD;
            l4 l4VarD2;
            x2 x2Var2 = x2.this;
            x0.x1 x1Var = x2Var2.f17564r;
            if (x2Var2.i() && ((i0.u1) x1Var.getValue()) == null) {
                x1Var.setValue(i0.u1.f13617c);
                x2Var2.f17566t = -1;
                x2Var2.l();
                i0.i2 i2Var = x2Var2.f17550d;
                if (i2Var == null || (l4VarD2 = i2Var.d()) == null || !l4VarD2.c(j10)) {
                    x2Var = x2Var2;
                    j11 = j10;
                    i0.i2 i2Var2 = x2Var.f17550d;
                    if (i2Var2 != null && (l4VarD = i2Var2.d()) != null) {
                        int iA = x2Var.f17548b.a(l4VarD.b(j11, true));
                        y2.c0 c0VarC = x2.c(x2Var.k().f33682a, t2.k0.a(iA, iA));
                        x2Var.f(false);
                        y1.a aVar = x2Var.f17557k;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                        x2Var.f17549c.invoke(c0VarC);
                    }
                } else {
                    if (x2Var2.k().f33682a.f27761b.length() == 0) {
                        return;
                    }
                    x2Var2.f(false);
                    long jA = x2.a(x2Var2, y2.c0.b(x2Var2.k(), null, t2.j0.f27837b, 5), j10, true, false, e0.a.f17303b, true);
                    x2Var = x2Var2;
                    j11 = j10;
                    x2Var.f17562p = Integer.valueOf((int) (jA >> 32));
                }
                x2Var.o(i0.v1.f13646a);
                x2Var.f17561o = j11;
                x2Var.f17565s.setValue(new p1.c(j11));
                x2Var.f17563q = 0L;
            }
        }

        @Override // i0.b3
        public final void b() {
            f();
        }

        @Override // i0.b3
        public final void c() {
        }

        @Override // i0.b3
        public final void d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
        @Override // i0.b3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(long j10) {
            l4 l4VarD;
            x2 x2Var = x2.this;
            if (!x2Var.i() || x2Var.k().f33682a.f27761b.length() == 0) {
                return;
            }
            x2Var.f17563q = p1.c.g(x2Var.f17563q, j10);
            i0.i2 i2Var = x2Var.f17550d;
            if (i2Var != null && (l4VarD = i2Var.d()) != null) {
                x2Var.f17565s.setValue(new p1.c(p1.c.g(x2Var.f17561o, x2Var.f17563q)));
                Integer num = x2Var.f17562p;
                e0 e0Var = e0.a.f17303b;
                if (num == null) {
                    p1.c cVarG = x2Var.g();
                    kotlin.jvm.internal.r.b(cVarG);
                    if (l4VarD.c(cVarG.f21129a)) {
                        Integer num2 = x2Var.f17562p;
                        int iIntValue = num2 != null ? num2.intValue() : l4VarD.b(x2Var.f17561o, false);
                        p1.c cVarG2 = x2Var.g();
                        kotlin.jvm.internal.r.b(cVarG2);
                        int iB = l4VarD.b(cVarG2.f21129a, false);
                        if (x2Var.f17562p == null && iIntValue == iB) {
                            return;
                        }
                        y2.c0 c0VarK = x2Var.k();
                        p1.c cVarG3 = x2Var.g();
                        kotlin.jvm.internal.r.b(cVarG3);
                        x2.a(x2Var, c0VarK, cVarG3.f21129a, false, false, e0Var, true);
                    } else {
                        int iA = x2Var.f17548b.a(l4VarD.b(x2Var.f17561o, true));
                        y2.v vVar = x2Var.f17548b;
                        p1.c cVarG4 = x2Var.g();
                        kotlin.jvm.internal.r.b(cVarG4);
                        if (iA == vVar.a(l4VarD.b(cVarG4.f21129a, true))) {
                            e0Var = e0.a.f17302a;
                        }
                        y2.c0 c0VarK2 = x2Var.k();
                        p1.c cVarG5 = x2Var.g();
                        kotlin.jvm.internal.r.b(cVarG5);
                        x2.a(x2Var, c0VarK2, cVarG5.f21129a, false, false, e0Var, true);
                    }
                    int i10 = t2.j0.f27838c;
                }
            }
            x2Var.q(false);
        }

        public final void f() {
            x2 x2Var = x2.this;
            x2Var.f17564r.setValue(null);
            x2Var.f17565s.setValue(null);
            x2Var.q(true);
            x2Var.f17562p = null;
            boolean zB = t2.j0.b(x2Var.k().f33683b);
            x2Var.o(zB ? i0.v1.f13648c : i0.v1.f13647b);
            i0.i2 i2Var = x2Var.f17550d;
            if (i2Var != null) {
                i2Var.f13349m.setValue(Boolean.valueOf(!zB && d3.b(x2Var, true)));
            }
            i0.i2 i2Var2 = x2Var.f17550d;
            if (i2Var2 != null) {
                i2Var2.f13350n.setValue(Boolean.valueOf(!zB && d3.b(x2Var, false)));
            }
            i0.i2 i2Var3 = x2Var.f17550d;
            if (i2Var3 == null) {
                return;
            }
            i2Var3.f13351o.setValue(Boolean.valueOf(zB && d3.b(x2Var, true)));
        }

        @Override // i0.b3
        public final void onCancel() {
            f();
        }
    }

    public x2() {
        this(null);
    }

    public static final long a(x2 x2Var, y2.c0 c0Var, long j10, boolean z10, boolean z11, e0 e0Var, boolean z12) {
        l4 l4VarD;
        long j11;
        long j12;
        z zVar;
        boolean z13;
        boolean z14;
        y1.a aVar;
        int i10;
        i0.i2 i2Var = x2Var.f17550d;
        if (i2Var == null || (l4VarD = i2Var.d()) == null) {
            return t2.j0.f27837b;
        }
        y2.v vVar = x2Var.f17548b;
        long j13 = c0Var.f33683b;
        t2.b bVar = c0Var.f33682a;
        int i11 = t2.j0.f27838c;
        long jA = t2.k0.a(vVar.b((int) (j13 >> 32)), x2Var.f17548b.b((int) (j13 & BodyPartID.bodyIdMax)));
        int iB = l4VarD.b(j10, false);
        int i12 = (z11 || z10) ? iB : (int) (jA >> 32);
        int i13 = (!z11 || z10) ? iB : (int) (jA & BodyPartID.bodyIdMax);
        r2 r2Var = x2Var.f17568v;
        int i14 = (z10 || r2Var == null || (i10 = x2Var.f17566t) == -1) ? -1 : i10;
        t2.h0 h0Var = l4VarD.f13418a;
        if (z10) {
            j12 = j13;
            j11 = 4294967295L;
            zVar = null;
        } else {
            j11 = 4294967295L;
            int i15 = (int) (jA >> 32);
            j12 = j13;
            z.a aVar2 = new z.a(l1.a(h0Var, i15), i15, 1L);
            int i16 = (int) (jA & BodyPartID.bodyIdMax);
            zVar = new z(aVar2, new z.a(l1.a(h0Var, i16), i16, 1L), t2.j0.f(jA));
        }
        r2 r2Var2 = new r2(z11, 1, 1, zVar, new y(1L, 1, i12, i13, i14, h0Var));
        if (!r2Var2.f(r2Var)) {
            return j12;
        }
        x2Var.f17568v = r2Var2;
        x2Var.f17566t = iB;
        z zVarA = e0Var.a(r2Var2);
        long jA2 = t2.k0.a(x2Var.f17548b.a(zVarA.f17593a.f17597b), x2Var.f17548b.a(zVarA.f17594b.f17597b));
        long j14 = j12;
        if (t2.j0.a(jA2, j14)) {
            return j14;
        }
        boolean z15 = t2.j0.f(jA2) != t2.j0.f(j14) && t2.j0.a(t2.k0.a((int) (jA2 & j11), (int) (jA2 >> 32)), j14);
        boolean z16 = t2.j0.b(jA2) && t2.j0.b(j14);
        if (z12 && bVar.f27761b.length() > 0 && !z15 && !z16 && (aVar = x2Var.f17557k) != null) {
            aVar.a(9);
        }
        x2Var.f17549c.invoke(c(bVar, jA2));
        if (!z12) {
            x2Var.q(!t2.j0.b(jA2));
        }
        i0.i2 i2Var2 = x2Var.f17550d;
        if (i2Var2 != null) {
            i2Var2.f13353q.setValue(Boolean.valueOf(z12));
        }
        i0.i2 i2Var3 = x2Var.f17550d;
        if (i2Var3 != null) {
            i2Var3.f13349m.setValue(Boolean.valueOf(!t2.j0.b(jA2) && d3.b(x2Var, true)));
        }
        i0.i2 i2Var4 = x2Var.f17550d;
        if (i2Var4 == null) {
            z13 = false;
        } else {
            if (t2.j0.b(jA2)) {
                z13 = false;
            } else {
                z13 = false;
                if (d3.b(x2Var, false)) {
                    z14 = true;
                }
                i2Var4.f13350n.setValue(Boolean.valueOf(z14));
            }
            z14 = z13;
            i2Var4.f13350n.setValue(Boolean.valueOf(z14));
        }
        i0.i2 i2Var5 = x2Var.f17550d;
        if (i2Var5 == null) {
            return jA2;
        }
        i2Var5.f13351o.setValue(Boolean.valueOf((t2.j0.b(jA2) && d3.b(x2Var, true)) ? true : z13));
        return jA2;
    }

    public static y2.c0 c(t2.b bVar, long j10) {
        return new y2.c0(bVar, j10, (t2.j0) null);
    }

    public final ph.l2 b(boolean z10) {
        ph.i0 i0Var = this.f17555i;
        if (i0Var != null) {
            return ph.h.c(i0Var, null, ph.k0.f21556d, new t2(this, z10, null), 1);
        }
        return null;
    }

    public final void d() {
        ph.i0 i0Var = this.f17555i;
        if (i0Var != null) {
            ph.h.c(i0Var, null, ph.k0.f21556d, new v2(this, null), 1);
        }
    }

    public final void e(p1.c cVar) {
        if (!t2.j0.b(k().f33683b)) {
            i0.i2 i2Var = this.f17550d;
            l4 l4VarD = i2Var != null ? i2Var.d() : null;
            int iD = (cVar == null || l4VarD == null) ? t2.j0.d(k().f33683b) : this.f17548b.a(l4VarD.b(cVar.f21129a, true));
            this.f17549c.invoke(y2.c0.b(k(), null, t2.k0.a(iD, iD), 5));
        }
        o((cVar == null || k().f33682a.f27761b.length() <= 0) ? i0.v1.f13646a : i0.v1.f13648c);
        q(false);
    }

    public final void f(boolean z10) {
        o1.c0 c0Var;
        i0.i2 i2Var = this.f17550d;
        if (i2Var != null && !i2Var.b() && (c0Var = this.f17558l) != null) {
            o1.c0.b(c0Var);
        }
        this.f17567u = k();
        q(z10);
        o(i0.v1.f13647b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p1.c g() {
        return (p1.c) this.f17565s.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return ((Boolean) this.f17559m.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f17560n.getValue()).booleanValue();
    }

    public final long j(boolean z10) {
        l4 l4VarD;
        long j10;
        i0.i2 i2Var = this.f17550d;
        if (i2Var == null || (l4VarD = i2Var.d()) == null) {
            return 9205357640488583168L;
        }
        t2.h0 h0Var = l4VarD.f13418a;
        i0.i2 i2Var2 = this.f17550d;
        t2.b bVar = i2Var2 != null ? i2Var2.f13337a.f13725a : null;
        if (bVar == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.r.a(bVar.f27761b, h0Var.f27819a.f27809a.f27761b)) {
            return 9205357640488583168L;
        }
        y2.c0 c0VarK = k();
        if (z10) {
            long j11 = c0VarK.f33683b;
            int i10 = t2.j0.f27838c;
            j10 = j11 >> 32;
        } else {
            long j12 = c0VarK.f33683b;
            int i11 = t2.j0.f27838c;
            j10 = j12 & BodyPartID.bodyIdMax;
        }
        return androidx.lifecycle.u.b(h0Var, this.f17548b.b((int) j10), z10, t2.j0.f(k().f33683b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y2.c0 k() {
        return (y2.c0) this.f17551e.getValue();
    }

    public final void l() {
        a5 a5Var;
        a5 a5Var2 = this.f17556j;
        if ((a5Var2 != null ? a5Var2.getStatus() : null) != b5.f14666a || (a5Var = this.f17556j) == null) {
            return;
        }
        a5Var.b();
    }

    public final void m() {
        ph.i0 i0Var = this.f17555i;
        if (i0Var != null) {
            ph.h.c(i0Var, null, ph.k0.f21556d, new y2(this, null), 1);
        }
    }

    public final void n() {
        y2.c0 c0VarC = c(k().f33682a, t2.k0.a(0, k().f33682a.f27761b.length()));
        this.f17549c.invoke(c0VarC);
        this.f17567u = y2.c0.b(this.f17567u, null, c0VarC.f33683b, 5);
        f(true);
    }

    public final void o(i0.v1 v1Var) {
        i0.i2 i2Var = this.f17550d;
        if (i2Var != null) {
            if (i2Var.a() == v1Var) {
                i2Var = null;
            }
            if (i2Var != null) {
                i2Var.f13347k.setValue(v1Var);
            }
        }
    }

    public final void p() {
        ph.i0 i0Var = this.f17555i;
        if (i0Var != null) {
            ph.h.c(i0Var, null, ph.k0.f21556d, new z2(this, null), 1);
        }
    }

    public final void q(boolean z10) {
        i0.i2 i2Var = this.f17550d;
        if (i2Var != null) {
            i2Var.f13348l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            p();
        } else {
            l();
        }
    }

    public x2(y4 y4Var) {
        this.f17547a = y4Var;
        this.f17548b = i0.a5.f13152a;
        this.f17549c = b.f17572a;
        this.f17551e = bg.b.h(new y2.c0((String) null, 0L, 7));
        this.f17552f = q0.a.f33765a;
        Boolean bool = Boolean.TRUE;
        this.f17559m = bg.b.h(bool);
        this.f17560n = bg.b.h(bool);
        this.f17561o = 0L;
        this.f17563q = 0L;
        this.f17564r = bg.b.h(null);
        this.f17565s = bg.b.h(null);
        this.f17566t = -1;
        this.f17567u = new y2.c0((String) null, 0L, 7);
        this.f17569w = new c();
        this.f17570x = new a();
    }
}
