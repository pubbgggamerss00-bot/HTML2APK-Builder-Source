package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import hb.e;

/* loaded from: classes2.dex */
final class zzac extends zzae {
    final /* synthetic */ e zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, h hVar, e eVar, PendingIntent pendingIntent) {
        super(hVar);
        this.zza = eVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
