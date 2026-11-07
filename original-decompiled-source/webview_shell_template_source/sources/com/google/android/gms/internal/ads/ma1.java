package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ma1 implements ld1 {

    /* renamed from: a, reason: collision with root package name */
    public final ab1 f7032a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.mediation.customevent.a f7033b;

    /* renamed from: c, reason: collision with root package name */
    public final zzm f7034c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7035d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f7036e;

    /* renamed from: f, reason: collision with root package name */
    public final zzy f7037f;

    /* renamed from: g, reason: collision with root package name */
    public final fd1 f7038g;

    public ma1(ab1 ab1Var, com.google.android.gms.ads.mediation.customevent.a aVar, zzm zzmVar, String str, Executor executor, zzy zzyVar, fd1 fd1Var) {
        this.f7032a = ab1Var;
        this.f7033b = aVar;
        this.f7034c = zzmVar;
        this.f7035d = str;
        this.f7036e = executor;
        this.f7037f = zzyVar;
        this.f7038g = fd1Var;
    }

    @Override // com.google.android.gms.internal.ads.ld1
    public final fd1 zza() {
        return this.f7038g;
    }

    @Override // com.google.android.gms.internal.ads.ld1
    public final Executor zzb() {
        return this.f7036e;
    }
}
