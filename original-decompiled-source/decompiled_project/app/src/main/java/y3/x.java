package y3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f33901a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f33902b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f33903c;

    public x(View view, Runnable runnable) {
        this.f33901a = view;
        this.f33902b = view.getViewTreeObserver();
        this.f33903c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f33902b.isAlive();
        View view = this.f33901a;
        if (zIsAlive) {
            this.f33902b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f33903c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33902b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f33902b.isAlive();
        View view2 = this.f33901a;
        if (zIsAlive) {
            this.f33902b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
