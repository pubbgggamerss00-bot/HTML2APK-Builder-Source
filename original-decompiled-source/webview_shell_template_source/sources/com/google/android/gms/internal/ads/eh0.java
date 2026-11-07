package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final w92 f4288a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f4289b;

    public eh0(w92 w92Var, w92 w92Var2) {
        this.f4288a = w92Var;
        this.f4289b = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wl0 zzb() {
        return new wl0((ScheduledExecutorService) this.f4288a.zzb(), (i3.a) this.f4289b.zzb());
    }
}
