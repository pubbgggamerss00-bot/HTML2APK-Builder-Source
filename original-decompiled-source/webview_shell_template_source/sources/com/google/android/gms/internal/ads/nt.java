package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class nt implements yt {
    public final /* synthetic */ on0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vf0 f7503t;

    public /* synthetic */ nt(on0 on0Var, vf0 vf0Var) {
        this.s = on0Var;
        this.f7503t = vf0Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        xa0 xa0Var = (xa0) obj;
        xt.b(map, this.s);
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        xr1 xr1VarP = xr1.p(xt.a(xa0Var, str));
        pt ptVar = new pt(0, this.f7503t, str);
        h70 h70Var = i70.f5586a;
        gr1 gr1VarP = bs1.p(xr1VarP, ptVar, h70Var);
        gr1VarP.addListener(new as1(0, gr1VarP, new ej0(2, xa0Var)), h70Var);
    }
}
