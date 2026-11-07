package s8;

import java.util.Iterator;
import p5.k0;
import p5.o0;
import t0.f2;
import t0.j9;
import t0.t8;
import x0.j;
import x0.s3;

/* loaded from: classes.dex */
public final class c0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.k0 f24612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24613b;

    public c0(p5.k0 k0Var, p5.s0 s0Var) {
        this.f24612a = k0Var;
        this.f24613b = s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        Iterator it;
        long j10;
        long j11;
        long j12;
        z.r NavigationRail = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(NavigationRail, "$this$NavigationRail");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            for (Iterator it2 = b2.f24610a.iterator(); it2.hasNext(); it2 = it) {
                pg.t tVar = (pg.t) it2.next();
                final e2 e2Var = (e2) tVar.f21479a;
                w1.d dVar = (w1.d) tVar.f21480b;
                w1.d dVar2 = (w1.d) tVar.f21481c;
                boolean z10 = false;
                final p5.k0 k0Var = this.f24612a;
                if (k0Var != null) {
                    int i10 = p5.k0.f21233e;
                    Iterator it3 = k0.a.b(k0Var).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.r.a(((p5.k0) it3.next()).f21235b.f24512e, e2Var.f24627a)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                s3 s3Var = f2.f25858a;
                long j13 = ((t0.e2) jVar2.f(s3Var)).f25751a;
                long j14 = ((t0.e2) jVar2.f(s3Var)).f25751a;
                long j15 = ((t0.e2) jVar2.f(s3Var)).f25773s;
                long j16 = ((t0.e2) jVar2.f(s3Var)).f25773s;
                long jC = q1.b1.c(0.16f, ((t0.e2) jVar2.f(s3Var)).f25751a);
                long jC2 = q1.b1.c(0.38f, j15);
                long jC3 = q1.b1.c(0.38f, j16);
                t0.e2 e2Var2 = (t0.e2) jVar2.f(s3Var);
                t8 t8Var = e2Var2.Z;
                if (t8Var == null) {
                    float f10 = v0.v.f30487a;
                    long jD = f2.d(e2Var2, v0.d.f30243g);
                    long jD2 = f2.d(e2Var2, v0.d.f30244h);
                    long jD3 = f2.d(e2Var2, v0.d.f30252r);
                    v0.d dVar3 = v0.v.f30491e;
                    long jD4 = f2.d(e2Var2, dVar3);
                    it = it2;
                    v0.d dVar4 = v0.v.f30492f;
                    j10 = j16;
                    t8Var = new t8(jD, jD2, jD3, jD4, f2.d(e2Var2, dVar4), q1.b1.c(0.38f, f2.d(e2Var2, dVar3)), q1.b1.c(0.38f, f2.d(e2Var2, dVar4)));
                    e2Var2.Z = t8Var;
                } else {
                    it = it2;
                    j10 = j16;
                }
                if (j13 != 16) {
                    j12 = j13;
                    j11 = 16;
                } else {
                    j11 = 16;
                    j12 = t8Var.f27058a;
                }
                long j17 = j14 != j11 ? j14 : t8Var.f27059b;
                if (jC == j11) {
                    jC = t8Var.f27060c;
                }
                long j18 = jC;
                if (j15 == j11) {
                    j15 = t8Var.f27061d;
                }
                t8 t8Var2 = new t8(j12, j17, j18, j15, j10 != j11 ? j10 : t8Var.f27062e, jC2 != j11 ? jC2 : t8Var.f27063f, jC3 != j11 ? jC3 : t8Var.f27064g);
                jVar2.L(1957049971);
                boolean zL = jVar2.l(k0Var) | jVar2.K(e2Var);
                final p5.s0 s0Var = this.f24613b;
                boolean zL2 = zL | jVar2.l(s0Var);
                Object objG = jVar2.g();
                if (zL2 || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: s8.y
                        @Override // eh.a
                        public final Object invoke() {
                            p5.k0 k0Var2 = k0Var;
                            String str = k0Var2 != null ? k0Var2.f21235b.f24512e : null;
                            e2 e2Var3 = e2Var;
                            if (!kotlin.jvm.internal.r.a(str, e2Var3.f24627a)) {
                                String str2 = e2Var3.f24627a;
                                final p5.s0 s0Var2 = s0Var;
                                s0Var2.b(new eh.l() { // from class: s8.z
                                    @Override // eh.l
                                    public final Object invoke(Object obj) {
                                        p5.w0 navigate = (p5.w0) obj;
                                        kotlin.jvm.internal.r.e(navigate, "$this$navigate");
                                        int i11 = p5.o0.f21252g;
                                        navigate.f21299d = o0.a.a(s0Var2.f21304b.i()).f21235b.f24511d;
                                        navigate.f21301f = false;
                                        p5.e1 e1Var = new p5.e1();
                                        e1Var.f21208b = true;
                                        pg.f0 f0Var = pg.f0.f21461a;
                                        navigate.f21301f = e1Var.f21207a;
                                        navigate.f21302g = e1Var.f21208b;
                                        navigate.f21297b = true;
                                        navigate.f21298c = true;
                                        return pg.f0.f21461a;
                                    }
                                }, str2);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                j9.b(z10, (eh.a) objG, f1.c.b(331819648, new a0(z10, dVar, dVar2, e2Var), jVar2), null, false, f1.c.b(378004445, new b0(e2Var), jVar2), false, t8Var2, jVar2, 196992);
            }
        }
        return pg.f0.f21461a;
    }
}
