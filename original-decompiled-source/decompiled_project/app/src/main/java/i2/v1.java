package i2;

import g2.g1;
import g2.h1;
import i2.c;
import i2.g1;
import j2.a5;
import j2.k5;
import j2.p5;
import j2.z4;
import x2.f;

/* loaded from: classes.dex */
public interface v1 extends c2.p0 {

    public interface a {
        void b();
    }

    static /* synthetic */ u1 n(v1 v1Var, eh.p pVar, g1.h hVar, t1.d dVar, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return v1Var.p(pVar, hVar, dVar, z10);
    }

    void B(e0 e0Var, boolean z10);

    void C(e0 e0Var);

    void D();

    void a(boolean z10);

    void b(e0 e0Var);

    default void c(int i10, e0 e0Var) {
    }

    void d(eh.a<pg.f0> aVar);

    void e(e0 e0Var);

    long f(long j10);

    long g(long j10);

    j2.h getAccessibilityManager();

    k1.h getAutofill();

    k1.j getAutofillManager();

    k1.l getAutofillTree();

    j2.f2 getClipboard();

    j2.g2 getClipboardManager();

    tg.h getCoroutineContext();

    f3.d getDensity();

    m1.d getDragAndDropManager();

    o1.q getFocusOwner();

    f.a getFontFamilyResolver();

    x2.e getFontLoader();

    q1.k1 getGraphicsContext();

    y1.a getHapticFeedBack();

    z1.b getInputModeManager();

    f3.r getLayoutDirection();

    h2.e getModifierLocalManager();

    default g1.a getPlacementScope() {
        h1.a aVar = g2.h1.f11391a;
        return new g2.c1(this);
    }

    c2.z getPointerIconService();

    r2.c getRectManager();

    e0 getRoot();

    q2.v getSemanticsOwner();

    h0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    f2 getSnapshotObserver();

    z4 getSoftwareKeyboardController();

    y2.e0 getTextInputService();

    a5 getTextToolbar();

    k5 getViewConfiguration();

    p5 getWindowInfo();

    void i(e0 e0Var);

    void j(eh.p pVar, vg.c cVar);

    void k(e0 e0Var);

    void m(e0 e0Var, boolean z10, boolean z11);

    void o(e0 e0Var);

    u1 p(eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar, eh.a<pg.f0> aVar, t1.d dVar, boolean z10);

    void q(e0 e0Var);

    void r(e0 e0Var, boolean z10, boolean z11, boolean z12);

    void setShowLayoutBounds(boolean z10);

    void t(e0 e0Var, long j10);

    void u();

    void v();

    void w(c.b bVar);

    default void x(int i10, e0 e0Var) {
    }
}
