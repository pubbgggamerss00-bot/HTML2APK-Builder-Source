package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import qa.b;

/* loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final zzaa createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        Status status = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                b.s(i10, parcel);
            } else {
                status = (Status) b.e(parcel, i10, Status.CREATOR);
            }
        }
        b.j(iT, parcel);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i10) {
        return new zzaa[i10];
    }
}
