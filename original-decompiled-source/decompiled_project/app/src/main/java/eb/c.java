package eb;

import android.os.Parcel;
import android.os.Parcelable;
import i8.n;

@Deprecated
/* loaded from: classes2.dex */
public enum c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<c> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final String f8653a;

    public static class a extends Exception {
    }

    c(String str) {
        this.f8653a = str;
    }

    public static c a(String str) throws a {
        if (str == null) {
            return UNKNOWN;
        }
        for (c cVar : values()) {
            if (str.equals(cVar.f8653a)) {
                return cVar;
            }
        }
        throw new a(n.d("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8653a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8653a);
    }
}
