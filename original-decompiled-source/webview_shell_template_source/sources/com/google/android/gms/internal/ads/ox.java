package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ox implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final hx f7878a;

    /* renamed from: b, reason: collision with root package name */
    public final ix f7879b;

    /* renamed from: c, reason: collision with root package name */
    public final cx f7880c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7881d;

    public ox(cx cxVar, String str, ix ixVar, hx hxVar) {
        this.f7880c = cxVar;
        this.f7881d = str;
        this.f7879b = ixVar;
        this.f7878a = hxVar;
    }

    public final c5.a a(Object obj) {
        o70 o70Var = new o70();
        zw zwVarA = this.f7880c.a();
        zze.zza("callJs > getEngine: Promise created");
        zwVarA.d(new mx(this, zwVarA, obj, o70Var, 0), new com.google.android.gms.ads.mediation.customevent.a(2, o70Var, zwVarA));
        return o70Var;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        return a(obj);
    }
}
