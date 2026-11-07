package i2;

import androidx.compose.ui.d;
import i0.u2;
import i2.e1;
import i2.g1;
import i2.p0;
import i2.v1;
import i3.b;
import j2.h3;
import j2.k5;
import java.util.List;
import x0.z;
import z0.b;

/* loaded from: classes.dex */
public final class e0 implements x0.h, g2.i1, w1, g2.z, q2.n, i2.g, v1.a {
    public static final c U = new c("Undefined intrinsics block and it is required");
    public static final a V = a.f13832a;
    public static final b W = new b();
    public static final d0 X = new d0();
    public y A;
    public f3.d B;
    public f3.r C;
    public k5 D;
    public x0.z E;
    public f F;
    public f G;
    public boolean H;
    public final d1 I;
    public final j0 K;
    public g2.d0 L;
    public g1 M;
    public boolean N;
    public androidx.compose.ui.d O;
    public androidx.compose.ui.d P;
    public b.e Q;
    public b.f R;
    public boolean S;
    public boolean T;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13809a;

    /* renamed from: b, reason: collision with root package name */
    public int f13810b;

    /* renamed from: c, reason: collision with root package name */
    public long f13811c;

    /* renamed from: d, reason: collision with root package name */
    public long f13812d;

    /* renamed from: e, reason: collision with root package name */
    public long f13813e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13814f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13815g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f13816h;

    /* renamed from: j, reason: collision with root package name */
    public int f13817j;

    /* renamed from: k, reason: collision with root package name */
    public final c1<e0> f13818k;

    /* renamed from: l, reason: collision with root package name */
    public z0.b<e0> f13819l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13820m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f13821n;

    /* renamed from: p, reason: collision with root package name */
    public v1 f13822p;

    /* renamed from: q, reason: collision with root package name */
    public i3.l f13823q;

    /* renamed from: r, reason: collision with root package name */
    public int f13824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13825s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13826t;

    /* renamed from: v, reason: collision with root package name */
    public q2.l f13827v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13828w;

    /* renamed from: x, reason: collision with root package name */
    public final z0.b<e0> f13829x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13830y;

    /* renamed from: z, reason: collision with root package name */
    public g2.l0 f13831z;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<e0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13832a = new a(0);

        @Override // eh.a
        public final e0 invoke() {
            return new e0(3);
        }
    }

    public static final class b implements k5 {
        @Override // j2.k5
        public final long a() {
            return 300L;
        }

        @Override // j2.k5
        public final long b() {
            return 400L;
        }

        @Override // j2.k5
        public final long d() {
            return 0L;
        }

        @Override // j2.k5
        public final float f() {
            return 16.0f;
        }
    }

    public static final class c extends e {
        @Override // g2.l0
        public final g2.m0 h(g2.o0 o0Var, List list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13833a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f13834b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f13835c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f13836d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f13837e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f13838f;

        static {
            d dVar = new d("Measuring", 0);
            f13833a = dVar;
            d dVar2 = new d("LookaheadMeasuring", 1);
            f13834b = dVar2;
            d dVar3 = new d("LayingOut", 2);
            f13835c = dVar3;
            d dVar4 = new d("LookaheadLayingOut", 3);
            f13836d = dVar4;
            d dVar5 = new d("Idle", 4);
            f13837e = dVar5;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
            f13838f = dVarArr;
            u2.e(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f13838f.clone();
        }
    }

    public static abstract class e implements g2.l0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f13839a;

        public e(String str) {
            this.f13839a = str;
        }

        @Override // g2.l0
        public final int c(g2.q qVar, List list, int i10) {
            throw new IllegalStateException(this.f13839a.toString());
        }

        @Override // g2.l0
        public final int f(g2.q qVar, List list, int i10) {
            throw new IllegalStateException(this.f13839a.toString());
        }

        @Override // g2.l0
        public final int g(g2.q qVar, List list, int i10) {
            throw new IllegalStateException(this.f13839a.toString());
        }

        @Override // g2.l0
        public final int i(g2.q qVar, List list, int i10) {
            throw new IllegalStateException(this.f13839a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f13840a;

        /* renamed from: b, reason: collision with root package name */
        public static final f f13841b;

        /* renamed from: c, reason: collision with root package name */
        public static final f f13842c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ f[] f13843d;

        static {
            f fVar = new f("InMeasureBlock", 0);
            f13840a = fVar;
            f fVar2 = new f("InLayoutBlock", 1);
            f13841b = fVar2;
            f fVar3 = new f("NotUsed", 2);
            f13842c = fVar3;
            f[] fVarArr = {fVar, fVar2, fVar3};
            f13843d = fVarArr;
            u2.e(fVarArr);
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f13843d.clone();
        }
    }

    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13844a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                d dVar = d.f13833a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13844a = iArr;
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public h() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            j0 j0Var = e0.this.K;
            j0Var.f13929p.D = true;
            p0 p0Var = j0Var.f13930q;
            if (p0Var != null) {
                p0Var.f13991x = true;
            }
            return pg.f0.f21461a;
        }
    }

    public e0() {
        this(3);
    }

    public static boolean Y(e0 e0Var) {
        x0 x0Var = e0Var.K.f13929p;
        return e0Var.X(x0Var.f14051k ? new f3.b(x0Var.f11385d) : null);
    }

    public static void d0(e0 e0Var, boolean z10, int i10) {
        e0 e0VarG;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (e0Var.f13816h == null) {
            f2.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        v1 v1Var = e0Var.f13822p;
        if (v1Var == null || e0Var.f13825s || e0Var.f13809a) {
            return;
        }
        v1Var.r(e0Var, true, z10, z11);
        if (z12) {
            p0 p0Var = e0Var.K.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            j0 j0Var = p0Var.f13976f;
            e0 e0VarG2 = j0Var.f13914a.G();
            f fVar = j0Var.f13914a.F;
            if (e0VarG2 == null || fVar == f.f13842c) {
                return;
            }
            while (e0VarG2.F == fVar && (e0VarG = e0VarG2.G()) != null) {
                e0VarG2 = e0VarG;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                if (e0VarG2.f13816h != null) {
                    d0(e0VarG2, z10, 6);
                    return;
                } else {
                    f0(e0VarG2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (e0VarG2.f13816h != null) {
                e0VarG2.c0(z10);
            } else {
                e0VarG2.e0(z10);
            }
        }
    }

    public static void f0(e0 e0Var, boolean z10, int i10) {
        v1 v1Var;
        e0 e0VarG;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (e0Var.f13825s || e0Var.f13809a || (v1Var = e0Var.f13822p) == null) {
            return;
        }
        v1Var.r(e0Var, false, z10, z11);
        if (z12) {
            j0 j0Var = e0Var.K.f13929p.f14047f;
            e0 e0VarG2 = j0Var.f13914a.G();
            f fVar = j0Var.f13914a.F;
            if (e0VarG2 == null || fVar == f.f13842c) {
                return;
            }
            while (e0VarG2.F == fVar && (e0VarG = e0VarG2.G()) != null) {
                e0VarG2 = e0VarG;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                f0(e0VarG2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                e0VarG2.e0(z10);
            }
        }
    }

    public static void g0(e0 e0Var) {
        j0 j0Var = e0Var.K;
        if (g.f13844a[j0Var.f13917d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + j0Var.f13917d);
        }
        if (j0Var.f13918e) {
            d0(e0Var, true, 6);
            return;
        }
        if (j0Var.f13919f) {
            e0Var.c0(true);
        }
        if (e0Var.D()) {
            f0(e0Var, true, 6);
        } else if (e0Var.C()) {
            e0Var.e0(true);
        }
    }

    private final String u(e0 e0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(e0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(r(0));
        sb.append(" Other tree: ");
        e0 e0Var2 = e0Var.f13821n;
        sb.append(e0Var2 != null ? e0Var2.r(0) : null);
        return sb.toString();
    }

    public final List<e0> A() {
        return J().f();
    }

    public final List<e0> B() {
        return this.f13818k.f13785a.f();
    }

    public final boolean C() {
        return this.K.f13929p.f14064z;
    }

    public final boolean D() {
        return this.K.f13929p.f14063y;
    }

    public final f E() {
        f fVar;
        p0 p0Var = this.K.f13930q;
        return (p0Var == null || (fVar = p0Var.f13980k) == null) ? f.f13842c : fVar;
    }

    public final y F() {
        y yVar = this.A;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, this.f13831z);
        this.A = yVar2;
        return yVar2;
    }

    public final e0 G() {
        e0 e0Var = this.f13821n;
        while (e0Var != null && e0Var.f13809a) {
            e0Var = e0Var.f13821n;
        }
        return e0Var;
    }

    public final int H() {
        return this.K.f13929p.f14050j;
    }

    public final z0.b<e0> I() {
        boolean z10 = this.f13830y;
        z0.b<e0> bVar = this.f13829x;
        if (z10) {
            bVar.g();
            bVar.d(bVar.f34702c, J());
            bVar.n(X);
            this.f13830y = false;
        }
        return bVar;
    }

    public final z0.b<e0> J() {
        l0();
        if (this.f13817j == 0) {
            return this.f13818k.f13785a;
        }
        z0.b<e0> bVar = this.f13819l;
        kotlin.jvm.internal.r.b(bVar);
        return bVar;
    }

    public final void K(long j10, u uVar, int i10, boolean z10) {
        d1 d1Var = this.I;
        g1 g1Var = d1Var.f13791c;
        g1.d dVar = g1.O;
        d1Var.f13791c.u1(g1.T, g1Var.d1(j10), uVar, i10, z10);
    }

    public final void L(int i10, e0 e0Var) {
        if (e0Var.f13821n != null && e0Var.f13822p != null) {
            f2.a.b(u(e0Var));
        }
        e0Var.f13821n = this;
        c1<e0> c1Var = this.f13818k;
        c1Var.f13785a.a(i10, e0Var);
        c1Var.f13786b.invoke();
        W();
        if (e0Var.f13809a) {
            this.f13817j++;
        }
        Q();
        v1 v1Var = this.f13822p;
        if (v1Var != null) {
            e0Var.o(v1Var);
        }
        if (e0Var.K.f13925l > 0) {
            j0 j0Var = this.K;
            j0Var.b(j0Var.f13925l + 1);
        }
    }

    public final void M() {
        if (this.N) {
            d1 d1Var = this.I;
            g1 g1Var = d1Var.f13790b;
            g1 g1Var2 = d1Var.f13791c.f13878s;
            this.M = null;
            while (true) {
                if (kotlin.jvm.internal.r.a(g1Var, g1Var2)) {
                    break;
                }
                if ((g1Var != null ? g1Var.M : null) != null) {
                    this.M = g1Var;
                    break;
                }
                g1Var = g1Var != null ? g1Var.f13878s : null;
            }
        }
        g1 g1Var3 = this.M;
        if (g1Var3 != null && g1Var3.M == null) {
            throw k1.a.a("layer was not set");
        }
        if (g1Var3 != null) {
            g1Var3.x1();
            return;
        }
        e0 e0VarG = G();
        if (e0VarG != null) {
            e0VarG.M();
        }
    }

    public final void N() {
        d1 d1Var = this.I;
        w wVar = d1Var.f13790b;
        for (g1 g1Var = d1Var.f13791c; g1Var != wVar; g1Var = g1Var.f13877r) {
            kotlin.jvm.internal.r.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            u1 u1Var = ((c0) g1Var).M;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
        u1 u1Var2 = d1Var.f13790b.M;
        if (u1Var2 != null) {
            u1Var2.invalidate();
        }
    }

    public final void O() {
        this.f13814f = true;
        if (this.f13816h != null) {
            d0(this, false, 7);
        } else {
            f0(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, q2.l] */
    public final void P() {
        if (this.f13828w) {
            return;
        }
        this.I.getClass();
        if (e1.f13846a.f1149f != null || this.P != null) {
            this.f13826t = true;
            return;
        }
        q2.l lVar = this.f13827v;
        this.f13828w = true;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f16327a = new q2.l();
        f2 snapshotObserver = i0.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f13856d, new f0(this, g0Var));
        this.f13828w = false;
        this.f13827v = (q2.l) g0Var.f16327a;
        this.f13826t = false;
        v1 v1VarA = i0.a(this);
        p.h0<q2.o> h0Var = v1VarA.getSemanticsOwner().f21819d;
        Object[] objArr = h0Var.f20706a;
        int i10 = h0Var.f20707b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((q2.o) objArr[i11]).b(this, lVar);
        }
        v1VarA.v();
    }

    public final void Q() {
        e0 e0Var;
        if (this.f13817j > 0) {
            this.f13820m = true;
        }
        if (!this.f13809a || (e0Var = this.f13821n) == null) {
            return;
        }
        e0Var.Q();
    }

    public final Boolean R() {
        p0 p0Var = this.K.f13930q;
        if (p0Var != null) {
            return Boolean.valueOf(p0Var.x());
        }
        return null;
    }

    public final void S() {
        e0 e0VarG;
        if (this.F == f.f13842c) {
            q();
        }
        p0 p0Var = this.K.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        try {
            p0Var.f13977g = true;
            if (!p0Var.f13982m) {
                f2.a.b("replace() called on item that was not placed");
            }
            p0Var.B = false;
            boolean zX = p0Var.x();
            p0Var.v0(p0Var.f13985q, p0Var.f13986r, p0Var.f13987s);
            if (zX && !p0Var.B && (e0VarG = p0Var.f13976f.f13914a.G()) != null) {
                e0VarG.c0(false);
            }
            p0Var.f13977g = false;
        } catch (Throwable th2) {
            p0Var.f13977g = false;
            throw th2;
        }
    }

    public final void T(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            c1<e0> c1Var = this.f13818k;
            z0.b<e0> bVar = c1Var.f13785a;
            h hVar = c1Var.f13786b;
            e0 e0VarK = bVar.k(i14);
            hVar.invoke();
            c1Var.f13785a.a(i15, e0VarK);
            hVar.invoke();
        }
        W();
        Q();
        O();
    }

    @Override // i2.w1
    public final boolean U() {
        return m();
    }

    public final void V(e0 e0Var) {
        if (e0Var.K.f13925l > 0) {
            this.K.b(r0.f13925l - 1);
        }
        if (this.f13822p != null) {
            e0Var.s();
        }
        e0Var.f13821n = null;
        e0Var.I.f13791c.f13878s = null;
        if (e0Var.f13809a) {
            this.f13817j--;
            z0.b<e0> bVar = e0Var.f13818k.f13785a;
            e0[] e0VarArr = bVar.f34700a;
            int i10 = bVar.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0VarArr[i11].I.f13791c.f13878s = null;
            }
        }
        Q();
        W();
    }

    public final void W() {
        if (!this.f13809a) {
            this.f13830y = true;
            return;
        }
        e0 e0VarG = G();
        if (e0VarG != null) {
            e0VarG.W();
        }
    }

    public final boolean X(f3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.F == f.f13842c) {
            p();
        }
        return this.K.f13929p.B0(bVar.f8811a);
    }

    public final void Z() {
        c1<e0> c1Var = this.f13818k;
        z0.b<e0> bVar = c1Var.f13785a;
        z0.b<e0> bVar2 = c1Var.f13785a;
        int i10 = bVar.f34702c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                bVar2.g();
                c1Var.f13786b.invoke();
                return;
            }
            V(bVar2.f34700a[i10]);
        }
    }

    @Override // x0.h
    public final void a() {
        i3.l lVar = this.f13823q;
        if (lVar != null) {
            lVar.a();
        }
        g2.d0 d0Var = this.L;
        if (d0Var != null) {
            d0Var.a();
        }
        d1 d1Var = this.I;
        g1 g1Var = d1Var.f13790b.f13877r;
        for (g1 g1Var2 = d1Var.f13791c; !kotlin.jvm.internal.r.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f13877r) {
            g1Var2.f13879t = true;
            g1Var2.K.invoke();
            if (g1Var2.M != null) {
                if (g1Var2.N != null) {
                    g1Var2.N = null;
                }
                g1Var2.T1(null, false);
                g1Var2.f13874n.e0(false);
            }
        }
    }

    public final void a0(int i10, int i11) {
        if (i11 < 0) {
            f2.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            c1<e0> c1Var = this.f13818k;
            V(c1Var.f13785a.f34700a[i12]);
            c1Var.f13785a.k(i12);
            c1Var.f13786b.invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // i2.v1.a
    public final void b() {
        d.c cVar;
        d1 d1Var = this.I;
        w wVar = d1Var.f13790b;
        boolean zG = j1.g(128);
        if (zG) {
            cVar = wVar.V;
        } else {
            cVar = wVar.V.f1148e;
            if (cVar == null) {
                return;
            }
        }
        g1.d dVar = g1.O;
        for (d.c cVarN1 = wVar.n1(zG); cVarN1 != null && (cVarN1.f1147d & 128) != 0; cVarN1 = cVarN1.f1149f) {
            if ((cVarN1.f1146c & 128) != 0) {
                m mVarB = cVarN1;
                ?? bVar = 0;
                while (mVarB != 0) {
                    if (mVarB instanceof a0) {
                        ((a0) mVarB).t0(d1Var.f13790b);
                    } else if ((mVarB.f1146c & 128) != 0 && (mVarB instanceof m)) {
                        d.c cVar2 = mVarB.f13947r;
                        int i10 = 0;
                        mVarB = mVarB;
                        bVar = bVar;
                        while (cVar2 != null) {
                            if ((cVar2.f1146c & 128) != 0) {
                                i10++;
                                bVar = bVar;
                                if (i10 == 1) {
                                    mVarB = cVar2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new z0.b(new d.c[16]);
                                    }
                                    if (mVarB != 0) {
                                        bVar.b(mVarB);
                                        mVarB = 0;
                                    }
                                    bVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f1149f;
                            mVarB = mVarB;
                            bVar = bVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVarB = k.b(bVar);
                }
            }
            if (cVarN1 == cVar) {
                return;
            }
        }
    }

    public final void b0() {
        e0 e0VarG;
        if (this.F == f.f13842c) {
            q();
        }
        x0 x0Var = this.K.f13929p;
        x0Var.getClass();
        try {
            x0Var.f14048g = true;
            if (!x0Var.f14052l) {
                f2.a.b("replace called on unplaced item");
            }
            boolean z10 = x0Var.f14061w;
            x0Var.w0(x0Var.f14055p, x0Var.f14058s, x0Var.f14056q, x0Var.f14057r);
            if (z10 && !x0Var.K && (e0VarG = x0Var.f14047f.f13914a.G()) != null) {
                e0VarG.e0(false);
            }
            x0Var.f14048g = false;
        } catch (Throwable th2) {
            x0Var.f14048g = false;
            throw th2;
        }
    }

    @Override // i2.g
    public final void c(androidx.compose.ui.d dVar) {
        if (this.f13809a && this.O != d.a.f1143b) {
            f2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.T) {
            f2.a.a("modifier is updated when deactivated");
        }
        if (!m()) {
            this.P = dVar;
            return;
        }
        n(dVar);
        if (this.f13826t) {
            P();
        }
    }

    public final void c0(boolean z10) {
        v1 v1Var;
        if (this.f13809a || (v1Var = this.f13822p) == null) {
            return;
        }
        v1Var.m(this, true, z10);
    }

    @Override // x0.h
    public final void d() {
        i3.l lVar = this.f13823q;
        if (lVar != null) {
            lVar.d();
        }
        g2.d0 d0Var = this.L;
        if (d0Var != null) {
            d0Var.e(true);
        }
        this.T = true;
        d1 d1Var = this.I;
        for (d.c cVar = d1Var.f13792d; cVar != null; cVar = cVar.f1148e) {
            if (cVar.f1157p) {
                cVar.O1();
            }
        }
        d1Var.f();
        for (d.c cVar2 = d1Var.f13792d; cVar2 != null; cVar2 = cVar2.f1148e) {
            if (cVar2.f1157p) {
                cVar2.K1();
            }
        }
        if (m()) {
            this.f13827v = null;
            this.f13826t = false;
        }
        v1 v1Var = this.f13822p;
        if (v1Var != null) {
            v1Var.q(this);
        }
    }

    @Override // q2.n
    public final q2.l e() {
        if (m() && !this.T && this.I.d(8)) {
            return this.f13827v;
        }
        return null;
    }

    public final void e0(boolean z10) {
        v1 v1Var;
        this.f13814f = true;
        if (this.f13809a || (v1Var = this.f13822p) == null) {
            return;
        }
        v1Var.m(this, false, z10);
    }

    @Override // q2.n
    public final e0 f() {
        return G();
    }

    @Override // q2.n
    public final List<q2.n> g() {
        return A();
    }

    @Override // g2.i1
    public final void h() {
        if (this.f13816h != null) {
            d0(this, false, 5);
        } else {
            f0(this, false, 5);
        }
        x0 x0Var = this.K.f13929p;
        f3.b bVar = x0Var.f14051k ? new f3.b(x0Var.f11385d) : null;
        if (bVar != null) {
            v1 v1Var = this.f13822p;
            if (v1Var != null) {
                v1Var.t(this, bVar.f8811a);
                return;
            }
            return;
        }
        v1 v1Var2 = this.f13822p;
        if (v1Var2 != null) {
            v1Var2.a(true);
        }
    }

    public final void h0() {
        z0.b<e0> bVarJ = J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = e0VarArr[i11];
            f fVar = e0Var.G;
            e0Var.F = fVar;
            if (fVar != f.f13842c) {
                e0Var.h0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // i2.g
    public final void i(x0.z zVar) {
        this.E = zVar;
        i0((f3.d) zVar.c(j2.j2.f14779h));
        f3.r rVar = (f3.r) zVar.c(j2.j2.f14785n);
        if (this.C != rVar) {
            this.C = rVar;
            O();
            e0 e0VarG = G();
            if (e0VarG != null) {
                e0VarG.M();
            }
            N();
            for (d.c cVar = this.I.f13793e; cVar != null; cVar = cVar.f1149f) {
                cVar.B0();
            }
        }
        k0((k5) zVar.c(j2.j2.f14790s));
        d.c cVar2 = this.I.f13793e;
        if ((cVar2.f1147d & 32768) != 0) {
            while (cVar2 != null) {
                if ((cVar2.f1146c & 32768) != 0) {
                    m mVarB = cVar2;
                    ?? bVar = 0;
                    while (mVarB != 0) {
                        if (mVarB instanceof i2.h) {
                            d.c cVarB = ((i2.h) mVarB).B();
                            if (cVarB.f1157p) {
                                j1.c(cVarB);
                            } else {
                                cVarB.f1153k = true;
                            }
                        } else if ((mVarB.f1146c & 32768) != 0 && (mVarB instanceof m)) {
                            d.c cVar3 = mVarB.f13947r;
                            int i10 = 0;
                            mVarB = mVarB;
                            bVar = bVar;
                            while (cVar3 != null) {
                                if ((cVar3.f1146c & 32768) != 0) {
                                    i10++;
                                    bVar = bVar;
                                    if (i10 == 1) {
                                        mVarB = cVar3;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (mVarB != 0) {
                                            bVar.b(mVarB);
                                            mVarB = 0;
                                        }
                                        bVar.b(cVar3);
                                    }
                                }
                                cVar3 = cVar3.f1149f;
                                mVarB = mVarB;
                                bVar = bVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVarB = k.b(bVar);
                    }
                }
                if ((cVar2.f1147d & 32768) == 0) {
                    return;
                } else {
                    cVar2 = cVar2.f1149f;
                }
            }
        }
    }

    public final void i0(f3.d dVar) {
        if (kotlin.jvm.internal.r.a(this.B, dVar)) {
            return;
        }
        this.B = dVar;
        O();
        e0 e0VarG = G();
        if (e0VarG != null) {
            e0VarG.M();
        }
        N();
        for (d.c cVar = this.I.f13793e; cVar != null; cVar = cVar.f1149f) {
            cVar.x();
        }
    }

    @Override // x0.h
    public final void j() {
        if (!m()) {
            f2.a.a("onReuse is only expected on attached node");
        }
        i3.l lVar = this.f13823q;
        if (lVar != null) {
            lVar.j();
        }
        g2.d0 d0Var = this.L;
        if (d0Var != null) {
            d0Var.e(false);
        }
        this.f13828w = false;
        boolean z10 = this.T;
        d1 d1Var = this.I;
        if (z10) {
            this.T = false;
        } else {
            for (d.c cVar = d1Var.f13792d; cVar != null; cVar = cVar.f1148e) {
                if (cVar.f1157p) {
                    cVar.O1();
                }
            }
            d1Var.f();
            for (d.c cVar2 = d1Var.f13792d; cVar2 != null; cVar2 = cVar2.f1148e) {
                if (cVar2.f1157p) {
                    cVar2.K1();
                }
            }
        }
        int i10 = this.f13810b;
        this.f13810b = q2.q.f21804a.addAndGet(1);
        v1 v1Var = this.f13822p;
        if (v1Var != null) {
            v1Var.c(i10, this);
        }
        for (d.c cVar3 = d1Var.f13793e; cVar3 != null; cVar3 = cVar3.f1149f) {
            cVar3.J1();
        }
        d1Var.e();
        if (d1Var.d(8)) {
            P();
        }
        g0(this);
        v1 v1Var2 = this.f13822p;
        if (v1Var2 != null) {
            v1Var2.x(i10, this);
        }
    }

    public final void j0(e0 e0Var) {
        if (kotlin.jvm.internal.r.a(e0Var, this.f13816h)) {
            return;
        }
        this.f13816h = e0Var;
        j0 j0Var = this.K;
        if (e0Var != null) {
            if (j0Var.f13930q == null) {
                j0Var.f13930q = new p0(j0Var);
            }
            d1 d1Var = this.I;
            g1 g1Var = d1Var.f13790b.f13877r;
            for (g1 g1Var2 = d1Var.f13791c; !kotlin.jvm.internal.r.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f13877r) {
                g1Var2.Y0();
            }
        } else {
            j0Var.f13930q = null;
        }
        O();
    }

    @Override // q2.n
    public final boolean k() {
        return this.I.f13791c.E1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void k0(k5 k5Var) {
        if (kotlin.jvm.internal.r.a(this.D, k5Var)) {
            return;
        }
        this.D = k5Var;
        d.c cVar = this.I.f13793e;
        if ((cVar.f1147d & 16) != 0) {
            while (cVar != null) {
                if ((cVar.f1146c & 16) != 0) {
                    m mVarB = cVar;
                    ?? bVar = 0;
                    while (mVarB != 0) {
                        if (mVarB instanceof i2) {
                            ((i2) mVarB).q1();
                        } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof m)) {
                            d.c cVar2 = mVarB.f13947r;
                            int i10 = 0;
                            mVarB = mVarB;
                            bVar = bVar;
                            while (cVar2 != null) {
                                if ((cVar2.f1146c & 16) != 0) {
                                    i10++;
                                    bVar = bVar;
                                    if (i10 == 1) {
                                        mVarB = cVar2;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (mVarB != 0) {
                                            bVar.b(mVarB);
                                            mVarB = 0;
                                        }
                                        bVar.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.f1149f;
                                mVarB = mVarB;
                                bVar = bVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVarB = k.b(bVar);
                    }
                }
                if ((cVar.f1147d & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.f1149f;
                }
            }
        }
    }

    @Override // i2.g
    public final void l(g2.l0 l0Var) {
        if (kotlin.jvm.internal.r.a(this.f13831z, l0Var)) {
            return;
        }
        this.f13831z = l0Var;
        y yVar = this.A;
        if (yVar != null) {
            yVar.f14071b.setValue(l0Var);
        }
        O();
    }

    public final void l0() {
        if (this.f13817j <= 0 || !this.f13820m) {
            return;
        }
        this.f13820m = false;
        z0.b<e0> bVar = this.f13819l;
        if (bVar == null) {
            bVar = new z0.b<>(new e0[16]);
            this.f13819l = bVar;
        }
        bVar.g();
        z0.b<e0> bVar2 = this.f13818k.f13785a;
        e0[] e0VarArr = bVar2.f34700a;
        int i10 = bVar2.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = e0VarArr[i11];
            if (e0Var.f13809a) {
                bVar.d(bVar.f34702c, e0Var.J());
            } else {
                bVar.b(e0Var);
            }
        }
        j0 j0Var = this.K;
        j0Var.f13929p.D = true;
        p0 p0Var = j0Var.f13930q;
        if (p0Var != null) {
            p0Var.f13991x = true;
        }
    }

    @Override // g2.z
    public final boolean m() {
        return this.f13822p != null;
    }

    public final void n(androidx.compose.ui.d dVar) {
        d1 d1Var;
        e1.a aVar;
        z0.b<d.b> bVar;
        boolean z10;
        this.O = dVar;
        d1 d1Var2 = this.I;
        w wVar = d1Var2.f13790b;
        d.c cVar = d1Var2.f13792d;
        e0 e0Var = d1Var2.f13789a;
        d.c cVar2 = d1Var2.f13793e;
        e1.a aVar2 = e1.f13846a;
        if (cVar2 == aVar2) {
            f2.a.b("padChain called on already padded chain");
        }
        d.c cVar3 = d1Var2.f13793e;
        cVar3.f1148e = aVar2;
        aVar2.f1149f = cVar3;
        z0.b<d.b> bVar2 = d1Var2.f13794f;
        int i10 = bVar2 != null ? bVar2.f34702c : 0;
        z0.b<d.b> bVar3 = d1Var2.f13795g;
        if (bVar3 == null) {
            bVar3 = new z0.b<>(new d.b[16]);
        }
        int i11 = bVar3.f34702c;
        if (i11 < 16) {
            i11 = 16;
        }
        z0.b bVar4 = new z0.b(new androidx.compose.ui.d[i11]);
        bVar4.b(dVar);
        f1 f1Var = null;
        while (true) {
            int i12 = bVar4.f34702c;
            if (i12 == 0) {
                break;
            }
            androidx.compose.ui.d dVar2 = (androidx.compose.ui.d) bVar4.k(i12 - 1);
            if (dVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar3 = (androidx.compose.ui.a) dVar2;
                bVar4.b(aVar3.f1138c);
                bVar4.b(aVar3.f1137b);
            } else if (dVar2 instanceof d.b) {
                bVar3.b(dVar2);
            } else {
                if (f1Var == null) {
                    f1Var = new f1(bVar3);
                }
                dVar2.d(f1Var);
                f1Var = f1Var;
            }
        }
        int i13 = bVar3.f34702c;
        if (i13 == i10) {
            d.c cVar4 = aVar2.f1149f;
            int i14 = 0;
            while (true) {
                if (cVar4 == null || i14 >= i10) {
                    break;
                }
                if (bVar2 == null) {
                    throw k1.a.a("expected prior modifier list to be non-empty");
                }
                d.b bVar5 = bVar2.f34700a[i14];
                d.b bVar6 = bVar3.f34700a[i14];
                boolean z11 = kotlin.jvm.internal.r.a(bVar5, bVar6) ? 2 : bVar5.getClass() == bVar6.getClass();
                if (!z11) {
                    cVar4 = cVar4.f1148e;
                    break;
                }
                if (z11) {
                    d1.i(bVar5, bVar6, cVar4);
                }
                cVar4 = cVar4.f1149f;
                i14++;
            }
            if (i14 >= i10) {
                d1Var2 = d1Var2;
                d1Var = d1Var2;
                aVar = aVar2;
                bVar = bVar3;
                z10 = false;
            } else {
                if (bVar2 == null) {
                    throw k1.a.a("expected prior modifier list to be non-empty");
                }
                if (cVar4 == null) {
                    throw k1.a.a("structuralUpdate requires a non-null tail");
                }
                boolean z12 = e0Var.P != null;
                d.c cVar5 = cVar4;
                d1Var = d1Var2;
                bVar = bVar3;
                d1Var.g(i14, bVar2, bVar, cVar5, !z12);
                aVar = aVar2;
                z10 = true;
            }
        } else {
            androidx.compose.ui.d dVar3 = e0Var.P;
            if (dVar3 != null && i10 == 0) {
                d.c cVarB = aVar2;
                for (int i15 = 0; i15 < bVar3.f34702c; i15++) {
                    cVarB = d1.b(bVar3.f34700a[i15], cVarB);
                }
                int i16 = 0;
                for (d.c cVar6 = cVar.f1148e; cVar6 != null && cVar6 != e1.f13846a; cVar6 = cVar6.f1148e) {
                    i16 |= cVar6.f1146c;
                    cVar6.f1147d = i16;
                }
                d1Var = d1Var2;
                aVar = aVar2;
                bVar = bVar3;
            } else if (i13 != 0) {
                if (bVar2 == null) {
                    bVar2 = new z0.b<>(new d.b[16]);
                }
                d1Var = d1Var2;
                aVar = aVar2;
                bVar = bVar3;
                d1Var.g(0, bVar2, bVar, aVar, !(dVar3 != null));
            } else {
                if (bVar2 == null) {
                    throw k1.a.a("expected prior modifier list to be non-empty");
                }
                d.c cVar7 = aVar2.f1149f;
                for (int i17 = 0; cVar7 != null && i17 < bVar2.f34702c; i17++) {
                    cVar7 = d1.c(cVar7).f1149f;
                }
                e0 e0VarG = e0Var.G();
                wVar.f13878s = e0VarG != null ? e0VarG.I.f13790b : null;
                d1Var2.f13791c = wVar;
                d1Var = d1Var2;
                aVar = aVar2;
                bVar = bVar3;
                z10 = false;
            }
            z10 = true;
        }
        d1Var.f13794f = bVar;
        if (bVar2 != null) {
            bVar2.g();
        } else {
            bVar2 = null;
        }
        d1Var.f13795g = bVar2;
        e1.a aVar4 = e1.f13846a;
        if (aVar != aVar4) {
            f2.a.b("trimChain called on already trimmed chain");
        }
        d.c cVar8 = aVar4.f1149f;
        if (cVar8 != null) {
            cVar = cVar8;
        }
        cVar.f1148e = null;
        aVar4.f1149f = null;
        aVar4.f1147d = -1;
        aVar4.f1151h = null;
        if (cVar == aVar4) {
            f2.a.b("trimChain did not update the head");
        }
        d1Var.f13793e = cVar;
        if (z10) {
            d1Var.h();
        }
        this.K.h();
        if (this.f13816h == null && d1Var.d(512)) {
            j0(this);
        }
    }

    public final void o(v1 v1Var) {
        e0 e0Var;
        if (this.f13822p != null) {
            f2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + r(0));
        }
        e0 e0Var2 = this.f13821n;
        if (e0Var2 != null && !kotlin.jvm.internal.r.a(e0Var2.f13822p, v1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(v1Var);
            sb.append(") than the parent's owner(");
            e0 e0VarG = G();
            sb.append(e0VarG != null ? e0VarG.f13822p : null);
            sb.append("). This tree: ");
            sb.append(r(0));
            sb.append(" Parent tree: ");
            e0 e0Var3 = this.f13821n;
            sb.append(e0Var3 != null ? e0Var3.r(0) : null);
            f2.a.b(sb.toString());
        }
        e0 e0VarG2 = G();
        j0 j0Var = this.K;
        if (e0VarG2 == null) {
            j0Var.f13929p.f14061w = true;
            p0 p0Var = j0Var.f13930q;
            if (p0Var != null) {
                p0Var.f13988t = p0.a.f13994a;
            }
        }
        d1 d1Var = this.I;
        d1Var.f13791c.f13878s = e0VarG2 != null ? e0VarG2.I.f13790b : null;
        this.f13822p = v1Var;
        this.f13824r = (e0VarG2 != null ? e0VarG2.f13824r : -1) + 1;
        androidx.compose.ui.d dVar = this.P;
        if (dVar != null) {
            n(dVar);
        }
        this.P = null;
        v1Var.o(this);
        e0 e0Var4 = this.f13821n;
        if (e0Var4 == null || (e0Var = e0Var4.f13816h) == null) {
            e0Var = this.f13816h;
        }
        j0(e0Var);
        if (this.f13816h == null && d1Var.d(512)) {
            j0(this);
        }
        if (!this.T) {
            for (d.c cVar = d1Var.f13793e; cVar != null; cVar = cVar.f1149f) {
                cVar.J1();
            }
        }
        z0.b<e0> bVar = this.f13818k.f13785a;
        e0[] e0VarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0VarArr[i11].o(v1Var);
        }
        if (!this.T) {
            d1Var.e();
        }
        O();
        if (e0VarG2 != null) {
            e0VarG2.O();
        }
        g1 g1Var = d1Var.f13790b.f13877r;
        for (g1 g1Var2 = d1Var.f13791c; !kotlin.jvm.internal.r.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f13877r) {
            g1Var2.T1(g1Var2.f13881w, true);
            u1 u1Var = g1Var2.M;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
        b.e eVar = this.Q;
        if (eVar != null) {
            eVar.invoke(v1Var);
        }
        j0Var.h();
        if (!this.T && d1Var.d(8)) {
            P();
        }
        v1Var.i(this);
    }

    public final void p() {
        this.G = this.F;
        this.F = f.f13842c;
        z0.b<e0> bVarJ = J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = e0VarArr[i11];
            if (e0Var.F != f.f13842c) {
                e0Var.p();
            }
        }
    }

    public final void q() {
        this.G = this.F;
        this.F = f.f13842c;
        z0.b<e0> bVarJ = J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var = e0VarArr[i11];
            if (e0Var.F == f.f13841b) {
                e0Var.q();
            }
        }
    }

    public final String r(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        z0.b<e0> bVarJ = J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i12 = bVarJ.f34702c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(e0VarArr[i13].r(i10 + 1));
        }
        String string = sb.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void s() {
        k0 k0Var;
        v1 v1Var = this.f13822p;
        if (v1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            e0 e0VarG = G();
            sb.append(e0VarG != null ? e0VarG.r(0) : null);
            f2.a.c(sb.toString());
            throw new pg.g();
        }
        e0 e0VarG2 = G();
        j0 j0Var = this.K;
        if (e0VarG2 != null) {
            e0VarG2.M();
            e0VarG2.O();
            x0 x0Var = j0Var.f13929p;
            f fVar = f.f13842c;
            x0Var.f14053m = fVar;
            p0 p0Var = j0Var.f13930q;
            if (p0Var != null) {
                p0Var.f13980k = fVar;
            }
        }
        g0 g0Var = j0Var.f13929p.B;
        g0Var.f13762b = true;
        g0Var.f13763c = false;
        g0Var.f13765e = false;
        g0Var.f13764d = false;
        g0Var.f13766f = false;
        g0Var.f13767g = false;
        g0Var.f13768h = null;
        p0 p0Var2 = j0Var.f13930q;
        if (p0Var2 != null && (k0Var = p0Var2.f13989v) != null) {
            k0Var.f13762b = true;
            k0Var.f13763c = false;
            k0Var.f13765e = false;
            k0Var.f13764d = false;
            k0Var.f13766f = false;
            k0Var.f13767g = false;
            k0Var.f13768h = null;
        }
        b.f fVar2 = this.R;
        if (fVar2 != null) {
            fVar2.invoke(v1Var);
        }
        d1 d1Var = this.I;
        d1Var.f();
        this.f13825s = true;
        z0.b<e0> bVar = this.f13818k.f13785a;
        e0[] e0VarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0VarArr[i11].s();
        }
        this.f13825s = false;
        for (d.c cVar = d1Var.f13792d; cVar != null; cVar = cVar.f1148e) {
            if (cVar.f1157p) {
                cVar.K1();
            }
        }
        v1Var.e(this);
        this.f13822p = null;
        j0(null);
        this.f13824r = 0;
        x0 x0Var2 = j0Var.f13929p;
        x0Var2.f14050j = Integer.MAX_VALUE;
        x0Var2.f14049h = Integer.MAX_VALUE;
        x0Var2.f14061w = false;
        p0 p0Var3 = j0Var.f13930q;
        if (p0Var3 != null) {
            p0Var3.f13979j = Integer.MAX_VALUE;
            p0Var3.f13978h = Integer.MAX_VALUE;
            p0Var3.f13988t = p0.a.f13996c;
        }
        if (d1Var.d(8)) {
            q2.l lVar = this.f13827v;
            this.f13827v = null;
            this.f13826t = false;
            p.h0<q2.o> h0Var = v1Var.getSemanticsOwner().f21819d;
            Object[] objArr = h0Var.f20706a;
            int i12 = h0Var.f20707b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((q2.o) objArr[i13]).b(this, lVar);
            }
            v1Var.v();
        }
    }

    public final void t(q1.w0 w0Var, t1.d dVar) {
        this.I.f13791c.V0(w0Var, dVar);
    }

    public final String toString() {
        return h3.b(this) + " children: " + ((b.a) A()).f34703a.f34702c + " measurePolicy: " + this.f13831z;
    }

    public final List<g2.k0> v() {
        p0 p0Var = this.K.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        z0.b<p0> bVar = p0Var.f13990w;
        j0 j0Var = p0Var.f13976f;
        j0Var.f13914a.A();
        if (!p0Var.f13991x) {
            return bVar.f();
        }
        e0 e0Var = j0Var.f13914a;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (bVar.f34702c <= i11) {
                p0 p0Var2 = e0Var2.K.f13930q;
                kotlin.jvm.internal.r.b(p0Var2);
                bVar.b(p0Var2);
            } else {
                p0 p0Var3 = e0Var2.K.f13930q;
                kotlin.jvm.internal.r.b(p0Var3);
                p0[] p0VarArr = bVar.f34700a;
                p0 p0Var4 = p0VarArr[i11];
                p0VarArr[i11] = p0Var3;
            }
        }
        bVar.l(((b.a) e0Var.A()).f34703a.f34702c, bVar.f34702c);
        p0Var.f13991x = false;
        return bVar.f();
    }

    public final List<g2.k0> w() {
        return this.K.f13929p.q0();
    }

    @Override // g2.z
    public final boolean x() {
        return this.K.f13929p.f14061w;
    }

    @Override // g2.z
    public final int y() {
        return this.f13810b;
    }

    @Override // g2.z
    public final boolean z() {
        return this.T;
    }

    public e0(int i10) {
        this((i10 & 1) == 0, q2.q.f21804a.addAndGet(1));
    }

    public e0(boolean z10, int i10) {
        this.f13809a = z10;
        this.f13810b = i10;
        this.f13811c = 9223372034707292159L;
        this.f13812d = 0L;
        this.f13813e = 9223372034707292159L;
        this.f13814f = true;
        this.f13818k = new c1<>(new z0.b(new e0[16]), new h());
        this.f13829x = new z0.b<>(new e0[16]);
        this.f13830y = true;
        this.f13831z = U;
        this.B = i0.f13913a;
        this.C = f3.r.f8828a;
        this.D = W;
        x0.z.J.getClass();
        this.E = z.a.f31979b;
        f fVar = f.f13842c;
        this.F = fVar;
        this.G = fVar;
        this.I = new d1(this);
        this.K = new j0(this);
        this.N = true;
        this.O = d.a.f1143b;
    }
}
