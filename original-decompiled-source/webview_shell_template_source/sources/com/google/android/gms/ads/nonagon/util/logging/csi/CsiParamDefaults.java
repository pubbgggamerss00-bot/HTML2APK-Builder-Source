package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        map.put("device", zzs.zzs());
        map.put("app", this.zzb);
        zzv.zzq();
        map.put("is_lite_sdk", true != zzs.zzF(this.zza) ? "0" : "1");
        sn snVar = zn.f11349a;
        ArrayList arrayListB = zzbe.zza().b();
        if (((Boolean) zzbe.zzc().a(zn.I6)).booleanValue()) {
            arrayListB.addAll(zzv.zzp().d().zzg().f10069i);
        }
        map.put("e", TextUtils.join(",", arrayListB));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbe.zzc().a(zn.ib)).booleanValue()) {
            zzv.zzq();
            map.put("is_bstar", true != zzs.zzC(this.zza) ? "0" : "1");
        }
        if (((Boolean) zzbe.zzc().a(zn.n9)).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.f11479t2)).booleanValue()) {
                String str = zzv.zzp().f2952g;
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                map.put("plugin", str);
            }
        }
    }
}
