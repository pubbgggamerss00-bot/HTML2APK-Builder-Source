package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.uj1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzf extends uj1 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("AdMobHandler.handleMessage", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.uj1
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzs.zzN(com.google.android.gms.ads.internal.zzv.zzp().f2950e, th);
            throw th;
        }
    }
}
