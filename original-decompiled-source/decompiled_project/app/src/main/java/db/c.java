package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum c implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<c> CREATOR = new i1();

    /* renamed from: a, reason: collision with root package name */
    public final String f7682a;

    public static class a extends Exception {
    }

    c(String str) {
        this.f7682a = str;
    }

    public static c a(String str) throws a {
        for (c cVar : values()) {
            if (str.equals(cVar.f7682a)) {
                return cVar;
            }
        }
        throw new a(i8.n.d("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7682a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7682a);
    }
}
