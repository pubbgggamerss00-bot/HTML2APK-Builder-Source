package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2559d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2559d = kVar;
        this.f2556a = aVar;
        this.f2557b = viewPropertyAnimator;
        this.f2558c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2557b.setListener(null);
        View view = this.f2558c;
        view.setAlpha(1.0f);
        view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        k.a aVar = this.f2556a;
        v.a0 a0Var = aVar.f2576a;
        k kVar = this.f2559d;
        kVar.c(a0Var);
        kVar.f2575r.remove(aVar.f2576a);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        v.a0 a0Var = this.f2556a.f2576a;
        this.f2559d.getClass();
    }
}
