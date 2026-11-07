package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hy0 implements el0 {
    @Override // com.google.android.gms.internal.ads.el0
    public final c01 a(Looper looper, Handler.Callback callback) {
        return new c01(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long zzc() {
        return System.nanoTime();
    }
}
