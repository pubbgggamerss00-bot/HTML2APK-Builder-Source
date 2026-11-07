package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hh2 extends dh2 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f5396e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f5397c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5398d;

    public hh2(zy zyVar, Object obj, Object obj2) {
        super(zyVar);
        this.f5397c = obj;
        this.f5398d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.dh2, com.google.android.gms.internal.ads.zy
    public final int a(Object obj) {
        Object obj2;
        if (f5396e.equals(obj) && (obj2 = this.f5398d) != null) {
            obj = obj2;
        }
        return this.f3938b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.dh2, com.google.android.gms.internal.ads.zy
    public final jx d(int i6, jx jxVar, boolean z6) {
        this.f3938b.d(i6, jxVar, z6);
        if (Objects.equals(jxVar.f6181b, this.f5398d) && z6) {
            jxVar.f6181b = f5396e;
        }
        return jxVar;
    }

    @Override // com.google.android.gms.internal.ads.dh2, com.google.android.gms.internal.ads.zy
    public final cy e(int i6, cy cyVar, long j6) {
        this.f3938b.e(i6, cyVar, j6);
        if (Objects.equals(cyVar.f3688a, this.f5397c)) {
            cyVar.f3688a = cy.f3686m;
        }
        return cyVar;
    }

    @Override // com.google.android.gms.internal.ads.dh2, com.google.android.gms.internal.ads.zy
    public final Object f(int i6) {
        Object objF = this.f3938b.f(i6);
        return Objects.equals(objF, this.f5398d) ? f5396e : objF;
    }
}
