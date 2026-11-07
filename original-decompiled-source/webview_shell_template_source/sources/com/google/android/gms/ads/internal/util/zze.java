package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am1;
import com.google.android.gms.internal.ads.cm1;
import com.google.android.gms.internal.ads.tp;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zze extends zzo {
    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        cm1 cm1Var = zzo.zza;
        cm1Var.getClass();
        Iterator itI = cm1Var.f3618a.i(cm1Var, str);
        boolean z6 = true;
        while (true) {
            am1 am1Var = (am1) itI;
            if (!am1Var.hasNext()) {
                return;
            }
            String str2 = (String) am1Var.next();
            if (z6) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzo.zzm(2) && ((Boolean) tp.f9357a.c()).booleanValue();
    }
}
