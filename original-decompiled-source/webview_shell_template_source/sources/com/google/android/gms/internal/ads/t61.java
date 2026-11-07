package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t61 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9118a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9119b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9120c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f9121d;

    public /* synthetic */ t61(x92 x92Var, ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f9118a = i6;
        this.f9119b = x92Var;
        this.f9120c = ca2Var;
        this.f9121d = ca2Var2;
    }

    public y71 a() {
        Context contextA = ((oc0) this.f9119b).a();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new y71(contextA, h70Var, ((lk0) this.f9120c).a(), ((bd0) this.f9121d).a());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f9118a) {
            case 0:
                Object t41Var = new t41(0, ((oc0) ((v41) this.f9119b).f9703a).a());
                Object obj = (n61) this.f9120c.zzb();
                if (true == ((List) this.f9121d.zzb()).contains("2")) {
                    t41Var = obj;
                }
                ih1.j(t41Var);
                return t41Var;
            case 1:
                Object objZzb = ((x71) this.f9119b).zzb();
                Object obj2 = (n61) this.f9120c.zzb();
                if (true == ((List) this.f9121d.zzb()).contains("29")) {
                    objZzb = obj2;
                }
                ih1.j(objZzb);
                return objZzb;
            case 2:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new p71(h70Var, ((lk0) this.f9119b).a(), (PackageInfo) this.f9120c.zzb(), ((lc0) this.f9121d).zzb());
            default:
                return a();
        }
    }
}
