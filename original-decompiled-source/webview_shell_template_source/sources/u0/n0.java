package u0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f14521a;

    public n0(View view) {
        this.f14521a = new WeakReference<>(view);
    }

    public final void a(float f6) {
        View view = this.f14521a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = this.f14521a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = this.f14521a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(o0 o0Var) {
        View view = this.f14521a.get();
        if (view != null) {
            if (o0Var != null) {
                view.animate().setListener(new m0(o0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f6) {
        View view = this.f14521a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
