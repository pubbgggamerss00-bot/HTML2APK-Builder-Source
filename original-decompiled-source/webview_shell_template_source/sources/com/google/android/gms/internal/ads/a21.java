package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a21 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final wi0 f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final n21 f2552d;

    /* renamed from: e, reason: collision with root package name */
    public final af1 f2553e;

    /* renamed from: f, reason: collision with root package name */
    public final ps1 f2554f = new ps1();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2555g = new AtomicBoolean();
    public b21 h;

    /* renamed from: i, reason: collision with root package name */
    public ac1 f2556i;

    public a21(h70 h70Var, ScheduledExecutorService scheduledExecutorService, wi0 wi0Var, n21 n21Var, af1 af1Var) {
        this.f2549a = h70Var;
        this.f2550b = scheduledExecutorService;
        this.f2551c = wi0Var;
        this.f2552d = n21Var;
        this.f2553e = af1Var;
    }

    public final void a(tb1 tb1Var) {
        c5.a aVarL;
        synchronized (this) {
            Iterator it = tb1Var.f9171a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVarL = bs1.l(new gw0(3));
                    break;
                }
                yz0 yz0VarA = this.f2551c.a(tb1Var.f9173b, (String) it.next());
                if (yz0VarA != null && yz0VarA.a(this.f2556i, tb1Var)) {
                    aVarL = bs1.q(yz0VarA.b(this.f2556i, tb1Var), tb1Var.R, TimeUnit.MILLISECONDS, this.f2550b);
                    break;
                }
            }
        }
        this.f2552d.a(this.f2556i, tb1Var, aVarL, this.f2553e);
        aVarL.addListener(new as1(0, aVarL, new com.google.android.gms.ads.mediation.customevent.a(this, tb1Var, 6, false)), this.f2549a);
    }
}
