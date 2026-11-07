package i2;

/* loaded from: classes.dex */
public interface b0 extends j {
    default int F(l0 l0Var, g2.p pVar, int i10) {
        return m(new g2.u(l0Var, l0Var.getLayoutDirection()), new k1(pVar, m1.f13954b, n1.f13960a), f3.c.b(0, i10, 7)).a();
    }

    default int G(l0 l0Var, g2.p pVar, int i10) {
        return m(new g2.u(l0Var, l0Var.getLayoutDirection()), new k1(pVar, m1.f13953a, n1.f13960a), f3.c.b(0, i10, 7)).a();
    }

    g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10);

    default int r(l0 l0Var, g2.p pVar, int i10) {
        return m(new g2.u(l0Var, l0Var.getLayoutDirection()), new k1(pVar, m1.f13954b, n1.f13961b), f3.c.b(i10, 0, 13)).getHeight();
    }

    default int w(l0 l0Var, g2.p pVar, int i10) {
        return m(new g2.u(l0Var, l0Var.getLayoutDirection()), new k1(pVar, m1.f13953a, n1.f13961b), f3.c.b(i10, 0, 13)).getHeight();
    }
}
