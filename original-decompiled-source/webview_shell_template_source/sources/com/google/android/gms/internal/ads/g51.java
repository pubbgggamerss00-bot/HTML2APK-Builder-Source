package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final n61 f4898a;

    /* renamed from: b, reason: collision with root package name */
    public final ec1 f4899b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4900c;

    /* renamed from: d, reason: collision with root package name */
    public final b70 f4901d;

    public g51(n61 n61Var, ec1 ec1Var, Context context, b70 b70Var) {
        this.f4898a = n61Var;
        this.f4899b = ec1Var;
        this.f4900c = context;
        this.f4901d = b70Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return bs1.o(this.f4898a.zzb(), new ta1(2, this), i70.f5592g);
    }
}
