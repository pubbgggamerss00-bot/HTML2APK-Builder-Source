package s8;

import f9.d9;
import f9.i9;
import java.util.Iterator;
import p5.k0;
import t0.a8;
import t0.f2;
import t0.s8;
import x0.j;
import x0.s3;

/* loaded from: classes.dex */
public final class e implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.k0 f24623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24624b;

    public e(p5.k0 k0Var, p5.s0 s0Var) {
        this.f24623a = k0Var;
        this.f24624b = s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 n1Var2;
        long j10;
        int i10;
        z.n1 NavigationBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(NavigationBar, "$this$NavigationBar");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(NavigationBar) ? 4 : 2;
        }
        int i11 = iIntValue;
        if ((i11 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            Iterator<T> it = b2.f24610a.iterator();
            while (it.hasNext()) {
                pg.t tVar = (pg.t) it.next();
                e2 e2Var = (e2) tVar.f21479a;
                w1.d dVar = (w1.d) tVar.f21480b;
                w1.d dVar2 = (w1.d) tVar.f21481c;
                boolean z10 = false;
                p5.k0 k0Var = this.f24623a;
                if (k0Var != null) {
                    int i12 = p5.k0.f21233e;
                    Iterator it2 = k0.a.b(k0Var).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.r.a(((p5.k0) it2.next()).f21235b.f24512e, e2Var.f24627a)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                s3 s3Var = f2.f25858a;
                long j11 = ((t0.e2) jVar2.f(s3Var)).f25751a;
                boolean z11 = z10;
                long j12 = ((t0.e2) jVar2.f(s3Var)).f25751a;
                long j13 = ((t0.e2) jVar2.f(s3Var)).f25773s;
                long j14 = ((t0.e2) jVar2.f(s3Var)).f25773s;
                long jC = q1.b1.c(0.16f, ((t0.e2) jVar2.f(s3Var)).f25751a);
                long j15 = q1.b1.f21654h;
                t0.e2 e2Var2 = (t0.e2) jVar2.f(s3Var);
                a8 a8Var = e2Var2.Y;
                if (a8Var == null) {
                    float f10 = v0.u.f30480a;
                    long jD = f2.d(e2Var2, v0.d.f30243g);
                    long jD2 = f2.d(e2Var2, v0.d.f30244h);
                    long jD3 = f2.d(e2Var2, v0.d.f30252r);
                    v0.d dVar3 = v0.u.f30484e;
                    long jD4 = f2.d(e2Var2, dVar3);
                    n1Var2 = NavigationBar;
                    v0.d dVar4 = v0.u.f30485f;
                    j10 = jC;
                    a8Var = new a8(jD, jD2, jD3, jD4, f2.d(e2Var2, dVar4), q1.b1.c(0.38f, f2.d(e2Var2, dVar3)), q1.b1.c(0.38f, f2.d(e2Var2, dVar4)));
                    e2Var2.Y = a8Var;
                } else {
                    n1Var2 = NavigationBar;
                    j10 = jC;
                }
                if (j11 == 16) {
                    j11 = a8Var.f25463a;
                }
                a8 a8Var2 = new a8(j11, j12 != 16 ? j12 : a8Var.f25464b, j10 != 16 ? j10 : a8Var.f25465c, j13 != 16 ? j13 : a8Var.f25466d, j14 != 16 ? j14 : a8Var.f25467e, j15 != 16 ? j15 : a8Var.f25468f, j15 != 16 ? j15 : a8Var.f25469g);
                jVar2.L(1956932307);
                boolean zL = jVar2.l(k0Var) | jVar2.K(e2Var);
                p5.s0 s0Var = this.f24624b;
                boolean zL2 = zL | jVar2.l(s0Var);
                Object objG = jVar2.g();
                if (zL2 || objG == j.a.f31715a) {
                    i10 = 1;
                    objG = new d9(k0Var, e2Var, s0Var, 1);
                    jVar2.C(objG);
                } else {
                    i10 = 1;
                }
                jVar2.B();
                NavigationBar = n1Var2;
                s8.b(NavigationBar, z11, (eh.a) objG, f1.c.b(1296411795, new d(z11, dVar, dVar2, e2Var), jVar2), null, false, f1.c.b(607855472, new i9(e2Var, i10), jVar2), false, a8Var2, jVar2, (i11 & 14) | 1575936);
            }
        }
        return pg.f0.f21461a;
    }
}
