package pb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f21415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f21416c;

    public c(BottomAppBar bottomAppBar, androidx.appcompat.widget.b bVar) {
        this.f21416c = bottomAppBar;
        this.f21415b = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f21414a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f21414a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f21416c;
        this.f21415b.setTranslationX(bottomAppBar.f(r1, 0));
    }
}
