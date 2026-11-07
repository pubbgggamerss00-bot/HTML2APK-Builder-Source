package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.location.LocationRequest;
import hb.f;

/* loaded from: classes2.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ f zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, h hVar, LocationRequest locationRequest, f fVar, Looper looper) {
        super(hVar);
        this.zza = locationRequest;
        this.zzb = fVar;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzy zzyVar = new zzy(this);
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), m.a(zzbj.zza(this.zzc), this.zzb, f.class.getSimpleName()), zzyVar);
    }
}
