package i2;

import androidx.compose.ui.platform.AndroidComposeView;
import g2.g1;
import i2.e0;
import i2.v1;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f14031a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14033c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14034d;

    /* renamed from: i, reason: collision with root package name */
    public f3.b f14039i;

    /* renamed from: b, reason: collision with root package name */
    public final p f14032b = new p();

    /* renamed from: e, reason: collision with root package name */
    public final s1 f14035e = new s1();

    /* renamed from: f, reason: collision with root package name */
    public final z0.b<v1.a> f14036f = new z0.b<>(new v1.a[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f14037g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final z0.b<a> f14038h = new z0.b<>(new a[16]);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e0 f14040a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14041b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14042c;

        public a(e0 e0Var, boolean z10, boolean z11) {
            this.f14040a = e0Var;
            this.f14041b = z10;
            this.f14042c = z11;
        }
    }

    public u0(e0 e0Var) {
        this.f14031a = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(e0 e0Var, f3.b bVar) {
        boolean zW0;
        e0 e0Var2 = e0Var.f13816h;
        j0 j0Var = e0Var.K;
        if (e0Var2 == null) {
            return false;
        }
        if (bVar == null) {
            p0 p0Var = j0Var.f13930q;
            f3.b bVar2 = p0Var != null ? p0Var.f13984p : null;
            if (bVar2 != null && e0Var2 != null) {
                kotlin.jvm.internal.r.b(p0Var);
                zW0 = p0Var.w0(bVar2.f8811a);
            }
        } else if (e0Var2 != null) {
            p0 p0Var2 = j0Var.f13930q;
            kotlin.jvm.internal.r.b(p0Var2);
            zW0 = p0Var2.w0(bVar.f8811a);
        } else {
            zW0 = false;
        }
        e0 e0VarG = e0Var.G();
        if (zW0 && e0VarG != null) {
            if (e0VarG.f13816h == null) {
                e0.f0(e0VarG, false, 3);
                return zW0;
            }
            if (e0Var.E() == e0.f.f13840a) {
                e0.d0(e0VarG, false, 3);
                return zW0;
            }
            if (e0Var.E() == e0.f.f13841b) {
                e0VarG.c0(false);
            }
        }
        return zW0;
    }

    public static boolean c(e0 e0Var, f3.b bVar) {
        boolean zX = bVar != null ? e0Var.X(bVar) : e0.Y(e0Var);
        e0 e0VarG = e0Var.G();
        if (zX && e0VarG != null) {
            e0.f fVar = e0Var.K.f13929p.f14053m;
            if (fVar == e0.f.f13840a) {
                e0.f0(e0VarG, false, 3);
                return zX;
            }
            if (fVar == e0.f.f13841b) {
                e0VarG.e0(false);
            }
        }
        return zX;
    }

    public static boolean h(e0 e0Var) {
        if (!e0Var.D()) {
            return false;
        }
        do {
            if (!i(e0Var)) {
                e0 e0VarG = e0Var.G();
                if ((e0VarG != null ? e0VarG.K.f13917d : null) != e0.d.f13833a) {
                    return false;
                }
            }
            e0Var = e0Var.G();
            if (e0Var == null) {
                return false;
            }
        } while (!e0Var.x());
        return true;
    }

    public static boolean i(e0 e0Var) {
        x0 x0Var = e0Var.K.f13929p;
        return x0Var.f14053m == e0.f.f13840a || x0Var.B.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        Object[] objArr;
        s1 s1Var = this.f14035e;
        if (z10) {
            z0.b bVar = (z0.b) s1Var.f14016a;
            bVar.g();
            e0 e0Var = this.f14031a;
            bVar.b(e0Var);
            e0Var.S = true;
        }
        z0.b bVar2 = (z0.b) s1Var.f14016a;
        bVar2.n(r1.f14010a);
        int i10 = bVar2.f34702c;
        e0[] e0VarArr = (e0[]) s1Var.f14017b;
        if (e0VarArr != null) {
            int length = e0VarArr.length;
            objArr = e0VarArr;
            if (length < i10) {
                objArr = new e0[Math.max(16, i10)];
            }
        }
        s1Var.f14017b = null;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = bVar2.f34700a[i11];
        }
        bVar2.g();
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            e0 e0Var2 = objArr[i12];
            kotlin.jvm.internal.r.b(e0Var2);
            if (e0Var2.S) {
                s1.b(e0Var2);
            }
        }
        s1Var.f14017b = objArr;
    }

    public final void d() {
        z0.b<a> bVar = this.f14038h;
        int i10 = bVar.f34702c;
        if (i10 != 0) {
            a[] aVarArr = bVar.f34700a;
            for (int i11 = 0; i11 < i10; i11++) {
                a aVar = aVarArr[i11];
                e0 e0Var = aVar.f14040a;
                boolean z10 = aVar.f14042c;
                e0 e0Var2 = aVar.f14040a;
                if (e0Var.m()) {
                    if (aVar.f14041b) {
                        e0.d0(e0Var2, z10, 2);
                    } else {
                        e0.f0(e0Var2, z10, 2);
                    }
                }
            }
            bVar.g();
        }
    }

    public final void e(e0 e0Var) {
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (kotlin.jvm.internal.r.a(e0Var2.R(), Boolean.TRUE) && !e0Var2.T) {
                if (this.f14032b.f13974a.f13958a.contains(e0Var2)) {
                    e0Var2.S();
                }
                e(e0Var2);
            }
        }
    }

    public final void f(e0 e0Var, boolean z10) {
        if (!this.f14033c) {
            f2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? e0Var.K.f13918e : e0Var.D()) {
            f2.a.a("node not yet measured");
        }
        g(e0Var, z10);
    }

    public final void g(e0 e0Var, boolean z10) {
        p0 p0Var;
        k0 k0Var;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if ((!z10 && i(e0Var2)) || (z10 && (e0Var2.E() == e0.f.f13840a || ((p0Var = e0Var2.K.f13930q) != null && (k0Var = p0Var.f13989v) != null && k0Var.f())))) {
                boolean zD = f3.u.d(e0Var2);
                j0 j0Var = e0Var2.K;
                if (zD && !z10) {
                    if (j0Var.f13918e && this.f14032b.f13974a.f13958a.contains(e0Var2)) {
                        m(e0Var2, true, false);
                    } else {
                        f(e0Var2, true);
                    }
                }
                if (z10 ? j0Var.f13918e : e0Var2.D()) {
                    m(e0Var2, z10, false);
                }
                if (!(z10 ? j0Var.f13918e : e0Var2.D())) {
                    g(e0Var2, z10);
                }
            }
        }
        if (z10 ? e0Var.K.f13918e : e0Var.D()) {
            m(e0Var, z10, false);
        }
    }

    public final boolean j(AndroidComposeView.s sVar) {
        boolean z10;
        e0 e0VarFirst;
        p pVar = this.f14032b;
        e0 e0Var = this.f14031a;
        if (!e0Var.m()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var.x()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f14033c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f14039i != null) {
            this.f14033c = true;
            this.f14034d = true;
            try {
                if (pVar.b()) {
                    z10 = false;
                    while (true) {
                        boolean zB = pVar.b();
                        n nVar = pVar.f13974a;
                        if (!zB) {
                            break;
                        }
                        boolean zIsEmpty = nVar.f13958a.isEmpty();
                        boolean z11 = !zIsEmpty;
                        if (zIsEmpty) {
                            n nVar2 = pVar.f13975b;
                            e0 e0VarFirst2 = nVar2.f13958a.first();
                            nVar2.b(e0VarFirst2);
                            e0VarFirst = e0VarFirst2;
                        } else {
                            e0VarFirst = nVar.f13958a.first();
                            nVar.b(e0VarFirst);
                        }
                        boolean zM = m(e0VarFirst, z11, true);
                        if (e0VarFirst == e0Var && zM) {
                            z10 = true;
                        }
                    }
                    if (sVar != null) {
                        sVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f14033c = false;
                this.f14034d = false;
            } catch (Throwable th2) {
                this.f14033c = false;
                this.f14034d = false;
                throw th2;
            }
        } else {
            z10 = false;
        }
        z0.b<v1.a> bVar = this.f14036f;
        v1.a[] aVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11].b();
        }
        bVar.g();
        return z10;
    }

    public final void k(e0 e0Var, long j10) {
        if (e0Var.T) {
            return;
        }
        e0 e0Var2 = this.f14031a;
        if (e0Var.equals(e0Var2)) {
            f2.a.a("measureAndLayout called on root");
        }
        if (!e0Var2.m()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var2.x()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f14033c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f14039i != null) {
            this.f14033c = true;
            this.f14034d = false;
            try {
                p pVar = this.f14032b;
                pVar.f13974a.b(e0Var);
                pVar.f13975b.b(e0Var);
                if ((b(e0Var, new f3.b(j10)) || e0Var.K.f13919f) && kotlin.jvm.internal.r.a(e0Var.R(), Boolean.TRUE)) {
                    e0Var.S();
                }
                e(e0Var);
                c(e0Var, new f3.b(j10));
                if (e0Var.C() && e0Var.x()) {
                    e0Var.b0();
                    ((z0.b) this.f14035e.f14016a).b(e0Var);
                    e0Var.S = true;
                }
                d();
                this.f14033c = false;
                this.f14034d = false;
            } catch (Throwable th2) {
                this.f14033c = false;
                this.f14034d = false;
                throw th2;
            }
        }
        z0.b<v1.a> bVar = this.f14036f;
        v1.a[] aVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11].b();
        }
        bVar.g();
    }

    public final void l() {
        p pVar = this.f14032b;
        if (pVar.b()) {
            e0 e0Var = this.f14031a;
            if (!e0Var.m()) {
                f2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!e0Var.x()) {
                f2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f14033c) {
                f2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f14039i != null) {
                this.f14033c = true;
                this.f14034d = false;
                try {
                    if (!pVar.f13974a.f13958a.isEmpty()) {
                        if (e0Var.f13816h != null) {
                            o(e0Var, true);
                        } else {
                            n(e0Var);
                        }
                    }
                    o(e0Var, false);
                    this.f14033c = false;
                    this.f14034d = false;
                } catch (Throwable th2) {
                    this.f14033c = false;
                    this.f14034d = false;
                    throw th2;
                }
            }
        }
    }

    public final boolean m(e0 e0Var, boolean z10, boolean z11) {
        f3.b bVar;
        boolean zB;
        g1.a placementScope;
        w wVar;
        e0 e0VarG;
        p0 p0Var;
        k0 k0Var;
        p0 p0Var2;
        k0 k0Var2;
        boolean z12 = e0Var.T;
        j0 j0Var = e0Var.K;
        if (z12 || (!e0Var.x() && !j0Var.f13929p.f14062x && !h(e0Var) && !kotlin.jvm.internal.r.a(e0Var.R(), Boolean.TRUE) && ((!j0Var.f13918e || (e0Var.E() != e0.f.f13840a && ((p0Var2 = j0Var.f13930q) == null || (k0Var2 = p0Var2.f13989v) == null || !k0Var2.f()))) && !j0Var.f13929p.B.f() && ((p0Var = j0Var.f13930q) == null || (k0Var = p0Var.f13989v) == null || !k0Var.f())))) {
            return false;
        }
        e0 e0Var2 = this.f14031a;
        if (e0Var == e0Var2) {
            bVar = this.f14039i;
            kotlin.jvm.internal.r.b(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            zB = j0Var.f13918e ? b(e0Var, bVar) : false;
            if (z11 && ((zB || j0Var.f13919f) && kotlin.jvm.internal.r.a(e0Var.R(), Boolean.TRUE))) {
                e0Var.S();
            }
        } else {
            boolean zC = e0Var.D() ? c(e0Var, bVar) : false;
            if (z11 && e0Var.C() && (e0Var == e0Var2 || ((e0VarG = e0Var.G()) != null && e0VarG.x() && j0Var.f13929p.f14062x))) {
                if (e0Var == e0Var2) {
                    if (e0Var.F == e0.f.f13842c) {
                        e0Var.q();
                    }
                    e0 e0VarG2 = e0Var.G();
                    if (e0VarG2 == null || (wVar = e0VarG2.I.f13790b) == null || (placementScope = wVar.f13939j) == null) {
                        placementScope = i0.a(e0Var).getPlacementScope();
                    }
                    g1.a.g(placementScope, j0Var.f13929p, 0, 0);
                } else {
                    e0Var.b0();
                }
                ((z0.b) this.f14035e.f14016a).b(e0Var);
                e0Var.S = true;
                i0.a(e0Var).getRectManager().d(e0Var);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(e0 e0Var) {
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (i(e0Var2)) {
                if (f3.u.d(e0Var2)) {
                    o(e0Var2, true);
                } else {
                    n(e0Var2);
                }
            }
        }
    }

    public final void o(e0 e0Var, boolean z10) {
        f3.b bVar;
        if (e0Var.T) {
            return;
        }
        if (e0Var == this.f14031a) {
            bVar = this.f14039i;
            kotlin.jvm.internal.r.b(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            b(e0Var, bVar);
        } else {
            c(e0Var, bVar);
        }
    }

    public final boolean p(e0 e0Var, boolean z10) {
        int iOrdinal = e0Var.K.f13917d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f14038h.b(new a(e0Var, false, z10));
            } else {
                if (iOrdinal != 4) {
                    throw new pg.l();
                }
                if (!e0Var.D() || z10) {
                    e0Var.K.f13929p.f14063y = true;
                    if (!e0Var.T && (e0Var.x() || h(e0Var))) {
                        e0 e0VarG = e0Var.G();
                        if (e0VarG == null || !e0VarG.D()) {
                            this.f14032b.a(e0Var, false);
                        }
                        if (!this.f14034d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j10) {
        f3.b bVar = this.f14039i;
        if (bVar == null ? false : f3.b.c(bVar.f8811a, j10)) {
            return;
        }
        if (this.f14033c) {
            f2.a.a("updateRootConstraints called while measuring");
        }
        this.f14039i = new f3.b(j10);
        e0 e0Var = this.f14031a;
        e0 e0Var2 = e0Var.f13816h;
        j0 j0Var = e0Var.K;
        if (e0Var2 != null) {
            j0Var.f13918e = true;
        }
        j0Var.f13929p.f14063y = true;
        this.f14032b.a(e0Var, e0Var2 != null);
    }
}
