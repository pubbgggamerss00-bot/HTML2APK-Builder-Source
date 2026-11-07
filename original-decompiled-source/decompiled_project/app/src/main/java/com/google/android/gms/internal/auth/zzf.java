package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import ca.b;
import ca.c;

/* loaded from: classes2.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    c zzh(b bVar) throws RemoteException;
}
