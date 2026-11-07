package t0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class n3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f26493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26494c;

    public n3(View view, eh.a<pg.f0> aVar) {
        this.f26493b = view;
        this.f26494c = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f26492a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f26492a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f26494c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f26492a) {
            return;
        }
        View view2 = this.f26493b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f26492a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f26492a) {
            this.f26493b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f26492a = false;
        }
    }
}
