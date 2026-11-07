package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class rh implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public rh(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    public final Parcel zzcZ(int i6, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void zzda(int i6, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.zza.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void zzdb(int i6, Parcel parcel) {
        try {
            this.zza.transact(i6, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
