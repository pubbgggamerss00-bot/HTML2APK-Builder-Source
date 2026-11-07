package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ss1 extends wr1 {
    public ScheduledFuture A;

    /* renamed from: z, reason: collision with root package name */
    public c5.a f9002z;

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        c5.a aVar = this.f9002z;
        ScheduledFuture scheduledFuture = this.A;
        if (aVar == null) {
            return null;
        }
        String strB = androidx.camera.camera2.internal.v0.b("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return strB;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strB;
        }
        return strB + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        i(this.f9002z);
        ScheduledFuture scheduledFuture = this.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9002z = null;
        this.A = null;
    }
}
