package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ih0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final nj0 f5759a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5760b;

    /* renamed from: c, reason: collision with root package name */
    public final pc0 f5761c;

    /* renamed from: d, reason: collision with root package name */
    public final nh0 f5762d;

    /* renamed from: e, reason: collision with root package name */
    public final nh0 f5763e;

    /* renamed from: f, reason: collision with root package name */
    public final qc0 f5764f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f5765g;
    public final w92 h;

    /* renamed from: i, reason: collision with root package name */
    public final pc0 f5766i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f5767j;

    public ih0(nj0 nj0Var, w92 w92Var, pc0 pc0Var, nh0 nh0Var, nh0 nh0Var2, qc0 qc0Var, to0 to0Var, w92 w92Var2, pc0 pc0Var2, w92 w92Var3) {
        this.f5759a = nj0Var;
        this.f5760b = w92Var;
        this.f5761c = pc0Var;
        this.f5762d = nh0Var;
        this.f5763e = nh0Var2;
        this.f5764f = qc0Var;
        this.f5765g = to0Var;
        this.h = w92Var2;
        this.f5766i = pc0Var2;
        this.f5767j = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hh0 zzb() {
        si0 si0VarA = this.f5759a.a();
        Context context = (Context) this.f5760b.zzb();
        ub1 ub1Var = ((lh0) this.f5761c.f8025b).f6733c;
        ih1.j(ub1Var);
        View view = this.f5762d.f7444b.f6732b;
        ih1.j(view);
        xa0 xa0Var = this.f5763e.f7444b.f6734d;
        ri0 ri0Var = ((lh0) this.f5764f.f8305b).f6731a;
        pp0 pp0Var = (pp0) ((to0) this.f5765g).f9355a.s;
        ih1.j(pp0Var);
        return new hh0(si0VarA, context, ub1Var, view, xa0Var, ri0Var, pp0Var, (pn0) this.h.zzb(), w92.a(new da2(this.f5766i)), (Executor) this.f5767j.zzb());
    }
}
