package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2563d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2563d = kVar;
        this.f2560a = aVar;
        this.f2561b = viewPropertyAnimator;
        this.f2562c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2561b.setListener(null);
        View view = this.f2562c;
        view.setAlpha(1.0f);
        view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        k.a aVar = this.f2560a;
        v.a0 a0Var = aVar.f2577b;
        k kVar = this.f2563d;
        kVar.c(a0Var);
        kVar.f2575r.remove(aVar.f2577b);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        v.a0 a0Var = this.f2560a.f2577b;
        this.f2563d.getClass();
    }
}
