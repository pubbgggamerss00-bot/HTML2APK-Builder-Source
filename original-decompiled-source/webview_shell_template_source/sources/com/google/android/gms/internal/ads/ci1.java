package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ci1 implements b.a, b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final qi1 f3588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3590c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f3591d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerThread f3592e;

    /* renamed from: f, reason: collision with root package name */
    public final xh1 f3593f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3594g;
    public final int h;

    public ci1(Context context, int i6, String str, String str2, xh1 xh1Var) {
        this.f3589b = str;
        this.h = i6;
        this.f3590c = str2;
        this.f3593f = xh1Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f3592e = handlerThread;
        handlerThread.start();
        this.f3594g = System.currentTimeMillis();
        qi1 qi1Var = new qi1(context, handlerThread.getLooper(), this, this, 19621000);
        this.f3588a = qi1Var;
        this.f3591d = new LinkedBlockingQueue();
        qi1Var.checkAvailabilityAndConnect();
    }

    public final void a() {
        qi1 qi1Var = this.f3588a;
        if (qi1Var != null) {
            if (qi1Var.isConnected() || qi1Var.isConnecting()) {
                qi1Var.disconnect();
            }
        }
    }

    public final void b(int i6, long j6, Exception exc) {
        this.f3593f.b(i6, System.currentTimeMillis() - j6, exc);
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) throws InterruptedException {
        try {
            b(4011, this.f3594g, null);
            this.f3591d.put(new bj1());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        vi1 vi1Var;
        long j6 = this.f3594g;
        HandlerThread handlerThread = this.f3592e;
        try {
            vi1Var = (vi1) this.f3588a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            vi1Var = null;
        }
        if (vi1Var != null) {
            try {
                yi1 yi1Var = new yi1(1, 1, this.h - 1, this.f3589b, this.f3590c);
                Parcel parcelZza = vi1Var.zza();
                th.c(parcelZza, yi1Var);
                Parcel parcelZzcZ = vi1Var.zzcZ(3, parcelZza);
                bj1 bj1Var = (bj1) th.a(parcelZzcZ, bj1.CREATOR);
                parcelZzcZ.recycle();
                b(5011, j6, null);
                this.f3591d.put(bj1Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) throws InterruptedException {
        try {
            b(4012, this.f3594g, null);
            this.f3591d.put(new bj1());
        } catch (InterruptedException unused) {
        }
    }
}
