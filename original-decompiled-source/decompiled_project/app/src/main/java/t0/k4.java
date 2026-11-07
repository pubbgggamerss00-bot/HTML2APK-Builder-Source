package t0;

/* loaded from: classes.dex */
public final class k4 {
    public static j4 a(long j10, long j11, x0.j jVar, int i10) {
        j4 j4Var;
        long j12 = q1.b1.f21654h;
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        j4 j4Var2 = e2Var.V;
        if (j4Var2 == null) {
            float f10 = v0.m.f30345a;
            v0.d dVar = v0.d.f30248m;
            long jD = f2.d(e2Var, dVar);
            long jA = f2.a(e2Var, f2.d(e2Var, dVar));
            v0.d dVar2 = v0.d.f30244h;
            j4 j4Var3 = new j4(jD, jA, q1.b1.c(0.12f, f2.d(e2Var, dVar2)), q1.b1.c(0.38f, f2.d(e2Var, dVar2)));
            e2Var.V = j4Var3;
            j4Var = j4Var3;
        } else {
            j4Var = j4Var2;
        }
        return j4Var.a(j10, j11, j12, j12);
    }

    public static j4 b(long j10, long j11, x0.j jVar, int i10) {
        j4 j4Var;
        long j12 = q1.b1.f21654h;
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        j4 j4Var2 = e2Var.W;
        if (j4Var2 == null) {
            float f10 = v0.o.f30408a;
            v0.d dVar = v0.d.f30252r;
            long jD = f2.d(e2Var, dVar);
            long jA = f2.a(e2Var, f2.d(e2Var, dVar));
            v0.d dVar2 = v0.d.f30244h;
            j4 j4Var3 = new j4(jD, jA, q1.b1.c(0.12f, f2.d(e2Var, dVar2)), q1.b1.c(0.38f, f2.d(e2Var, dVar2)));
            e2Var.W = j4Var3;
            j4Var = j4Var3;
        } else {
            j4Var = j4Var2;
        }
        return j4Var.a(j10, j11, j12, j12);
    }

    public static j4 c(x0.j jVar) {
        jVar.L(-1519621781);
        long j10 = ((q1.b1) jVar.f(p2.f26666a)).f21656a;
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        j4 j4Var = e2Var.U;
        if (j4Var == null) {
            long j11 = q1.b1.f21653g;
            j4Var = new j4(j11, j10, j11, q1.b1.c(0.38f, j10));
            e2Var.U = j4Var;
        }
        if (q1.b1.d(j4Var.f26134b, j10)) {
            jVar.B();
            return j4Var;
        }
        j4 j4VarA = j4Var.a(j4Var.f26133a, j10, j4Var.f26135c, q1.b1.c(0.38f, j10));
        jVar.B();
        return j4VarA;
    }
}
