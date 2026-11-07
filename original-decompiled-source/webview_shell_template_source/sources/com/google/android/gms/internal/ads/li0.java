package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class li0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6748a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6749b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6750c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f6751d;

    public li0(w92 w92Var, bd0 bd0Var, qi0 qi0Var) {
        this.f6748a = 1;
        this.f6750c = w92Var;
        this.f6751d = bd0Var;
        this.f6749b = qi0Var;
    }

    public w41 a() {
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new w41(h70Var, ((oc0) this.f6749b).a(), ((lk0) this.f6750c).a(), (ViewGroup) ((dh0) ((pc0) this.f6751d).f8025b).f3937t);
    }

    public l51 b() {
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new l51(h70Var, (mt0) this.f6749b.zzb(), (fv0) this.f6750c.zzb(), (n51) this.f6751d.zzb());
    }

    public bb1 c() {
        Context context = (Context) ((y92) this.f6749b).f10908a;
        vc1 vc1Var = (vc1) this.f6750c.zzb();
        jd1 jd1Var = (jd1) this.f6751d.zzb();
        w60 w60VarZzg = ((Boolean) zzbe.zzc().a(zn.g6)).booleanValue() ? zzv.zzp().d().zzg() : zzv.zzp().d().zzh();
        boolean z6 = false;
        if (w60VarZzg != null && w60VarZzg.f10070j) {
            z6 = true;
        }
        if (((Integer) zzbe.zzc().a(zn.w6)).intValue() > 0) {
            if (!((Boolean) zzbe.zzc().a(zn.f6)).booleanValue() || z6) {
                id1 id1VarA = jd1Var.a(bd1.f3039u, context, vc1Var, new l2(11, new ka1()));
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
        switch (this.f6748a) {
            case 0:
                return new ki0(((qi0) this.f6749b).a(), (yk0) ((w92) this.f6750c).zzb(), (nl0) ((w92) this.f6751d).zzb());
            case 1:
                Context context = (Context) this.f6750c.zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f6751d).a();
                tb1 tb1VarA = ((qi0) this.f6749b).a();
                new f0(13);
                p50 p50Var = tb1VarA.A;
                if (p50Var == null) {
                    return null;
                }
                xb1 xb1Var = tb1VarA.s;
                return new o50(context, versionInfoParcelA, p50Var, xb1Var != null ? xb1Var.f10473b : null);
            case 2:
                return new eu0((zt0) this.f6749b.zzb(), ((ea2) this.f6750c).zzb(), (i3.a) this.f6751d.zzb());
            case 3:
                return a();
            case 4:
                return b();
            case 5:
                cd0 cd0Var = (cd0) this.f6749b;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                y81 y81Var = new y81(((oc0) cd0Var.f3521b).a(), h70Var);
                i3.a aVar = (i3.a) ((w92) this.f6750c).zzb();
                ih1.j(h70Var);
                return new n61(y81Var, ((Long) jp.f6119d.c()).longValue(), aVar, h70Var, (cu0) ((w92) this.f6751d).zzb());
            case 6:
                a91 a91VarZzb = ((b91) this.f6749b).zzb();
                i3.a aVar2 = (i3.a) ((w92) this.f6750c).zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new n61(a91VarZzb, ((Long) jp.h.c()).longValue(), aVar2, h70Var2, (cu0) ((w92) this.f6751d).zzb());
            default:
                return c();
        }
    }

    public /* synthetic */ li0(ca2 ca2Var, ca2 ca2Var2, ca2 ca2Var3, int i6) {
        this.f6748a = i6;
        this.f6749b = ca2Var;
        this.f6750c = ca2Var2;
        this.f6751d = ca2Var3;
    }
}
