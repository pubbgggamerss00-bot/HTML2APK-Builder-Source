package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r01 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final wh0 f8495a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8496b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0 f8497c;

    /* renamed from: d, reason: collision with root package name */
    public final ec1 f8498d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f8499e;

    /* renamed from: f, reason: collision with root package name */
    public final pl1 f8500f;

    /* renamed from: g, reason: collision with root package name */
    public final zt0 f8501g;

    public r01(wh0 wh0Var, Context context, Executor executor, ct0 ct0Var, ec1 ec1Var, pl1 pl1Var, zt0 zt0Var) {
        this.f8496b = context;
        this.f8495a = wh0Var;
        this.f8499e = executor;
        this.f8497c = ct0Var;
        this.f8498d = ec1Var;
        this.f8500f = pl1Var;
        this.f8501g = zt0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var = tb1Var.s;
        return (xb1Var == null || xb1Var.f10472a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        return bs1.p(ds1.f4001t, new q01(this, ac1Var, tb1Var, 0), this.f8499e);
    }
}
