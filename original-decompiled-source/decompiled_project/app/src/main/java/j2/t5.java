package j2;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t5 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph.l2 f14907a;

    public t5(ph.l2 l2Var) {
        this.f14907a = l2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.f14907a.cancel((CancellationException) null);
    }
}
