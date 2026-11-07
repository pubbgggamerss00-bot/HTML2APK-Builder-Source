package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import db.u;
import db.x;

/* loaded from: classes2.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, u uVar) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, uVar);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, x xVar) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, xVar);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
