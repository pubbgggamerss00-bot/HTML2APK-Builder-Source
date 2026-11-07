package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc1 implements yt {
    public final /* synthetic */ on0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vf0 f5325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ cf1 f5326u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dz0 f5327v;

    public /* synthetic */ hc1(on0 on0Var, vf0 vf0Var, cf1 cf1Var, dz0 dz0Var) {
        this.s = on0Var;
        this.f5325t = vf0Var;
        this.f5326u = cf1Var;
        this.f5327v = dz0Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        xa0 xa0Var = (xa0) obj;
        xt.b(map, this.s);
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        c5.a aVarA = xt.a(xa0Var, str);
        jc1 jc1Var = new jc1(xa0Var, this.f5325t, this.f5326u, this.f5327v);
        aVarA.addListener(new as1(0, aVarA, jc1Var), i70.f5586a);
    }
}
