package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final zzl createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        zzj zzjVar = null;
        int iN = 1;
        IBinder iBinderM = null;
        IBinder iBinderM2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN = b.n(i10, parcel);
            } else if (c10 == 2) {
                zzjVar = (zzj) b.e(parcel, i10, zzj.CREATOR);
            } else if (c10 == 3) {
                iBinderM = b.m(i10, parcel);
            } else if (c10 != 4) {
                b.s(i10, parcel);
            } else {
                iBinderM2 = b.m(i10, parcel);
            }
        }
        b.j(iT, parcel);
        return new zzl(iN, zzjVar, iBinderM, iBinderM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
