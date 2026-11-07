package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class st0 implements be1 {
    public final Map s;

    /* renamed from: t, reason: collision with root package name */
    public final kk f9003t;

    public st0(kk kkVar, Map map) {
        this.s = map;
        this.f9003t = kkVar;
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void c(yd1 yd1Var, String str, Throwable th) {
        Map map = this.s;
        if (map.containsKey(yd1Var)) {
            this.f9003t.b(((rt0) map.get(yd1Var)).f8703c);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void j(yd1 yd1Var, String str) {
        Map map = this.s;
        if (map.containsKey(yd1Var)) {
            this.f9003t.b(((rt0) map.get(yd1Var)).f8702b);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void n(yd1 yd1Var, String str) {
        Map map = this.s;
        if (map.containsKey(yd1Var)) {
            this.f9003t.b(((rt0) map.get(yd1Var)).f8701a);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void f(String str) {
    }
}
