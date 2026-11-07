package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fi implements Application.ActivityLifecycleCallbacks {
    public final Application s;

    /* renamed from: t, reason: collision with root package name */
    public final WeakReference f4687t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4688u = false;

    public fi(Application application, ci ciVar) {
        this.f4687t = new WeakReference(ciVar);
        this.s = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f4687t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else {
                if (this.f4688u) {
                    return;
                }
                this.s.unregisterActivityLifecycleCallbacks(this);
                this.f4688u = true;
            }
        } catch (Exception e6) {
            zzo.zzh("Error while dispatching lifecycle callback.", e6);
        }
    }
}
