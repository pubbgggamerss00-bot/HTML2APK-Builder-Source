package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f1625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1628d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1628d = kVar;
        this.f1625a = aVar;
        this.f1626b = viewPropertyAnimator;
        this.f1627c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1626b.setListener(null);
        View view = this.f1627c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1625a;
        RecyclerView.b0 b0Var = aVar.f1643a;
        k kVar = this.f1628d;
        kVar.c(b0Var);
        kVar.f1642r.remove(aVar.f1643a);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f1625a.f1643a;
        this.f1628d.getClass();
    }
}
