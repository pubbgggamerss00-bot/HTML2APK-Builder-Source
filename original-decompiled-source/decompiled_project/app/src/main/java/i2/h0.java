package i2;

import androidx.compose.ui.d;
import s1.a;

/* loaded from: classes.dex */
public final class h0 implements s1.e, s1.c {

    /* renamed from: a, reason: collision with root package name */
    public final s1.a f13901a = new s1.a();

    /* renamed from: b, reason: collision with root package name */
    public r f13902b;

    @Override // s1.e
    public final void A1(long j10, long j11, long j12, float f10, s1.f fVar, q1.c1 c1Var, int i10) {
        this.f13901a.A1(j10, j11, j12, f10, fVar, c1Var, i10);
    }

    @Override // s1.e
    public final void B1(long j10, long j11, long j12, long j13, s1.f fVar, float f10) {
        this.f13901a.B1(j10, j11, j12, j13, fVar, f10);
    }

    @Override // s1.e
    public final void D1(q1.n1 n1Var, s1.f fVar, q1.p0 p0Var) {
        this.f13901a.D1(n1Var, fVar, p0Var);
    }

    @Override // f3.d
    public final long E(long j10) {
        return this.f13901a.E(j10);
    }

    @Override // f3.d
    public final float G0() {
        return this.f13901a.G0();
    }

    @Override // s1.e
    public final void H0(q1.u1 u1Var, q1.u0 u0Var, float f10, s1.f fVar, int i10) {
        this.f13901a.H0(u1Var, u0Var, f10, fVar, i10);
    }

    @Override // f3.d
    public final float N0(float f10) {
        return this.f13901a.getDensity() * f10;
    }

    @Override // s1.e
    public final a.b Q0() {
        return this.f13901a.f24173b;
    }

    @Override // s1.e
    public final void S0(long j10, float f10, float f11, long j11, long j12, s1.f fVar) {
        this.f13901a.S0(j10, f10, f11, j11, j12, fVar);
    }

    @Override // f3.d
    public final int T0(long j10) {
        return this.f13901a.T0(j10);
    }

    @Override // f3.d
    public final int b1(float f10) {
        return this.f13901a.b1(f10);
    }

    @Override // s1.e
    public final void c0(q1.u0 u0Var, long j10, long j11, float f10, s1.f fVar) {
        this.f13901a.c0(u0Var, j10, j11, f10, fVar);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f13901a.getDensity();
    }

    @Override // s1.e
    public final f3.r getLayoutDirection() {
        return this.f13901a.f24172a.f24177b;
    }

    @Override // s1.e
    public final void h0(q1.u0 u0Var, long j10, long j11, long j12, float f10, s1.f fVar) {
        this.f13901a.h0(u0Var, j10, j11, j12, f10, fVar);
    }

    @Override // s1.e
    public final long h1() {
        return this.f13901a.h1();
    }

    @Override // s1.e
    public final long i() {
        return this.f13901a.i();
    }

    @Override // s1.e
    public final void j1(q1.i2 i2Var, long j10, long j11, float f10, float f11) {
        this.f13901a.j1(i2Var, j10, j11, f10, f11);
    }

    @Override // s1.e
    public final void k0(long j10, long j11, long j12, float f10, int i10) {
        this.f13901a.k0(j10, j11, j12, f10, i10);
    }

    public final void m(q1.w0 w0Var, long j10, g1 g1Var, r rVar, t1.d dVar) {
        r rVar2 = this.f13902b;
        this.f13902b = rVar;
        f3.r rVar3 = g1Var.f13874n.C;
        s1.a aVar = this.f13901a;
        f3.d dVarB = aVar.f24173b.b();
        a.b bVar = aVar.f24173b;
        f3.r rVarC = bVar.c();
        q1.w0 w0VarA = bVar.a();
        long jD = bVar.d();
        t1.d dVar2 = bVar.f24181b;
        bVar.f(g1Var);
        bVar.g(rVar3);
        bVar.e(w0Var);
        bVar.h(j10);
        bVar.f24181b = dVar;
        w0Var.d();
        try {
            rVar.z(this);
            w0Var.o();
            bVar.f(dVarB);
            bVar.g(rVarC);
            bVar.e(w0VarA);
            bVar.h(jD);
            bVar.f24181b = dVar2;
            this.f13902b = rVar2;
        } catch (Throwable th2) {
            w0Var.o();
            bVar.f(dVarB);
            bVar.g(rVarC);
            bVar.e(w0VarA);
            bVar.h(jD);
            bVar.f24181b = dVar2;
            throw th2;
        }
    }

    @Override // s1.e
    public final void n0(q1.u1 u1Var, long j10, s1.f fVar, int i10) {
        this.f13901a.n0(u1Var, j10, fVar, i10);
    }

    @Override // f3.d
    public final long o(float f10) {
        return this.f13901a.o(f10);
    }

    @Override // s1.e
    public final void o1(long j10, float f10, long j11, s1.f fVar, int i10) {
        this.f13901a.o1(j10, f10, j11, fVar, i10);
    }

    @Override // f3.d
    public final long p(long j10) {
        return this.f13901a.p(j10);
    }

    @Override // f3.d
    public final float q(long j10) {
        return this.f13901a.q(j10);
    }

    @Override // f3.d
    public final float r1(long j10) {
        return this.f13901a.r1(j10);
    }

    @Override // f3.d
    public final long t(float f10) {
        return this.f13901a.t(f10);
    }

    @Override // f3.d
    public final float u(int i10) {
        return this.f13901a.u(i10);
    }

    @Override // f3.d
    public final float v(float f10) {
        return f10 / this.f13901a.getDensity();
    }

    @Override // s1.e
    public final void x0(q1.w1 w1Var, float f10, long j10, s1.f fVar) {
        this.f13901a.x0(w1Var, f10, j10, fVar);
    }

    @Override // s1.e
    public final void y0(q1.n1 n1Var, long j10, long j11, long j12, long j13, float f10, s1.f fVar, q1.c1 c1Var, int i10, int i11) {
        this.f13901a.y0(n1Var, j10, j11, j12, j13, f10, fVar, c1Var, i10, i11);
    }

    @Override // s1.c
    public final void z1() {
        s1.a aVar = this.f13901a;
        q1.w0 w0VarA = aVar.f24173b.a();
        r rVar = this.f13902b;
        if (rVar == null) {
            throw k1.a.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        d.c cVarB = rVar.B().f1149f;
        if (cVarB == null || (cVarB.f1147d & 4) == 0) {
            cVarB = null;
        } else {
            while (cVarB != null) {
                int i10 = cVarB.f1146c;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    cVarB = cVarB.f1149f;
                }
            }
            cVarB = null;
        }
        if (cVarB == null) {
            g1 g1VarD = k.d(rVar, 4);
            if (g1VarD.l1() == rVar.B()) {
                g1VarD = g1VarD.f13877r;
                kotlin.jvm.internal.r.b(g1VarD);
            }
            g1VarD.M1(w0VarA, aVar.f24173b.f24181b);
            return;
        }
        z0.b bVar = null;
        while (cVarB != null) {
            if (cVarB instanceof r) {
                r rVar2 = (r) cVarB;
                t1.d dVar = aVar.f24173b.f24181b;
                g1 g1VarD2 = k.d(rVar2, 4);
                long jE = f3.q.e(g1VarD2.f11384c);
                e0 e0Var = g1VarD2.f13874n;
                e0Var.getClass();
                i0.a(e0Var).getSharedDrawScope().m(w0VarA, jE, g1VarD2, rVar2, dVar);
            } else if ((cVarB.f1146c & 4) != 0 && (cVarB instanceof m)) {
                int i11 = 0;
                for (d.c cVar = ((m) cVarB).f13947r; cVar != null; cVar = cVar.f1149f) {
                    if ((cVar.f1146c & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            cVarB = cVar;
                        } else {
                            if (bVar == null) {
                                bVar = new z0.b(new d.c[16]);
                            }
                            if (cVarB != null) {
                                bVar.b(cVarB);
                                cVarB = null;
                            }
                            bVar.b(cVar);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            cVarB = k.b(bVar);
        }
    }
}
