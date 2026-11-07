package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jd1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6039a = new HashMap();

    public final id1 a(bd1 bd1Var, Context context, vc1 vc1Var, l2 l2Var) {
        cd1 cd1Var;
        HashMap map = this.f6039a;
        id1 id1Var = (id1) map.get(bd1Var);
        if (id1Var != null) {
            return id1Var;
        }
        if (bd1Var == bd1.s) {
            cd1Var = new cd1(context, bd1Var, ((Integer) zzbe.zzc().a(zn.i6)).intValue(), ((Integer) zzbe.zzc().a(zn.o6)).intValue(), ((Integer) zzbe.zzc().a(zn.q6)).intValue(), (String) zzbe.zzc().a(zn.s6), (String) zzbe.zzc().a(zn.k6), (String) zzbe.zzc().a(zn.m6));
        } else if (bd1Var == bd1.f3038t) {
            cd1Var = new cd1(context, bd1Var, ((Integer) zzbe.zzc().a(zn.j6)).intValue(), ((Integer) zzbe.zzc().a(zn.p6)).intValue(), ((Integer) zzbe.zzc().a(zn.r6)).intValue(), (String) zzbe.zzc().a(zn.t6), (String) zzbe.zzc().a(zn.l6), (String) zzbe.zzc().a(zn.n6));
        } else if (bd1Var == bd1.f3039u) {
            cd1Var = new cd1(context, bd1Var, ((Integer) zzbe.zzc().a(zn.w6)).intValue(), ((Integer) zzbe.zzc().a(zn.y6)).intValue(), ((Integer) zzbe.zzc().a(zn.z6)).intValue(), (String) zzbe.zzc().a(zn.u6), (String) zzbe.zzc().a(zn.v6), (String) zzbe.zzc().a(zn.x6));
        } else {
            cd1Var = null;
        }
        xc1 xc1Var = new xc1(cd1Var);
        id1 id1Var2 = new id1(xc1Var, new md1(xc1Var, vc1Var, l2Var));
        map.put(bd1Var, id1Var2);
        return id1Var2;
    }
}
