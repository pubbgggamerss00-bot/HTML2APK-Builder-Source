package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.z;

/* loaded from: classes2.dex */
public final class b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return z.a(parcel.readString());
        } catch (z.a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
