package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ia.a;

/* loaded from: classes2.dex */
public final class zzbh extends zza implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzbgVar);
        zzc(3, parcelZza);
    }

    public final void zze(zzbg zzbgVar, a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzbgVar);
        zzc.zzc(parcelZza, aVar);
        zzc(1, parcelZza);
    }
}
