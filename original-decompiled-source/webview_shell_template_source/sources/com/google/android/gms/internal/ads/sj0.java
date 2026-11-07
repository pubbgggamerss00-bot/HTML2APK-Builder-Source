package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8956a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8957b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f8958c;

    public /* synthetic */ sj0(w92 w92Var, w92 w92Var2, int i6) {
        this.f8956a = i6;
        this.f8957b = w92Var;
        this.f8958c = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f8956a) {
        }
        return new kn0((bm0) this.f8957b.zzb(), (Executor) this.f8958c.zzb());
    }
}
