package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final c f5945e = new c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5946a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5947b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5948c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5949d = false;

    public interface a {
        void a(boolean z10);
    }

    public static void b(Application application) {
        c cVar = f5945e;
        synchronized (cVar) {
            try {
                if (!cVar.f5949d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f5949d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f5945e) {
            this.f5948c.add(aVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f5945e) {
            try {
                ArrayList arrayList = this.f5948c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((a) obj).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f5946a.compareAndSet(true, false);
        this.f5947b.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f5946a.compareAndSet(true, false);
        this.f5947b.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5946a.compareAndSet(false, true)) {
            this.f5947b.set(true);
            c(true);
        }
    }
}
