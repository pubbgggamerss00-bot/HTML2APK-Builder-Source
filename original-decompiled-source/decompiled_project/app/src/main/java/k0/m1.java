package k0;

import i0.i2;
import j2.k5;
import j2.z4;
import m0.x2;
import ph.l2;

/* loaded from: classes.dex */
public abstract class m1 implements y2.x {

    /* renamed from: a, reason: collision with root package name */
    public a f15873a;

    public interface a {
        l2 J0(b bVar);

        g2.v S();

        z4 getSoftwareKeyboardController();

        k5 getViewConfiguration();

        x2 p0();

        i2 u1();
    }

    @Override // y2.x
    public final void b() {
        z4 softwareKeyboardController;
        a aVar = this.f15873a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    @Override // y2.x
    public final void f() {
        z4 softwareKeyboardController;
        a aVar = this.f15873a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    public abstract void i();

    public final void j(j1 j1Var) {
        if (this.f15873a != j1Var) {
            y.c.c("Expected textInputModifierNode to be " + j1Var + " but was " + this.f15873a);
        }
        this.f15873a = null;
    }
}
