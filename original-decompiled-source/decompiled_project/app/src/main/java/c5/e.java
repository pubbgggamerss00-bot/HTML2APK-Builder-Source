package c5;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import c5.f;
import c5.m0;

/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.a f4828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f4830c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.f4829b.endViewTransition(null);
            eVar.f4830c.a();
        }
    }

    public e(m0.a aVar, ViewGroup viewGroup, f.a aVar2) {
        this.f4828a = aVar;
        this.f4829b = viewGroup;
        this.f4830c = aVar2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f4829b.post(new a());
        if (b0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4828a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (b0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4828a + " has reached onAnimationStart.");
        }
    }
}
