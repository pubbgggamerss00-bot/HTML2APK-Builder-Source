package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2946a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final zzj f2947b;

    /* renamed from: c, reason: collision with root package name */
    public final e70 f2948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2949d;

    /* renamed from: e, reason: collision with root package name */
    public Context f2950e;

    /* renamed from: f, reason: collision with root package name */
    public VersionInfoParcel f2951f;

    /* renamed from: g, reason: collision with root package name */
    public String f2952g;
    public co h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f2953i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2954j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2955k;

    /* renamed from: l, reason: collision with root package name */
    public final a70 f2956l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2957m;

    /* renamed from: n, reason: collision with root package name */
    public c5.a f2958n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f2959o;

    public b70() {
        zzj zzjVar = new zzj();
        this.f2947b = zzjVar;
        this.f2948c = new e70(zzbc.zzd(), zzjVar);
        this.f2949d = false;
        this.h = null;
        this.f2953i = null;
        this.f2954j = new AtomicInteger(0);
        this.f2955k = new AtomicInteger(0);
        this.f2956l = new a70();
        this.f2957m = new Object();
        this.f2959o = new AtomicBoolean();
    }

    public final boolean a(Context context) {
        if (i3.g.a()) {
            if (((Boolean) zzbe.zzc().a(zn.m8)).booleanValue()) {
                return this.f2959o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final Resources b() {
        if (this.f2951f.isClientJar) {
            return this.f2950e.getResources();
        }
        try {
            if (((Boolean) zzbe.zzc().a(zn.La)).booleanValue()) {
                return zzs.zza(this.f2950e).getResources();
            }
            zzs.zza(this.f2950e).getResources();
            return null;
        } catch (zzr e6) {
            zzo.zzk("Cannot load resource from dynamite apk or local jar", e6);
            return null;
        }
    }

    public final co c() {
        co coVar;
        synchronized (this.f2946a) {
            coVar = this.h;
        }
        return coVar;
    }

    public final zzj d() {
        zzj zzjVar;
        synchronized (this.f2946a) {
            zzjVar = this.f2947b;
        }
        return zzjVar;
    }

    public final c5.a e() {
        if (this.f2950e != null) {
            if (!((Boolean) zzbe.zzc().a(zn.W2)).booleanValue()) {
                synchronized (this.f2957m) {
                    try {
                        c5.a aVar = this.f2958n;
                        if (aVar != null) {
                            return aVar;
                        }
                        c5.a aVarU = i70.f5586a.u(new x60(0, this));
                        this.f2958n = aVarU;
                        return aVarU;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return bs1.m(new ArrayList());
    }

    @TargetApi(23)
    public final void f(Context context, VersionInfoParcel versionInfoParcel) {
        co coVar;
        synchronized (this.f2946a) {
            try {
                if (!this.f2949d) {
                    this.f2950e = context.getApplicationContext();
                    this.f2951f = versionInfoParcel;
                    zzv.zzb().b(this.f2948c);
                    this.f2947b.zzp(this.f2950e);
                    t20.d(this.f2950e, this.f2951f);
                    zzv.zze();
                    if (((Boolean) zzbe.zzc().a(zn.f11391f2)).booleanValue()) {
                        coVar = new co();
                    } else {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        coVar = null;
                    }
                    this.h = coVar;
                    if (coVar != null) {
                        y5.g(new y60(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f2950e;
                    if (i3.g.a()) {
                        if (((Boolean) zzbe.zzc().a(zn.m8)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new z60(this));
                            } catch (RuntimeException e6) {
                                zzo.zzk("Failed to register network callback", e6);
                                this.f2959o.set(true);
                            }
                        }
                    }
                    this.f2949d = true;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void g(String str, Throwable th) {
        t20.d(this.f2950e, this.f2951f).c(th, str, ((Double) aq.f2824g.c()).floatValue());
    }

    public final void h(String str, Throwable th) {
        t20.d(this.f2950e, this.f2951f).b(str, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002f, B:13:0x0039, B:14:0x0042), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str, Throwable th) {
        Context context = this.f2950e;
        VersionInfoParcel versionInfoParcel = this.f2951f;
        synchronized (t20.C) {
            try {
                if (t20.E == null) {
                    if (((Boolean) zzbe.zzc().a(zn.A7)).booleanValue()) {
                        if (((Boolean) zzbe.zzc().a(zn.z7)).booleanValue()) {
                            t20.E = new me0(17);
                        } else {
                            t20.E = new t20(context, versionInfoParcel);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t20.E.b(str, th);
    }
}
