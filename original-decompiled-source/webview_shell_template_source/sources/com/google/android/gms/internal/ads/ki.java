package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ki implements Application.ActivityLifecycleCallbacks {
    public long B;
    public Activity s;

    /* renamed from: t, reason: collision with root package name */
    public Application f6423t;

    /* renamed from: z, reason: collision with root package name */
    public cf f6429z;

    /* renamed from: u, reason: collision with root package name */
    public final Object f6424u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f6425v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6426w = false;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f6427x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f6428y = new ArrayList();
    public boolean A = false;

    public final void a(Activity activity) {
        synchronized (this.f6424u) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.s = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f6424u) {
            try {
                Activity activity2 = this.s;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.s = null;
                }
                Iterator it = this.f6428y.iterator();
                while (it.hasNext()) {
                    try {
                        if (((wi) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e6) {
                        zzv.zzp().h("AppActivityTracker.ActivityListener.onActivityDestroyed", e6);
                        zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f6424u) {
            ArrayList arrayList = this.f6428y;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                try {
                    ((wi) obj).zzb();
                } catch (Exception e6) {
                    zzv.zzp().h("AppActivityTracker.ActivityListener.onActivityPaused", e6);
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                }
            }
        }
        this.f6426w = true;
        cf cfVar = this.f6429z;
        if (cfVar != null) {
            zzs.zza.removeCallbacks(cfVar);
        }
        uj1 uj1Var = zzs.zza;
        cf cfVar2 = new cf(2, this);
        this.f6429z = cfVar2;
        uj1Var.postDelayed(cfVar2, this.B);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        int i6 = 0;
        this.f6426w = false;
        boolean z6 = this.f6425v;
        this.f6425v = true;
        cf cfVar = this.f6429z;
        if (cfVar != null) {
            zzs.zza.removeCallbacks(cfVar);
        }
        synchronized (this.f6424u) {
            ArrayList arrayList = this.f6428y;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                try {
                    ((wi) obj).zzc();
                } catch (Exception e6) {
                    zzv.zzp().h("AppActivityTracker.ActivityListener.onActivityResumed", e6);
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                }
            }
            if (z6) {
                zzo.zze("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f6427x;
                int size2 = arrayList2.size();
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    try {
                        ((li) obj2).zza(true);
                    } catch (Exception e7) {
                        zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
