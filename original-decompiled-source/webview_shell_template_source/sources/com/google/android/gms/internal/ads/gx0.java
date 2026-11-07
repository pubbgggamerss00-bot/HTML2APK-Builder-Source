package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gx0 implements hx0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5182a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f5183b;

    /* renamed from: c, reason: collision with root package name */
    public final xl0 f5184c;

    public gx0(Map map, hs1 hs1Var, xl0 xl0Var) {
        this.f5182a = map;
        this.f5183b = hs1Var;
        this.f5184c = xl0Var;
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final c5.a a(r30 r30Var) {
        this.f5184c.k(r30Var);
        cr1 cr1VarL = bs1.l(new gw0(3));
        for (String str : ((String) zzbe.zzc().a(zn.c8)).split(",")) {
            ga2 ga2Var = (ga2) this.f5182a.get(str.trim());
            if (ga2Var != null) {
                cr1VarL = bs1.k(cr1VarL, gw0.class, new qf0(2, ga2Var, r30Var), this.f5183b);
            }
        }
        cr1VarL.addListener(new as1(0, cr1VarL, new xj1(14, this)), i70.f5592g);
        return cr1VarL;
    }
}
