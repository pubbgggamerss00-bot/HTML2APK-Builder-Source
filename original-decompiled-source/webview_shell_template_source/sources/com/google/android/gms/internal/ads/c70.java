package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c70 {

    /* renamed from: g, reason: collision with root package name */
    public final String f3452g;
    public final zzj h;

    /* renamed from: a, reason: collision with root package name */
    public long f3446a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f3447b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3448c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3449d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f3450e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3451f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f3453i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f3454j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3455k = 0;

    public c70(String str, zzj zzjVar) {
        this.f3452g = str;
        this.h = zzjVar;
    }

    public final void a(zzm zzmVar, long j6) {
        Bundle bundle;
        synchronized (this.f3451f) {
            try {
                long jZzd = this.h.zzd();
                long jA = zzv.zzC().a();
                if (this.f3447b == -1) {
                    if (jA - jZzd > ((Long) zzbe.zzc().a(zn.f11375d1)).longValue()) {
                        this.f3449d = -1;
                    } else {
                        this.f3449d = this.h.zzc();
                    }
                    this.f3447b = j6;
                    this.f3446a = j6;
                } else {
                    this.f3446a = j6;
                }
                if (((Boolean) zzbe.zzc().a(zn.I3)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f3448c++;
                    int i6 = this.f3449d + 1;
                    this.f3449d = i6;
                    if (i6 == 0) {
                        this.f3450e = 0L;
                        this.h.zzz(jA);
                    } else {
                        this.f3450e = jA - this.h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) yp.f11059a.c()).booleanValue()) {
            synchronized (this.f3451f) {
                this.f3448c--;
                this.f3449d--;
            }
        }
    }
}
