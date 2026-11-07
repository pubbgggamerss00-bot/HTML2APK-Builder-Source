package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum f0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<f0> CREATOR = new k1();

    /* renamed from: a, reason: collision with root package name */
    public final String f7716a;

    f0(String str) {
        this.f7716a = str;
    }

    public static f0 a(String str) throws l1 {
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f7716a)) {
                return f0Var;
            }
        }
        throw new l1(i8.n.d("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7716a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7716a);
    }
}
