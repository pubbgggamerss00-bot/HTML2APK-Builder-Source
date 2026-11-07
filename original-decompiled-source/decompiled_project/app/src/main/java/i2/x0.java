package i2;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import i2.e0;
import i2.p0;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import z0.b;

/* loaded from: classes.dex */
public final class x0 extends g2.g1 implements g2.k0, i2.b, b1 {
    public boolean A;
    public boolean E;
    public float I;
    public boolean K;
    public eh.l<? super q1.l1, pg.f0> L;
    public t1.d M;
    public float O;
    public boolean Q;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f14047f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14048g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14051k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14052l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14054n;

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super q1.l1, pg.f0> f14056q;

    /* renamed from: r, reason: collision with root package name */
    public t1.d f14057r;

    /* renamed from: s, reason: collision with root package name */
    public float f14058s;

    /* renamed from: v, reason: collision with root package name */
    public Object f14060v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14061w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14062x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14063y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14064z;

    /* renamed from: h, reason: collision with root package name */
    public int f14049h = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f14050j = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public e0.f f14053m = e0.f.f13842c;

    /* renamed from: p, reason: collision with root package name */
    public long f14055p = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14059t = true;
    public final g0 B = new g0(this);
    public final z0.b<x0> C = new z0.b<>(new x0[16]);
    public boolean D = true;
    public long F = f3.c.b(0, 0, 15);
    public final b G = new b();
    public final a H = new a();
    public long N = 0;
    public final c P = new c();

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x0 x0Var = x0.this;
            j0 j0Var = x0Var.f14047f;
            j0Var.f13922i = 0;
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                x0 x0Var2 = e0VarArr[i11].K.f13929p;
                x0Var2.f14049h = x0Var2.f14050j;
                x0Var2.f14050j = Integer.MAX_VALUE;
                x0Var2.f14062x = false;
                if (x0Var2.f14053m == e0.f.f13841b) {
                    x0Var2.f14053m = e0.f.f13842c;
                }
            }
            x0Var.V(v0.f14043a);
            x0Var.F().v0().s();
            e0 e0Var = j0Var.f13914a;
            z0.b<e0> bVarJ2 = e0Var.J();
            e0[] e0VarArr2 = bVarJ2.f34700a;
            int i12 = bVarJ2.f34702c;
            for (int i13 = 0; i13 < i12; i13++) {
                e0 e0Var2 = e0VarArr2[i13];
                j0 j0Var2 = e0Var2.K;
                if (j0Var2.f13929p.f14049h != e0Var2.H()) {
                    e0Var.W();
                    e0Var.M();
                    if (e0Var2.H() == Integer.MAX_VALUE) {
                        if (j0Var2.f13916c) {
                            p0 p0Var = j0Var2.f13930q;
                            kotlin.jvm.internal.r.b(p0Var);
                            p0Var.q0(false);
                        }
                        j0Var2.f13929p.s0();
                    }
                }
            }
            x0Var.V(w0.f14044a);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x0 x0Var = x0.this;
            x0Var.f14047f.a().P(x0Var.F);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public c() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g1.a placementScope;
            x0 x0Var = x0.this;
            j0 j0Var = x0Var.f14047f;
            g1 g1Var = j0Var.a().f13878s;
            if (g1Var == null || (placementScope = g1Var.f13939j) == null) {
                placementScope = i0.a(j0Var.f13914a).getPlacementScope();
            }
            eh.l<? super q1.l1, pg.f0> lVar = x0Var.L;
            t1.d dVar = x0Var.M;
            if (dVar != null) {
                g1 g1VarA = j0Var.a();
                long j10 = x0Var.N;
                float f10 = x0Var.O;
                placementScope.getClass();
                g1.a.a(placementScope, g1VarA);
                g1VarA.m0(f3.m.d(j10, g1VarA.f11386e), f10, dVar);
            } else if (lVar == null) {
                g1 g1VarA2 = j0Var.a();
                long j11 = x0Var.N;
                float f11 = x0Var.O;
                placementScope.getClass();
                g1.a.a(placementScope, g1VarA2);
                g1VarA2.l0(f11, f3.m.d(j11, g1VarA2.f11386e), null);
            } else {
                g1 g1VarA3 = j0Var.a();
                long j12 = x0Var.N;
                float f12 = x0Var.O;
                placementScope.getClass();
                g1.a.a(placementScope, g1VarA3);
                g1VarA3.l0(f12, f3.m.d(j12, g1VarA3.f11386e), lVar);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<i2.b, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14068a = new d(1);

        @Override // eh.l
        public final pg.f0 invoke(i2.b bVar) {
            bVar.r().f13763c = false;
            return pg.f0.f21461a;
        }
    }

    public x0(j0 j0Var) {
        this.f14047f = j0Var;
    }

    public final boolean B0(long j10) {
        j0 j0Var = this.f14047f;
        e0 e0Var = j0Var.f13914a;
        e0 e0Var2 = j0Var.f13914a;
        if (e0Var.T) {
            f2.a.a("measure is called on a deactivated node");
        }
        v1 v1VarA = i0.a(e0Var2);
        e0 e0VarG = e0Var2.G();
        boolean z10 = true;
        e0Var2.H = e0Var2.H || (e0VarG != null && e0VarG.H);
        if (!e0Var2.D() && f3.b.c(this.f11385d, j10)) {
            v1VarA.B(e0Var2, false);
            e0Var2.h0();
            return false;
        }
        this.B.f13766f = false;
        V(d.f14068a);
        this.f14051k = true;
        long j11 = j0Var.a().f11384c;
        p0(j10);
        e0.d dVar = j0Var.f13917d;
        e0.d dVar2 = e0.d.f13837e;
        if (dVar != dVar2) {
            f2.a.b("layout state is not idle before measure starts");
        }
        this.F = j10;
        e0.d dVar3 = e0.d.f13833a;
        j0Var.f13917d = dVar3;
        this.f14063y = false;
        f2 snapshotObserver = i0.a(e0Var2).getSnapshotObserver();
        snapshotObserver.a(e0Var2, snapshotObserver.f13855c, this.G);
        if (j0Var.f13917d == dVar3) {
            this.f14064z = true;
            this.A = true;
            j0Var.f13917d = dVar2;
        }
        if (f3.p.b(j0Var.a().f11384c, j11) && j0Var.a().f11382a == this.f11382a && j0Var.a().f11383b == this.f11383b) {
            z10 = false;
        }
        o0((j0Var.a().f11383b & BodyPartID.bodyIdMax) | (j0Var.a().f11382a << 32));
        return z10;
    }

    @Override // i2.b
    public final w F() {
        return this.f14047f.f13914a.I.f13790b;
    }

    @Override // i2.b
    public final i2.b H() {
        j0 j0Var;
        e0 e0VarG = this.f14047f.f13914a.G();
        if (e0VarG == null || (j0Var = e0VarG.K) == null) {
            return null;
        }
        return j0Var.f13929p;
    }

    @Override // g2.p
    public final int J(int i10) {
        j0 j0Var = this.f14047f;
        if (!f3.u.d(j0Var.f13914a)) {
            u0();
            return j0Var.a().J(i10);
        }
        p0 p0Var = j0Var.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        return p0Var.J(i10);
    }

    @Override // g2.p
    public final int O(int i10) {
        j0 j0Var = this.f14047f;
        if (!f3.u.d(j0Var.f13914a)) {
            u0();
            return j0Var.a().O(i10);
        }
        p0 p0Var = j0Var.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        return p0Var.O(i10);
    }

    @Override // g2.k0
    public final g2.g1 P(long j10) {
        e0.f fVar;
        j0 j0Var = this.f14047f;
        e0 e0Var = j0Var.f13914a;
        e0.f fVar2 = e0Var.F;
        e0.f fVar3 = e0.f.f13842c;
        if (fVar2 == fVar3) {
            e0Var.p();
        }
        if (f3.u.d(j0Var.f13914a)) {
            p0 p0Var = j0Var.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            p0Var.f13980k = fVar3;
            p0Var.P(j10);
        }
        e0 e0Var2 = j0Var.f13914a;
        e0 e0VarG = e0Var2.G();
        if (e0VarG != null) {
            j0 j0Var2 = e0VarG.K;
            if (this.f14053m != fVar3 && !e0Var2.H) {
                f2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.f13917d.ordinal();
            if (iOrdinal == 0) {
                fVar = e0.f.f13840a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.f13917d);
                }
                fVar = e0.f.f13841b;
            }
            this.f14053m = fVar;
        } else {
            this.f14053m = fVar3;
        }
        B0(j10);
        return this;
    }

    @Override // g2.p0
    public final int Q(g2.a aVar) {
        j0 j0Var = this.f14047f;
        e0 e0VarG = j0Var.f13914a.G();
        e0.d dVar = e0VarG != null ? e0VarG.K.f13917d : null;
        e0.d dVar2 = e0.d.f13833a;
        g0 g0Var = this.B;
        if (dVar == dVar2) {
            g0Var.f13763c = true;
        } else {
            e0 e0VarG2 = j0Var.f13914a.G();
            if ((e0VarG2 != null ? e0VarG2.K.f13917d : null) == e0.d.f13835c) {
                g0Var.f13764d = true;
            }
        }
        this.f14054n = true;
        int iQ = j0Var.a().Q(aVar);
        this.f14054n = false;
        return iQ;
    }

    @Override // i2.b1
    public final void T(boolean z10) {
        j0 j0Var = this.f14047f;
        if (z10 != j0Var.a().f13936f) {
            j0Var.a().f13936f = z10;
            this.Q = true;
        }
    }

    @Override // i2.b
    public final void V(eh.l<? super i2.b, pg.f0> lVar) {
        z0.b<e0> bVarJ = this.f14047f.f13914a.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            lVar.invoke(e0VarArr[i11].K.f13929p);
        }
    }

    @Override // i2.b
    public final void X() {
        this.E = true;
        g0 g0Var = this.B;
        g0Var.i();
        boolean z10 = this.f14064z;
        j0 j0Var = this.f14047f;
        if (z10) {
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0 e0Var = e0VarArr[i11];
                if (e0Var.D() && e0Var.K.f13929p.f14053m == e0.f.f13840a && e0.Y(e0Var)) {
                    e0.f0(j0Var.f13914a, false, 7);
                }
            }
        }
        if (this.A || (!this.f14054n && !F().f13938h && this.f14064z)) {
            this.f14064z = false;
            e0.d dVar = j0Var.f13917d;
            j0Var.f13917d = e0.d.f13835c;
            j0Var.e(false);
            e0 e0Var2 = j0Var.f13914a;
            f2 snapshotObserver = i0.a(e0Var2).getSnapshotObserver();
            snapshotObserver.a(e0Var2, snapshotObserver.f13857e, this.H);
            j0Var.f13917d = dVar;
            if (F().f13938h && j0Var.f13923j) {
                requestLayout();
            }
            this.A = false;
        }
        if (g0Var.f13764d) {
            g0Var.f13765e = true;
        }
        if (g0Var.f13762b && g0Var.f()) {
            g0Var.h();
        }
        this.E = false;
    }

    @Override // i2.b
    public final void a0() {
        e0.f0(this.f14047f.f13914a, false, 7);
    }

    @Override // g2.p
    public final int b0(int i10) {
        j0 j0Var = this.f14047f;
        if (!f3.u.d(j0Var.f13914a)) {
            u0();
            return j0Var.a().b0(i10);
        }
        p0 p0Var = j0Var.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        return p0Var.b0(i10);
    }

    @Override // g2.g1
    public final int e0() {
        return this.f14047f.a().e0();
    }

    @Override // g2.g1
    public final int g0() {
        return this.f14047f.a().g0();
    }

    @Override // g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
        z0(j10, f10, lVar, null);
    }

    @Override // g2.g1
    public final void m0(long j10, float f10, t1.d dVar) {
        z0(j10, f10, null, dVar);
    }

    public final List<x0> q0() {
        j0 j0Var = this.f14047f;
        j0Var.f13914a.l0();
        boolean z10 = this.D;
        z0.b<x0> bVar = this.C;
        if (!z10) {
            return bVar.f();
        }
        e0 e0Var = j0Var.f13914a;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (bVar.f34702c <= i11) {
                bVar.b(e0Var2.K.f13929p);
            } else {
                x0 x0Var = e0Var2.K.f13929p;
                x0[] x0VarArr = bVar.f34700a;
                x0 x0Var2 = x0VarArr[i11];
                x0VarArr[i11] = x0Var;
            }
        }
        bVar.l(((b.a) e0Var.A()).f34703a.f34702c, bVar.f34702c);
        this.D = false;
        return bVar.f();
    }

    @Override // i2.b
    public final i2.a r() {
        return this.B;
    }

    public final void r0() {
        boolean z10 = this.f14061w;
        this.f14061w = true;
        e0 e0Var = this.f14047f.f13914a;
        d1 d1Var = e0Var.I;
        if (!z10) {
            d1Var.f13790b.K1();
            if (e0Var.D()) {
                e0.f0(e0Var, true, 6);
            } else if (e0Var.K.f13918e) {
                e0.d0(e0Var, true, 6);
            }
        }
        g1 g1Var = d1Var.f13790b.f13877r;
        for (g1 g1Var2 = d1Var.f13791c; !kotlin.jvm.internal.r.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f13877r) {
            if (g1Var2.L) {
                g1Var2.x1();
            }
        }
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (e0Var2.H() != Integer.MAX_VALUE) {
                e0Var2.K.f13929p.r0();
                e0.g0(e0Var2);
            }
        }
    }

    @Override // i2.b
    public final void requestLayout() {
        e0 e0Var = this.f14047f.f13914a;
        e0.c cVar = e0.U;
        e0Var.e0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void s0() {
        if (this.f14061w) {
            this.f14061w = false;
            j0 j0Var = this.f14047f;
            d1 d1Var = j0Var.f13914a.I;
            g1 g1Var = d1Var.f13790b.f13877r;
            for (g1 g1Var2 = d1Var.f13791c; !kotlin.jvm.internal.r.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f13877r) {
                d.c cVarN1 = g1Var2.n1(j1.g(PKIFailureInfo.badCertTemplate));
                if (cVarN1 != null && (cVarN1.f1144a.f1147d & PKIFailureInfo.badCertTemplate) != 0) {
                    boolean zG = j1.g(PKIFailureInfo.badCertTemplate);
                    d.c cVarL1 = g1Var2.l1();
                    if (zG || (cVarL1 = cVarL1.f1148e) != null) {
                        for (d.c cVarN12 = g1Var2.n1(zG); cVarN12 != null && (cVarN12.f1147d & PKIFailureInfo.badCertTemplate) != 0; cVarN12 = cVarN12.f1149f) {
                            if ((cVarN12.f1146c & PKIFailureInfo.badCertTemplate) != 0) {
                                m mVarB = cVarN12;
                                ?? bVar = 0;
                                while (mVarB != 0) {
                                    if (mVarB instanceof t1) {
                                        ((t1) mVarB).E1();
                                    } else if ((mVarB.f1146c & PKIFailureInfo.badCertTemplate) != 0 && (mVarB instanceof m)) {
                                        d.c cVar = mVarB.f13947r;
                                        int i10 = 0;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                        while (cVar != null) {
                                            if ((cVar.f1146c & PKIFailureInfo.badCertTemplate) != 0) {
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
                    }
                }
                if (g1Var2.M != null) {
                    if (g1Var2.N != null) {
                        g1Var2.N = null;
                    }
                    g1Var2.T1(null, false);
                    g1Var2.f13874n.e0(false);
                }
            }
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i11 = bVarJ.f34702c;
            for (int i12 = 0; i12 < i11; i12++) {
                e0VarArr[i12].K.f13929p.s0();
            }
        }
    }

    public final void t0() {
        j0 j0Var = this.f14047f;
        if (j0Var.f13925l > 0) {
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0 e0Var = e0VarArr[i11];
                j0 j0Var2 = e0Var.K;
                boolean z10 = j0Var2.f13923j;
                x0 x0Var = j0Var2.f13929p;
                if ((z10 || j0Var2.f13924k) && !x0Var.f14064z) {
                    e0Var.e0(false);
                }
                x0Var.t0();
            }
        }
    }

    public final void u0() {
        j0 j0Var = this.f14047f;
        e0.f0(j0Var.f13914a, false, 7);
        e0 e0Var = j0Var.f13914a;
        e0 e0VarG = e0Var.G();
        if (e0VarG == null || e0Var.F != e0.f.f13842c) {
            return;
        }
        int iOrdinal = e0VarG.K.f13917d.ordinal();
        e0Var.F = iOrdinal != 0 ? iOrdinal != 2 ? e0VarG.F : e0.f.f13841b : e0.f.f13840a;
    }

    public final void v0() {
        this.K = true;
        j0 j0Var = this.f14047f;
        e0 e0VarG = j0Var.f13914a.G();
        float f10 = F().D;
        e0 e0Var = j0Var.f13914a;
        d1 d1Var = e0Var.I;
        w wVar = d1Var.f13790b;
        for (g1 g1Var = d1Var.f13791c; g1Var != wVar; g1Var = g1Var.f13877r) {
            kotlin.jvm.internal.r.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f10 += ((c0) g1Var).D;
        }
        if (f10 != this.I) {
            this.I = f10;
            if (e0VarG != null) {
                e0VarG.W();
            }
            if (e0VarG != null) {
                e0VarG.M();
            }
        }
        if (this.f14061w) {
            e0Var.I.f13790b.K1();
        } else {
            if (e0VarG != null) {
                e0VarG.M();
            }
            r0();
            if (this.f14048g && e0VarG != null) {
                e0VarG.e0(false);
            }
        }
        if (e0VarG != null) {
            j0 j0Var2 = e0VarG.K;
            if (!this.f14048g && j0Var2.f13917d == e0.d.f13835c) {
                if (this.f14050j != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i10 = j0Var2.f13922i;
                this.f14050j = i10;
                j0Var2.f13922i = i10 + 1;
            }
        } else {
            this.f14050j = 0;
        }
        X();
    }

    @Override // g2.p0, g2.p
    public final Object w() {
        return this.f14060v;
    }

    public final void w0(long j10, float f10, eh.l<? super q1.l1, pg.f0> lVar, t1.d dVar) {
        j0 j0Var = this.f14047f;
        e0 e0Var = j0Var.f13914a;
        e0 e0Var2 = j0Var.f13914a;
        if (e0Var.T) {
            f2.a.a("place is called on a deactivated node");
        }
        j0Var.f13917d = e0.d.f13835c;
        boolean z10 = !this.f14052l;
        this.f14055p = j10;
        this.f14058s = f10;
        this.f14056q = lVar;
        this.f14057r = dVar;
        this.f14052l = true;
        this.K = false;
        v1 v1VarA = i0.a(e0Var2);
        v1VarA.getRectManager().f(e0Var2, j10, z10);
        if (this.f14064z || !this.f14061w) {
            this.B.f13767g = false;
            j0Var.d(false);
            this.L = lVar;
            this.N = j10;
            this.O = f10;
            this.M = dVar;
            f2 snapshotObserver = v1VarA.getSnapshotObserver();
            snapshotObserver.a(e0Var2, snapshotObserver.f13858f, this.P);
        } else {
            g1 g1VarA = j0Var.a();
            g1VarA.N1(f3.m.d(j10, g1VarA.f11386e), f10, lVar, dVar);
            v0();
        }
        j0Var.f13917d = e0.d.f13837e;
    }

    @Override // i2.b
    public final boolean x() {
        return this.f14061w;
    }

    @Override // g2.p
    public final int z(int i10) {
        j0 j0Var = this.f14047f;
        if (!f3.u.d(j0Var.f13914a)) {
            u0();
            return j0Var.a().z(i10);
        }
        p0 p0Var = j0Var.f13930q;
        kotlin.jvm.internal.r.b(p0Var);
        return p0Var.z(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(long j10, float f10, eh.l<? super q1.l1, pg.f0> lVar, t1.d dVar) {
        boolean z10;
        g1.a placementScope;
        boolean z11;
        this.f14062x = true;
        boolean zB = f3.m.b(j10, this.f14055p);
        j0 j0Var = this.f14047f;
        if (!zB || this.Q) {
            if (j0Var.f13924k || j0Var.f13923j || this.Q) {
                this.f14064z = true;
                this.Q = false;
            }
            t0();
        }
        p0 p0Var = j0Var.f13930q;
        e0 e0Var = j0Var.f13914a;
        if (p0Var != null) {
            j0 j0Var2 = p0Var.f13976f;
            if (f3.u.d(j0Var2.f13914a)) {
                z11 = true;
            } else {
                if (p0Var.f13988t == p0.a.f13996c && !j0Var2.f13915b) {
                    j0Var2.f13916c = true;
                }
                z11 = j0Var2.f13916c;
            }
            z10 = z11;
        }
        if (z10) {
            g1 g1Var = j0Var.a().f13878s;
            if (g1Var == null || (placementScope = g1Var.f13939j) == null) {
                placementScope = i0.a(e0Var).getPlacementScope();
            }
            p0 p0Var2 = j0Var.f13930q;
            kotlin.jvm.internal.r.b(p0Var2);
            e0 e0VarG = e0Var.G();
            if (e0VarG != null) {
                e0VarG.K.f13921h = 0;
            }
            p0Var2.f13979j = Integer.MAX_VALUE;
            placementScope.d(p0Var2, (int) (j10 >> 32), (int) (BodyPartID.bodyIdMax & j10), CropImageView.DEFAULT_ASPECT_RATIO);
        }
        p0 p0Var3 = j0Var.f13930q;
        if ((p0Var3 == null || p0Var3.f13982m) ? false : true) {
            f2.a.b("Error: Placement happened before lookahead.");
        }
        w0(j10, f10, lVar, dVar);
    }
}
