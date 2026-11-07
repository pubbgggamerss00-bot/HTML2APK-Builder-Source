package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f1615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1618d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.b0 b0Var) {
        this.f1618d = kVar;
        this.f1615a = b0Var;
        this.f1616b = view;
        this.f1617c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1616b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1617c.setListener(null);
        k kVar = this.f1618d;
        RecyclerView.b0 b0Var = this.f1615a;
        kVar.c(b0Var);
        kVar.f1639o.remove(b0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1618d.getClass();
    }
}
