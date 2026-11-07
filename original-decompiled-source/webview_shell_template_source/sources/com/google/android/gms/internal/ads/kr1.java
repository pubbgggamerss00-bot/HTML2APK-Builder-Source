package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class kr1 extends nr1 {
    public static final gs1 G = new gs1(kr1.class);
    public wn1 D;
    public final boolean E;
    public final boolean F;

    public kr1(wn1 wn1Var, boolean z6, boolean z7) {
        int size = wn1Var.size();
        this.f7492z = null;
        this.A = size;
        this.D = wn1Var;
        this.E = z6;
        this.F = z7;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        wn1 wn1Var = this.D;
        return wn1Var != null ? "futures=".concat(wn1Var.toString()) : super.c();
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        wn1 wn1Var = this.D;
        v(1);
        if ((wn1Var != null) && (this.s instanceof sq1)) {
            boolean zK = k();
            up1 it = wn1Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zK);
            }
        }
    }

    public final void p(wn1 wn1Var) {
        int iA = nr1.B.a(this);
        int i6 = 0;
        sl1.h("Less than 0 remaining futures", iA >= 0);
        if (iA == 0) {
            if (wn1Var != null) {
                up1 it = wn1Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            s(i6, aa1.e(future));
                        } catch (ExecutionException e6) {
                            q(e6.getCause());
                        } catch (Throwable th) {
                            q(th);
                        }
                    }
                    i6++;
                }
            }
            this.f7492z = null;
            t();
            v(2);
        }
    }

    public final void q(Throwable th) {
        th.getClass();
        if (this.E && !f(th)) {
            Set<Throwable> set = this.f7492z;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.s instanceof sq1)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                nr1.B.l(this, setNewSetFromMap);
                set = this.f7492z;
                Objects.requireNonNull(set);
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            G.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z6 = th instanceof Error;
        if (z6) {
            G.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z6 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void r(int i6, c5.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.D = null;
                cancel(false);
            } else {
                try {
                    s(i6, aa1.e(aVar));
                } catch (ExecutionException e6) {
                    q(e6.getCause());
                } catch (Throwable th) {
                    q(th);
                }
            }
        } finally {
            p(null);
        }
    }

    public abstract void s(int i6, Object obj);

    public abstract void t();

    public final void u() {
        Objects.requireNonNull(this.D);
        if (this.D.isEmpty()) {
            t();
            return;
        }
        boolean z6 = this.E;
        ur1 ur1Var = ur1.s;
        if (!z6) {
            wn1 wn1Var = this.F ? this.D : null;
            bb bbVar = new bb(this, wn1Var, 10, false);
            up1 it = this.D.iterator();
            while (it.hasNext()) {
                c5.a aVar = (c5.a) it.next();
                if (aVar.isDone()) {
                    p(wn1Var);
                } else {
                    aVar.addListener(bbVar, ur1Var);
                }
            }
            return;
        }
        up1 it2 = this.D.iterator();
        final int i6 = 0;
        while (it2.hasNext()) {
            final c5.a aVar2 = (c5.a) it2.next();
            int i7 = i6 + 1;
            if (aVar2.isDone()) {
                r(i6, aVar2);
            } else {
                aVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.jr1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.s.r(i6, aVar2);
                    }
                }, ur1Var);
            }
            i6 = i7;
        }
    }

    public void v(int i6) {
        this.D = null;
    }
}
