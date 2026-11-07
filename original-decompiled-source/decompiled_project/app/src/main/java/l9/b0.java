package l9;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.basitce.htmltoapk.HtmlToApkApplication;
import com.basitce.htmltoapk.util.LauncherNameService;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HtmlToApkApplication f16784a;

    public b0(HtmlToApkApplication htmlToApkApplication) {
        this.f16784a = htmlToApkApplication;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.r.e(activity, "activity");
        int i10 = com.basitce.htmltoapk.util.a.f5834c;
        List<String> list = com.basitce.htmltoapk.util.a.f5832a;
        com.basitce.htmltoapk.util.a.f5834c = i10 + 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
        List<String> list = com.basitce.htmltoapk.util.a.f5832a;
        int i10 = com.basitce.htmltoapk.util.a.f5834c - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        com.basitce.htmltoapk.util.a.f5834c = i10;
        if (com.basitce.htmltoapk.util.a.f5834c != 0 || activity.isChangingConfigurations()) {
            return;
        }
        HtmlToApkApplication htmlToApkApplication = this.f16784a;
        if (com.basitce.htmltoapk.util.a.f5834c > 0) {
            return;
        }
        com.basitce.htmltoapk.util.a.a(htmlToApkApplication);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
        List<String> list = com.basitce.htmltoapk.util.a.f5832a;
        if (com.basitce.htmltoapk.util.a.f5835d) {
            try {
                activity.startService(new Intent(activity, (Class<?>) LauncherNameService.class));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.r.e(activity, "activity");
        kotlin.jvm.internal.r.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.r.e(activity, "activity");
    }
}
