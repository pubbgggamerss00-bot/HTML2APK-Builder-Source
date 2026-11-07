package j2;

/* loaded from: classes.dex */
public final class i2 extends a {

    /* renamed from: j, reason: collision with root package name */
    public final x0.x1 f14758j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14759k;

    public i2(b.k kVar) {
        super(kVar);
        this.f14758j = bg.b.h(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // j2.a
    public final void a(int i10, x0.j jVar) {
        jVar.L(420213850);
        eh.p pVar = (eh.p) this.f14758j.getValue();
        if (pVar == null) {
            jVar.L(358356153);
        } else {
            jVar.L(150107208);
            pVar.invoke(jVar, 0);
        }
        jVar.B();
        jVar.B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return i2.class.getName();
    }

    @Override // j2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14759k;
    }

    public final void setContent(eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        this.f14759k = true;
        this.f14758j.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }
}
