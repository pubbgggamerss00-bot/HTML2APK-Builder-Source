package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f2596b;

    public a71(Context context, hs1 hs1Var) {
        this.f2596b = hs1Var;
        this.f2595a = context;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f2596b.u(new e61(1, this));
    }
}
