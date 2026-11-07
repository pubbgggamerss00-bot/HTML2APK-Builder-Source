package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qo0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8424a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8425b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8426c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f8427d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f8428e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f8429f;

    public /* synthetic */ qo0(x92 x92Var, ca2 ca2Var, ca2 ca2Var2, w92 w92Var, ca2 ca2Var3, int i6) {
        this.f8424a = i6;
        this.f8426c = x92Var;
        this.f8427d = ca2Var;
        this.f8428e = ca2Var2;
        this.f8425b = w92Var;
        this.f8429f = ca2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8424a) {
            case 0:
                Map mapZzb = ((z92) this.f8426c).zzb();
                Map mapZzb2 = ((z92) this.f8427d).zzb();
                Map mapZzb3 = ((z92) this.f8428e).zzb();
                pp0 pp0Var = (pp0) ((to0) this.f8429f).f9355a.s;
                ih1.j(pp0Var);
                return new po0(mapZzb, mapZzb2, mapZzb3, this.f8425b, pp0Var);
            case 1:
                uo0 uo0Var = (uo0) ((y92) this.f8426c).f10908a;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                th0 th0Var = (th0) this.f8427d;
                ih1.j(h70Var);
                return new u11(uo0Var, h70Var, new wq0(h70Var, ((hr0) th0Var.f9284c).zzb(), new kr0(h70Var, ((hr0) ((rc0) th0Var.f9283b).f8608b).zzb())), (sc1) this.f8428e.zzb(), (ms0) this.f8425b.zzb(), (zt0) this.f8429f.zzb());
            case 2:
                return new f21((hc0) this.f8426c.zzb(), ((jk0) ((qi0) this.f8427d).f8393b).a(), ((tm0) this.f8428e).f9347b, (n21) this.f8425b.zzb(), (e01) ((w92) this.f8429f).zzb());
            default:
                return new fb1((Context) ((y92) this.f8426c).f10908a, (Executor) this.f8427d.zzb(), (hc0) this.f8428e.zzb(), (j41) this.f8425b.zzb(), (hb1) ((w92) this.f8429f).zzb(), new dc1());
        }
    }
}
