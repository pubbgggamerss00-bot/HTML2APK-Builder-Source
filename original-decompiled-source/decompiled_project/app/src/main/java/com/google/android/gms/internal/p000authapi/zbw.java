package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.h;
import ga.b;
import ga.e;
import ga.f;

/* loaded from: classes2.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, b bVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbmVar);
        zbc.zbc(parcelZba, bVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbp zbpVar, e eVar, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbpVar);
        zbc.zbc(parcelZba, eVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbr zbrVar, f fVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbrVar);
        zbc.zbc(parcelZba, fVar);
        zbb(3, parcelZba);
    }

    public final void zbf(h hVar, String str) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, hVar);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
