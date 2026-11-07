package z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f15437b;

    public c(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view) {
        this.f15437b = hideBottomViewOnScrollBehavior;
        this.f15436a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.f15437b;
        hideBottomViewOnScrollBehavior.f12008k = null;
        if (hideBottomViewOnScrollBehavior.f12007j == 1) {
            View view = this.f15436a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
