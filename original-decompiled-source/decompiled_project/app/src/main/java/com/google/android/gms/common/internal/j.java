package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes2.dex */
public interface j extends IInterface {

    public static abstract class a extends zzb implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f6156a = 0;
    }

    Account zzb() throws RemoteException;
}
