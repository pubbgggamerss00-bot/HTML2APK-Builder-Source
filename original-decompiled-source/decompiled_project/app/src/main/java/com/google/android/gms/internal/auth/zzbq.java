package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import ia.a;

/* loaded from: classes2.dex */
final class zzbq extends zzbi {
    final /* synthetic */ a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, h hVar, a aVar) {
        super(hVar);
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
