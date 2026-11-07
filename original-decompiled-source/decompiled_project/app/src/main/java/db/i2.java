package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.q;

/* loaded from: classes2.dex */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return q.a(parcel.readInt());
        } catch (q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
