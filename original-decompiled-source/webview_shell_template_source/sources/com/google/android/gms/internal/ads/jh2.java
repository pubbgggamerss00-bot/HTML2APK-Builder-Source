package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jh2 extends zy {

    /* renamed from: b, reason: collision with root package name */
    public final tc f6067b;

    public jh2(tc tcVar) {
        this.f6067b = tcVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int a(Object obj) {
        return obj == hh2.f5396e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final jx d(int i6, jx jxVar, boolean z6) {
        Integer num = z6 ? 0 : null;
        Object obj = z6 ? hh2.f5396e : null;
        dj djVar = dj.f3948b;
        jxVar.b(num, obj, 0, -9223372036854775807L, true);
        return jxVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final cy e(int i6, cy cyVar, long j6) {
        Object obj = cy.f3686m;
        cyVar.a(this.f6067b, false, true, null, -9223372036854775807L);
        cyVar.f3695i = true;
        return cyVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final Object f(int i6) {
        return hh2.f5396e;
    }
}
