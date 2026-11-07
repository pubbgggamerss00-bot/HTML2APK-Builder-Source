package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u81 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9491a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f9492b;

    public u81(Context context, hs1 hs1Var) {
        this.f9491a = context;
        this.f9492b = hs1Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        if (!((Boolean) lp.f6807b.c()).booleanValue()) {
            return bs1.m(new v81(-1, -1));
        }
        return this.f9492b.u(new mw0(5, this));
    }
}
