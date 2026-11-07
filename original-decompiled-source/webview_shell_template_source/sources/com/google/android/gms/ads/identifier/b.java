package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class b extends Thread {
    public final WeakReference<AdvertisingIdClient> s;

    /* renamed from: t, reason: collision with root package name */
    public final long f2260t;

    /* renamed from: u, reason: collision with root package name */
    public final CountDownLatch f2261u = new CountDownLatch(1);

    /* renamed from: v, reason: collision with root package name */
    public boolean f2262v = false;

    public b(AdvertisingIdClient advertisingIdClient, long j6) {
        this.s = new WeakReference<>(advertisingIdClient);
        this.f2260t = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference<AdvertisingIdClient> weakReference = this.s;
        try {
            if (this.f2261u.await(this.f2260t, TimeUnit.MILLISECONDS) || (advertisingIdClient = weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f2262v = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f2262v = true;
            }
        }
    }
}
