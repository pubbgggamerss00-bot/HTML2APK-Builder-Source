package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7160a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ki f7161b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7162c = false;

    public final Activity a() {
        synchronized (this.f7160a) {
            try {
                ki kiVar = this.f7161b;
                if (kiVar == null) {
                    return null;
                }
                return kiVar.s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(li liVar) {
        synchronized (this.f7160a) {
            try {
                if (this.f7161b == null) {
                    this.f7161b = new ki();
                }
                ki kiVar = this.f7161b;
                synchronized (kiVar.f6424u) {
                    kiVar.f6427x.add(liVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Context context) {
        synchronized (this.f7160a) {
            try {
                if (!this.f7162c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        zzo.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.f7161b == null) {
                        this.f7161b = new ki();
                    }
                    ki kiVar = this.f7161b;
                    if (!kiVar.A) {
                        application.registerActivityLifecycleCallbacks(kiVar);
                        if (context instanceof Activity) {
                            kiVar.a((Activity) context);
                        }
                        kiVar.f6423t = application;
                        kiVar.B = ((Long) zzbe.zzc().a(zn.f11367c1)).longValue();
                        kiVar.A = true;
                    }
                    this.f7162c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
