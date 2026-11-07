package t0;

import android.view.View;

/* loaded from: classes.dex */
public final class m3 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n3 f26423a;

    public m3(n3 n3Var) {
        this.f26423a = n3Var;
    }

    @Override // x0.k0
    public final void a() {
        n3 n3Var = this.f26423a;
        View view = n3Var.f26493b;
        if (n3Var.f26492a) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(n3Var);
            n3Var.f26492a = false;
        }
        view.removeOnAttachStateChangeListener(n3Var);
    }
}
