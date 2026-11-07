package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;

/* loaded from: classes2.dex */
final class zzbs extends zzbj {
    public zzbs(zzbt zzbtVar, h hVar) {
        super(hVar);
    }

    @Override // com.google.android.gms.internal.auth.zzbj
    public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zzd(new zzbr(this));
    }
}
