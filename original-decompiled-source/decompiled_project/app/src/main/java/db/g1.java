package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.d0;

/* loaded from: classes2.dex */
public final class g1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return d0.a.a(parcel.readString());
        } catch (d0.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0.a[i10];
    }
}
