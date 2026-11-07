package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.e0;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class f0 extends g {
    final /* synthetic */ e0 this$0;

    public static final class a extends g {
        final /* synthetic */ e0 this$0;

        public a(e0 e0Var) {
            this.this$0 = e0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            e0 e0Var = this.this$0;
            int i10 = e0Var.f2261a + 1;
            e0Var.f2261a = i10;
            if (i10 == 1 && e0Var.f2264d) {
                e0Var.f2266f.f(l.a.ON_START);
                e0Var.f2264d = false;
            }
        }
    }

    public f0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.r.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = j0.f2313b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.r.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((j0) fragmentFindFragmentByTag).f2314a = this.this$0.f2268h;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i10 = e0Var.f2262b - 1;
        e0Var.f2262b = i10;
        if (i10 == 0) {
            Handler handler = e0Var.f2265e;
            kotlin.jvm.internal.r.b(handler);
            handler.postDelayed(e0Var.f2267g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.r.e(activity, "activity");
        e0.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i10 = e0Var.f2261a - 1;
        e0Var.f2261a = i10;
        if (i10 == 0 && e0Var.f2263c) {
            e0Var.f2266f.f(l.a.ON_STOP);
            e0Var.f2264d = true;
        }
    }
}
