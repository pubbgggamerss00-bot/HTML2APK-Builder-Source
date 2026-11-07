package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f2340a;

    public g(long j6) {
        this.f2340a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.zzz.remove(Long.valueOf(this.f2340a)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzv.zzp().h("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
