package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.location.LocationRequest;
import hb.g;

/* loaded from: classes2.dex */
final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ g zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzzVar, h hVar, LocationRequest locationRequest, g gVar) {
        super(hVar);
        this.zza = locationRequest;
        this.zzb = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzy zzyVar = new zzy(this);
        ((zzaz) bVar).zzC(this.zza, m.a(zzbj.zzb(), this.zzb, g.class.getSimpleName()), zzyVar);
    }
}
