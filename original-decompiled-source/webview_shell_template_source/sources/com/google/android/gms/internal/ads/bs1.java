package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bs1 extends fo {
    public static pq1 j(c5.a aVar, Class cls, pl1 pl1Var, Executor executor) {
        pq1 pq1Var = new pq1(aVar, cls, pl1Var);
        aVar.addListener(pq1Var, sj1.l(executor, pq1Var));
        return pq1Var;
    }

    public static oq1 k(c5.a aVar, Class cls, pr1 pr1Var, Executor executor) {
        oq1 oq1Var = new oq1(aVar, cls, pr1Var);
        aVar.addListener(oq1Var, sj1.l(executor, oq1Var));
        return oq1Var;
    }

    public static cs1 l(Throwable th) {
        th.getClass();
        cs1 cs1Var = new cs1();
        cs1Var.f(th);
        return cs1Var;
    }

    public static ds1 m(Object obj) {
        return obj == null ? ds1.f4001t : new ds1(obj);
    }

    public static vs1 n(or1 or1Var, Executor executor) {
        vs1 vs1Var = new vs1();
        vs1Var.f9931z = new ts1(vs1Var, or1Var);
        executor.execute(vs1Var);
        return vs1Var;
    }

    public static hr1 o(c5.a aVar, pl1 pl1Var, Executor executor) {
        hr1 hr1Var = new hr1(aVar, pl1Var);
        aVar.addListener(hr1Var, sj1.l(executor, hr1Var));
        return hr1Var;
    }

    public static gr1 p(c5.a aVar, pr1 pr1Var, Executor executor) {
        int i6 = ir1.B;
        executor.getClass();
        gr1 gr1Var = new gr1(aVar, pr1Var);
        aVar.addListener(gr1Var, sj1.l(executor, gr1Var));
        return gr1Var;
    }

    public static c5.a q(c5.a aVar, long j6, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        ss1 ss1Var = new ss1();
        ss1Var.f9002z = aVar;
        qs1 qs1Var = new qs1();
        qs1Var.s = ss1Var;
        ss1Var.A = scheduledExecutorService.schedule(qs1Var, j6, timeUnit);
        aVar.addListener(qs1Var, ur1.s);
        return ss1Var;
    }

    public static Object r(Future future) {
        if (future.isDone()) {
            return aa1.e(future);
        }
        throw new IllegalStateException(dm1.a("Future was expected to be done: %s", future));
    }

    public static Object s(o70 o70Var) {
        try {
            return aa1.e(o70Var);
        } catch (ExecutionException e6) {
            if (e6.getCause() instanceof Error) {
                throw new vr1((Error) e6.getCause());
            }
            throw new ws1(e6.getCause());
        }
    }

    public static void t(c5.a aVar, zr1 zr1Var, Executor executor) {
        aVar.addListener(new as1(0, aVar, zr1Var), executor);
    }
}
