package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f1611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1614d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.b0 b0Var) {
        this.f1614d = kVar;
        this.f1611a = b0Var;
        this.f1612b = viewPropertyAnimator;
        this.f1613c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1612b.setListener(null);
        this.f1613c.setAlpha(1.0f);
        k kVar = this.f1614d;
        RecyclerView.b0 b0Var = this.f1611a;
        kVar.c(b0Var);
        kVar.f1641q.remove(b0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1614d.getClass();
    }
}
