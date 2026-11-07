package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iN = 1;
        zzba zzbaVar = null;
        IBinder iBinderM = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderM2 = null;
        IBinder iBinderM3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN = b.n(i10, parcel);
                    break;
                case 2:
                    zzbaVar = (zzba) b.e(parcel, i10, zzba.CREATOR);
                    break;
                case 3:
                    iBinderM = b.m(i10, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.e(parcel, i10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderM2 = b.m(i10, parcel);
                    break;
                case 6:
                    iBinderM3 = b.m(i10, parcel);
                    break;
                default:
                    b.s(i10, parcel);
                    break;
            }
        }
        b.j(iT, parcel);
        return new zzbc(iN, zzbaVar, iBinderM, pendingIntent, iBinderM2, iBinderM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
