package j2;

import android.view.View;

/* loaded from: classes.dex */
public final class w5 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.k2 f14965b;

    public w5(View view, x0.k2 k2Var) {
        this.f14964a = view;
        this.f14965b = k2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14964a.removeOnAttachStateChangeListener(this);
        this.f14965b.v();
    }
}
