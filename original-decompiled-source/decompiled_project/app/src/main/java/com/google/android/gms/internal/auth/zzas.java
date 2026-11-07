package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import fa.a;
import fa.b;
import fa.i;

/* loaded from: classes2.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                i iVar = (i) zzc.zza(parcel, i.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, iVar);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                b bVar = (b) zzc.zza(parcel, b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, bVar);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(bArrCreateByteArray);
                return true;
            case 7:
                a aVar = (a) zzc.zza(parcel, a.CREATOR);
                zzc.zzb(parcel);
                zzc(aVar);
                return true;
            default:
                return false;
        }
    }
}
