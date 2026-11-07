package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tj {

    /* renamed from: a, reason: collision with root package name */
    public ScheduledFuture f9299a = null;

    /* renamed from: b, reason: collision with root package name */
    public final t f9300b = new t(1, this);

    /* renamed from: c, reason: collision with root package name */
    public final Object f9301c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public wj f9302d;

    /* renamed from: e, reason: collision with root package name */
    public Context f9303e;

    /* renamed from: f, reason: collision with root package name */
    public zj f9304f;

    public static /* bridge */ /* synthetic */ void b(tj tjVar) {
        synchronized (tjVar.f9301c) {
            try {
                wj wjVar = tjVar.f9302d;
                if (wjVar == null) {
                    return;
                }
                if (wjVar.isConnected() || tjVar.f9302d.isConnecting()) {
                    tjVar.f9302d.disconnect();
                }
                tjVar.f9302d = null;
                tjVar.f9304f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final uj a(xj xjVar) {
        synchronized (this.f9301c) {
            if (this.f9304f == null) {
                return new uj();
            }
            try {
                if (this.f9302d.d()) {
                    zj zjVar = this.f9304f;
                    Parcel parcelZza = zjVar.zza();
                    th.c(parcelZza, xjVar);
                    Parcel parcelZzcZ = zjVar.zzcZ(2, parcelZza);
                    uj ujVar = (uj) th.a(parcelZzcZ, uj.CREATOR);
                    parcelZzcZ.recycle();
                    return ujVar;
                }
                zj zjVar2 = this.f9304f;
                Parcel parcelZza2 = zjVar2.zza();
                th.c(parcelZza2, xjVar);
                Parcel parcelZzcZ2 = zjVar2.zzcZ(1, parcelZza2);
                uj ujVar2 = (uj) th.a(parcelZzcZ2, uj.CREATOR);
                parcelZzcZ2.recycle();
                return ujVar2;
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call into cache service.", e6);
                return new uj();
            }
        }
    }

    public final void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f9301c) {
            try {
                if (this.f9303e != null) {
                    return;
                }
                this.f9303e = context.getApplicationContext();
                if (((Boolean) zzbe.zzc().a(zn.m4)).booleanValue()) {
                    d();
                } else {
                    if (((Boolean) zzbe.zzc().a(zn.l4)).booleanValue()) {
                        zzv.zzb().b(new qj(0, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        wj wjVar;
        synchronized (this.f9301c) {
            if (this.f9303e != null && this.f9302d == null) {
                rj rjVar = new rj(this);
                sj sjVar = new sj(this);
                synchronized (this) {
                    wjVar = new wj(this.f9303e, zzv.zzu().zzb(), rjVar, sjVar);
                }
                this.f9302d = wjVar;
                wjVar.checkAvailabilityAndConnect();
            }
        }
    }
}
