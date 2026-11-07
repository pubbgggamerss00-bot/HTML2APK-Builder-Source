package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class pk2 extends Handler implements Runnable {
    public final bi2 s;

    /* renamed from: t, reason: collision with root package name */
    public ei2 f8099t;

    /* renamed from: u, reason: collision with root package name */
    public IOException f8100u;

    /* renamed from: v, reason: collision with root package name */
    public int f8101v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f8102w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8103x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f8104y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ sk2 f8105z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk2(sk2 sk2Var, Looper looper, bi2 bi2Var, ei2 ei2Var, long j6) {
        super(looper);
        this.f8105z = sk2Var;
        this.s = bi2Var;
        this.f8099t = ei2Var;
    }

    public final void a(boolean z6) {
        this.f8104y = z6;
        this.f8100u = null;
        if (hasMessages(1)) {
            this.f8103x = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f8103x = true;
                    this.s.f3196g = true;
                    Thread thread = this.f8102w;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z6) {
            this.f8105z.f8975b = null;
            SystemClock.elapsedRealtime();
            ei2 ei2Var = this.f8099t;
            ei2Var.getClass();
            ei2Var.k(this.s, true);
            this.f8099t = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        ok2 ok2Var;
        m1 m1Var;
        if (this.f8104y) {
            return;
        }
        int i6 = message.what;
        if (i6 == 1) {
            SystemClock.elapsedRealtime();
            this.f8099t.getClass();
            this.f8100u = null;
            sk2 sk2Var = this.f8105z;
            xk2 xk2Var = sk2Var.f8974a;
            pk2 pk2Var = sk2Var.f8975b;
            pk2Var.getClass();
            xk2Var.execute(pk2Var);
            return;
        }
        if (i6 == 4) {
            throw ((Error) message.obj);
        }
        this.f8105z.f8975b = null;
        SystemClock.elapsedRealtime();
        ei2 ei2Var = this.f8099t;
        ei2Var.getClass();
        if (this.f8103x) {
            ei2Var.k(this.s, false);
            return;
        }
        int i7 = message.what;
        if (i7 == 2) {
            try {
                ei2Var.l(this.s);
                return;
            } catch (RuntimeException e6) {
                qs0.d("LoadTask", "Unexpected exception handling load completed", e6);
                this.f8105z.f8976c = new rk2(e6);
                return;
            }
        }
        if (i7 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f8100u = iOException;
        int i8 = this.f8101v;
        this.f8101v = i8 + 1;
        bi2 bi2Var = this.s;
        Uri uri = bi2Var.f3191b.f8791b;
        fh2 fh2Var = new fh2();
        int i9 = j31.f5914a;
        if ((iOException instanceof rn) || (iOException instanceof FileNotFoundException) || (iOException instanceof dz1) || (iOException instanceof rk2)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof dp1) && ((dp1) cause).s == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i8 * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 5000);
        if (jMin == -9223372036854775807L) {
            ok2Var = sk2.f8973e;
        } else {
            int iM = ei2Var.m();
            int i10 = iM > ei2Var.f4307b0 ? 1 : 0;
            if (ei2Var.X || !((m1Var = ei2Var.P) == null || m1Var.zza() == -9223372036854775807L)) {
                ei2Var.f4307b0 = iM;
            } else {
                boolean z6 = ei2Var.L;
                if (!z6 || ei2Var.v()) {
                    ei2Var.U = z6;
                    ei2Var.Y = 0L;
                    ei2Var.f4307b0 = 0;
                    for (li2 li2Var : ei2Var.I) {
                        li2Var.m(false);
                    }
                    bi2Var.f3195f.f2886a = 0L;
                    bi2Var.f3197i = 0L;
                    bi2Var.h = true;
                    bi2Var.f3200l = false;
                } else {
                    ei2Var.f4306a0 = true;
                    ok2Var = sk2.f8972d;
                }
            }
            ok2Var = new ok2(i10, jMin);
        }
        int i11 = ok2Var.f7805a;
        boolean z7 = i11 == 0 || i11 == 1;
        sh2 sh2Var = ei2Var.f4313v;
        sh2Var.a(new py0(sh2Var, fh2Var, new lh2(-1, null, j31.v(bi2Var.f3197i), j31.v(ei2Var.Q)), iOException, !z7));
        int i12 = ok2Var.f7805a;
        if (i12 == 3) {
            this.f8105z.f8976c = this.f8100u;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f8101v = 1;
            }
            long jMin2 = ok2Var.f7806b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f8101v - 1) * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 5000);
            }
            sk2 sk2Var2 = this.f8105z;
            y5.r(sk2Var2.f8975b == null);
            sk2Var2.f8975b = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
                return;
            }
            SystemClock.elapsedRealtime();
            this.f8099t.getClass();
            this.f8100u = null;
            xk2 xk2Var2 = sk2Var2.f8974a;
            pk2 pk2Var2 = sk2Var2.f8975b;
            pk2Var2.getClass();
            xk2Var2.execute(pk2Var2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            synchronized (this) {
                z6 = this.f8103x;
                this.f8102w = Thread.currentThread();
            }
            if (!z6) {
                Trace.beginSection("load:".concat(this.s.getClass().getSimpleName()));
                try {
                    this.s.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f8102w = null;
                Thread.interrupted();
            }
            if (this.f8104y) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e6) {
            if (this.f8104y) {
                return;
            }
            obtainMessage(3, e6).sendToTarget();
        } catch (Exception e7) {
            if (this.f8104y) {
                return;
            }
            qs0.d("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new rk2(e7)).sendToTarget();
        } catch (OutOfMemoryError e8) {
            if (this.f8104y) {
                return;
            }
            qs0.d("LoadTask", "OutOfMemory error loading stream", e8);
            obtainMessage(3, new rk2(e8)).sendToTarget();
        } catch (Error e9) {
            if (!this.f8104y) {
                qs0.d("LoadTask", "Unexpected error loading stream", e9);
                obtainMessage(4, e9).sendToTarget();
            }
            throw e9;
        }
    }
}
