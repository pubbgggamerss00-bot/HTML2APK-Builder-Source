package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class he1 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public final ie1 f5366t;

    /* renamed from: u, reason: collision with root package name */
    public String f5367u;

    /* renamed from: w, reason: collision with root package name */
    public String f5369w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.fragment.app.f0 f5370x;

    /* renamed from: y, reason: collision with root package name */
    public zze f5371y;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledFuture f5372z;
    public final ArrayList s = new ArrayList();
    public int A = 2;

    /* renamed from: v, reason: collision with root package name */
    public ke1 f5368v = ke1.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public he1(ie1 ie1Var) {
        this.f5366t = ie1Var;
    }

    public final synchronized void a(de1 de1Var) {
        try {
            if (((Boolean) mp.f7199c.c()).booleanValue()) {
                ArrayList arrayList = this.s;
                de1Var.zzj();
                arrayList.add(de1Var);
                ScheduledFuture scheduledFuture = this.f5372z;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f5372z = i70.f5589d.schedule(this, ((Integer) zzbe.zzc().a(zn.G8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        boolean zMatches;
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbe.zzc().a(zn.H8), str);
            }
            if (zMatches) {
                this.f5367u = str;
            }
        }
    }

    public final synchronized void c(zze zzeVar) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            this.f5371y = zzeVar;
        }
    }

    public final synchronized void d(ArrayList arrayList) {
        try {
            if (((Boolean) mp.f7199c.c()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.A = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.A = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.A = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.A = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.A = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.A = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            this.f5369w = str;
        }
    }

    public final synchronized void f(Bundle bundle) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            this.f5368v = zzaa.zza(bundle);
        }
    }

    public final synchronized void g(androidx.fragment.app.f0 f0Var) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            this.f5370x = f0Var;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) mp.f7199c.c()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f5372z;
                int i6 = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    de1 de1Var = (de1) obj;
                    int i7 = this.A;
                    if (i7 != 2) {
                        de1Var.a(i7);
                    }
                    if (!TextUtils.isEmpty(this.f5367u)) {
                        de1Var.zze(this.f5367u);
                    }
                    if (!TextUtils.isEmpty(this.f5369w) && !de1Var.zzl()) {
                        de1Var.f(this.f5369w);
                    }
                    androidx.fragment.app.f0 f0Var = this.f5370x;
                    if (f0Var != null) {
                        de1Var.d(f0Var);
                    } else {
                        zze zzeVar = this.f5371y;
                        if (zzeVar != null) {
                            de1Var.c(zzeVar);
                        }
                    }
                    de1Var.b(this.f5368v);
                    this.f5366t.b(de1Var.zzm());
                }
                this.s.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i6) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            this.A = i6;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
