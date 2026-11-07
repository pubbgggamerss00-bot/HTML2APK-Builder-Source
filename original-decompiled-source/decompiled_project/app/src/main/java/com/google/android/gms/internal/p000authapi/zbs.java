package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import ga.h;

/* loaded from: classes2.dex */
public abstract class zbs extends zbb implements zbt {
    public zbs() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        h hVar = (h) zbc.zba(parcel, h.CREATOR);
        zbc.zbb(parcel);
        zbb(status, hVar);
        return true;
    }
}
