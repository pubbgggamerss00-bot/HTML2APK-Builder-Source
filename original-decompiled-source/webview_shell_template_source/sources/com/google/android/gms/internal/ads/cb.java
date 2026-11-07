package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cb extends Thread {

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f3502y = ac.f2645a;
    public final BlockingQueue s;

    /* renamed from: t, reason: collision with root package name */
    public final BlockingQueue f3503t;

    /* renamed from: u, reason: collision with root package name */
    public final ab f3504u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f3505v = false;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.fragment.app.f0 f3506w;

    /* renamed from: x, reason: collision with root package name */
    public final xj1 f3507x;

    public cb(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, ic icVar, xj1 xj1Var) {
        this.s = priorityBlockingQueue;
        this.f3503t = priorityBlockingQueue2;
        this.f3504u = icVar;
        this.f3507x = xj1Var;
        this.f3506w = new androidx.fragment.app.f0(this, priorityBlockingQueue2, xj1Var);
    }

    public final void a() {
        pb pbVar = (pb) this.s.take();
        pbVar.zzm("cache-queue-take");
        pbVar.zzt(1);
        try {
            pbVar.zzw();
            za zaVarA = ((ic) this.f3504u).a(pbVar.zzj());
            if (zaVarA == null) {
                pbVar.zzm("cache-miss");
                if (!this.f3506w.m(pbVar)) {
                    this.f3503t.put(pbVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zaVarA.f11237e < jCurrentTimeMillis) {
                    pbVar.zzm("cache-hit-expired");
                    pbVar.zze(zaVarA);
                    if (!this.f3506w.m(pbVar)) {
                        this.f3503t.put(pbVar);
                    }
                } else {
                    pbVar.zzm("cache-hit");
                    byte[] bArr = zaVarA.f11233a;
                    Map map = zaVarA.f11239g;
                    ub ubVarZzh = pbVar.zzh(new lb(200, bArr, map, lb.a(map), false));
                    pbVar.zzm("cache-hit-parsed");
                    if (!(ubVarZzh.f9520c == null)) {
                        pbVar.zzm("cache-parsing-failed");
                        ab abVar = this.f3504u;
                        String strZzj = pbVar.zzj();
                        ic icVar = (ic) abVar;
                        synchronized (icVar) {
                            za zaVarA2 = icVar.a(strZzj);
                            if (zaVarA2 != null) {
                                zaVarA2.f11238f = 0L;
                                zaVarA2.f11237e = 0L;
                                icVar.c(strZzj, zaVarA2);
                            }
                        }
                        pbVar.zze(null);
                        if (!this.f3506w.m(pbVar)) {
                            this.f3503t.put(pbVar);
                        }
                    } else if (zaVarA.f11238f < jCurrentTimeMillis) {
                        pbVar.zzm("cache-hit-refresh-needed");
                        pbVar.zze(zaVarA);
                        ubVarZzh.f9521d = true;
                        if (this.f3506w.m(pbVar)) {
                            this.f3507x.k(pbVar, ubVarZzh, null);
                        } else {
                            this.f3507x.k(pbVar, ubVarZzh, new bb(0, this, pbVar));
                        }
                    } else {
                        this.f3507x.k(pbVar, ubVarZzh, null);
                    }
                }
            }
            pbVar.zzt(2);
        } catch (Throwable th) {
            pbVar.zzt(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f3502y) {
            ac.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((ic) this.f3504u).b();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f3505v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ac.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
