package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.op;
import com.google.android.gms.internal.ads.y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i6 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) op.f7828a.c()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                c5.a aVarZzb = new h(context).zzb();
                zzo.zzi("Updating ad debug logging enablement.");
                y5.g(aVarZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e6) {
                zzo.zzk("Fail to determine debug setting.", e6);
            }
        }
    }
}
