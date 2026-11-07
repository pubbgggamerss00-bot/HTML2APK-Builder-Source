package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzaiq implements Parcelable.Creator<zzair> {
    @Override // android.os.Parcelable.Creator
    public final zzair createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        while (parcel.dataPosition() < iT) {
            b.s(parcel.readInt(), parcel);
        }
        b.j(iT, parcel);
        return new zzair();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzair[] newArray(int i10) {
        return new zzair[i10];
    }
}
