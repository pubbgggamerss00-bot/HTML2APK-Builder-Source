package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jq0 implements al0 {
    public final jp0 s;

    /* renamed from: t, reason: collision with root package name */
    public final lp0 f6151t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f6152u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f6153v;

    public jq0(jp0 jp0Var, lp0 lp0Var, Executor executor, h70 h70Var) {
        this.s = jp0Var;
        this.f6151t = lp0Var;
        this.f6152u = executor;
        this.f6153v = h70Var;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        c5.a aVar;
        c5.a aVar2;
        o70 o70Var;
        jp0 jp0Var = this.s;
        if (this.f6151t.f6818e) {
            vz0 vz0VarO = jp0Var.o();
            if (vz0VarO == null) {
                synchronized (jp0Var) {
                    aVar = jp0Var.f6134m;
                }
                if (aVar != null && ((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue()) {
                    synchronized (jp0Var) {
                        aVar2 = jp0Var.f6134m;
                    }
                    synchronized (jp0Var) {
                        o70Var = jp0Var.f6135n;
                    }
                    if (aVar2 == null || o70Var == null) {
                        return;
                    }
                    qr1 qr1Var = new qr1(bo1.m(new c5.a[]{aVar2, o70Var}), false);
                    qr1Var.addListener(new as1(0, qr1Var, new xj1(11, this)), this.f6153v);
                    return;
                }
            }
            if (vz0VarO != null) {
                xa0 xa0VarL = jp0Var.l();
                xa0 xa0VarM = jp0Var.m();
                if (xa0VarL == null) {
                    xa0VarL = xa0VarM != null ? xa0VarM : null;
                }
                if (xa0VarL != null) {
                    this.f6152u.execute(new iq0(xa0VarL, 0));
                }
            }
        }
    }
}
