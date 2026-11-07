package t0;

/* loaded from: classes.dex */
public final class z0 {
    public static y0 a(long j10, x0.j jVar, int i10) {
        y0 y0Var;
        long jB = f2.b(j10, jVar);
        long j11 = q1.b1.f21654h;
        long jC = q1.b1.c(0.38f, jB);
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        y0 y0Var2 = e2Var.O;
        if (y0Var2 == null) {
            float f10 = v0.l.f30330a;
            v0.d dVar = v0.d.f30256w;
            y0 y0Var3 = new y0(f2.d(e2Var, dVar), f2.a(e2Var, f2.d(e2Var, dVar)), c2.n0.f(q1.b1.c(v0.l.f30334e, f2.d(e2Var, v0.l.f30332c)), f2.d(e2Var, dVar)), q1.b1.c(0.38f, f2.a(e2Var, f2.d(e2Var, dVar))));
            e2Var.O = y0Var3;
            y0Var = y0Var3;
            jB = jB;
        } else {
            y0Var = y0Var2;
        }
        return y0Var.a(j10, jB, j11, jC);
    }

    public static c1 b(float f10, int i10) {
        if ((i10 & 1) != 0) {
            f10 = v0.l.f30330a;
        }
        return new c1(f10, v0.l.f30338i, v0.l.f30336g, v0.l.f30337h, v0.l.f30335f, v0.l.f30333d);
    }
}
