package x0;

import android.os.Parcel;
import android.os.Parcelable;
import x0.g3;

/* loaded from: classes.dex */
public final class w1 extends g3 implements Parcelable {
    public static final Parcelable.Creator<w1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<w1> {
        @Override // android.os.Parcelable.Creator
        public final w1 createFromParcel(Parcel parcel) {
            return new w1(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final w1[] newArray(int i10) {
            return new w1[i10];
        }
    }

    public w1(long j10) {
        h1.h hVarK = h1.n.k();
        g3.a aVar = new g3.a(hVarK.g(), j10);
        if (!(hVarK instanceof h1.b)) {
            aVar.f12134b = new g3.a(1, j10);
        }
        this.f31697b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(b());
    }
}
