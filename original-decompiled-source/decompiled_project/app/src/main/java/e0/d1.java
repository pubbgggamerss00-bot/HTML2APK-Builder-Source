package e0;

import com.yalantis.ucrop.view.CropImageView;
import d0.d1;
import d0.d2;
import d0.o1;
import h1.h;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.m2;
import v.l1;
import x0.n1;
import x0.q1;
import x0.u3;
import x0.v1;
import x0.x1;

/* loaded from: classes.dex */
public abstract class d1 implements l1 {
    public final d0.c1 A;
    public final n1<pg.f0> B;
    public final n1<pg.f0> C;
    public final x1 D;
    public final x1 E;
    public final x1 F;
    public final x1 G;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8143a;

    /* renamed from: b, reason: collision with root package name */
    public o0 f8144b;

    /* renamed from: c, reason: collision with root package name */
    public final x1 f8145c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f8146d;

    /* renamed from: e, reason: collision with root package name */
    public int f8147e;

    /* renamed from: f, reason: collision with root package name */
    public int f8148f;

    /* renamed from: g, reason: collision with root package name */
    public long f8149g;

    /* renamed from: h, reason: collision with root package name */
    public long f8150h;

    /* renamed from: i, reason: collision with root package name */
    public float f8151i;

    /* renamed from: j, reason: collision with root package name */
    public float f8152j;

    /* renamed from: k, reason: collision with root package name */
    public final v.j f8153k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8154l;

    /* renamed from: m, reason: collision with root package name */
    public int f8155m;

    /* renamed from: n, reason: collision with root package name */
    public d1.b f8156n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8157o;

    /* renamed from: p, reason: collision with root package name */
    public final x1 f8158p;

    /* renamed from: q, reason: collision with root package name */
    public f3.d f8159q;

    /* renamed from: r, reason: collision with root package name */
    public final x.n f8160r;

    /* renamed from: s, reason: collision with root package name */
    public final v1 f8161s;

    /* renamed from: t, reason: collision with root package name */
    public final v1 f8162t;

    /* renamed from: u, reason: collision with root package name */
    public final d0.d1 f8163u;

    /* renamed from: v, reason: collision with root package name */
    public final d0.k f8164v;

    /* renamed from: w, reason: collision with root package name */
    public final d0.d f8165w;

    /* renamed from: x, reason: collision with root package name */
    public final x1 f8166x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f8167y;

    /* renamed from: z, reason: collision with root package name */
    public long f8168z;

    public d1(float f10, int i10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            y.c.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f8145c = bg.b.h(new p1.c(0L));
        this.f8146d = new r0(i10, f10, this);
        this.f8147e = i10;
        this.f8149g = Long.MAX_VALUE;
        this.f8153k = new v.j(new o1(this, 1));
        this.f8154l = true;
        this.f8155m = -1;
        this.f8158p = new x1(e1.f8173b, q1.f31878a);
        this.f8159q = e1.f8174c;
        this.f8160r = new x.n();
        this.f8161s = new v1(-1);
        this.f8162t = new v1(i10);
        b1 b1Var = new b1(this);
        u3 u3Var = u3.f31923a;
        bg.b.e(b1Var, u3Var);
        bg.b.e(new c1(this), u3Var);
        this.f8163u = new d0.d1(null, new w0(this));
        this.f8164v = new d0.k();
        this.f8165w = new d0.d();
        this.f8166x = bg.b.h(null);
        this.f8167y = new x0(this);
        this.f8168z = f3.c.b(0, 0, 15);
        this.A = new d0.c1();
        this.B = d2.a();
        this.C = d2.a();
        Boolean bool = Boolean.FALSE;
        this.D = bg.b.h(bool);
        this.E = bg.b.h(bool);
        this.F = bg.b.h(bool);
        this.G = bg.b.h(bool);
    }

    public static /* synthetic */ Object g(b bVar, int i10, m2 m2Var, vg.i iVar, int i11) {
        s.l lVarC = m2Var;
        if ((i11 & 4) != 0) {
            lVarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        }
        return bVar.f(i10, lVarC, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r8.c(r6, r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(d1 d1Var, t.b1 b1Var, eh.p pVar, vg.c cVar) {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i10 = z0Var.f8337f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                z0Var.f8337f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                z0Var = new z0(d1Var, cVar);
            }
        }
        Object obj = z0Var.f8335d;
        Object obj2 = ug.a.f29706a;
        int i11 = z0Var.f8337f;
        if (i11 == 0) {
            pg.q.b(obj);
            z0Var.f8332a = d1Var;
            z0Var.f8333b = b1Var;
            z0Var.f8334c = (vg.i) pVar;
            z0Var.f8337f = 1;
            Object objA = d1Var.f8165w.a(z0Var);
            if (objA != obj2) {
                objA = pg.f0.f21461a;
            }
            if (objA != obj2) {
            }
            return obj2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d1Var = z0Var.f8332a;
            pg.q.b(obj);
            d1Var.f8161s.f(-1);
            return pg.f0.f21461a;
        }
        pVar = (eh.p) z0Var.f8334c;
        b1Var = z0Var.f8333b;
        d1Var = z0Var.f8332a;
        pg.q.b(obj);
        if (!d1Var.f8153k.a()) {
            d1Var.f8162t.f(d1Var.j());
        }
        v.j jVar = d1Var.f8153k;
        z0Var.f8332a = d1Var;
        z0Var.f8333b = null;
        z0Var.f8334c = null;
        z0Var.f8337f = 2;
    }

    @Override // v.l1
    public final boolean a() {
        return this.f8153k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean b() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // v.l1
    public final Object c(t.b1 b1Var, eh.p pVar, vg.c cVar) {
        return s(this, b1Var, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // v.l1
    public final float e(float f10) {
        return this.f8153k.e(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r6.c(t.b1.f25167a, r5, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i10, s.l lVar, vg.c cVar) {
        u0 u0Var;
        d1 d1Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i11 = u0Var.f8309f;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                u0Var.f8309f = i11 - PKIFailureInfo.systemUnavail;
            } else {
                u0Var = new u0(this, cVar);
            }
        }
        Object obj = u0Var.f8307d;
        ug.a aVar = ug.a.f29706a;
        int i12 = u0Var.f8309f;
        if (i12 == 0) {
            pg.q.b(obj);
            if ((i10 == j() && k() == CropImageView.DEFAULT_ASPECT_RATIO) || m() == 0) {
                return pg.f0.f21461a;
            }
            u0Var.f8304a = this;
            u0Var.f8305b = lVar;
            u0Var.f8306c = i10;
            u0Var.f8309f = 1;
            Object objA = this.f8165w.a(u0Var);
            if (objA != aVar) {
                objA = pg.f0.f21461a;
            }
            if (objA != aVar) {
                d1Var = this;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        i10 = u0Var.f8306c;
        lVar = u0Var.f8305b;
        d1 d1Var2 = u0Var.f8304a;
        pg.q.b(obj);
        d1Var = d1Var2;
        s.l lVar2 = lVar;
        double d10 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (-0.5d > d10 || d10 > 0.5d) {
            y.c.a("pageOffsetFraction " + CropImageView.DEFAULT_ASPECT_RATIO + " is not within the range -0.5 to 0.5");
        }
        v0 v0Var = new v0(d1Var, d1Var.i(i10), CropImageView.DEFAULT_ASPECT_RATIO * d1Var.o(), lVar2, null);
        u0Var.f8304a = null;
        u0Var.f8305b = null;
        u0Var.f8309f = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011c A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:57:0x00c7, B:59:0x00da, B:61:0x00de, B:63:0x00ec, B:74:0x0126, B:69:0x011c, B:66:0x0104, B:77:0x012e), top: B:87:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:57:0x00c7, B:59:0x00da, B:61:0x00de, B:63:0x00ec, B:74:0x0126, B:69:0x011c, B:66:0x0104, B:77:0x012e), top: B:87:0x00c7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(o0 o0Var, boolean z10, boolean z11) {
        int i10 = o0Var.f8258h;
        m mVar = o0Var.f8260j;
        float f10 = o0Var.f8261k;
        List<m> list = o0Var.f8251a;
        if (!z10 && this.f8143a) {
            this.f8144b = o0Var;
            return;
        }
        boolean z12 = true;
        if (z10) {
            this.f8143a = true;
        }
        r0 r0Var = this.f8146d;
        if (z11) {
            r0Var.f8279c.e(f10);
        } else {
            r0Var.getClass();
            r0Var.f8281e = mVar != null ? mVar.f8225d : null;
            if (r0Var.f8280d || !list.isEmpty()) {
                r0Var.f8280d = true;
                int i11 = mVar != null ? mVar.f8222a : 0;
                r0Var.f8278b.f(i11);
                r0Var.f8282f.c(i11);
                r0Var.f8279c.e(f10);
            }
            if (this.f8155m != -1 && !list.isEmpty()) {
                if (this.f8155m != (this.f8157o ? i10 + ((n) qg.x.J(list)).getIndex() + 1 : (((n) qg.x.B(list)).getIndex() - i10) - 1)) {
                    this.f8155m = -1;
                    d1.b bVar = this.f8156n;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    this.f8156n = null;
                }
            }
        }
        this.f8158p.setValue(o0Var);
        boolean z13 = o0Var.f8263m;
        int i12 = o0Var.f8262l;
        m mVar2 = o0Var.f8259i;
        this.D.setValue(Boolean.valueOf(z13));
        this.E.setValue(Boolean.valueOf(((mVar2 != null ? mVar2.f8222a : 0) == 0 && i12 == 0) ? false : true));
        if (mVar2 != null) {
            this.f8147e = mVar2.f8222a;
        }
        this.f8148f = i12;
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            if (Math.abs(this.f8152j) > 0.5f && this.f8154l) {
                float f11 = this.f8152j;
                if (l().getOrientation() == v.t0.f30083a) {
                    if (Math.signum(f11) != Math.signum(-Float.intBitsToFloat((int) (p() & BodyPartID.bodyIdMax)))) {
                        if (!q()) {
                            z12 = false;
                        }
                    }
                    if (z12) {
                        r(this.f8152j, o0Var);
                    }
                } else {
                    if (Math.signum(f11) == Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                    }
                    if (z12) {
                    }
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            this.f8149g = e1.a(o0Var, m());
            m();
            int iB = (int) (o0Var.f8255e == v.t0.f30084b ? o0Var.b() >> 32 : o0Var.b() & BodyPartID.bodyIdMax);
            o0Var.f8264n.getClass();
            this.f8150h = jh.j.m(0, 0, iB);
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }

    public final int i(int i10) {
        if (m() > 0) {
            return jh.j.m(i10, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return this.f8146d.f8278b.g();
    }

    public final float k() {
        return this.f8146d.f8279c.getFloatValue();
    }

    public final c0 l() {
        return (c0) this.f8158p.getValue();
    }

    public abstract int m();

    /* JADX WARN: Multi-variable type inference failed */
    public final int n() {
        return ((o0) this.f8158p.getValue()).f8252b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o() {
        return ((o0) this.f8158p.getValue()).f8253c + n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p() {
        return ((p1.c) this.f8145c.getValue()).f21129a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & BodyPartID.bodyIdMax))) == 0;
    }

    public final void r(float f10, o0 o0Var) {
        d1.b bVar;
        d1.b bVar2;
        d1.b bVar3;
        int i10 = o0Var.f8258h;
        List<m> list = o0Var.f8251a;
        if (this.f8154l && !list.isEmpty()) {
            boolean z10 = f10 > CropImageView.DEFAULT_ASPECT_RATIO;
            int index = z10 ? i10 + ((n) qg.x.J(list)).getIndex() + 1 : (((n) qg.x.B(list)).getIndex() - i10) - 1;
            if (index < 0 || index >= m()) {
                return;
            }
            if (index != this.f8155m) {
                if (this.f8157o != z10 && (bVar3 = this.f8156n) != null) {
                    bVar3.cancel();
                }
                this.f8157o = z10;
                this.f8155m = index;
                this.f8156n = this.f8163u.a(index, this.f8168z);
            }
            if (z10) {
                if ((((n) qg.x.J(list)).getOffset() + (o0Var.f8253c + o0Var.f8252b)) - o0Var.f8257g >= f10 || (bVar2 = this.f8156n) == null) {
                    return;
                }
                bVar2.a();
                return;
            }
            if (o0Var.f8256f - ((n) qg.x.B(list)).getOffset() >= (-f10) || (bVar = this.f8156n) == null) {
                return;
            }
            bVar.a();
        }
    }

    public final void t(int i10, float f10, boolean z10) {
        r0 r0Var = this.f8146d;
        r0Var.f8278b.f(i10);
        r0Var.f8282f.c(i10);
        r0Var.f8279c.e(f10);
        r0Var.f8281e = null;
        if (!z10) {
            d2.b(this.C);
            return;
        }
        g2.i1 i1Var = (g2.i1) this.f8166x.getValue();
        if (i1Var != null) {
            i1Var.h();
        }
    }
}
