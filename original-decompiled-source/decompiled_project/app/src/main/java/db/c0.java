package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum c0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<c0> CREATOR = new d1();

    /* renamed from: a, reason: collision with root package name */
    public final String f7685a;

    public static class a extends Exception {
    }

    c0(String str) {
        this.f7685a = str;
    }

    public static c0 a(String str) throws a {
        for (c0 c0Var : values()) {
            if (str.equals(c0Var.f7685a)) {
                return c0Var;
            }
        }
        throw new a(i8.n.d("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7685a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7685a);
    }
}
