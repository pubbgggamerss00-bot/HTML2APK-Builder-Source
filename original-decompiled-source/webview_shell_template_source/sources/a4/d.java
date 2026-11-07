package a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f27b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i6, boolean z6) {
        this.f30e = bottomAppBar;
        this.f27b = actionMenuView;
        this.f28c = i6;
        this.f29d = z6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f26a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f26a) {
            return;
        }
        this.f30e.D(this.f27b, this.f28c, this.f29d, false);
    }
}
