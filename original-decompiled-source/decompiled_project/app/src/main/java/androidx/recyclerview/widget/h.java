package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.a0 f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f2555f;

    public h(k kVar, v.a0 a0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2555f = kVar;
        this.f2550a = a0Var;
        this.f2551b = i10;
        this.f2552c = view;
        this.f2553d = i11;
        this.f2554e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f2551b;
        View view = this.f2552c;
        if (i10 != 0) {
            view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if (this.f2553d != 0) {
            view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2554e.setListener(null);
        k kVar = this.f2555f;
        v.a0 a0Var = this.f2550a;
        kVar.c(a0Var);
        kVar.f2573p.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2555f.getClass();
    }
}
