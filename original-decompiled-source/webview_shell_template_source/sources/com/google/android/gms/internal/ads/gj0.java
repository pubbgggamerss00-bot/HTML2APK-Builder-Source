package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f5064a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5065b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f5066c;

    /* renamed from: d, reason: collision with root package name */
    public final pe0 f5067d;

    /* renamed from: e, reason: collision with root package name */
    public final s21 f5068e;

    /* renamed from: f, reason: collision with root package name */
    public final w92 f5069f;

    /* renamed from: g, reason: collision with root package name */
    public final y92 f5070g;
    public final rg0 h;

    /* renamed from: i, reason: collision with root package name */
    public final ek0 f5071i;

    /* renamed from: j, reason: collision with root package name */
    public final t50 f5072j;

    /* renamed from: k, reason: collision with root package name */
    public final w92 f5073k;

    public gj0(xw0 xw0Var, lk0 lk0Var, w92 w92Var, pe0 pe0Var, s21 s21Var, w92 w92Var2, y92 y92Var, rg0 rg0Var, ek0 ek0Var, t50 t50Var, w92 w92Var3) {
        this.f5064a = xw0Var;
        this.f5065b = lk0Var;
        this.f5066c = w92Var;
        this.f5067d = pe0Var;
        this.f5068e = s21Var;
        this.f5069f = w92Var2;
        this.f5070g = y92Var;
        this.h = rg0Var;
        this.f5071i = ek0Var;
        this.f5072j = t50Var;
        this.f5073k = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        ww0 ww0VarZzb = ((xw0) this.f5064a).zzb();
        ec1 ec1VarA = ((lk0) this.f5065b).a();
        ae1 ae1Var = (ae1) this.f5066c.zzb();
        pe0 pe0Var = this.f5067d;
        ro0 ro0Var = new ro0(((z92) pe0Var.f8051b).zzb(), ((z92) pe0Var.f8052c).zzb());
        r21 r21VarZzb = this.f5068e.zzb();
        km0 km0Var = (km0) this.f5069f.zzb();
        ac1 ac1Var = (ac1) this.f5070g.f10908a;
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        rg0 rg0Var = this.h;
        ox0 ox0Var = new ox0(h70Var, ((we0) rg0Var.f8629b).a(), w92.a(new da2((zx0) rg0Var.f8630c)));
        dk0 dk0VarZzb = this.f5071i.zzb();
        ih1.j(h70Var);
        t50 t50Var = this.f5072j;
        Map map = ((aa2) t50Var.f9109b).f9761a;
        ih1.j(h70Var);
        return new fj0(ww0VarZzb, ec1VarA, ae1Var, ro0Var, r21VarZzb, km0Var, ac1Var, ox0Var, dk0VarZzb, h70Var, new gx0(map, h70Var, new xl0(((zk0) t50Var.f9110c).f11325b.zzb())), (e01) this.f5073k.zzb());
    }
}
