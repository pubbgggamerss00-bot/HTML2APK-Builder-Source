package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import ga.a;

/* loaded from: classes2.dex */
public abstract class zbi extends zbb implements zbj {
    public zbi() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        a aVar = (a) zbc.zba(parcel, a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, aVar);
        return true;
    }
}
