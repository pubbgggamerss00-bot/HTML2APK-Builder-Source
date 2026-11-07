package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gp0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final nj0 f5101a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5102b;

    /* renamed from: c, reason: collision with root package name */
    public final qc0 f5103c;

    /* renamed from: d, reason: collision with root package name */
    public final x92 f5104d;

    /* renamed from: e, reason: collision with root package name */
    public final vp0 f5105e;

    /* renamed from: f, reason: collision with root package name */
    public final ca2 f5106f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f5107g;
    public final w92 h;

    /* renamed from: i, reason: collision with root package name */
    public final w92 f5108i;

    /* renamed from: j, reason: collision with root package name */
    public final w92 f5109j;

    /* renamed from: k, reason: collision with root package name */
    public final w92 f5110k;

    /* renamed from: l, reason: collision with root package name */
    public final w92 f5111l;

    /* renamed from: m, reason: collision with root package name */
    public final qp0 f5112m;

    /* renamed from: n, reason: collision with root package name */
    public final ga2 f5113n;

    /* renamed from: o, reason: collision with root package name */
    public final ga2 f5114o;

    /* renamed from: p, reason: collision with root package name */
    public final ga2 f5115p;

    /* renamed from: q, reason: collision with root package name */
    public final w92 f5116q;

    /* renamed from: r, reason: collision with root package name */
    public final w92 f5117r;
    public final ga2 s;

    public gp0(nj0 nj0Var, w92 w92Var, qc0 qc0Var, x92 x92Var, vp0 vp0Var, ca2 ca2Var, to0 to0Var, w92 w92Var2, w92 w92Var3, w92 w92Var4, w92 w92Var5, w92 w92Var6, qp0 qp0Var, w92 w92Var7, bd0 bd0Var, oc0 oc0Var, w92 w92Var8, w92 w92Var9, w92 w92Var10) {
        this.f5101a = nj0Var;
        this.f5102b = w92Var;
        this.f5103c = qc0Var;
        this.f5104d = x92Var;
        this.f5105e = vp0Var;
        this.f5106f = ca2Var;
        this.f5107g = to0Var;
        this.h = w92Var2;
        this.f5108i = w92Var3;
        this.f5109j = w92Var4;
        this.f5110k = w92Var5;
        this.f5111l = w92Var6;
        this.f5112m = qp0Var;
        this.f5113n = w92Var7;
        this.f5114o = bd0Var;
        this.f5115p = oc0Var;
        this.f5116q = w92Var8;
        this.f5117r = w92Var9;
        this.s = w92Var10;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        si0 si0VarA = this.f5101a.a();
        Executor executor = (Executor) this.f5102b.zzb();
        jp0 jp0VarA = this.f5103c.a();
        np0 np0Var = (np0) this.f5104d.zzb();
        up0 up0VarA = this.f5105e.a();
        mp0 mp0Var = (mp0) this.f5106f.zzb();
        pp0 pp0Var = (pp0) ((to0) this.f5107g).f9355a.s;
        ih1.j(pp0Var);
        u92 u92VarA = w92.a(new da2(this.h));
        u92 u92VarA2 = w92.a(new da2(this.f5108i));
        u92 u92VarA3 = w92.a(new da2(this.f5109j));
        u92 u92VarA4 = w92.a(new da2(this.f5110k));
        u92 u92VarA5 = w92.a(new da2(this.f5111l));
        qp0 qp0Var = this.f5112m;
        z50 z50Var = new z50(((oc0) qp0Var.f8439b).a(), ((lk0) qp0Var.f8440c).a().f4211f);
        mf mfVar = (mf) this.f5113n.zzb();
        VersionInfoParcel versionInfoParcelA = ((bd0) this.f5114o).a();
        Context contextA = ((oc0) this.f5115p).a();
        hp0 hp0Var = (hp0) this.f5116q.zzb();
        k41 k41Var = (k41) this.f5117r.zzb();
        return new fp0(si0VarA, executor, jp0VarA, np0Var, up0VarA, mp0Var, pp0Var, u92VarA, u92VarA2, u92VarA3, u92VarA4, u92VarA5, z50Var, mfVar, versionInfoParcelA, contextA, hp0Var, k41Var);
    }
}
