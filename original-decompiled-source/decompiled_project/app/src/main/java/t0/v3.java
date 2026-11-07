package t0;

/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f27221a = v0.p.f30419a;

    public static ua a(long j10, long j11, long j12, long j13, x0.j jVar, int i10) {
        long j14 = q1.b1.f21654h;
        long j15 = (i10 & 4) != 0 ? j14 : j10;
        long j16 = (i10 & 512) != 0 ? j14 : j12;
        long j17 = (i10 & 1024) != 0 ? j14 : j13;
        ua uaVarB = b((e2) jVar.f(f2.f25858a));
        long j18 = j14 != 16 ? j14 : uaVarB.f27149a;
        long j19 = j14 != 16 ? j14 : uaVarB.f27150b;
        long j20 = j15 != 16 ? j15 : uaVarB.f27151c;
        if (j15 == 16) {
            j15 = uaVarB.f27152d;
        }
        long j21 = j15;
        long j22 = j14 != 16 ? j14 : uaVarB.f27153e;
        long j23 = j14 != 16 ? j14 : uaVarB.f27154f;
        long j24 = j14 != 16 ? j14 : uaVarB.f27155g;
        long j25 = j14 != 16 ? j14 : uaVarB.f27156h;
        long j26 = j11 != 16 ? j11 : uaVarB.f27157i;
        long j27 = j14 != 16 ? j14 : uaVarB.f27158j;
        if (j16 == 16) {
            j16 = uaVarB.f27159k;
        }
        long j28 = j16;
        if (j17 == 16) {
            j17 = uaVarB.f27160l;
        }
        long j29 = j17;
        if (j14 == 16) {
            j14 = uaVarB.f27161m;
        }
        return new ua(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j14);
    }

    public static ua b(e2 e2Var) {
        ua uaVar = e2Var.R;
        if (uaVar != null) {
            return uaVar;
        }
        long j10 = q1.b1.f21653g;
        long jD = f2.d(e2Var, v0.p.f30435q);
        v0.d dVar = v0.p.f30439u;
        long jD2 = f2.d(e2Var, dVar);
        long jD3 = f2.d(e2Var, dVar);
        long jC = q1.b1.c(0.38f, f2.d(e2Var, v0.d.f30244h));
        v0.d dVar2 = v0.p.f30436r;
        long jD4 = f2.d(e2Var, dVar2);
        float f10 = v0.p.f30437s;
        long jC2 = q1.b1.c(f10, jD4);
        long jC3 = q1.b1.c(f10, f2.d(e2Var, dVar2));
        long jD5 = f2.d(e2Var, v0.p.f30426h);
        long jC4 = q1.b1.c(v0.p.f30423e, f2.d(e2Var, v0.p.f30422d));
        long jD6 = f2.d(e2Var, v0.p.f30434p);
        v0.d dVar3 = v0.p.f30438t;
        ua uaVar2 = new ua(j10, jD, jD2, jD3, j10, jC, jC2, jC3, jD5, jC4, jD6, f2.d(e2Var, dVar3), f2.d(e2Var, dVar3));
        e2Var.R = uaVar2;
        return uaVar2;
    }
}
