package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f1629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1632d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1632d = kVar;
        this.f1629a = aVar;
        this.f1630b = viewPropertyAnimator;
        this.f1631c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1630b.setListener(null);
        View view = this.f1631c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1629a;
        RecyclerView.b0 b0Var = aVar.f1644b;
        k kVar = this.f1632d;
        kVar.c(b0Var);
        kVar.f1642r.remove(aVar.f1644b);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f1629a.f1644b;
        this.f1632d.getClass();
    }
}
