package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c01 implements xo0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f3350b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3351a;

    public c01(Handler handler) {
        this.f3351a = handler;
    }

    public static /* bridge */ /* synthetic */ void a(yy0 yy0Var) {
        ArrayList arrayList = f3350b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(yy0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static yy0 i() {
        yy0 yy0Var;
        ArrayList arrayList = f3350b;
        synchronized (arrayList) {
            try {
                yy0Var = arrayList.isEmpty() ? new yy0() : (yy0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yy0Var;
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final void b(int i6) {
        this.f3351a.removeMessages(i6);
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final boolean c(long j6) {
        return this.f3351a.sendEmptyMessageAtTime(2, j6);
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final yy0 d(int i6, Object obj) {
        yy0 yy0VarI = i();
        yy0VarI.f11120a = this.f3351a.obtainMessage(i6, obj);
        return yy0VarI;
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final boolean e(Runnable runnable) {
        return this.f3351a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final boolean f(yy0 yy0Var) {
        Message message = yy0Var.f11120a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f3351a.sendMessageAtFrontOfQueue(message);
        yy0Var.f11120a = null;
        a(yy0Var);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final yy0 g(int i6, int i7) {
        yy0 yy0VarI = i();
        yy0VarI.f11120a = this.f3351a.obtainMessage(1, i6, i7);
        return yy0VarI;
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final boolean h(int i6) {
        return this.f3351a.sendEmptyMessage(i6);
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final Looper zza() {
        return this.f3351a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final yy0 zzb(int i6) {
        yy0 yy0VarI = i();
        yy0VarI.f11120a = this.f3351a.obtainMessage(i6);
        return yy0VarI;
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final void zze() {
        this.f3351a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public final boolean zzg() {
        return this.f3351a.hasMessages(1);
    }
}
