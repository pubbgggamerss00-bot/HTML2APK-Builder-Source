package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fv0 {

    /* renamed from: f, reason: collision with root package name */
    public final Context f4792f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f4793g;
    public final mt0 h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4794i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4795j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f4796k;

    /* renamed from: l, reason: collision with root package name */
    public final iu0 f4797l;

    /* renamed from: m, reason: collision with root package name */
    public final VersionInfoParcel f4798m;

    /* renamed from: o, reason: collision with root package name */
    public final an0 f4800o;

    /* renamed from: p, reason: collision with root package name */
    public final ie1 f4801p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4787a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4788b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4789c = false;

    /* renamed from: e, reason: collision with root package name */
    public final o70 f4791e = new o70();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f4799n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f4802q = true;

    /* renamed from: d, reason: collision with root package name */
    public final long f4790d = zzv.zzC().b();

    public fv0(Executor executor, Context context, WeakReference weakReference, h70 h70Var, mt0 mt0Var, ScheduledExecutorService scheduledExecutorService, iu0 iu0Var, VersionInfoParcel versionInfoParcel, an0 an0Var, ie1 ie1Var) {
        this.h = mt0Var;
        this.f4792f = context;
        this.f4793g = weakReference;
        this.f4794i = h70Var;
        this.f4796k = scheduledExecutorService;
        this.f4795j = executor;
        this.f4797l = iu0Var;
        this.f4798m = versionInfoParcel;
        this.f4800o = an0Var;
        this.f4801p = ie1Var;
        d("com.google.android.gms.ads.MobileAds", 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f4799n;
        for (String str : concurrentHashMap.keySet()) {
            rv rvVar = (rv) concurrentHashMap.get(str);
            arrayList.add(new rv(str, rvVar.f8709u, rvVar.f8710v, rvVar.f8708t));
        }
        return arrayList;
    }

    public final void b() {
        if (!((Boolean) xp.f10654a.c()).booleanValue()) {
            if (this.f4798m.clientJarVersion >= ((Integer) zzbe.zzc().a(zn.V1)).intValue() && this.f4802q) {
                if (this.f4787a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f4787a) {
                            return;
                        }
                        this.f4797l.d();
                        this.f4800o.zzf();
                        o70 o70Var = this.f4791e;
                        final int i6 = 1;
                        o70Var.s.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yu0

                            /* renamed from: t, reason: collision with root package name */
                            public final /* synthetic */ fv0 f11079t;

                            {
                                this.f11079t = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        fv0 fv0Var = this.f11079t;
                                        synchronized (fv0Var) {
                                            try {
                                                if (fv0Var.f4789c) {
                                                    return;
                                                }
                                                fv0Var.d("com.google.android.gms.ads.MobileAds", (int) (zzv.zzC().b() - fv0Var.f4790d), "Timeout.", false);
                                                fv0Var.f4797l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                fv0Var.f4800o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                fv0Var.f4791e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                    default:
                                        fv0 fv0Var2 = this.f11079t;
                                        iu0 iu0Var = fv0Var2.f4797l;
                                        synchronized (iu0Var) {
                                            try {
                                                if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue() && !iu0Var.f5852d) {
                                                    HashMap mapE = iu0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    iu0Var.f5850b.add(mapE);
                                                    ArrayList arrayList = iu0Var.f5850b;
                                                    int size = arrayList.size();
                                                    int i7 = 0;
                                                    while (i7 < size) {
                                                        Object obj = arrayList.get(i7);
                                                        i7++;
                                                        iu0Var.f5854f.b((Map) obj, false);
                                                    }
                                                    iu0Var.f5852d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        fv0Var2.f4800o.zze();
                                        fv0Var2.f4788b = true;
                                        return;
                                }
                            }
                        }, this.f4794i);
                        this.f4787a = true;
                        c5.a aVarC = c();
                        final int i7 = 0;
                        this.f4796k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yu0

                            /* renamed from: t, reason: collision with root package name */
                            public final /* synthetic */ fv0 f11079t;

                            {
                                this.f11079t = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        fv0 fv0Var = this.f11079t;
                                        synchronized (fv0Var) {
                                            try {
                                                if (fv0Var.f4789c) {
                                                    return;
                                                }
                                                fv0Var.d("com.google.android.gms.ads.MobileAds", (int) (zzv.zzC().b() - fv0Var.f4790d), "Timeout.", false);
                                                fv0Var.f4797l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                fv0Var.f4800o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                                fv0Var.f4791e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                    default:
                                        fv0 fv0Var2 = this.f11079t;
                                        iu0 iu0Var = fv0Var2.f4797l;
                                        synchronized (iu0Var) {
                                            try {
                                                if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue() && !iu0Var.f5852d) {
                                                    HashMap mapE = iu0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    iu0Var.f5850b.add(mapE);
                                                    ArrayList arrayList = iu0Var.f5850b;
                                                    int size = arrayList.size();
                                                    int i72 = 0;
                                                    while (i72 < size) {
                                                        Object obj = arrayList.get(i72);
                                                        i72++;
                                                        iu0Var.f5854f.b((Map) obj, false);
                                                    }
                                                    iu0Var.f5852d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        fv0Var2.f4800o.zze();
                                        fv0Var2.f4788b = true;
                                        return;
                                }
                            }
                        }, ((Long) zzbe.zzc().a(zn.X1)).longValue(), TimeUnit.SECONDS);
                        cv0 cv0Var = new cv0(this);
                        aVarC.addListener(new as1(0, aVarC, cv0Var), this.f4794i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f4787a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
        this.f4791e.a(Boolean.FALSE);
        this.f4787a = true;
        this.f4788b = true;
    }

    public final synchronized c5.a c() {
        String str = zzv.zzp().d().zzg().f10066e;
        if (!TextUtils.isEmpty(str)) {
            return bs1.m(str);
        }
        o70 o70Var = new o70();
        zzv.zzp().d().zzo(new as1(7, this, o70Var));
        return o70Var;
    }

    public final void d(String str, int i6, String str2, boolean z6) {
        this.f4799n.put(str, new rv(str, i6, str2, z6));
    }
}
