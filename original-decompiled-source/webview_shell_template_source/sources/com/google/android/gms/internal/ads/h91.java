package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5305a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5306b;

    public h91(h70 h70Var, String str) {
        this.f5305a = h70Var;
        this.f5306b = str;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        ds1 ds1VarM = bs1.m(this.f5306b);
        a6 a6Var = new a6(3);
        Executor executor = this.f5305a;
        return bs1.k(bs1.o(ds1VarM, a6Var, executor), Throwable.class, new nv(2, this), executor);
    }
}
