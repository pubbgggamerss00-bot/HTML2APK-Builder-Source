package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class tg1 implements Application.ActivityLifecycleCallbacks {
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9276t;

    /* renamed from: u, reason: collision with root package name */
    public sg1 f9277u;

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f9276t) {
            this.f9276t = true;
            if (this.s) {
                a(true);
                sg1 sg1Var = this.f9277u;
                if (sg1Var != null) {
                    sg1Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z6 = runningAppProcessInfo.importance == 100 || b();
        if (this.f9276t != z6) {
            this.f9276t = z6;
            if (this.s) {
                a(z6);
                sg1 sg1Var = this.f9277u;
                if (sg1Var != null) {
                    sg1Var.a(z6);
                }
            }
        }
    }

    public void a(boolean z6) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
