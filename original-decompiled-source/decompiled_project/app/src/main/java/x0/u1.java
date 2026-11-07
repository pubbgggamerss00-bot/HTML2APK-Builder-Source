package x0;

import android.os.Parcel;
import android.os.Parcelable;
import x0.e3;

/* loaded from: classes.dex */
public final class u1 extends e3 implements Parcelable {
    public static final Parcelable.Creator<u1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<u1> {
        @Override // android.os.Parcelable.Creator
        public final u1 createFromParcel(Parcel parcel) {
            return new u1(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final u1[] newArray(int i10) {
            return new u1[i10];
        }
    }

    public u1(float f10) {
        h1.h hVarK = h1.n.k();
        e3.a aVar = new e3.a(f10, hVarK.g());
        if (!(hVarK instanceof h1.b)) {
            aVar.f12134b = new e3.a(f10, 1);
        }
        this.f31669b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(getFloatValue());
    }
}
