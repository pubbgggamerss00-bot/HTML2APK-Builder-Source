package a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25b;

    public /* synthetic */ c(int i6, Object obj) {
        this.f24a = i6;
        this.f25b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f24a) {
            case 0:
                BottomAppBar bottomAppBar = (BottomAppBar) this.f25b;
                int i6 = BottomAppBar.f12036x0;
                bottomAppBar.f12039o0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f24a) {
            case 0:
                break;
            default:
                ((y4.c) this.f25b).f15271b.i(true);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
