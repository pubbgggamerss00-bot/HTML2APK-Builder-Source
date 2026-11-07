package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nc2 extends dh2 {

    /* renamed from: c, reason: collision with root package name */
    public final cy f7386c;

    public nc2(zy zyVar) {
        super(zyVar);
        this.f7386c = new cy();
    }

    @Override // com.google.android.gms.internal.ads.dh2, com.google.android.gms.internal.ads.zy
    public final jx d(int i6, jx jxVar, boolean z6) {
        zy zyVar = this.f3938b;
        jx jxVarD = zyVar.d(i6, jxVar, z6);
        if (!zyVar.e(jxVarD.f6182c, this.f7386c, 0L).b()) {
            jxVarD.f6184e = true;
            return jxVarD;
        }
        Object obj = jxVar.f6180a;
        Object obj2 = jxVar.f6181b;
        int i7 = jxVar.f6182c;
        long j6 = jxVar.f6183d;
        dj djVar = dj.f3948b;
        jxVarD.b(obj, obj2, i7, j6, true);
        return jxVarD;
    }
}
