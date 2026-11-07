package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class x0 extends l0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f6207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(b bVar, int i10, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f6207g = bVar;
    }

    @Override // com.google.android.gms.common.internal.l0
    public final void c(pa.a aVar) {
        b bVar = this.f6207g;
        if (bVar.enableLocalFallback() && b.zzo(bVar)) {
            b.zzk(bVar, 16);
        } else {
            bVar.zzc.a(aVar);
            bVar.onConnectionFailed(aVar);
        }
    }

    @Override // com.google.android.gms.common.internal.l0
    public final boolean d() {
        this.f6207g.zzc.a(pa.a.f21375e);
        return true;
    }
}
