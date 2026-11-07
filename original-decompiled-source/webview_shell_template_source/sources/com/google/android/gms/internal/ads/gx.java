package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gx {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5178a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Object f5179b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public lx f5180c;

    /* renamed from: d, reason: collision with root package name */
    public lx f5181d;

    public final lx a(Context context, VersionInfoParcel versionInfoParcel, ie1 ie1Var) {
        lx lxVar;
        synchronized (this.f5178a) {
            try {
                if (this.f5180c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f5180c = new lx(context, versionInfoParcel, (String) zzbe.zzc().a(zn.f11349a), ie1Var);
                }
                lxVar = this.f5180c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lxVar;
    }

    public final lx b(Context context, VersionInfoParcel versionInfoParcel, ie1 ie1Var) {
        lx lxVar;
        synchronized (this.f5179b) {
            try {
                if (this.f5181d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    String strA = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html";
                    fq fqVar = (fq) hq.f5455a.get();
                    if (fqVar != null) {
                        strA = fqVar.a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");
                    } else if (hq.a() != null) {
                        hq.a().zza();
                    }
                    this.f5181d = new lx(context, versionInfoParcel, strA, ie1Var);
                }
                lxVar = this.f5181d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lxVar;
    }
}
