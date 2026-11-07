package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.ump.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements Application.ActivityLifecycleCallbacks {
    public final Activity s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f11807t;

    public l(n nVar, Activity activity) {
        Objects.requireNonNull(nVar);
        this.f11807t = nVar;
        this.s = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        n nVar = this.f11807t;
        Dialog dialog = nVar.f11837g;
        AtomicReference atomicReference = nVar.f11841l;
        if (dialog == null || !nVar.f11842m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        w wVar = nVar.f11832b;
        if (wVar != null) {
            wVar.f11923a = activity;
        }
        l lVar = (l) atomicReference.getAndSet(null);
        if (lVar != null) {
            lVar.f11807t.f11831a.unregisterActivityLifecycleCallbacks(lVar);
            l lVar2 = new l(nVar, activity);
            nVar.f11831a.registerActivityLifecycleCallbacks(lVar2);
            atomicReference.set(lVar2);
        }
        Dialog dialog2 = nVar.f11837g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.s) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        n nVar = this.f11807t;
        if (zIsChangingConfigurations && nVar.f11842m && (dialog = nVar.f11837g) != null) {
            dialog.dismiss();
            return;
        }
        f2 f2Var = new f2(3, "Activity is destroyed.");
        Dialog dialog2 = nVar.f11837g;
        if (dialog2 != null) {
            dialog2.dismiss();
            nVar.f11837g = null;
        }
        nVar.f11832b.f11923a = null;
        l lVar = (l) nVar.f11841l.getAndSet(null);
        if (lVar != null) {
            lVar.f11807t.f11831a.unregisterActivityLifecycleCallbacks(lVar);
        }
        a.InterfaceC0040a interfaceC0040a = (a.InterfaceC0040a) nVar.f11840k.getAndSet(null);
        if (interfaceC0040a == null) {
            return;
        }
        nVar.d(f2Var);
        interfaceC0040a.a(f2Var.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
