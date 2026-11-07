package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f0 implements i {
    public final IBinder s;

    public f0(IBinder iBinder) {
        this.s = iBinder;
    }

    @Override // com.google.android.gms.common.internal.i
    public final void N(m0 m0Var, e eVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(m0Var);
            parcelObtain.writeInt(1);
            t0.a(eVar, parcelObtain, 0);
            this.s.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }
}
