package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.internal.ads.dy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzb {
    private static volatile zzci zza;

    private zzb() {
    }

    public static zzci zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                try {
                    if (zza == null) {
                        zza = zzbc.zza().zzg(context.getApplicationContext(), new dy());
                    }
                } finally {
                }
            }
        }
        return zza;
    }
}
