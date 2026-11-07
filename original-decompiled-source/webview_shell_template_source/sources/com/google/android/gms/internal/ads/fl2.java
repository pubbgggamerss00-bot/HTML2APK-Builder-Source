package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fl2 extends HandlerThread implements Handler.Callback {
    public fn0 s;

    /* renamed from: t, reason: collision with root package name */
    public Handler f4720t;

    /* renamed from: u, reason: collision with root package name */
    public Error f4721u;

    /* renamed from: v, reason: collision with root package name */
    public RuntimeException f4722v;

    /* renamed from: w, reason: collision with root package name */
    public gl2 f4723w;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        fn0 fn0Var;
        int i6 = message.what;
        try {
            if (i6 == 1) {
                try {
                    int i7 = message.arg1;
                    fn0 fn0Var2 = this.s;
                    if (fn0Var2 == null) {
                        throw null;
                    }
                    fn0Var2.a(i7);
                    SurfaceTexture surfaceTexture = this.s.f4732x;
                    surfaceTexture.getClass();
                    this.f4723w = new gl2(this, surfaceTexture, i7 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (rn0 e6) {
                    qs0.d("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f4722v = new IllegalStateException(e6);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    qs0.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f4721u = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e8) {
                    qs0.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f4722v = e8;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i6 == 2) {
                try {
                    fn0Var = this.s;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (fn0Var == null) {
                    throw null;
                }
                fn0Var.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
