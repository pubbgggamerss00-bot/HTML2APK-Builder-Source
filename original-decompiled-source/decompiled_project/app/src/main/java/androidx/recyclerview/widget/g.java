package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.a0 f2546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2549d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, v.a0 a0Var) {
        this.f2549d = kVar;
        this.f2546a = a0Var;
        this.f2547b = view;
        this.f2548c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2547b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2548c.setListener(null);
        k kVar = this.f2549d;
        v.a0 a0Var = this.f2546a;
        kVar.c(a0Var);
        kVar.f2572o.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2549d.getClass();
    }
}
