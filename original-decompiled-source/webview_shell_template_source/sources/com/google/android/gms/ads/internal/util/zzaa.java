package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.eb0;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.oz0;
import com.google.android.gms.internal.ads.xa0;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zzaa {
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i6, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public eb0 zzc(xa0 xa0Var, kk kkVar, boolean z6, oz0 oz0Var) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public bn zzg(Context context, TelephonyManager telephonyManager) {
        return bn.ENUM_UNKNOWN;
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void zzk(Activity activity) {
    }

    public void zzh(Context context, String str, String str2) {
    }
}
