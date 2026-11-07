package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c60 {
    public static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i6 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i6) + str2 + "=" + str3 + "&" + str.substring(i6));
    }

    public static String b(String str, Context context, boolean z6, Map map) {
        String strA;
        if ((((Boolean) zzbe.zzc().a(zn.f11516z0)).booleanValue() && !z6) || !zzv.zzo().e(context) || TextUtils.isEmpty(str) || (strA = zzv.zzo().a(context)) == null) {
            return str;
        }
        String str2 = (String) zzbe.zzc().a(zn.f11472s0);
        if (((Boolean) zzbe.zzc().a(zn.f11467r0)).booleanValue() && str.contains(str2)) {
            if (zzv.zzq().zzj(str)) {
                b60 b60VarZzo = zzv.zzo();
                Map map2 = (Map) map.get("_ac");
                b60VarZzo.getClass();
                b60VarZzo.k(context, "_ac", strA, b60.f(map2));
                return c(context, str).replace(str2, strA);
            }
            if (!zzv.zzq().zzk(str)) {
                return str;
            }
            b60 b60VarZzo2 = zzv.zzo();
            Map map3 = (Map) map.get("_ai");
            b60VarZzo2.getClass();
            b60VarZzo2.k(context, "_ai", strA, b60.f(map3));
            return c(context, str).replace(str2, strA);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) zzbe.zzc().a(zn.f11460q0)).booleanValue()) {
            return str;
        }
        if (zzv.zzq().zzj(str)) {
            b60 b60VarZzo3 = zzv.zzo();
            Map map4 = (Map) map.get("_ac");
            b60VarZzo3.getClass();
            b60VarZzo3.k(context, "_ac", strA, b60.f(map4));
            return a(c(context, str), "fbs_aeid", strA).toString();
        }
        if (!zzv.zzq().zzk(str)) {
            return str;
        }
        b60 b60VarZzo4 = zzv.zzo();
        Map map5 = (Map) map.get("_ai");
        b60VarZzo4.getClass();
        b60VarZzo4.k(context, "_ai", strA, b60.f(map5));
        return a(c(context, str), "fbs_aeid", strA).toString();
    }

    public static String c(Context context, String str) {
        String strC = zzv.zzo().c(context);
        String strB = zzv.zzo().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strC)) {
            str = a(str, "gmp_app_id", strC).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strB)) ? str : a(str, "fbs_aiid", strB).toString();
    }
}
