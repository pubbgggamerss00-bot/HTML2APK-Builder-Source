package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9111a;

    /* renamed from: b, reason: collision with root package name */
    public final b70 f9112b;

    public t51(h70 h70Var, b70 b70Var) {
        this.f9111a = h70Var;
        this.f9112b = b70Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return ((Boolean) zzbe.zzc().a(zn.W2)).booleanValue() ? bs1.m(new u51(0, null)) : bs1.o(this.f9112b.e(), new a6(2), this.f9111a);
    }
}
