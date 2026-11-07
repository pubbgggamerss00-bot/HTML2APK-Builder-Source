package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jc2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6025a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Looper f6026b = null;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f6027c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f6028d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.f6025a) {
            try {
                y5.r(this.f6028d > 0);
                int i6 = this.f6028d - 1;
                this.f6028d = i6;
                if (i6 == 0 && (handlerThread = this.f6027c) != null) {
                    handlerThread.quit();
                    this.f6027c = null;
                    this.f6026b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
