package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zg2 extends sg2 {
    public final HashMap h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f11290i;

    /* renamed from: j, reason: collision with root package name */
    public o52 f11291j;

    @Override // com.google.android.gms.internal.ads.sg2
    public final void m() {
        for (yg2 yg2Var : this.h.values()) {
            yg2Var.f10977a.d(yg2Var.f10978b);
        }
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void n() {
        for (yg2 yg2Var : this.h.values()) {
            yg2Var.f10977a.i(yg2Var.f10978b);
        }
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public void q() {
        HashMap map = this.h;
        for (yg2 yg2Var : map.values()) {
            qh2 qh2Var = yg2Var.f10977a;
            xg2 xg2Var = yg2Var.f10979c;
            qh2Var.a(yg2Var.f10978b);
            qh2Var.h(xg2Var);
            qh2Var.k(xg2Var);
        }
        map.clear();
    }

    public abstract void r(Object obj, sg2 sg2Var, zy zyVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.ph2, com.google.android.gms.internal.ads.wg2] */
    public final void s(final Integer num, qh2 qh2Var) {
        HashMap map = this.h;
        y5.n(!map.containsKey(num));
        ?? r12 = new ph2() { // from class: com.google.android.gms.internal.ads.wg2
            @Override // com.google.android.gms.internal.ads.ph2
            public final void a(sg2 sg2Var, zy zyVar) {
                this.f10197a.r(num, sg2Var, zyVar);
            }
        };
        xg2 xg2Var = new xg2(this, num);
        map.put(num, new yg2(qh2Var, r12, xg2Var));
        Handler handler = this.f11290i;
        handler.getClass();
        qh2Var.l(handler, xg2Var);
        Handler handler2 = this.f11290i;
        handler2.getClass();
        qh2Var.j(handler2, xg2Var);
        o52 o52Var = this.f11291j;
        hd2 hd2Var = this.f8934g;
        y5.k(hd2Var);
        qh2Var.f(r12, o52Var, hd2Var);
        if (this.f8929b.isEmpty()) {
            qh2Var.d(r12);
        }
    }

    public abstract oh2 v(Object obj, oh2 oh2Var);

    public void t(Object obj) {
    }

    public void u(long j6, Object obj) {
    }
}
