package k0;

import androidx.compose.ui.d;
import i0.i2;
import j2.j2;
import j2.k5;
import j2.t3;
import j2.z4;
import k0.m1;
import m0.x2;
import ph.l2;
import x0.x1;

/* loaded from: classes.dex */
public final class j1 extends d.c implements t3, i2.h, i2.t, m1.a {

    /* renamed from: q, reason: collision with root package name */
    public m1 f15852q;

    /* renamed from: r, reason: collision with root package name */
    public i2 f15853r;

    /* renamed from: s, reason: collision with root package name */
    public x2 f15854s;

    /* renamed from: t, reason: collision with root package name */
    public final x1 f15855t = bg.b.h(null);

    public j1(m1 m1Var, i2 i2Var, x2 x2Var) {
        this.f15852q = m1Var;
        this.f15853r = i2Var;
        this.f15854s = x2Var;
    }

    @Override // k0.m1.a
    public final l2 J0(b bVar) {
        if (this.f1157p) {
            return ph.h.c(H1(), null, ph.k0.f21556d, new i1(this, bVar, null), 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        m1 m1Var = this.f15852q;
        if (m1Var.f15873a != null) {
            y.c.c("Expected textInputModifierNode to be null");
        }
        m1Var.f15873a = this;
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        this.f15852q.j(this);
    }

    @Override // k0.m1.a
    public final g2.v S() {
        return (g2.v) this.f15855t.getValue();
    }

    @Override // i2.t
    public final void g0(i2.g1 g1Var) {
        this.f15855t.setValue(g1Var);
    }

    @Override // k0.m1.a
    public final z4 getSoftwareKeyboardController() {
        return (z4) i2.i.a(this, j2.f14787p);
    }

    @Override // k0.m1.a
    public final k5 getViewConfiguration() {
        return (k5) i2.i.a(this, j2.f14790s);
    }

    @Override // k0.m1.a
    public final x2 p0() {
        return this.f15854s;
    }

    @Override // k0.m1.a
    public final i2 u1() {
        return this.f15853r;
    }
}
