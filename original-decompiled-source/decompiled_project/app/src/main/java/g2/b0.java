package g2;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public interface b0 extends d.b {
    default int F(i2.l0 l0Var, p pVar, int i10) {
        return m(new u(l0Var, l0Var.getLayoutDirection()), new q0(pVar, s0.f11438b, t0.f11451a), f3.c.b(0, i10, 7)).a();
    }

    default int G(i2.l0 l0Var, p pVar, int i10) {
        return m(new u(l0Var, l0Var.getLayoutDirection()), new q0(pVar, s0.f11437a, t0.f11451a), f3.c.b(0, i10, 7)).a();
    }

    m0 m(o0 o0Var, k0 k0Var, long j10);

    default int r(i2.l0 l0Var, p pVar, int i10) {
        return m(new u(l0Var, l0Var.getLayoutDirection()), new q0(pVar, s0.f11438b, t0.f11452b), f3.c.b(i10, 0, 13)).getHeight();
    }

    default int w(i2.l0 l0Var, p pVar, int i10) {
        return m(new u(l0Var, l0Var.getLayoutDirection()), new q0(pVar, s0.f11437a, t0.f11452b), f3.c.b(i10, 0, 13)).getHeight();
    }
}
