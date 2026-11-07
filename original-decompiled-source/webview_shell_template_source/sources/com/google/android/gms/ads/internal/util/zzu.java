package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@TargetApi(24)
/* loaded from: classes.dex */
public class zzu extends zzt {
    public static final boolean zze(int i6, int i7, int i8) {
        return Math.abs(i6 - i7) <= i8;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.R4)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.T4)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(activity, configuration.screenHeightDp);
            int iZzx2 = com.google.android.gms.ads.internal.util.client.zzf.zzx(activity, configuration.screenWidthDp);
            WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
            com.google.android.gms.ads.internal.zzv.zzq();
            DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
            int i6 = displayMetricsZzu.heightPixels;
            int i7 = displayMetricsZzu.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.P4)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
            if (!zze(i6, iZzx + dimensionPixelSize, iIntValue) || !zze(i7, iZzx2, iIntValue)) {
                return true;
            }
        }
        return false;
    }
}
