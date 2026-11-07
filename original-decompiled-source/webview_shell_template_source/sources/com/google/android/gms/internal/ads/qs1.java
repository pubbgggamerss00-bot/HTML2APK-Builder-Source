package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qs1 implements Runnable {
    public ss1 s;

    @Override // java.lang.Runnable
    public final void run() {
        c5.a aVar;
        ss1 ss1Var = this.s;
        if (ss1Var == null || (aVar = ss1Var.f9002z) == null) {
            return;
        }
        this.s = null;
        if (aVar.isDone()) {
            ss1Var.j(aVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ss1Var.A;
            ss1Var.A = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    ss1Var.f(new rs1(str));
                    throw th;
                }
            }
            ss1Var.f(new rs1(str + ": " + aVar.toString()));
        } finally {
            aVar.cancel(true);
        }
    }
}
