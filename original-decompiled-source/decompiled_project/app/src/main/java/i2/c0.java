package i2;

import androidx.compose.ui.d;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class c0 extends g1 {
    public static final q1.h0 Z;
    public b0 V;
    public f3.b W;
    public a X;
    public g2.f Y;

    public final class a extends o0 {
        public a() {
            super(c0.this);
        }

        @Override // g2.p
        public final int J(int i10) {
            c0 c0Var = c0.this;
            b0 b0Var = c0Var.V;
            g1 g1Var = c0Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            o0 o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            return b0Var.G(this, o0VarG1, i10);
        }

        @Override // g2.p
        public final int O(int i10) {
            c0 c0Var = c0.this;
            b0 b0Var = c0Var.V;
            g1 g1Var = c0Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            o0 o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            return b0Var.F(this, o0VarG1, i10);
        }

        @Override // g2.k0
        public final g2.g1 P(long j10) {
            p0(j10);
            f3.b bVar = new f3.b(j10);
            c0 c0Var = c0.this;
            c0Var.W = bVar;
            b0 b0Var = c0Var.V;
            g1 g1Var = c0Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            o0 o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            o0.J0(this, b0Var.m(this, o0VarG1, j10));
            return this;
        }

        @Override // g2.p
        public final int b0(int i10) {
            c0 c0Var = c0.this;
            b0 b0Var = c0Var.V;
            g1 g1Var = c0Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            o0 o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            return b0Var.w(this, o0VarG1, i10);
        }

        @Override // i2.l0
        public final int q0(g2.a aVar) {
            int iB = f3.i.b(this, aVar);
            this.f13973t.h(iB, aVar);
            return iB;
        }

        @Override // g2.p
        public final int z(int i10) {
            c0 c0Var = c0.this;
            b0 b0Var = c0Var.V;
            g1 g1Var = c0Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            o0 o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
            return b0Var.r(this, o0VarG1, i10);
        }
    }

    public static final class b implements g2.m0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.m0 f13782a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13783b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13784c;

        public b(g2.m0 m0Var, c0 c0Var) {
            this.f13782a = m0Var;
            a aVar = c0Var.X;
            kotlin.jvm.internal.r.b(aVar);
            this.f13783b = aVar.f11382a;
            a aVar2 = c0Var.X;
            kotlin.jvm.internal.r.b(aVar2);
            this.f13784c = aVar2.f11383b;
        }

        @Override // g2.m0
        public final int a() {
            return this.f13783b;
        }

        @Override // g2.m0
        public final int getHeight() {
            return this.f13784c;
        }

        @Override // g2.m0
        public final Map<g2.a, Integer> r() {
            return this.f13782a.r();
        }

        @Override // g2.m0
        public final void s() {
            this.f13782a.s();
        }

        @Override // g2.m0
        public final eh.l<Object, pg.f0> t() {
            return this.f13782a.t();
        }
    }

    static {
        q1.h0 h0VarA = q1.i0.a();
        h0VarA.i(q1.b1.f21652f);
        h0VarA.p(1.0f);
        h0VarA.q(1);
        Z = h0VarA;
    }

    public c0(e0 e0Var, b0 b0Var) {
        super(e0Var);
        this.V = b0Var;
        this.X = e0Var.f13816h != null ? new a() : null;
        this.Y = (b0Var.B().f1146c & 512) != 0 ? new g2.f(this, (g2.d) b0Var) : null;
    }

    @Override // g2.p
    public final int J(int i10) {
        g2.f fVar = this.Y;
        if (fVar != null) {
            g2.d dVar = fVar.f11366b;
            g1 g1Var = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            return dVar.m0(fVar, g1Var, i10);
        }
        b0 b0Var = this.V;
        g1 g1Var2 = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var2);
        return b0Var.G(this, g1Var2, i10);
    }

    @Override // i2.g1
    public final void M1(q1.w0 w0Var, t1.d dVar) {
        g1 g1Var = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var);
        g1Var.V0(w0Var, dVar);
        if (i0.a(this.f13874n).getShowLayoutBounds()) {
            long j10 = this.f11384c;
            w0Var.t(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & BodyPartID.bodyIdMax)) - 0.5f, Z);
        }
    }

    @Override // g2.p
    public final int O(int i10) {
        g2.f fVar = this.Y;
        if (fVar != null) {
            g2.d dVar = fVar.f11366b;
            g1 g1Var = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            return dVar.W0(fVar, g1Var, i10);
        }
        b0 b0Var = this.V;
        g1 g1Var2 = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var2);
        return b0Var.F(this, g1Var2, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // g2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.g1 P(long j10) {
        g2.m0 m0VarM;
        f3.b bVar;
        if (this.f13876q) {
            f3.b bVar2 = this.W;
            if (bVar2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j10 = bVar2.f8811a;
        }
        p0(j10);
        g2.f fVar = this.Y;
        if (fVar != null) {
            g2.d dVar = fVar.f11366b;
            a aVar = fVar.f11365a.X;
            kotlin.jvm.internal.r.b(aVar);
            g2.m0 m0VarV0 = aVar.v0();
            m0VarV0.a();
            m0VarV0.getHeight();
            boolean z10 = dVar.q0() || (bVar = this.W) == null || j10 != bVar.f8811a;
            fVar.f11367c = z10;
            if (!z10) {
                g1 g1Var = this.f13877r;
                kotlin.jvm.internal.r.b(g1Var);
                g1Var.f13876q = true;
            }
            kotlin.jvm.internal.r.b(this.f13877r);
            m0VarM = dVar.o0();
            g1 g1Var2 = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var2);
            g1Var2.f13876q = false;
            int iA = m0VarM.a();
            a aVar2 = this.X;
            kotlin.jvm.internal.r.b(aVar2);
            if (iA == aVar2.f11382a) {
                int height = m0VarM.getHeight();
                a aVar3 = this.X;
                kotlin.jvm.internal.r.b(aVar3);
                boolean z11 = height == aVar3.f11383b;
                if (!fVar.f11367c) {
                    g1 g1Var3 = this.f13877r;
                    kotlin.jvm.internal.r.b(g1Var3);
                    long j11 = g1Var3.f11384c;
                    g1 g1Var4 = this.f13877r;
                    kotlin.jvm.internal.r.b(g1Var4);
                    o0 o0VarG1 = g1Var4.g1();
                    if (f3.p.a(o0VarG1 != null ? new f3.p(o0VarG1.L0()) : null, j11) && !z11) {
                        m0VarM = new b(m0VarM, this);
                    }
                }
            }
        } else {
            b0 b0Var = this.V;
            g1 g1Var5 = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var5);
            m0VarM = b0Var.m(this, g1Var5, j10);
        }
        P1(m0VarM);
        J1();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1() {
        if (this.f13937g) {
            return;
        }
        K1();
        g2.f fVar = this.Y;
        if (fVar != null) {
            kotlin.jvm.internal.r.b(this.X);
            if (!fVar.f11367c) {
                long j10 = this.f11384c;
                a aVar = this.X;
                if (f3.p.a(aVar != null ? new f3.p(aVar.L0()) : null, j10)) {
                    g1 g1Var = this.f13877r;
                    kotlin.jvm.internal.r.b(g1Var);
                    long j11 = g1Var.f11384c;
                    g1 g1Var2 = this.f13877r;
                    kotlin.jvm.internal.r.b(g1Var2);
                    o0 o0VarG1 = g1Var2.g1();
                    boolean z10 = f3.p.a(o0VarG1 != null ? new f3.p(o0VarG1.L0()) : null, j11);
                    g1 g1Var3 = this.f13877r;
                    kotlin.jvm.internal.r.b(g1Var3);
                    g1Var3.f13875p = z10;
                }
            }
        }
        v0().s();
        g1 g1Var4 = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var4);
        g1Var4.f13875p = false;
    }

    public final void X1(b0 b0Var) {
        if (!b0Var.equals(this.V)) {
            if ((b0Var.B().f1146c & 512) != 0) {
                g2.d dVar = (g2.d) b0Var;
                g2.f fVar = this.Y;
                if (fVar != null) {
                    fVar.f11366b = dVar;
                } else {
                    fVar = new g2.f(this, dVar);
                }
                this.Y = fVar;
            } else {
                this.Y = null;
            }
        }
        this.V = b0Var;
    }

    @Override // i2.g1
    public final void Y0() {
        if (this.X == null) {
            this.X = new a();
        }
    }

    @Override // g2.p
    public final int b0(int i10) {
        g2.f fVar = this.Y;
        if (fVar != null) {
            g2.d dVar = fVar.f11366b;
            g1 g1Var = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            return dVar.d1(fVar, g1Var, i10);
        }
        b0 b0Var = this.V;
        g1 g1Var2 = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var2);
        return b0Var.w(this, g1Var2, i10);
    }

    @Override // i2.g1
    public final o0 g1() {
        return this.X;
    }

    @Override // i2.g1, g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
        super.l0(f10, j10, lVar);
        W1();
    }

    @Override // i2.g1
    public final d.c l1() {
        return this.V.B();
    }

    @Override // i2.g1, g2.g1
    public final void m0(long j10, float f10, t1.d dVar) {
        super.m0(j10, f10, dVar);
        W1();
    }

    @Override // i2.l0
    public final int q0(g2.a aVar) {
        a aVar2 = this.X;
        if (aVar2 == null) {
            return f3.i.b(this, aVar);
        }
        p.f0<g2.a> f0Var = aVar2.f13973t;
        int iD = f0Var.d(aVar);
        return iD >= 0 ? f0Var.f20617c[iD] : PKIFailureInfo.systemUnavail;
    }

    @Override // g2.p
    public final int z(int i10) {
        g2.f fVar = this.Y;
        if (fVar != null) {
            g2.d dVar = fVar.f11366b;
            g1 g1Var = this.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
            return dVar.f1(fVar, g1Var, i10);
        }
        b0 b0Var = this.V;
        g1 g1Var2 = this.f13877r;
        kotlin.jvm.internal.r.b(g1Var2);
        return b0Var.r(this, g1Var2, i10);
    }
}
