package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kj0 implements nm0, jl0 {
    public final i3.a s;

    /* renamed from: t, reason: collision with root package name */
    public final mj0 f6436t;

    /* renamed from: u, reason: collision with root package name */
    public final ec1 f6437u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6438v;

    public kj0(i3.a aVar, mj0 mj0Var, ec1 ec1Var, String str) {
        this.s = aVar;
        this.f6436t = mj0Var;
        this.f6437u = ec1Var;
        this.f6438v = str;
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        long jB = this.s.b();
        String str = this.f6437u.f4211f;
        mj0 mj0Var = this.f6436t;
        ConcurrentHashMap concurrentHashMap = mj0Var.f7165c;
        String str2 = this.f6438v;
        Long l4 = (Long) concurrentHashMap.get(str2);
        if (l4 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        mj0Var.f7166d.put(str, Long.valueOf(jB - l4.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final void zza() {
        this.f6436t.f7165c.put(this.f6438v, Long.valueOf(this.s.b()));
    }
}
