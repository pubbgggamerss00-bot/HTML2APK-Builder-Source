package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.u;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v extends d {
    final /* synthetic */ u this$0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends d {
        final /* synthetic */ u this$0;

        public a(u uVar) {
            this.this$0 = uVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e("activity", activity);
            u uVar = this.this$0;
            int i6 = uVar.s + 1;
            uVar.s = i6;
            if (i6 == 1 && uVar.f1331v) {
                uVar.f1333x.f(h.a.ON_START);
                uVar.f1331v = false;
            }
        }
    }

    public v(u uVar) {
        this.this$0 = uVar;
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = w.f1337t;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((w) fragmentFindFragmentByTag).s = this.this$0.f1335z;
        }
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e("activity", activity);
        u uVar = this.this$0;
        int i6 = uVar.f1329t - 1;
        uVar.f1329t = i6;
        if (i6 == 0) {
            Handler handler = uVar.f1332w;
            kotlin.jvm.internal.j.b(handler);
            handler.postDelayed(uVar.f1334y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e("activity", activity);
        u.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e("activity", activity);
        u uVar = this.this$0;
        int i6 = uVar.s - 1;
        uVar.s = i6;
        if (i6 == 0 && uVar.f1330u) {
            uVar.f1333x.f(h.a.ON_STOP);
            uVar.f1331v = true;
        }
    }
}
