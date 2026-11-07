package vb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.focus.FocusRingDrawable;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusRingDrawable f30746a;

    public b(FocusRingDrawable focusRingDrawable) {
        this.f30746a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FocusRingDrawable focusRingDrawable = this.f30746a;
        focusRingDrawable.f6428k = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
