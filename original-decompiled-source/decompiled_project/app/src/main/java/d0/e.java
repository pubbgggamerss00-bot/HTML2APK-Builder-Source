package d0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f7090a;

    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10) {
        this.f7090a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f7090a == ((e) obj).f7090a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7090a);
    }

    public final String toString() {
        return b.b.a(new StringBuilder("DefaultLazyKey(index="), this.f7090a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7090a);
    }
}
