package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8094a;

    /* renamed from: b, reason: collision with root package name */
    public final x92 f8095b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8096c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f8097d;

    public /* synthetic */ pj0(x92 x92Var, ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f8094a = i6;
        this.f8095b = x92Var;
        this.f8096c = ca2Var;
        this.f8097d = ca2Var2;
    }

    public e71 a() {
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new e71(h70Var, (ViewGroup) ((dh0) ((pc0) this.f8095b).f8025b).f3937t, (Context) ((w92) this.f8096c).zzb(), ((ea2) this.f8097d).zzb());
    }

    public bb1 b() {
        Context context = (Context) ((y92) this.f8095b).f10908a;
        vc1 vc1Var = (vc1) this.f8096c.zzb();
        jd1 jd1Var = (jd1) this.f8097d.zzb();
        w60 w60VarZzg = ((Boolean) zzbe.zzc().a(zn.g6)).booleanValue() ? zzv.zzp().d().zzg() : zzv.zzp().d().zzh();
        boolean z6 = false;
        if (w60VarZzg != null && w60VarZzg.f10070j) {
            z6 = true;
        }
        if (((Integer) zzbe.zzc().a(zn.i6)).intValue() > 0) {
            if (!((Boolean) zzbe.zzc().a(zn.f6)).booleanValue() || z6) {
                id1 id1VarA = jd1Var.a(bd1.s, context, vc1Var, new l2(11, new ka1()));
                xc1 xc1Var = id1VarA.f5718a;
                ni0 ni0Var = new ni0(new ej0());
                h70 h70Var = i70.f5586a;
                return new na1(ni0Var, new ra1(xc1Var, h70Var), id1VarA.f5719b, xc1Var.f10495b.f3527y, h70Var);
            }
        }
        return new ej0();
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Set setSingleton;
        switch (this.f8094a) {
            case 0:
                Context contextA = ((oc0) this.f8095b).a();
                ie1 ie1Var = (ie1) ((w92) this.f8096c).zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f8097d).a();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new oj0(contextA, ie1Var, versionInfoParcelA, h70Var);
            case 1:
                String str = ((q91) ((pc0) this.f8095b).f8025b).f8279a.f8530z;
                ih1.j(str);
                Context contextA2 = ((oc0) this.f8096c).a();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Map mapB = ((z92) this.f8097d).zzb();
                if (((Boolean) zzbe.zzc().a(zn.W4)).booleanValue()) {
                    kk kkVar = new kk(new mk(contextA2));
                    synchronized (kkVar) {
                        if (kkVar.f6441c) {
                            try {
                                cn cnVar = kkVar.f6440b;
                                cnVar.i();
                                dn.I((dn) cnVar.f4126t, str);
                            } catch (NullPointerException e6) {
                                zzv.zzp().h("AdMobClearcutLogger.modify", e6);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new kn0(new st0(kkVar, mapB), h70Var2));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                ih1.j(setSingleton);
                return setSingleton;
            case 2:
                t41 t41Var = new t41(0, ((oc0) ((v41) this.f8095b).f9703a).a());
                i3.a aVar = (i3.a) ((w92) this.f8096c).zzb();
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new n61(t41Var, 2147483647L, aVar, h70Var3, (cu0) ((w92) this.f8097d).zzb());
            case 3:
                return a();
            default:
                return b();
        }
    }
}
