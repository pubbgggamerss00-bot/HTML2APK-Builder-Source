package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tg0 implements li {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f9269a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.a f9270b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f9271c;

    /* renamed from: d, reason: collision with root package name */
    public long f9272d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f9273e = -1;

    /* renamed from: f, reason: collision with root package name */
    public p f9274f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9275g = false;

    public tg0(ScheduledExecutorService scheduledExecutorService, i3.a aVar) {
        this.f9269a = scheduledExecutorService;
        this.f9270b = aVar;
        zzv.zzb().b(this);
    }

    @Override // com.google.android.gms.internal.ads.li
    public final void zza(boolean z6) {
        ScheduledFuture scheduledFuture;
        if (z6) {
            synchronized (this) {
                try {
                    if (this.f9275g) {
                        if (this.f9273e > 0 && (scheduledFuture = this.f9271c) != null && scheduledFuture.isCancelled()) {
                            this.f9271c = this.f9269a.schedule(this.f9274f, this.f9273e, TimeUnit.MILLISECONDS);
                        }
                        this.f9275g = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f9275g) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f9271c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f9273e = -1L;
                } else {
                    this.f9271c.cancel(true);
                    this.f9273e = this.f9272d - this.f9270b.b();
                }
                this.f9275g = true;
            } finally {
            }
        }
    }
}
