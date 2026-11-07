package x0;

import android.os.Parcel;
import android.os.Parcelable;
import x0.f3;

/* loaded from: classes.dex */
public final class v1 extends f3 implements Parcelable {
    public static final Parcelable.Creator<v1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<v1> {
        @Override // android.os.Parcelable.Creator
        public final v1 createFromParcel(Parcel parcel) {
            return new v1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final v1[] newArray(int i10) {
            return new v1[i10];
        }
    }

    public v1(int i10) {
        h1.h hVarK = h1.n.k();
        f3.a aVar = new f3.a(i10, hVarK.g());
        if (!(hVarK instanceof h1.b)) {
            aVar.f12134b = new f3.a(i10, 1);
        }
        this.f31678b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(g());
    }
}
