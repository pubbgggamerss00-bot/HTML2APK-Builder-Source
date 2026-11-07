package t1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.w0;
import q1.x0;
import s1.a;
import t1.e;

/* loaded from: classes.dex */
public final class h0 extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final a f27687l = new a();

    /* renamed from: a, reason: collision with root package name */
    public final u1.a f27688a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f27689b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.a f27690c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27691d;

    /* renamed from: e, reason: collision with root package name */
    public Outline f27692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27693f;

    /* renamed from: g, reason: collision with root package name */
    public f3.d f27694g;

    /* renamed from: h, reason: collision with root package name */
    public f3.r f27695h;

    /* renamed from: j, reason: collision with root package name */
    public eh.l<? super s1.e, pg.f0> f27696j;

    /* renamed from: k, reason: collision with root package name */
    public d f27697k;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof h0) || (outline2 = ((h0) view).f27692e) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public h0(u1.a aVar, x0 x0Var, s1.a aVar2) {
        super(aVar.getContext());
        this.f27688a = aVar;
        this.f27689b = x0Var;
        this.f27690c = aVar2;
        setOutlineProvider(f27687l);
        this.f27693f = true;
        this.f27694g = s1.d.f24184a;
        this.f27695h = f3.r.f8828a;
        e.f27658a.getClass();
        this.f27696j = e.a.f27660b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x0 x0Var = this.f27689b;
        q1.b0 b0Var = x0Var.f21746a;
        Canvas canvas2 = b0Var.f21645a;
        b0Var.f21645a = canvas;
        f3.d dVar = this.f27694g;
        f3.r rVar = this.f27695h;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32);
        d dVar2 = this.f27697k;
        eh.l<? super s1.e, pg.f0> lVar = this.f27696j;
        s1.a aVar = this.f27690c;
        f3.d dVarB = aVar.f24173b.b();
        a.b bVar = aVar.f24173b;
        f3.r rVarC = bVar.c();
        w0 w0VarA = bVar.a();
        long jD = bVar.d();
        d dVar3 = bVar.f24181b;
        bVar.f(dVar);
        bVar.g(rVar);
        bVar.e(b0Var);
        bVar.h(jFloatToRawIntBits);
        bVar.f24181b = dVar2;
        b0Var.d();
        try {
            lVar.invoke(aVar);
            b0Var.o();
            bVar.f(dVarB);
            bVar.g(rVarC);
            bVar.e(w0VarA);
            bVar.h(jD);
            bVar.f24181b = dVar3;
            x0Var.f21746a.f21645a = canvas2;
            this.f27691d = false;
        } catch (Throwable th2) {
            b0Var.o();
            bVar.f(dVarB);
            bVar.g(rVarC);
            bVar.e(w0VarA);
            bVar.h(jD);
            bVar.f24181b = dVar3;
            throw th2;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f27693f;
    }

    public final x0 getCanvasHolder() {
        return this.f27689b;
    }

    public final View getOwnerView() {
        return this.f27688a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f27693f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f27691d) {
            return;
        }
        this.f27691d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f27693f != z10) {
            this.f27693f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f27691d = z10;
    }
}
