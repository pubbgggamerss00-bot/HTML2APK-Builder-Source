package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f1619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1624f;

    public h(k kVar, RecyclerView.b0 b0Var, int i6, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1624f = kVar;
        this.f1619a = b0Var;
        this.f1620b = i6;
        this.f1621c = view;
        this.f1622d = i7;
        this.f1623e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i6 = this.f1620b;
        View view = this.f1621c;
        if (i6 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1622d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1623e.setListener(null);
        k kVar = this.f1624f;
        RecyclerView.b0 b0Var = this.f1619a;
        kVar.c(b0Var);
        kVar.f1640p.remove(b0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1624f.getClass();
    }
}
