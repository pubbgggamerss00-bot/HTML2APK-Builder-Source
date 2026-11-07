package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.am1;
import com.google.android.gms.internal.ads.cm1;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zzo {
    protected static final cm1 zza = new cm1(new aa1(6));

    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void zze(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        cm1 cm1Var = zza;
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
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        cm1 cm1Var = zza;
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
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        cm1 cm1Var = zza;
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
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void zzj(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        cm1 cm1Var = zza;
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
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i6) {
        return i6 >= 5 || Log.isLoggable("Ads", i6);
    }
}
