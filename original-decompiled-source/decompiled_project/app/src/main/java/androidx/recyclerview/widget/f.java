package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.a0 f2542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2545d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, v.a0 a0Var) {
        this.f2545d = kVar;
        this.f2542a = a0Var;
        this.f2543b = viewPropertyAnimator;
        this.f2544c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2543b.setListener(null);
        this.f2544c.setAlpha(1.0f);
        k kVar = this.f2545d;
        v.a0 a0Var = this.f2542a;
        kVar.c(a0Var);
        kVar.f2574q.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2545d.getClass();
    }
}
