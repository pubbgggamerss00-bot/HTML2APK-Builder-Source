package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import la.c;

/* loaded from: classes2.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            zza(status, bArrCreateByteArray);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
            c cVar = (c) zzc.zza(parcel, c.CREATOR);
            enforceNoDataAvail(parcel);
            zzb(status2, cVar);
        }
        return true;
    }
}
