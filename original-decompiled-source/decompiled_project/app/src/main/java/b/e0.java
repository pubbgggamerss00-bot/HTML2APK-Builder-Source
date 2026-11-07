package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class e0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f3236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f3238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f3239d;

    public e0(x xVar, y yVar, z zVar, a0 a0Var) {
        this.f3236a = xVar;
        this.f3237b = yVar;
        this.f3238c = zVar;
        this.f3239d = a0Var;
    }

    public final void onBackCancelled() {
        this.f3239d.invoke();
    }

    public final void onBackInvoked() {
        this.f3238c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
        this.f3237b.invoke(new c(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
        this.f3236a.invoke(new c(backEvent));
    }
}
