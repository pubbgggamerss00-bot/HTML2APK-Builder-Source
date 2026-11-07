package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hi1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5417b;

    /* renamed from: c, reason: collision with root package name */
    public final xh1 f5418c;

    /* renamed from: d, reason: collision with root package name */
    public v3.p f5419d;

    /* renamed from: e, reason: collision with root package name */
    public v3.p f5420e;

    public hi1(Context context, Executor executor, xh1 xh1Var, ai1 ai1Var, fi1 fi1Var, gi1 gi1Var) {
        this.f5416a = context;
        this.f5417b = executor;
        this.f5418c = xh1Var;
    }

    public static hi1 a(Context context, Executor executor, xh1 xh1Var, ai1 ai1Var) {
        hi1 hi1Var = new hi1(context, executor, xh1Var, ai1Var, new fi1(), new gi1());
        if (ai1Var.f2780b) {
            hi1Var.f5419d = hi1Var.b(new e61(4, hi1Var));
        } else {
            yd ydVar = fi1.f4692a;
            v3.p pVar = new v3.p();
            pVar.j(ydVar);
            hi1Var.f5419d = pVar;
        }
        hi1Var.f5420e = hi1Var.b(new of(3, hi1Var));
        return hi1Var;
    }

    public final v3.p b(Callable callable) {
        Executor executor = this.f5417b;
        com.google.android.gms.common.internal.l.g("Executor must not be null", executor);
        v3.p pVar = new v3.p();
        executor.execute(new o30(7, pVar, callable));
        pVar.b(executor, new v31(16, this));
        return pVar;
    }
}
