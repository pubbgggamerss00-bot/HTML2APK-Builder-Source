package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.i70;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzb {
    private final Runnable zza = new a(0, this);
    private volatile Thread zzb;

    public abstract void zza();

    public c5.a zzb() {
        return i70.f5586a.w(this.zza);
    }
}
