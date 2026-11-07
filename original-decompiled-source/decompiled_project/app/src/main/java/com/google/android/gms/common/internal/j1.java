package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class j1 extends zza implements j {
    @Override // com.google.android.gms.common.internal.j
    public final Account zzb() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) zzc.zza(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
