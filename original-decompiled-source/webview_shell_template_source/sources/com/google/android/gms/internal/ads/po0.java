package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class po0 implements wi0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8110a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8111b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8112c;

    /* renamed from: d, reason: collision with root package name */
    public final w92 f8113d;

    /* renamed from: e, reason: collision with root package name */
    public final pp0 f8114e;

    public po0(Map map, Map map2, Map map3, w92 w92Var, pp0 pp0Var) {
        this.f8110a = map;
        this.f8111b = map2;
        this.f8112c = map3;
        this.f8113d = w92Var;
        this.f8114e = pp0Var;
    }

    @Override // com.google.android.gms.internal.ads.wi0
    public final yz0 a(int i6, String str) {
        yz0 yz0VarA;
        yz0 yz0Var = (yz0) this.f8110a.get(str);
        if (yz0Var != null) {
            return yz0Var;
        }
        if (i6 != 1) {
            if (i6 != 4) {
                return null;
            }
            s11 s11Var = (s11) this.f8112c.get(str);
            if (s11Var != null) {
                return new zz0(s11Var, new kt(1));
            }
            yz0VarA = (yz0) this.f8111b.get(str);
            if (yz0VarA == null) {
                return null;
            }
        } else if (this.f8114e.f8128d == null || (yz0VarA = ((wi0) this.f8113d.zzb()).a(i6, str)) == null) {
            return null;
        }
        return new zz0(yz0VarA, new xi0(0));
    }
}
