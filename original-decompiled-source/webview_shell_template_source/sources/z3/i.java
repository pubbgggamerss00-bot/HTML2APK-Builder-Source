package z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HideViewOnScrollBehavior f15441b;

    public i(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view) {
        this.f15441b = hideViewOnScrollBehavior;
        this.f15440a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.f15441b;
        hideViewOnScrollBehavior.f12021l = null;
        if (hideViewOnScrollBehavior.f12020k == 1) {
            View view = this.f15440a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
