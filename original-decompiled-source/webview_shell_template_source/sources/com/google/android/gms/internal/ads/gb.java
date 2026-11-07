package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gb implements Executor {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4966t;

    public /* synthetic */ gb(int i6, Object obj) {
        this.s = i6;
        this.f4966t = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.s) {
            case 0:
                ((Handler) this.f4966t).post(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((zzf) this.f4966t).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zzv.zzq();
                    zzs.zzN(zzv.zzp().f2950e, th);
                    throw th;
                }
            default:
                ((xo0) this.f4966t).e(runnable);
                return;
        }
    }

    public gb() {
        this.s = 1;
        this.f4966t = new zzf(Looper.getMainLooper());
    }
}
