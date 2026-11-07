package i2;

import i0.u2;
import i2.e0;
import i2.w;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import z0.b;

/* loaded from: classes.dex */
public final class p0 extends g2.g1 implements g2.k0, i2.b, b1 {
    public Object A;
    public boolean B;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f13976f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13977g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13981l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13982m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13983n;

    /* renamed from: p, reason: collision with root package name */
    public f3.b f13984p;

    /* renamed from: r, reason: collision with root package name */
    public eh.l<? super q1.l1, pg.f0> f13986r;

    /* renamed from: s, reason: collision with root package name */
    public t1.d f13987s;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13992y;

    /* renamed from: h, reason: collision with root package name */
    public int f13978h = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f13979j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public e0.f f13980k = e0.f.f13842c;

    /* renamed from: q, reason: collision with root package name */
    public long f13985q = 0;

    /* renamed from: t, reason: collision with root package name */
    public a f13988t = a.f13996c;

    /* renamed from: v, reason: collision with root package name */
    public final k0 f13989v = new k0(this);

    /* renamed from: w, reason: collision with root package name */
    public final z0.b<p0> f13990w = new z0.b<>(new p0[16]);

    /* renamed from: x, reason: collision with root package name */
    public boolean f13991x = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13993z = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13994a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f13995b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f13996c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f13997d;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            f13994a = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            f13995b = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            f13996c = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f13997d = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f13997d.clone();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f13999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var) {
            super(0);
            this.f13999b = o0Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            p0 p0Var = p0.this;
            j0 j0Var = p0Var.f13976f;
            j0Var.f13921h = 0;
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                p0 p0Var2 = e0VarArr[i11].K.f13930q;
                kotlin.jvm.internal.r.b(p0Var2);
                p0Var2.f13978h = p0Var2.f13979j;
                p0Var2.f13979j = Integer.MAX_VALUE;
                if (p0Var2.f13980k == e0.f.f13841b) {
                    p0Var2.f13980k = e0.f.f13842c;
                }
            }
            p0Var.V(q0.f14005a);
            w.a aVar = p0Var.F().W;
            if (aVar != null) {
                boolean z10 = aVar.f13938h;
                b.a aVar2 = (b.a) j0Var.f13914a.A();
                int i12 = aVar2.f34703a.f34702c;
                for (int i13 = 0; i13 < i12; i13++) {
                    o0 o0VarG1 = ((e0) aVar2.get(i13)).I.f13791c.g1();
                    if (o0VarG1 != null) {
                        o0VarG1.f13938h = z10;
                    }
                }
            }
            this.f13999b.v0().s();
            if (p0Var.F().W != null) {
                b.a aVar3 = (b.a) j0Var.f13914a.A();
                int i14 = aVar3.f34703a.f34702c;
                for (int i15 = 0; i15 < i14; i15++) {
                    o0 o0VarG12 = ((e0) aVar3.get(i15)).I.f13791c.g1();
                    if (o0VarG12 != null) {
                        o0VarG12.f13938h = false;
                    }
                }
            }
            z0.b<e0> bVarJ2 = j0Var.f13914a.J();
            e0[] e0VarArr2 = bVarJ2.f34700a;
            int i16 = bVarJ2.f34702c;
            for (int i17 = 0; i17 < i16; i17++) {
                p0 p0Var3 = e0VarArr2[i17].K.f13930q;
                kotlin.jvm.internal.r.b(p0Var3);
                int i18 = p0Var3.f13978h;
                int i19 = p0Var3.f13979j;
                if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                    p0Var3.q0(true);
                }
            }
            p0Var.V(r0.f14009a);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<i2.b, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14000a = new c(1);

        @Override // eh.l
        public final pg.f0 invoke(i2.b bVar) {
            bVar.r().f13763c = false;
            return pg.f0.f21461a;
        }
    }

    public p0(j0 j0Var) {
        this.f13976f = j0Var;
        this.A = j0Var.f13929p.f14060v;
    }

    @Override // i2.b
    public final w F() {
        return this.f13976f.f13914a.I.f13790b;
    }

    @Override // i2.b
    public final i2.b H() {
        j0 j0Var;
        e0 e0VarG = this.f13976f.f13914a.G();
        if (e0VarG == null || (j0Var = e0VarG.K) == null) {
            return null;
        }
        return j0Var.f13930q;
    }

    @Override // g2.p
    public final int J(int i10) {
        t0();
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.J(i10);
    }

    @Override // g2.p
    public final int O(int i10) {
        t0();
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.O(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // g2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.g1 P(long j10) {
        e0.f fVar;
        j0 j0Var = this.f13976f;
        e0 e0VarG = j0Var.f13914a.G();
        if ((e0VarG != null ? e0VarG.K.f13917d : null) == e0.d.f13834b) {
            j0Var.f13915b = false;
        } else {
            e0 e0VarG2 = j0Var.f13914a.G();
            if ((e0VarG2 != null ? e0VarG2.K.f13917d : null) == e0.d.f13836d) {
            }
        }
        e0 e0Var = j0Var.f13914a;
        e0 e0VarG3 = e0Var.G();
        if (e0VarG3 != null) {
            j0 j0Var2 = e0VarG3.K;
            if (this.f13980k != e0.f.f13842c && !e0Var.H) {
                f2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.f13917d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fVar = e0.f.f13840a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.f13917d);
                }
                fVar = e0.f.f13841b;
            }
            this.f13980k = fVar;
        } else {
            this.f13980k = e0.f.f13842c;
        }
        e0 e0Var2 = j0Var.f13914a;
        if (e0Var2.F == e0.f.f13842c) {
            e0Var2.p();
        }
        w0(j10);
        return this;
    }

    @Override // g2.p0
    public final int Q(g2.a aVar) {
        j0 j0Var = this.f13976f;
        e0 e0VarG = j0Var.f13914a.G();
        e0.d dVar = e0VarG != null ? e0VarG.K.f13917d : null;
        e0.d dVar2 = e0.d.f13834b;
        k0 k0Var = this.f13989v;
        if (dVar == dVar2) {
            k0Var.f13763c = true;
        } else {
            e0 e0VarG2 = j0Var.f13914a.G();
            if ((e0VarG2 != null ? e0VarG2.K.f13917d : null) == e0.d.f13836d) {
                k0Var.f13764d = true;
            }
        }
        this.f13981l = true;
        o0 o0VarG1 = j0Var.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        int iQ = o0VarG1.Q(aVar);
        this.f13981l = false;
        return iQ;
    }

    @Override // i2.b1
    public final void T(boolean z10) {
        o0 o0VarG1;
        j0 j0Var = this.f13976f;
        o0 o0VarG12 = j0Var.a().g1();
        if (Boolean.valueOf(z10).equals(o0VarG12 != null ? Boolean.valueOf(o0VarG12.f13936f) : null) || (o0VarG1 = j0Var.a().g1()) == null) {
            return;
        }
        o0VarG1.f13936f = z10;
    }

    @Override // i2.b
    public final void V(eh.l<? super i2.b, pg.f0> lVar) {
        z0.b<e0> bVarJ = this.f13976f.f13914a.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            p0 p0Var = e0VarArr[i11].K.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            lVar.invoke(p0Var);
        }
    }

    @Override // i2.b
    public final void X() {
        this.f13992y = true;
        k0 k0Var = this.f13989v;
        k0Var.i();
        j0 j0Var = this.f13976f;
        boolean z10 = j0Var.f13919f;
        e0 e0Var = j0Var.f13914a;
        if (z10) {
            z0.b<e0> bVarJ = e0Var.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0 e0Var2 = e0VarArr[i11];
                j0 j0Var2 = e0Var2.K;
                if (j0Var2.f13918e && e0Var2.E() == e0.f.f13840a) {
                    p0 p0Var = j0Var2.f13930q;
                    kotlin.jvm.internal.r.b(p0Var);
                    p0 p0Var2 = j0Var2.f13930q;
                    f3.b bVar = p0Var2 != null ? p0Var2.f13984p : null;
                    kotlin.jvm.internal.r.b(bVar);
                    if (p0Var.w0(bVar.f8811a)) {
                        e0.d0(e0Var, false, 7);
                    }
                }
            }
        }
        w.a aVar = F().W;
        kotlin.jvm.internal.r.b(aVar);
        if (j0Var.f13920g || (!this.f13981l && !aVar.f13938h && j0Var.f13919f)) {
            j0Var.f13919f = false;
            e0.d dVar = j0Var.f13917d;
            j0Var.f13917d = e0.d.f13836d;
            v1 v1VarA = i0.a(e0Var);
            j0Var.g(false);
            f2 snapshotObserver = v1VarA.getSnapshotObserver();
            b bVar2 = new b(aVar);
            snapshotObserver.getClass();
            if (e0Var.f13816h != null) {
                snapshotObserver.a(e0Var, snapshotObserver.f13860h, bVar2);
            } else {
                snapshotObserver.a(e0Var, snapshotObserver.f13857e, bVar2);
            }
            j0Var.f13917d = dVar;
            if (j0Var.f13926m && aVar.f13938h) {
                requestLayout();
            }
            j0Var.f13920g = false;
        }
        if (k0Var.f13764d) {
            k0Var.f13765e = true;
        }
        if (k0Var.f13762b && k0Var.f()) {
            k0Var.h();
        }
        this.f13992y = false;
    }

    @Override // i2.b
    public final void a0() {
        e0.d0(this.f13976f.f13914a, false, 7);
    }

    @Override // g2.p
    public final int b0(int i10) {
        t0();
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.b0(i10);
    }

    @Override // g2.g1
    public final int e0() {
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.e0();
    }

    @Override // g2.g1
    public final int g0() {
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.g0();
    }

    @Override // g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
        v0(j10, lVar, null);
    }

    @Override // g2.g1
    public final void m0(long j10, float f10, t1.d dVar) {
        v0(j10, null, dVar);
    }

    public final void q0(boolean z10) {
        j0 j0Var = this.f13976f;
        if (z10 && j0Var.f13916c) {
            return;
        }
        if (z10 || j0Var.f13916c) {
            this.f13988t = a.f13996c;
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                p0 p0Var = e0VarArr[i11].K.f13930q;
                kotlin.jvm.internal.r.b(p0Var);
                p0Var.q0(true);
            }
        }
    }

    @Override // i2.b
    public final i2.a r() {
        return this.f13989v;
    }

    public final void r0() {
        a aVar = this.f13988t;
        j0 j0Var = this.f13976f;
        boolean z10 = j0Var.f13916c;
        e0 e0Var = j0Var.f13914a;
        if (z10) {
            this.f13988t = a.f13995b;
        } else {
            this.f13988t = a.f13994a;
        }
        if (aVar != a.f13994a && j0Var.f13918e) {
            e0.d0(e0Var, true, 6);
        }
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            p0 p0Var = e0Var2.K.f13930q;
            if (p0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (p0Var.f13979j != Integer.MAX_VALUE) {
                p0Var.r0();
                e0.g0(e0Var2);
            }
        }
    }

    @Override // i2.b
    public final void requestLayout() {
        e0 e0Var = this.f13976f.f13914a;
        e0.c cVar = e0.U;
        e0Var.c0(false);
    }

    public final void s0() {
        j0 j0Var = this.f13976f;
        if (j0Var.f13928o > 0) {
            z0.b<e0> bVarJ = j0Var.f13914a.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0 e0Var = e0VarArr[i11];
                j0 j0Var2 = e0Var.K;
                if ((j0Var2.f13926m || j0Var2.f13927n) && !j0Var2.f13919f) {
                    e0Var.c0(false);
                }
                p0 p0Var = j0Var2.f13930q;
                if (p0Var != null) {
                    p0Var.s0();
                }
            }
        }
    }

    public final void t0() {
        j0 j0Var = this.f13976f;
        e0.d0(j0Var.f13914a, false, 7);
        e0 e0Var = j0Var.f13914a;
        e0 e0VarG = e0Var.G();
        if (e0VarG == null || e0Var.F != e0.f.f13842c) {
            return;
        }
        int iOrdinal = e0VarG.K.f13917d.ordinal();
        e0Var.F = iOrdinal != 0 ? iOrdinal != 2 ? e0VarG.F : e0.f.f13841b : e0.f.f13840a;
    }

    public final void u0() {
        e0.d dVar;
        this.B = true;
        j0 j0Var = this.f13976f;
        e0 e0VarG = j0Var.f13914a.G();
        a aVar = this.f13988t;
        if ((aVar != a.f13994a && !j0Var.f13916c) || (aVar != a.f13995b && j0Var.f13916c)) {
            r0();
            if (this.f13977g && e0VarG != null) {
                e0VarG.c0(false);
            }
        }
        if (e0VarG != null) {
            j0 j0Var2 = e0VarG.K;
            if (!this.f13977g && ((dVar = j0Var2.f13917d) == e0.d.f13835c || dVar == e0.d.f13836d)) {
                if (this.f13979j != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i10 = j0Var2.f13921h;
                this.f13979j = i10;
                j0Var2.f13921h = i10 + 1;
            }
        } else {
            this.f13979j = 0;
        }
        X();
    }

    public final void v0(long j10, eh.l lVar, t1.d dVar) {
        j0 j0Var = this.f13976f;
        e0 e0Var = j0Var.f13914a;
        e0 e0Var2 = j0Var.f13914a;
        e0 e0VarG = e0Var.G();
        e0.d dVar2 = e0VarG != null ? e0VarG.K.f13917d : null;
        e0.d dVar3 = e0.d.f13836d;
        if (dVar2 == dVar3) {
            j0Var.f13916c = false;
        }
        if (e0Var2.T) {
            f2.a.a("place is called on a deactivated node");
        }
        j0Var.f13917d = dVar3;
        this.f13982m = true;
        this.B = false;
        if (!f3.m.b(j10, this.f13985q)) {
            if (j0Var.f13927n || j0Var.f13926m) {
                j0Var.f13919f = true;
            }
            s0();
        }
        v1 v1VarA = i0.a(e0Var2);
        if (j0Var.f13919f || !x()) {
            j0Var.f(false);
            this.f13989v.f13767g = false;
            f2 snapshotObserver = v1VarA.getSnapshotObserver();
            t0 t0Var = new t0(this, v1VarA, j10);
            snapshotObserver.getClass();
            if (e0Var2.f13816h != null) {
                snapshotObserver.a(e0Var2, snapshotObserver.f13859g, t0Var);
            } else {
                snapshotObserver.a(e0Var2, snapshotObserver.f13858f, t0Var);
            }
        } else {
            o0 o0VarG1 = j0Var.a().g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            o0VarG1.O0(f3.m.d(j10, o0VarG1.f11386e));
            u0();
        }
        this.f13985q = j10;
        this.f13986r = lVar;
        this.f13987s = dVar;
        j0Var.f13917d = e0.d.f13837e;
    }

    @Override // g2.p0, g2.p
    public final Object w() {
        return this.A;
    }

    public final boolean w0(long j10) {
        long j11;
        long j12;
        j0 j0Var = this.f13976f;
        e0 e0Var = j0Var.f13914a;
        e0 e0Var2 = j0Var.f13914a;
        if (e0Var.T) {
            f2.a.a("measure is called on a deactivated node");
        }
        e0 e0VarG = e0Var2.G();
        e0Var2.H = e0Var2.H || (e0VarG != null && e0VarG.H);
        if (!e0Var2.K.f13918e) {
            f3.b bVar = this.f13984p;
            if (bVar == null ? false : f3.b.c(bVar.f8811a, j10)) {
                v1 v1Var = e0Var2.f13822p;
                if (v1Var != null) {
                    v1Var.B(e0Var2, true);
                }
                e0Var2.h0();
                return false;
            }
        }
        this.f13984p = new f3.b(j10);
        p0(j10);
        this.f13989v.f13766f = false;
        V(c.f14000a);
        if (this.f13983n) {
            j11 = this.f11384c;
        } else {
            long j13 = PKIFailureInfo.systemUnavail;
            j11 = (j13 & BodyPartID.bodyIdMax) | (j13 << 32);
        }
        this.f13983n = true;
        o0 o0VarG1 = j0Var.a().g1();
        if (!(o0VarG1 != null)) {
            f2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        p0 p0Var = j0Var.f13930q;
        if (p0Var != null) {
            e0.d dVar = e0.d.f13834b;
            j0 j0Var2 = p0Var.f13976f;
            j0Var2.f13917d = dVar;
            x0 x0Var = j0Var2.f13929p;
            e0 e0Var3 = j0Var2.f13914a;
            j0Var2.f13918e = false;
            f2 snapshotObserver = i0.a(e0Var3).getSnapshotObserver();
            j12 = 4294967295L;
            s0 s0Var = new s0(p0Var, j10);
            snapshotObserver.getClass();
            if (e0Var3.f13816h != null) {
                snapshotObserver.a(e0Var3, snapshotObserver.f13854b, s0Var);
            } else {
                snapshotObserver.a(e0Var3, snapshotObserver.f13855c, s0Var);
            }
            j0Var2.f13919f = true;
            j0Var2.f13920g = true;
            if (f3.u.d(e0Var3)) {
                x0Var.f14064z = true;
                x0Var.A = true;
            } else {
                x0Var.f14063y = true;
            }
            j0Var2.f13917d = e0.d.f13837e;
        } else {
            j12 = 4294967295L;
        }
        o0((o0VarG1.f11383b & j12) | (o0VarG1.f11382a << 32));
        return (((int) (j11 >> 32)) == o0VarG1.f11382a && ((int) (j11 & j12)) == o0VarG1.f11383b) ? false : true;
    }

    @Override // i2.b
    public final boolean x() {
        return this.f13988t != a.f13996c;
    }

    @Override // g2.p
    public final int z(int i10) {
        t0();
        o0 o0VarG1 = this.f13976f.a().g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.z(i10);
    }
}
