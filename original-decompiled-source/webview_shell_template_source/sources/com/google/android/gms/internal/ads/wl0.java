package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wl0 extends pm0 {
    public ScheduledFuture A;
    public ScheduledFuture B;

    /* renamed from: t, reason: collision with root package name */
    public final ScheduledExecutorService f10223t;

    /* renamed from: u, reason: collision with root package name */
    public final i3.a f10224u;

    /* renamed from: v, reason: collision with root package name */
    public long f10225v;

    /* renamed from: w, reason: collision with root package name */
    public long f10226w;

    /* renamed from: x, reason: collision with root package name */
    public long f10227x;

    /* renamed from: y, reason: collision with root package name */
    public long f10228y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10229z;

    public wl0(ScheduledExecutorService scheduledExecutorService, i3.a aVar) {
        super(Collections.EMPTY_SET);
        this.f10225v = -1L;
        this.f10226w = -1L;
        this.f10227x = -1L;
        this.f10228y = -1L;
        this.f10229z = false;
        this.f10223t = scheduledExecutorService;
        this.f10224u = aVar;
    }

    public final synchronized void p0(int i6) {
        if (i6 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i6);
            if (this.f10229z) {
                long j6 = this.f10227x;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f10227x = millis;
                return;
            }
            long jB = this.f10224u.b();
            long j7 = this.f10225v;
            if (jB > j7 || j7 - jB > millis) {
                r0(millis);
            }
        }
    }

    public final synchronized void q0(int i6) {
        if (i6 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i6);
            if (this.f10229z) {
                long j6 = this.f10228y;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f10228y = millis;
                return;
            }
            long jB = this.f10224u.b();
            long j7 = this.f10226w;
            if (jB > j7 || j7 - jB > millis) {
                s0(millis);
            }
        }
    }

    public final synchronized void r0(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.A;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.A.cancel(false);
            }
            this.f10225v = this.f10224u.b() + j6;
            this.A = this.f10223t.schedule(new cf(this), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s0(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.B;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.B.cancel(false);
            }
            this.f10226w = this.f10224u.b() + j6;
            this.B = this.f10223t.schedule(new x(this), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f10229z = false;
        r0(0L);
    }
}
