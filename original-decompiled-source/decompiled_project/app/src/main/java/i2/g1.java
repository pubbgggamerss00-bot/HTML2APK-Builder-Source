package i2;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import h1.h;
import i2.e0;
import i2.m2;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class g1 extends l0 implements g2.k0, g2.v, w1 {
    public static final d O = d.f13886a;
    public static final c P = c.f13885a;
    public static final q1.c2 Q;
    public static final z R;
    public static final float[] S;
    public static final a T;
    public static final b U;
    public g2.m0 A;
    public p.f0<g2.a> B;
    public float D;
    public p1.b E;
    public z F;
    public t1.d G;
    public q1.w0 H;
    public f I;
    public boolean L;
    public u1 M;
    public t1.d N;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f13874n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13875p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13876q;

    /* renamed from: r, reason: collision with root package name */
    public g1 f13877r;

    /* renamed from: s, reason: collision with root package name */
    public g1 f13878s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13879t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13880v;

    /* renamed from: w, reason: collision with root package name */
    public eh.l<? super q1.l1, pg.f0> f13881w;

    /* renamed from: x, reason: collision with root package name */
    public f3.d f13882x;

    /* renamed from: y, reason: collision with root package name */
    public f3.r f13883y;

    /* renamed from: z, reason: collision with root package name */
    public float f13884z = 0.8f;
    public long C = 0;
    public final h K = new h();

    public static final class a implements e {
        @Override // i2.g1.e
        public final boolean a(e0 e0Var) {
            return true;
        }

        @Override // i2.g1.e
        public final int b() {
            return 16;
        }

        @Override // i2.g1.e
        public final void c(e0 e0Var, long j10, u uVar, int i10, boolean z10) {
            e0Var.K(j10, uVar, i10, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // i2.g1.e
        public final boolean d(d.c cVar) {
            ?? bVar = 0;
            while (true) {
                int i10 = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof i2) {
                    ((i2) cVar).z0();
                } else if ((cVar.f1146c & 16) != 0 && (cVar instanceof m)) {
                    d.c cVar2 = cVar.f13947r;
                    bVar = bVar;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.f1146c & 16) != 0) {
                            i10++;
                            bVar = bVar;
                            if (i10 == 1) {
                                cVar = cVar2;
                            } else {
                                if (bVar == 0) {
                                    bVar = new z0.b(new d.c[16]);
                                }
                                if (cVar != 0) {
                                    bVar.b(cVar);
                                    cVar = 0;
                                }
                                bVar.b(cVar2);
                            }
                        }
                        cVar2 = cVar2.f1149f;
                        bVar = bVar;
                        cVar = cVar;
                    }
                    if (i10 == 1) {
                    }
                }
                cVar = k.b(bVar);
            }
        }
    }

    public static final class b implements e {
        @Override // i2.g1.e
        public final boolean a(e0 e0Var) {
            q2.l lVarE = e0Var.e();
            boolean z10 = false;
            if (lVarE != null && lVarE.f21802d) {
                z10 = true;
            }
            return !z10;
        }

        @Override // i2.g1.e
        public final int b() {
            return 8;
        }

        @Override // i2.g1.e
        public final void c(e0 e0Var, long j10, u uVar, int i10, boolean z10) {
            d1 d1Var = e0Var.I;
            g1 g1Var = d1Var.f13791c;
            d dVar = g1.O;
            d1Var.f13791c.u1(g1.U, g1Var.d1(j10), uVar, 1, z10);
        }

        @Override // i2.g1.e
        public final boolean d(d.c cVar) {
            return false;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13885a = new c(1);

        @Override // eh.l
        public final pg.f0 invoke(g1 g1Var) {
            u1 u1Var = g1Var.M;
            if (u1Var != null) {
                u1Var.invalidate();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<g1, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13886a = new d(1);

        @Override // eh.l
        public final pg.f0 invoke(g1 g1Var) {
            g1 g1Var2 = g1Var;
            if (g1Var2.U() && g1Var2.U1(true)) {
                e0 e0Var = g1Var2.f13874n;
                j0 j0Var = e0Var.K;
                if (j0Var.f13925l > 0) {
                    if (j0Var.f13924k || j0Var.f13923j) {
                        e0Var.e0(false);
                    }
                    j0Var.f13929p.t0();
                }
                v1 v1VarA = i0.a(e0Var);
                v1VarA.getRectManager().e(e0Var);
                v1VarA.b(e0Var);
            }
            return pg.f0.f21461a;
        }
    }

    public interface e {
        boolean a(e0 e0Var);

        int b();

        void c(e0 e0Var, long j10, u uVar, int i10, boolean z10);

        boolean d(d.c cVar);
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.p<q1.w0, t1.d, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f13888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g gVar) {
            super(2);
            this.f13888b = gVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(q1.w0 w0Var, t1.d dVar) {
            q1.w0 w0Var2 = w0Var;
            t1.d dVar2 = dVar;
            g1 g1Var = g1.this;
            e0 e0Var = g1Var.f13874n;
            if (e0Var.x()) {
                g1Var.H = w0Var2;
                g1Var.G = dVar2;
                i0.a(e0Var).getSnapshotObserver().a(g1Var, g1.P, this.f13888b);
                g1Var.L = false;
            } else {
                g1Var.L = true;
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public g() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g1 g1Var = g1.this;
            q1.w0 w0Var = g1Var.H;
            kotlin.jvm.internal.r.b(w0Var);
            g1Var.W0(w0Var, g1Var.G);
            return pg.f0.f21461a;
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public h() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g1 g1Var = g1.this.f13878s;
            if (g1Var != null) {
                g1Var.x1();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.c f13892b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f13893c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f13894d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u f13895e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f13896f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f13897g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f13898h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f13899j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(d.c cVar, e eVar, long j10, u uVar, int i10, boolean z10, float f10, boolean z11) {
            super(0);
            this.f13892b = cVar;
            this.f13893c = eVar;
            this.f13894d = j10;
            this.f13895e = uVar;
            this.f13896f = i10;
            this.f13897g = z10;
            this.f13898h = f10;
            this.f13899j = z11;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g1.this.L1(i1.a(this.f13892b, this.f13893c.b()), this.f13893c, this.f13894d, this.f13895e, this.f13896f, this.f13897g, this.f13898h, this.f13899j);
            return pg.f0.f21461a;
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<q1.l1, pg.f0> f13900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(eh.l<? super q1.l1, pg.f0> lVar) {
            super(0);
            this.f13900a = lVar;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            q1.c2 c2Var = g1.Q;
            this.f13900a.invoke(c2Var);
            c2Var.f21678w = c2Var.f21671n.a(c2Var.f21674r, c2Var.f21676t, c2Var.f21675s);
            return pg.f0.f21461a;
        }
    }

    static {
        q1.c2 c2Var = new q1.c2();
        c2Var.f21660b = 1.0f;
        c2Var.f21661c = 1.0f;
        c2Var.f21662d = 1.0f;
        long j10 = q1.m1.f21721a;
        c2Var.f21666h = j10;
        c2Var.f21667j = j10;
        c2Var.f21669l = 8.0f;
        c2Var.f21670m = q1.l2.f21718b;
        c2Var.f21671n = q1.y1.f21750a;
        c2Var.f21673q = 0;
        c2Var.f21674r = 9205357640488583168L;
        c2Var.f21675s = f3.f.a();
        c2Var.f21676t = f3.r.f8828a;
        Q = c2Var;
        R = new z();
        S = q1.r1.a();
        T = new a();
        U = new b();
    }

    public g1(e0 e0Var) {
        this.f13874n = e0Var;
        this.f13882x = e0Var.B;
        this.f13883y = e0Var.C;
    }

    public static g1 Q1(g2.v vVar) {
        g1 g1Var;
        g2.i0 i0Var = vVar instanceof g2.i0 ? (g2.i0) vVar : null;
        if (i0Var != null && (g1Var = i0Var.f11396a.f13968n) != null) {
            return g1Var;
        }
        kotlin.jvm.internal.r.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (g1) vVar;
    }

    @Override // g2.v
    public final long B(long j10) {
        return i0.a(this.f13874n).f(Y(j10));
    }

    @Override // i2.l0
    public final void E0() {
        t1.d dVar = this.N;
        if (dVar != null) {
            m0(this.C, this.D, dVar);
        } else {
            l0(this.D, this.C, this.f13881w);
        }
    }

    public final boolean E1() {
        if (this.M != null && this.f13884z <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return true;
        }
        g1 g1Var = this.f13878s;
        if (g1Var != null) {
            return g1Var.E1();
        }
        return false;
    }

    public final long F1(g2.v vVar, long j10) {
        if (vVar instanceof g2.i0) {
            g2.i0 i0Var = (g2.i0) vVar;
            i0Var.f11396a.f13968n.I1();
            return i0Var.c(this, j10 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        g1 g1VarQ1 = Q1(vVar);
        g1VarQ1.I1();
        g1 g1VarZ0 = Z0(g1VarQ1);
        while (g1VarQ1 != g1VarZ0) {
            u1 u1Var = g1VarQ1.M;
            if (u1Var != null) {
                j10 = u1Var.d(j10, false);
            }
            j10 = ph.m0.b(j10, g1VarQ1.C);
            g1VarQ1 = g1VarQ1.f13878s;
            kotlin.jvm.internal.r.b(g1VarQ1);
        }
        return L0(g1VarZ0, j10);
    }

    @Override // g2.v
    public final void G(g2.v vVar, float[] fArr) {
        g1 g1VarQ1 = Q1(vVar);
        g1VarQ1.I1();
        g1 g1VarZ0 = Z0(g1VarQ1);
        q1.r1.d(fArr);
        g1VarQ1.S1(g1VarZ0, fArr);
        R1(g1VarZ0, fArr);
    }

    @Override // f3.d
    public final float G0() {
        return this.f13874n.B.G0();
    }

    public final void H1() {
        if (this.M != null || this.f13881w == null) {
            return;
        }
        u1 u1VarN = v1.n(i0.a(this.f13874n), f1(), this.K, this.N, false, 8);
        u1VarN.e(this.f11384c);
        u1VarN.i(this.C);
        u1VarN.invalidate();
        this.M = u1VarN;
    }

    @Override // g2.v
    public final void I(float[] fArr) {
        v1 v1VarA = i0.a(this.f13874n);
        g1 g1VarQ1 = Q1(g2.w.c(this));
        S1(g1VarQ1, fArr);
        if (v1VarA instanceof c2.k) {
            ((c2.k) v1VarA).s(fArr);
            return;
        }
        if (!g1VarQ1.l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long jA = i0.a(g1VarQ1.f13874n).A(g1VarQ1.Y(0L));
        if ((9223372034707292159L & jA) != 9205357640488583168L) {
            q1.r1.f(fArr, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax)));
        }
    }

    public final void I1() {
        j0 j0Var = this.f13874n.K;
        e0.d dVar = j0Var.f13914a.K.f13917d;
        if (dVar == e0.d.f13835c || dVar == e0.d.f13836d) {
            if (j0Var.f13929p.E) {
                j0Var.e(true);
            } else {
                j0Var.d(true);
            }
        }
        if (dVar == e0.d.f13836d) {
            p0 p0Var = j0Var.f13930q;
            if (p0Var == null || !p0Var.f13992y) {
                j0Var.f(true);
            } else {
                j0Var.g(true);
            }
        }
    }

    public final void J0(g1 g1Var, p1.b bVar, boolean z10) {
        if (g1Var == this) {
            return;
        }
        g1 g1Var2 = this.f13878s;
        if (g1Var2 != null) {
            g1Var2.J0(g1Var, bVar, z10);
        }
        long j10 = this.C;
        float f10 = (int) (j10 >> 32);
        bVar.f21125a -= f10;
        bVar.f21127c -= f10;
        float f11 = (int) (j10 & BodyPartID.bodyIdMax);
        bVar.f21126b -= f11;
        bVar.f21128d -= f11;
        u1 u1Var = this.M;
        if (u1Var != null) {
            u1Var.k(bVar, true);
            if (this.f13880v && z10) {
                long j11 = this.f11384c;
                bVar.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j11 >> 32), (int) (j11 & BodyPartID.bodyIdMax));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void J1() {
        d.c cVarL1;
        boolean zG = j1.g(128);
        d.c cVarN1 = n1(zG);
        if (cVarN1 == null || (cVarN1.f1144a.f1147d & 128) == 0) {
            return;
        }
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            if (!zG) {
                cVarL1 = l1().f1148e;
                if (cVarL1 == null) {
                }
                pg.f0 f0Var = pg.f0.f21461a;
                h.a.d(hVarA, hVarB, lVarE);
            }
            cVarL1 = l1();
            for (d.c cVarN12 = n1(zG); cVarN12 != null && (cVarN12.f1147d & 128) != 0; cVarN12 = cVarN12.f1149f) {
                if ((cVarN12.f1146c & 128) != 0) {
                    m mVarB = cVarN12;
                    ?? bVar = 0;
                    while (mVarB != 0) {
                        if (mVarB instanceof a0) {
                            ((a0) mVarB).O(this.f11384c);
                        } else if ((mVarB.f1146c & 128) != 0 && (mVarB instanceof m)) {
                            d.c cVar = mVarB.f13947r;
                            int i10 = 0;
                            mVarB = mVarB;
                            bVar = bVar;
                            while (cVar != null) {
                                if ((cVar.f1146c & 128) != 0) {
                                    i10++;
                                    bVar = bVar;
                                    if (i10 == 1) {
                                        mVarB = cVar;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (mVarB != 0) {
                                            bVar.b(mVarB);
                                            mVarB = 0;
                                        }
                                        bVar.b(cVar);
                                    }
                                }
                                cVar = cVar.f1149f;
                                mVarB = mVarB;
                                bVar = bVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVarB = k.b(bVar);
                    }
                }
                if (cVarN12 == cVarL1) {
                    break;
                }
            }
            pg.f0 f0Var2 = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void K1() {
        boolean zG = j1.g(128);
        d.c cVarL1 = l1();
        if (!zG && (cVarL1 = cVarL1.f1148e) == null) {
            return;
        }
        for (d.c cVarN1 = n1(zG); cVarN1 != null && (cVarN1.f1147d & 128) != 0; cVarN1 = cVarN1.f1149f) {
            if ((cVarN1.f1146c & 128) != 0) {
                m mVarB = cVarN1;
                ?? bVar = 0;
                while (mVarB != 0) {
                    if (mVarB instanceof a0) {
                        ((a0) mVarB).t0(this);
                    } else if ((mVarB.f1146c & 128) != 0 && (mVarB instanceof m)) {
                        d.c cVar = mVarB.f13947r;
                        int i10 = 0;
                        mVarB = mVarB;
                        bVar = bVar;
                        while (cVar != null) {
                            if ((cVar.f1146c & 128) != 0) {
                                i10++;
                                bVar = bVar;
                                if (i10 == 1) {
                                    mVarB = cVar;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new z0.b(new d.c[16]);
                                    }
                                    if (mVarB != 0) {
                                        bVar.b(mVarB);
                                        mVarB = 0;
                                    }
                                    bVar.b(cVar);
                                }
                            }
                            cVar = cVar.f1149f;
                            mVarB = mVarB;
                            bVar = bVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVarB = k.b(bVar);
                }
            }
            if (cVarN1 == cVarL1) {
                return;
            }
        }
    }

    @Override // g2.v
    public final long L(g2.v vVar, long j10) {
        return F1(vVar, j10);
    }

    public final long L0(g1 g1Var, long j10) {
        if (g1Var == this) {
            return j10;
        }
        g1 g1Var2 = this.f13878s;
        return (g1Var2 == null || kotlin.jvm.internal.r.a(g1Var, g1Var2)) ? d1(j10) : d1(g1Var2.L0(g1Var, j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d A[PHI: r2
      0x018d: PHI (r2v7 z0.b) = (r2v1 z0.b), (r2v1 z0.b), (r2v9 z0.b) binds: [B:52:0x0159, B:54:0x015d, B:68:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(d.c cVar, e eVar, long j10, u uVar, int i10, boolean z10, float f10, boolean z11) {
        d.c cVarB;
        int i11;
        if (cVar == null) {
            w1(eVar, j10, uVar, i10, z10);
            return;
        }
        int i12 = i10;
        if (i12 == 3 || i12 == 4) {
            m mVar = cVar;
            z0.b bVar = null;
            while (true) {
                if (mVar == 0) {
                    break;
                }
                if (mVar instanceof i2) {
                    long jN = ((i2) mVar).N();
                    int i13 = (int) (j10 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i13);
                    e0 e0Var = this.f13874n;
                    f3.r rVar = e0Var.C;
                    int i14 = m2.f13957b;
                    long j11 = Long.MIN_VALUE & jN;
                    if (fIntBitsToFloat >= (-((j11 == 0 || rVar == f3.r.f8828a) ? m2.a.a(0, jN) : m2.a.a(2, jN)))) {
                        if (Float.intBitsToFloat(i13) < g0() + ((j11 == 0 || e0Var.C == f3.r.f8828a) ? m2.a.a(2, jN) : m2.a.a(0, jN))) {
                            int i15 = (int) (j10 & BodyPartID.bodyIdMax);
                            if (Float.intBitsToFloat(i15) >= (-m2.a.a(1, jN))) {
                                if (Float.intBitsToFloat(i15) < m2.a.a(3, jN) + e0()) {
                                    i iVar = new i(cVar, eVar, j10, uVar, i12, z10, f10, z11);
                                    p.b0 b0Var = uVar.f14022b;
                                    p.h0<Object> h0Var = uVar.f14021a;
                                    if (uVar.f14023c == qg.p.i(uVar)) {
                                        int i16 = uVar.f14023c;
                                        uVar.e(i16 + 1, h0Var.f20707b);
                                        uVar.f14023c++;
                                        h0Var.g(cVar);
                                        b0Var.a(v.a(CropImageView.DEFAULT_ASPECT_RATIO, z10, true));
                                        iVar.invoke();
                                        uVar.f14023c = i16;
                                        return;
                                    }
                                    long jC = uVar.c();
                                    int i17 = uVar.f14023c;
                                    if (!f1.m.e(jC)) {
                                        if (f1.m.c(jC) > CropImageView.DEFAULT_ASPECT_RATIO) {
                                            int i18 = uVar.f14023c;
                                            uVar.e(i18 + 1, h0Var.f20707b);
                                            uVar.f14023c++;
                                            h0Var.g(cVar);
                                            b0Var.a(v.a(CropImageView.DEFAULT_ASPECT_RATIO, z10, true));
                                            iVar.invoke();
                                            uVar.f14023c = i18;
                                            return;
                                        }
                                        return;
                                    }
                                    int i19 = qg.p.i(uVar);
                                    uVar.f14023c = i19;
                                    uVar.e(i19 + 1, h0Var.f20707b);
                                    uVar.f14023c++;
                                    h0Var.g(cVar);
                                    b0Var.a(v.a(CropImageView.DEFAULT_ASPECT_RATIO, z10, true));
                                    iVar.invoke();
                                    uVar.f14023c = i19;
                                    if (f1.m.c(uVar.c()) < CropImageView.DEFAULT_ASPECT_RATIO) {
                                        uVar.e(i17 + 1, uVar.f14023c + 1);
                                    }
                                    uVar.f14023c = i17;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((mVar.f1146c & 16) == 0 || !(mVar instanceof m)) {
                        cVarB = k.b(bVar);
                    } else {
                        d.c cVar2 = mVar.f13947r;
                        int i20 = 0;
                        cVarB = mVar;
                        bVar = bVar;
                        while (cVar2 != null) {
                            if ((cVar2.f1146c & 16) != 0) {
                                i20++;
                                bVar = bVar;
                                if (i20 == 1) {
                                    cVarB = cVar2;
                                } else {
                                    if (bVar == null) {
                                        bVar = new z0.b(new d.c[16]);
                                    }
                                    if (cVarB != null) {
                                        bVar.b(cVarB);
                                        cVarB = null;
                                    }
                                    bVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f1149f;
                            cVarB = cVarB;
                            bVar = bVar;
                        }
                        if (i20 == 1) {
                        }
                    }
                    i12 = i10;
                    mVar = cVarB;
                    bVar = bVar;
                }
            }
        }
        if (z11) {
            s1(cVar, eVar, j10, uVar, i10, z10, f10);
            return;
        }
        if (!eVar.d(cVar)) {
            L1(i1.a(cVar, eVar.b()), eVar, j10, uVar, i10, z10, f10, false);
            return;
        }
        h1 h1Var = new h1(this, cVar, eVar, j10, uVar, i10, z10, f10);
        p.b0 b0Var2 = uVar.f14022b;
        p.h0<Object> h0Var2 = uVar.f14021a;
        if (uVar.f14023c != qg.p.i(uVar)) {
            long jC2 = uVar.c();
            int i21 = uVar.f14023c;
            int i22 = qg.p.i(uVar);
            uVar.f14023c = i22;
            uVar.e(i22 + 1, h0Var2.f20707b);
            uVar.f14023c++;
            h0Var2.g(cVar);
            b0Var2.a(v.a(f10, z10, false));
            h1Var.invoke();
            uVar.f14023c = i22;
            long jC3 = uVar.c();
            if (uVar.f14023c + 1 >= qg.p.i(uVar) || f1.m.b(jC2, jC3) <= 0) {
                uVar.e(uVar.f14023c + 1, h0Var2.f20707b);
            } else {
                uVar.e(i21 + 1, f1.m.e(jC3) ? uVar.f14023c + 2 : uVar.f14023c + 1);
            }
            uVar.f14023c = i21;
            return;
        }
        int i23 = uVar.f14023c;
        int i24 = i23 + 1;
        uVar.e(i24, h0Var2.f20707b);
        uVar.f14023c++;
        h0Var2.g(cVar);
        b0Var2.a(v.a(f10, z10, false));
        h1Var.invoke();
        uVar.f14023c = i23;
        if (i24 == qg.p.i(uVar) || f1.m.e(uVar.c())) {
            int i25 = uVar.f14023c;
            int i26 = i25 + 1;
            h0Var2.k(i26);
            if (i26 < 0 || i26 >= (i11 = b0Var2.f20573b)) {
                q.d.b("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = b0Var2.f20572a;
            long j12 = jArr[i26];
            if (i26 != i11 - 1) {
                qg.m.e(i26, jArr, i25 + 2, jArr, i11);
            }
            b0Var2.f20573b--;
        }
    }

    public final long M0(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - g0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - e0();
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public void M1(q1.w0 w0Var, t1.d dVar) {
        g1 g1Var = this.f13877r;
        if (g1Var != null) {
            g1Var.V0(w0Var, dVar);
        }
    }

    @Override // g2.v
    public final p1.e N(g2.v vVar, boolean z10) {
        if (!l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!vVar.m()) {
            f2.a.b("LayoutCoordinates " + vVar + " is not attached!");
        }
        g1 g1VarQ1 = Q1(vVar);
        g1VarQ1.I1();
        g1 g1VarZ0 = Z0(g1VarQ1);
        p1.b bVar = this.E;
        if (bVar == null) {
            bVar = new p1.b();
            this.E = bVar;
        }
        bVar.f21125a = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f21126b = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f21127c = (int) (vVar.a() >> 32);
        bVar.f21128d = (int) (vVar.a() & BodyPartID.bodyIdMax);
        while (g1VarQ1 != g1VarZ0) {
            g1VarQ1.O1(bVar, z10, false);
            if (bVar.b()) {
                return p1.e.f21130e;
            }
            g1VarQ1 = g1VarQ1.f13878s;
            kotlin.jvm.internal.r.b(g1VarQ1);
        }
        J0(g1VarZ0, bVar, z10);
        return new p1.e(bVar.f21125a, bVar.f21126b, bVar.f21127c, bVar.f21128d);
    }

    public final void N1(long j10, float f10, eh.l<? super q1.l1, pg.f0> lVar, t1.d dVar) {
        e0 e0Var = this.f13874n;
        if (dVar != null) {
            if (lVar != null) {
                f2.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.N != dVar) {
                this.N = null;
                T1(null, false);
                this.N = dVar;
            }
            if (this.M == null) {
                v1 v1VarA = i0.a(e0Var);
                eh.p<q1.w0, t1.d, pg.f0> pVarF1 = f1();
                h hVar = this.K;
                u1 u1VarN = v1.n(v1VarA, pVarF1, hVar, dVar, false, 8);
                u1VarN.e(this.f11384c);
                u1VarN.i(j10);
                this.M = u1VarN;
                e0Var.N = true;
                hVar.invoke();
            }
        } else {
            if (this.N != null) {
                this.N = null;
                T1(null, false);
            }
            T1(lVar, false);
        }
        if (!f3.m.b(this.C, j10)) {
            this.C = j10;
            e0Var.K.f13929p.t0();
            u1 u1Var = this.M;
            if (u1Var != null) {
                u1Var.i(j10);
            } else {
                g1 g1Var = this.f13878s;
                if (g1Var != null) {
                    g1Var.x1();
                }
            }
            l0.B0(this);
            v1 v1Var = e0Var.f13822p;
            if (v1Var != null) {
                v1Var.k(e0Var);
            }
        }
        this.D = f10;
        if (this.f13938h) {
            return;
        }
        r0(new h2(v0(), this));
    }

    public final float O0(long j10, long j11) {
        if (g0() >= Float.intBitsToFloat((int) (j11 >> 32)) && e0() >= Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM0 = M0(j11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM0 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat3 < CropImageView.DEFAULT_ASPECT_RATIO ? -fIntBitsToFloat3 : fIntBitsToFloat3 - g0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) < CropImageView.DEFAULT_ASPECT_RATIO ? -r9 : r9 - e0())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32);
        if (fIntBitsToFloat > CropImageView.DEFAULT_ASPECT_RATIO || fIntBitsToFloat2 > CropImageView.DEFAULT_ASPECT_RATIO) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & BodyPartID.bodyIdMax);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void O1(p1.b bVar, boolean z10, boolean z11) {
        u1 u1Var = this.M;
        if (u1Var != null) {
            if (this.f13880v) {
                if (z11) {
                    long jI1 = i1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI1 & BodyPartID.bodyIdMax)) / 2.0f;
                    long j10 = this.f11384c;
                    bVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j10 >> 32)) + fIntBitsToFloat, ((int) (j10 & BodyPartID.bodyIdMax)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j11 = this.f11384c;
                    bVar.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j11 >> 32), (int) (j11 & BodyPartID.bodyIdMax));
                }
                if (bVar.b()) {
                    return;
                }
            }
            u1Var.k(bVar, false);
        }
        long j12 = this.C;
        float f10 = (int) (j12 >> 32);
        bVar.f21125a += f10;
        bVar.f21127c += f10;
        float f11 = (int) (j12 & BodyPartID.bodyIdMax);
        bVar.f21126b += f11;
        bVar.f21128d += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [z0.b] */
    public final void P1(g2.m0 m0Var) {
        g1 g1Var;
        g2.m0 m0Var2 = this.A;
        if (m0Var != m0Var2) {
            this.A = m0Var;
            e0 e0Var = this.f13874n;
            int i10 = 0;
            if (m0Var2 == null || m0Var.a() != m0Var2.a() || m0Var.getHeight() != m0Var2.getHeight()) {
                int iA = m0Var.a();
                int height = m0Var.getHeight();
                u1 u1Var = this.M;
                if (u1Var != null) {
                    u1Var.e((iA << 32) | (height & BodyPartID.bodyIdMax));
                } else if (e0Var.x() && (g1Var = this.f13878s) != null) {
                    g1Var.x1();
                }
                o0((height & BodyPartID.bodyIdMax) | (iA << 32));
                if (this.f13881w != null) {
                    U1(false);
                }
                boolean zG = j1.g(4);
                d.c cVarL1 = l1();
                if (zG || (cVarL1 = cVarL1.f1148e) != null) {
                    for (d.c cVarN1 = n1(zG); cVarN1 != null && (cVarN1.f1147d & 4) != 0; cVarN1 = cVarN1.f1149f) {
                        if ((cVarN1.f1146c & 4) != 0) {
                            m mVarB = cVarN1;
                            ?? bVar = 0;
                            while (mVarB != 0) {
                                if (mVarB instanceof r) {
                                    ((r) mVarB).w0();
                                } else if ((mVarB.f1146c & 4) != 0 && (mVarB instanceof m)) {
                                    d.c cVar = mVarB.f13947r;
                                    int i11 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar != null) {
                                        if ((cVar.f1146c & 4) != 0) {
                                            i11++;
                                            bVar = bVar;
                                            if (i11 == 1) {
                                                mVarB = cVar;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar);
                                            }
                                        }
                                        cVar = cVar.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVarB = k.b(bVar);
                            }
                        }
                        if (cVarN1 == cVarL1) {
                            break;
                        }
                    }
                }
                v1 v1Var = e0Var.f13822p;
                if (v1Var != null) {
                    v1Var.k(e0Var);
                }
            }
            p.f0<g2.a> f0Var = this.B;
            if ((f0Var == null || f0Var.f20619e == 0) && m0Var.r().isEmpty()) {
                return;
            }
            p.f0<g2.a> f0Var2 = this.B;
            Map<g2.a, Integer> mapR = m0Var.r();
            if (f0Var2 != null && f0Var2.f20619e == mapR.size()) {
                Object[] objArr = f0Var2.f20616b;
                int[] iArr = f0Var2.f20617c;
                long[] jArr = f0Var2.f20615a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j10) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = mapR.get((g2.a) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            e0Var.K.f13929p.B.g();
            p.f0<g2.a> f0VarA = this.B;
            if (f0VarA == null) {
                f0VarA = p.p0.a();
                this.B = f0VarA;
            }
            f0VarA.a();
            for (Map.Entry<g2.a, Integer> entry : m0Var.r().entrySet()) {
                f0VarA.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    @Override // g2.v
    public final long R(long j10) {
        if (!l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        g2.v vVarC = g2.w.c(this);
        return F1(vVarC, p1.c.f(i0.a(this.f13874n).g(j10), vVarC.Y(0L)));
    }

    public final void R1(g1 g1Var, float[] fArr) {
        if (kotlin.jvm.internal.r.a(g1Var, this)) {
            return;
        }
        g1 g1Var2 = this.f13878s;
        kotlin.jvm.internal.r.b(g1Var2);
        g1Var2.R1(g1Var, fArr);
        if (!f3.m.b(this.C, 0L)) {
            float[] fArr2 = S;
            q1.r1.d(fArr2);
            long j10 = this.C;
            q1.r1.f(fArr2, -((int) (j10 >> 32)), -((int) (j10 & BodyPartID.bodyIdMax)));
            q1.r1.e(fArr, fArr2);
        }
        u1 u1Var = this.M;
        if (u1Var != null) {
            u1Var.g(fArr);
        }
    }

    @Override // g2.v
    public final g2.v S() {
        if (!l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        return this.f13874n.I.f13791c.f13878s;
    }

    public final void S1(g1 g1Var, float[] fArr) {
        g1 g1Var2 = this;
        while (!g1Var2.equals(g1Var)) {
            u1 u1Var = g1Var2.M;
            if (u1Var != null) {
                u1Var.a(fArr);
            }
            if (!f3.m.b(g1Var2.C, 0L)) {
                float[] fArr2 = S;
                q1.r1.d(fArr2);
                q1.r1.f(fArr2, (int) (r1 >> 32), (int) (r1 & BodyPartID.bodyIdMax));
                q1.r1.e(fArr, fArr2);
            }
            g1Var2 = g1Var2.f13878s;
            kotlin.jvm.internal.r.b(g1Var2);
        }
    }

    public final void T1(eh.l<? super q1.l1, pg.f0> lVar, boolean z10) {
        v1 v1Var;
        if (lVar != null && this.N != null) {
            f2.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        e0 e0Var = this.f13874n;
        boolean z11 = (!z10 && this.f13881w == lVar && kotlin.jvm.internal.r.a(this.f13882x, e0Var.B) && this.f13883y == e0Var.C) ? false : true;
        this.f13882x = e0Var.B;
        this.f13883y = e0Var.C;
        boolean zM = e0Var.m();
        h hVar = this.K;
        if (!zM || lVar == null) {
            this.f13881w = null;
            u1 u1Var = this.M;
            if (u1Var != null) {
                u1Var.destroy();
                e0Var.N = true;
                hVar.invoke();
                if (l1().f1157p && e0Var.x() && (v1Var = e0Var.f13822p) != null) {
                    v1Var.k(e0Var);
                }
            }
            this.M = null;
            this.L = false;
            return;
        }
        this.f13881w = lVar;
        if (this.M != null) {
            if (z11 && U1(true)) {
                i0.a(e0Var).getRectManager().e(e0Var);
                return;
            }
            return;
        }
        u1 u1VarN = v1.n(i0.a(e0Var), f1(), hVar, null, e0Var.f13815g, 4);
        u1VarN.e(this.f11384c);
        u1VarN.i(this.C);
        this.M = u1VarN;
        U1(true);
        e0Var.N = true;
        hVar.invoke();
    }

    @Override // i2.w1
    public final boolean U() {
        return (this.M == null || this.f13879t || !this.f13874n.m()) ? false : true;
    }

    public final boolean U1(boolean z10) {
        v1 v1Var;
        boolean z11 = false;
        if (this.N == null) {
            u1 u1Var = this.M;
            if (u1Var != null) {
                eh.l<? super q1.l1, pg.f0> lVar = this.f13881w;
                if (lVar == null) {
                    throw k1.a.a("updateLayerParameters requires a non-null layerBlock");
                }
                q1.c2 c2Var = Q;
                c2Var.h(1.0f);
                c2Var.d(1.0f);
                c2Var.f(1.0f);
                c2Var.j(CropImageView.DEFAULT_ASPECT_RATIO);
                c2Var.c(CropImageView.DEFAULT_ASPECT_RATIO);
                c2Var.n(CropImageView.DEFAULT_ASPECT_RATIO);
                long j10 = q1.m1.f21721a;
                c2Var.A(j10);
                c2Var.D(j10);
                c2Var.b(CropImageView.DEFAULT_ASPECT_RATIO);
                c2Var.k(8.0f);
                c2Var.c1(q1.l2.f21718b);
                c2Var.p1(q1.y1.f21750a);
                c2Var.C(false);
                c2Var.l(null);
                c2Var.s(0);
                c2Var.f21674r = 9205357640488583168L;
                c2Var.f21678w = null;
                c2Var.f21659a = 0;
                e0 e0Var = this.f13874n;
                c2Var.f21675s = e0Var.B;
                c2Var.f21676t = e0Var.C;
                c2Var.f21674r = f3.q.e(this.f11384c);
                i0.a(e0Var).getSnapshotObserver().a(this, O, new j(lVar));
                z zVar = this.F;
                if (zVar == null) {
                    zVar = new z();
                    this.F = zVar;
                }
                z zVar2 = R;
                zVar2.getClass();
                zVar2.f14073a = zVar.f14073a;
                zVar2.f14074b = zVar.f14074b;
                zVar2.f14075c = zVar.f14075c;
                zVar2.f14076d = zVar.f14076d;
                zVar2.f14077e = zVar.f14077e;
                zVar2.f14078f = zVar.f14078f;
                zVar2.f14079g = zVar.f14079g;
                zVar2.f14080h = zVar.f14080h;
                zVar2.f14081i = zVar.f14081i;
                zVar.f14073a = c2Var.f21660b;
                zVar.f14074b = c2Var.f21661c;
                zVar.f14075c = c2Var.f21663e;
                zVar.f14076d = c2Var.f21664f;
                zVar.f14077e = CropImageView.DEFAULT_ASPECT_RATIO;
                zVar.f14078f = CropImageView.DEFAULT_ASPECT_RATIO;
                zVar.f14079g = c2Var.f21668k;
                zVar.f14080h = c2Var.f21669l;
                zVar.f14081i = c2Var.f21670m;
                u1Var.h(c2Var);
                boolean z12 = this.f13880v;
                this.f13880v = c2Var.f21672p;
                this.f13884z = c2Var.f21662d;
                if (zVar2.f14073a == zVar.f14073a && zVar2.f14074b == zVar.f14074b && zVar2.f14075c == zVar.f14075c && zVar2.f14076d == zVar.f14076d && zVar2.f14077e == zVar.f14077e && zVar2.f14078f == zVar.f14078f && zVar2.f14079g == zVar.f14079g && zVar2.f14080h == zVar.f14080h && q1.l2.a(zVar2.f14081i, zVar.f14081i)) {
                    z11 = true;
                }
                boolean z13 = !z11;
                if (z10 && ((!z11 || z12 != this.f13880v) && (v1Var = e0Var.f13822p) != null)) {
                    v1Var.k(e0Var);
                }
                return z13;
            }
            if (this.f13881w != null) {
                f2.a.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final void V0(q1.w0 w0Var, t1.d dVar) {
        u1 u1Var = this.M;
        if (u1Var != null) {
            u1Var.b(w0Var, dVar);
            return;
        }
        long j10 = this.C;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & BodyPartID.bodyIdMax);
        w0Var.n(f10, f11);
        W0(w0Var, dVar);
        w0Var.n(-f10, -f11);
    }

    public final boolean V1(long j10) {
        if ((((9187343241974906880L ^ (j10 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        u1 u1Var = this.M;
        return u1Var == null || !this.f13880v || u1Var.c(j10);
    }

    public final void W0(q1.w0 w0Var, t1.d dVar) {
        q1.w0 w0Var2;
        t1.d dVar2;
        d.c cVarM1 = m1(4);
        if (cVarM1 == null) {
            M1(w0Var, dVar);
            return;
        }
        e0 e0Var = this.f13874n;
        e0Var.getClass();
        h0 sharedDrawScope = i0.a(e0Var).getSharedDrawScope();
        long jE = f3.q.e(this.f11384c);
        sharedDrawScope.getClass();
        z0.b bVar = null;
        while (cVarM1 != null) {
            if (cVarM1 instanceof r) {
                w0Var2 = w0Var;
                dVar2 = dVar;
                sharedDrawScope.m(w0Var2, jE, this, (r) cVarM1, dVar2);
            } else {
                w0Var2 = w0Var;
                dVar2 = dVar;
                if ((cVarM1.f1146c & 4) != 0 && (cVarM1 instanceof m)) {
                    int i10 = 0;
                    for (d.c cVar = ((m) cVarM1).f13947r; cVar != null; cVar = cVar.f1149f) {
                        if ((cVar.f1146c & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVarM1 = cVar;
                            } else {
                                if (bVar == null) {
                                    bVar = new z0.b(new d.c[16]);
                                }
                                if (cVarM1 != null) {
                                    bVar.b(cVarM1);
                                    cVarM1 = null;
                                }
                                bVar.b(cVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                w0Var = w0Var2;
                dVar = dVar2;
            }
            cVarM1 = k.b(bVar);
            w0Var = w0Var2;
            dVar = dVar2;
        }
    }

    @Override // g2.v
    public final long Y(long j10) {
        if (!l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        for (g1 g1Var = this; g1Var != null; g1Var = g1Var.f13878s) {
            u1 u1Var = g1Var.M;
            if (u1Var != null) {
                j10 = u1Var.d(j10, false);
            }
            j10 = ph.m0.b(j10, g1Var.C);
        }
        return j10;
    }

    public abstract void Y0();

    public final g1 Z0(g1 g1Var) {
        e0 e0VarG = g1Var.f13874n;
        e0 e0Var = this.f13874n;
        if (e0VarG == e0Var) {
            d.c cVarL1 = g1Var.l1();
            d.c cVarL12 = l1();
            if (!cVarL12.f1144a.f1157p) {
                f2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (d.c cVar = cVarL12.f1144a.f1148e; cVar != null; cVar = cVar.f1148e) {
                if ((cVar.f1146c & 2) != 0 && cVar == cVarL1) {
                    return g1Var;
                }
            }
            return this;
        }
        while (e0VarG.f13824r > e0Var.f13824r) {
            e0VarG = e0VarG.G();
            kotlin.jvm.internal.r.b(e0VarG);
        }
        e0 e0VarG2 = e0Var;
        while (e0VarG2.f13824r > e0VarG.f13824r) {
            e0VarG2 = e0VarG2.G();
            kotlin.jvm.internal.r.b(e0VarG2);
        }
        while (e0VarG != e0VarG2) {
            e0VarG = e0VarG.G();
            e0VarG2 = e0VarG2.G();
            if (e0VarG == null || e0VarG2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (e0VarG2 != e0Var) {
            if (e0VarG != g1Var.f13874n) {
                return e0VarG.I.f13790b;
            }
            return g1Var;
        }
        return this;
    }

    @Override // g2.v
    public final long a() {
        return this.f11384c;
    }

    public final long d1(long j10) {
        long j11 = this.C;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - ((int) (j11 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - ((int) (j11 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        u1 u1Var = this.M;
        return u1Var != null ? u1Var.d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public final eh.p<q1.w0, t1.d, pg.f0> f1() {
        f fVar = this.I;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(new g());
        this.I = fVar2;
        return fVar2;
    }

    public abstract o0 g1();

    @Override // f3.d
    public final float getDensity() {
        return this.f13874n.B.getDensity();
    }

    @Override // g2.q
    public final f3.r getLayoutDirection() {
        return this.f13874n.C;
    }

    public final long i1() {
        return this.f13882x.E(this.f13874n.D.d());
    }

    @Override // i2.l0, i2.y0
    public final e0 k1() {
        return this.f13874n;
    }

    @Override // g2.g1
    public void l0(float f10, long j10, eh.l lVar) {
        if (!this.f13875p) {
            N1(j10, f10, lVar, null);
            return;
        }
        o0 o0VarG1 = g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        N1(o0VarG1.f13969p, f10, lVar, null);
    }

    public abstract d.c l1();

    @Override // g2.v
    public final boolean m() {
        return l1().f1157p;
    }

    @Override // g2.g1
    public void m0(long j10, float f10, t1.d dVar) {
        if (!this.f13875p) {
            N1(j10, f10, null, dVar);
            return;
        }
        o0 o0VarG1 = g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        N1(o0VarG1.f13969p, f10, null, dVar);
    }

    public final d.c m1(int i10) {
        boolean zG = j1.g(i10);
        d.c cVarL1 = l1();
        if (!zG && (cVarL1 = cVarL1.f1148e) == null) {
            return null;
        }
        for (d.c cVarN1 = n1(zG); cVarN1 != null && (cVarN1.f1147d & i10) != 0; cVarN1 = cVarN1.f1149f) {
            if ((cVarN1.f1146c & i10) != 0) {
                return cVarN1;
            }
            if (cVarN1 == cVarL1) {
                return null;
            }
        }
        return null;
    }

    public final d.c n1(boolean z10) {
        d.c cVarL1;
        d1 d1Var = this.f13874n.I;
        if (d1Var.f13791c == this) {
            return d1Var.f13793e;
        }
        if (!z10) {
            g1 g1Var = this.f13878s;
            if (g1Var != null) {
                return g1Var.l1();
            }
            return null;
        }
        g1 g1Var2 = this.f13878s;
        if (g1Var2 == null || (cVarL1 = g1Var2.l1()) == null) {
            return null;
        }
        return cVarL1.f1149f;
    }

    public final void q1(d.c cVar, e eVar, long j10, u uVar, int i10, boolean z10) {
        if (cVar == null) {
            w1(eVar, j10, uVar, i10, z10);
            return;
        }
        int i11 = uVar.f14023c;
        p.h0<Object> h0Var = uVar.f14021a;
        uVar.e(i11 + 1, h0Var.f20707b);
        uVar.f14023c++;
        h0Var.g(cVar);
        uVar.f14022b.a(v.a(-1.0f, z10, false));
        q1(i1.a(cVar, eVar.b()), eVar, j10, uVar, i10, z10);
        uVar.f14023c = i11;
    }

    @Override // i2.l0
    public final l0 s0() {
        return this.f13877r;
    }

    public final void s1(d.c cVar, e eVar, long j10, u uVar, int i10, boolean z10, float f10) {
        if (cVar == null) {
            w1(eVar, j10, uVar, i10, z10);
            return;
        }
        int i11 = uVar.f14023c;
        p.h0<Object> h0Var = uVar.f14021a;
        uVar.e(i11 + 1, h0Var.f20707b);
        uVar.f14023c++;
        h0Var.g(cVar);
        uVar.f14022b.a(v.a(f10, z10, false));
        L1(i1.a(cVar, eVar.b()), eVar, j10, uVar, i10, z10, f10, true);
        uVar.f14023c = i11;
    }

    @Override // i2.l0
    public final g2.v t0() {
        return this;
    }

    @Override // i2.l0
    public final boolean u0() {
        return this.A != null;
    }

    public final void u1(e eVar, long j10, u uVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        d.c cVarM1 = m1(eVar.b());
        if (!V1(j10)) {
            if (i10 == 1) {
                float fO0 = O0(j10, i1());
                if ((Float.floatToRawIntBits(fO0) & Integer.MAX_VALUE) < 2139095040) {
                    if (uVar.f14023c != qg.p.i(uVar)) {
                        if (f1.m.b(uVar.c(), v.a(fO0, false, false)) <= 0) {
                            return;
                        }
                    }
                    s1(cVarM1, eVar, j10, uVar, i10, false, fO0);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarM1 == null) {
            w1(eVar, j10, uVar, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        if (fIntBitsToFloat >= CropImageView.DEFAULT_ASPECT_RATIO && fIntBitsToFloat2 >= CropImageView.DEFAULT_ASPECT_RATIO && fIntBitsToFloat < g0() && fIntBitsToFloat2 < e0()) {
            q1(cVarM1, eVar, j10, uVar, i10, z10);
            return;
        }
        float fO02 = i10 == 1 ? O0(j10, i1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fO02) & Integer.MAX_VALUE) < 2139095040) {
            if (uVar.f14023c != qg.p.i(uVar)) {
                z11 = z10;
                if (f1.m.b(uVar.c(), v.a(fO02, z11, false)) > 0) {
                }
                L1(cVarM1, eVar, j10, uVar, i10, z11, fO02, z12);
            }
            z11 = z10;
            z12 = true;
            L1(cVarM1, eVar, j10, uVar, i10, z11, fO02, z12);
        }
        z11 = z10;
        z12 = false;
        L1(cVarM1, eVar, j10, uVar, i10, z11, fO02, z12);
    }

    @Override // i2.l0
    public final g2.m0 v0() {
        g2.m0 m0Var = this.A;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
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
    @Override // g2.p0, g2.p
    public final Object w() {
        e0 e0Var = this.f13874n;
        if (!e0Var.I.d(64)) {
            return null;
        }
        l1();
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        for (d.c cVar = e0Var.I.f13792d; cVar != null; cVar = cVar.f1148e) {
            if ((cVar.f1146c & 64) != 0) {
                ?? bVar = 0;
                m mVarB = cVar;
                while (mVarB != 0) {
                    if (mVarB instanceof g2) {
                        g0Var.f16327a = ((g2) mVarB).O0(e0Var.B, g0Var.f16327a);
                    } else if ((mVarB.f1146c & 64) != 0 && (mVarB instanceof m)) {
                        d.c cVar2 = mVarB.f13947r;
                        int i10 = 0;
                        mVarB = mVarB;
                        bVar = bVar;
                        while (cVar2 != null) {
                            if ((cVar2.f1146c & 64) != 0) {
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
        }
        return g0Var.f16327a;
    }

    @Override // i2.l0
    public final l0 w0() {
        return this.f13878s;
    }

    public void w1(e eVar, long j10, u uVar, int i10, boolean z10) {
        g1 g1Var = this.f13877r;
        if (g1Var != null) {
            g1Var.u1(eVar, g1Var.d1(j10), uVar, i10, z10);
        }
    }

    public final void x1() {
        u1 u1Var = this.M;
        if (u1Var != null) {
            u1Var.invalidate();
            return;
        }
        g1 g1Var = this.f13878s;
        if (g1Var != null) {
            g1Var.x1();
        }
    }

    @Override // g2.v
    public final long y(long j10) {
        if (!l1().f1157p) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return F1(g2.w.c(this), i0.a(this.f13874n).y(j10));
    }

    @Override // i2.l0
    public final long z0() {
        return this.C;
    }
}
