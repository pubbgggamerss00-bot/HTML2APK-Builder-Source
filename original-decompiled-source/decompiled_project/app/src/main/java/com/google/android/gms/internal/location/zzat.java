package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.l;
import hb.g;

/* loaded from: classes2.dex */
final class zzat implements l.b<g> {
    final /* synthetic */ Location zza;

    public zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.l.b
    public final /* bridge */ /* synthetic */ void notifyListener(g gVar) {
        gVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.l.b
    public final void onNotifyListenerFailed() {
    }
}
