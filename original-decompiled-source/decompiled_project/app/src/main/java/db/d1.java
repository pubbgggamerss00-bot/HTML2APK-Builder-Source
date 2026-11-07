package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.c0;

/* loaded from: classes2.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        try {
            return c0.a(string);
        } catch (c0.a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
