package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import ca.c;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        c cVar = (c) zzc.zza(parcel, c.CREATOR);
        zzc.zzb(parcel);
        zzb(status, cVar);
        return true;
    }
}
