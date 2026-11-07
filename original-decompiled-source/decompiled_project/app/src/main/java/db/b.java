package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum b implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<b> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    public final String f7676a;

    public static class a extends Exception {
    }

    b(String str) {
        this.f7676a = str;
    }

    public static b a(String str) throws a {
        for (b bVar : values()) {
            if (str.equals(bVar.f7676a)) {
                return bVar;
            }
        }
        throw new a(i8.n.d("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7676a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7676a);
    }
}
