package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f76a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f77b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f78c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f79d;

    public m0(g0 g0Var, h0 h0Var, i0 i0Var, j0 j0Var) {
        this.f76a = g0Var;
        this.f77b = h0Var;
        this.f78c = i0Var;
        this.f79d = j0Var;
    }

    public final void onBackCancelled() {
        this.f79d.a();
    }

    public final void onBackInvoked() {
        this.f78c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.j.e("backEvent", backEvent);
        this.f77b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e("backEvent", backEvent);
        this.f76a.invoke(new b(backEvent));
    }
}
