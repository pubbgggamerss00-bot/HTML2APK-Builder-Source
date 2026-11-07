package oa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        return new b(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
