package com.google.android.gms.common.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p0 extends e0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f2479g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b bVar, int i6, Bundle bundle) {
        super(bVar, i6, bundle);
        this.f2479g = bVar;
    }

    @Override // com.google.android.gms.common.internal.e0
    public final boolean b() {
        this.f2479g.zzc.a(c3.b.f2165x);
        return true;
    }

    @Override // com.google.android.gms.common.internal.e0
    public final void c(c3.b bVar) {
        b bVar2 = this.f2479g;
        if (bVar2.enableLocalFallback() && bVar2.zzg()) {
            bVar2.zzf(16);
        } else {
            bVar2.zzc.a(bVar);
            bVar2.onConnectionFailed(bVar);
        }
    }
}
