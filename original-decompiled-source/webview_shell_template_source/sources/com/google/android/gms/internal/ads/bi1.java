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
public final class bi1 implements b.a, b.InterfaceC0030b {

    /* renamed from: a, reason: collision with root package name */
    public final qi1 f3185a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3187c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f3188d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerThread f3189e;

    public bi1(Context context, String str, String str2) {
        this.f3186b = str;
        this.f3187c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f3189e = handlerThread;
        handlerThread.start();
        qi1 qi1Var = new qi1(context, handlerThread.getLooper(), this, this, 9200000);
        this.f3185a = qi1Var;
        this.f3188d = new LinkedBlockingQueue();
        qi1Var.checkAvailabilityAndConnect();
    }

    public static yd a() {
        kd kdVarB0 = yd.b0();
        kdVarB0.i();
        yd.M((yd) kdVarB0.f4126t, 32768L);
        return (yd) kdVarB0.g();
    }

    public final void b() {
        qi1 qi1Var = this.f3185a;
        if (qi1Var != null) {
            if (qi1Var.isConnected() || qi1Var.isConnecting()) {
                qi1Var.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) throws InterruptedException {
        try {
            this.f3188d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        vi1 vi1Var;
        LinkedBlockingQueue linkedBlockingQueue = this.f3188d;
        HandlerThread handlerThread = this.f3189e;
        try {
            vi1Var = (vi1) this.f3185a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            vi1Var = null;
        }
        if (vi1Var != null) {
            try {
                try {
                    ri1 ri1Var = new ri1(1, this.f3186b, this.f3187c);
                    Parcel parcelZza = vi1Var.zza();
                    th.c(parcelZza, ri1Var);
                    Parcel parcelZzcZ = vi1Var.zzcZ(1, parcelZza);
                    ti1 ti1Var = (ti1) th.a(parcelZzcZ, ti1.CREATOR);
                    parcelZzcZ.recycle();
                    if (ti1Var.f9296t == null) {
                        try {
                            byte[] bArr = ti1Var.f9297u;
                            u42 u42Var = u42.f9458b;
                            u62 u62Var = u62.f9474c;
                            ti1Var.f9296t = yd.w0(bArr, u42.f9459c);
                            ti1Var.f9297u = null;
                        } catch (u52 | NullPointerException e6) {
                            throw new IllegalStateException(e6);
                        }
                    }
                    ti1Var.l();
                    linkedBlockingQueue.put(ti1Var.f9296t);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(a());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                b();
                handlerThread.quit();
                throw th;
            }
            b();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) throws InterruptedException {
        try {
            this.f3188d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
