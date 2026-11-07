package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s21 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f8763a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8764b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f8765c;

    /* renamed from: d, reason: collision with root package name */
    public final w92 f8766d;

    /* renamed from: e, reason: collision with root package name */
    public final w92 f8767e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f8768f;

    /* renamed from: g, reason: collision with root package name */
    public final w92 f8769g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final w92 f8770i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f8771j;

    /* renamed from: k, reason: collision with root package name */
    public final ah0 f8772k;

    /* renamed from: l, reason: collision with root package name */
    public final ga2 f8773l;

    public s21(oc0 oc0Var, w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4, w92 w92Var5, w92 w92Var6, w92 w92Var7, w92 w92Var8, w92 w92Var9, ah0 ah0Var, w92 w92Var10) {
        this.f8763a = oc0Var;
        this.f8764b = w92Var;
        this.f8765c = w92Var2;
        this.f8766d = w92Var3;
        this.f8767e = w92Var4;
        this.f8768f = w92Var5;
        this.f8769g = w92Var6;
        this.h = w92Var7;
        this.f8770i = w92Var8;
        this.f8771j = w92Var9;
        this.f8772k = ah0Var;
        this.f8773l = w92Var10;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r21 zzb() {
        Context contextA = ((oc0) this.f8763a).a();
        ae1 ae1Var = (ae1) this.f8764b.zzb();
        n21 n21Var = (n21) this.f8765c.zzb();
        qk0 qk0Var = (qk0) this.f8766d.zzb();
        af1 af1Var = (af1) this.f8767e.zzb();
        cf1 cf1Var = (cf1) this.f8768f.zzb();
        wi0 wi0Var = (wi0) this.f8769g.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new r21(contextA, ae1Var, n21Var, qk0Var, af1Var, cf1Var, wi0Var, h70Var, (ScheduledExecutorService) this.h.zzb(), (e01) this.f8770i.zzb(), (he1) this.f8771j.zzb(), this.f8772k.a(), (zt0) this.f8773l.zzb());
    }
}
