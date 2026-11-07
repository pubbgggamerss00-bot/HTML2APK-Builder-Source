package t0;

/* loaded from: classes.dex */
public final class mf {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26477a = v0.l0.f30339a;

    static {
        int i10 = v0.k0.f30329a;
        int i11 = v0.j0.f30319a;
    }

    public static lf a(long j10, long j11, long j12, x0.j jVar, int i10) {
        long j13 = q1.b1.f21654h;
        long j14 = (i10 & 4) != 0 ? j13 : j11;
        long j15 = (i10 & 8) != 0 ? j13 : j12;
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        lf lfVar = e2Var.S;
        if (lfVar == null) {
            float f10 = v0.l0.f30339a;
            lf lfVar2 = new lf(f2.d(e2Var, v0.d.f30253s), f2.d(e2Var, v0.l0.f30343e), f2.d(e2Var, v0.l0.f30342d), f2.d(e2Var, v0.l0.f30340b), f2.d(e2Var, v0.l0.f30344f));
            e2Var.S = lfVar2;
            lfVar = lfVar2;
        }
        long j16 = j10 != 16 ? j10 : lfVar.f26394a;
        long j17 = j13 != 16 ? j13 : lfVar.f26395b;
        if (j14 == 16) {
            j14 = lfVar.f26396c;
        }
        long j18 = j14;
        if (j15 == 16) {
            j15 = lfVar.f26397d;
        }
        long j19 = j15;
        if (j13 == 16) {
            j13 = lfVar.f26398e;
        }
        return new lf(j16, j17, j18, j19, j13);
    }
}
