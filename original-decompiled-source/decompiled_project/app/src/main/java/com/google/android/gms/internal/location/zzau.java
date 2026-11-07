package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.l;
import hb.g;
import hb.w;

/* loaded from: classes2.dex */
final class zzau extends w {
    private final l<g> zza;

    public zzau(l<g> lVar) {
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        l<g> lVar = this.zza;
        lVar.f6010b = null;
        lVar.f6011c = null;
    }

    @Override // hb.x
    public final synchronized void zzd(Location location) {
        this.zza.a(new zzat(this, location));
    }
}
