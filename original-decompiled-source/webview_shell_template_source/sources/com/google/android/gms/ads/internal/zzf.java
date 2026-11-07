package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.as1;
import com.google.android.gms.internal.ads.bs1;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.de1;
import com.google.android.gms.internal.ads.ds1;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.gr1;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ie1;
import com.google.android.gms.internal.ads.jv1;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.lx;
import com.google.android.gms.internal.ads.o70;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.pr1;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.zn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final c5.a zzd(Long l4, cu0 cu0Var, ie1 ie1Var, de1 de1Var, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzv.zzp().d().zzs(jSONObject.getString("appSettingsJson"));
            if (l4 != null) {
                zzf(cu0Var, "cld_s", zzv.zzC().b() - l4.longValue());
            }
        }
        de1Var.s(zOptBoolean);
        ie1Var.b(de1Var.zzm());
        return ds1.f4001t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(cu0 cu0Var, String str, long j6) {
        if (cu0Var != null) {
            if (((Boolean) zzbe.zzc().a(zn.yc)).booleanValue()) {
                bu0 bu0VarA = cu0Var.a();
                bu0VarA.a("action", "lat_init");
                bu0VarA.a(str, Long.toString(j6));
                bu0VarA.c();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, ie1 ie1Var, cu0 cu0Var, Long l4) throws JSONException {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, ie1Var, cu0Var, l4);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z6, w60 w60Var, String str, String str2, Runnable runnable, final ie1 ie1Var, final cu0 cu0Var, final Long l4) throws JSONException {
        de1 de1Var;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoB;
        if (zzv.zzC().b() - this.zzb < 5000) {
            zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzC().b();
        if (w60Var != null && !TextUtils.isEmpty(w60Var.f10066e)) {
            if (zzv.zzC().a() - w60Var.f10067f <= ((Long) zzbe.zzc().a(zn.f11419j4)).longValue() && w60Var.h) {
                return;
            }
        }
        if (context == null) {
            zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final de1 de1VarE = d0.e(context, 4);
        de1VarE.zzi();
        lx lxVarA = zzv.zzg().a(this.zza, versionInfoParcel, ie1Var);
        fo foVar = kx.f6519b;
        ox oxVarA = lxVarA.a("google.afma.config.fetchAppSettings", foVar, foVar);
        int i6 = 0;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e6) {
            e = e6;
            de1Var = de1VarE;
            exc = e;
            zzo.zzh("Error requesting application settings", exc);
            de1Var.g(exc);
            de1Var.s(false);
            ie1Var.b(de1Var.zzm());
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z6);
            jSONObject.put("pn", context.getPackageName());
            sn snVar = zn.f11349a;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbe.zza().a()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfoB = j3.d.a(context).b(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoB.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            c5.a aVarA = oxVarA.a(jSONObject);
            try {
                pr1 pr1Var = new pr1(this) { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.pr1
                    public final c5.a zza(Object obj) {
                        return zzf.zzd(l4, cu0Var, ie1Var, de1VarE, (JSONObject) obj);
                    }
                };
                de1Var = de1VarE;
                try {
                    h70 h70Var = i70.f5592g;
                    gr1 gr1VarP = bs1.p(aVarA, pr1Var, h70Var);
                    if (runnable != null) {
                        ((o70) aVarA).s.addListener(runnable, h70Var);
                    }
                    if (l4 != null) {
                        ((o70) aVarA).s.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzf.zzf(cu0Var, "cld_r", zzv.zzC().b() - l4.longValue());
                            }
                        }, h70Var);
                    }
                    if (((Boolean) zzbe.zzc().a(zn.C7)).booleanValue()) {
                        gr1VarP.addListener(new as1(i6, gr1VarP, new jv1("ConfigLoader.maybeFetchNewAppSettings", 3)), h70Var);
                    } else {
                        y5.g(gr1VarP, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e7) {
                    e = e7;
                    exc = e;
                    zzo.zzh("Error requesting application settings", exc);
                    de1Var.g(exc);
                    de1Var.s(false);
                    ie1Var.b(de1Var.zzm());
                }
            } catch (Exception e8) {
                e = e8;
                de1Var = de1VarE;
            }
        } catch (Exception e9) {
            exc = e9;
            de1Var = de1VarE;
            zzo.zzh("Error requesting application settings", exc);
            de1Var.g(exc);
            de1Var.s(false);
            ie1Var.b(de1Var.zzm());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, w60 w60Var, ie1 ie1Var) throws JSONException {
        zzb(context, versionInfoParcel, false, w60Var, w60Var != null ? w60Var.f10065d : null, str, null, ie1Var, null, null);
    }
}
