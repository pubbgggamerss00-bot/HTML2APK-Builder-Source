package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qc1 {
    public static void a(Context context, boolean z6) {
        if (z6) {
            zzo.zzi("This request is sent from a test device.");
            return;
        }
        zzbc.zzb();
        zzo.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzf.zzy(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i6, String str, Throwable th) {
        zzo.zzi("Ad failed to load : " + i6);
        zze.zzb(str, th);
        if (i6 == 3) {
            return;
        }
        zzv.zzp().g(str, th);
    }
}
