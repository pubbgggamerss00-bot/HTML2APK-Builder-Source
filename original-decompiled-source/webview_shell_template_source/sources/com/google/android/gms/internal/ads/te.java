package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class te implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            ue.f9540b = MessageDigest.getInstance("MD5");
            countDownLatch = ue.f9543e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = ue.f9543e;
        } catch (Throwable th) {
            ue.f9543e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
