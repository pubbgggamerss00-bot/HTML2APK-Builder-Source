package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jb extends Thread {
    public final BlockingQueue s;

    /* renamed from: t, reason: collision with root package name */
    public final ib f6007t;

    /* renamed from: u, reason: collision with root package name */
    public final ab f6008u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f6009v = false;

    /* renamed from: w, reason: collision with root package name */
    public final xj1 f6010w;

    public jb(PriorityBlockingQueue priorityBlockingQueue, cc ccVar, ic icVar, xj1 xj1Var) {
        this.s = priorityBlockingQueue;
        this.f6007t = ccVar;
        this.f6008u = icVar;
        this.f6010w = xj1Var;
    }

    public final void a() {
        xj1 xj1Var = this.f6010w;
        pb pbVar = (pb) this.s.take();
        SystemClock.elapsedRealtime();
        pbVar.zzt(3);
        Object obj = null;
        try {
            try {
                pbVar.zzm("network-queue-take");
                pbVar.zzw();
                TrafficStats.setThreadStatsTag(pbVar.zzc());
                lb lbVarZza = this.f6007t.zza(pbVar);
                pbVar.zzm("network-http-complete");
                if (lbVarZza.f6649e && pbVar.zzv()) {
                    pbVar.zzp("not-modified");
                    pbVar.zzr();
                } else {
                    ub ubVarZzh = pbVar.zzh(lbVarZza);
                    pbVar.zzm("network-parse-complete");
                    if (ubVarZzh.f9519b != null) {
                        ((ic) this.f6008u).c(pbVar.zzj(), ubVarZzh.f9519b);
                        pbVar.zzm("network-cache-written");
                    }
                    pbVar.zzq();
                    xj1Var.k(pbVar, ubVarZzh, null);
                    pbVar.zzs(ubVarZzh);
                }
            } catch (xb e6) {
                SystemClock.elapsedRealtime();
                xj1Var.getClass();
                pbVar.zzm("post-error");
                ((Handler) ((gb) xj1Var.f10619t).f4966t).post(new v(pbVar, new ub(e6), obj, 1));
                pbVar.zzr();
            } catch (Exception e7) {
                Log.e("Volley", ac.d("Unhandled exception %s", e7.toString()), e7);
                xb xbVar = new xb(e7);
                SystemClock.elapsedRealtime();
                xj1Var.getClass();
                pbVar.zzm("post-error");
                ((Handler) ((gb) xj1Var.f10619t).f4966t).post(new v(pbVar, new ub(xbVar), obj, 1));
                pbVar.zzr();
            }
            pbVar.zzt(4);
        } catch (Throwable th) {
            pbVar.zzt(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f6009v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ac.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
