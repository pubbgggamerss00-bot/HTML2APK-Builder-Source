package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class o0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f6179a;

    public o0(IBinder iBinder) {
        this.f6179a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6179a;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void e(u0 u0Var, f fVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(u0Var.asBinder());
            parcelObtain.writeInt(1);
            b1.a(fVar, parcelObtain, 0);
            this.f6179a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
