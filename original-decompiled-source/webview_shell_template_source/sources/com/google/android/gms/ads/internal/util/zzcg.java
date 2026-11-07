package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcg {
    private static zzcg zzb;
    String zza;

    private zzcg() {
    }

    public static zzcg zza() {
        if (zzb == null) {
            zzb = new zzcg();
        }
        return zzb;
    }

    public final void zzb(Context context) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zza)) {
            AtomicBoolean atomicBoolean = c3.k.f2186a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.zza = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
