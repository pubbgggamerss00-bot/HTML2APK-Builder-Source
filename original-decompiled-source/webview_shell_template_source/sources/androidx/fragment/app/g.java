package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.i;
import androidx.fragment.app.j0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.d f1105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i.a f1108d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f1106b.endViewTransition(gVar.f1107c);
            gVar.f1108d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, i.a aVar, j0.d dVar) {
        this.f1105a = dVar;
        this.f1106b = viewGroup;
        this.f1107c = view;
        this.f1108d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1106b.post(new a());
        if (y.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1105a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (y.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1105a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
