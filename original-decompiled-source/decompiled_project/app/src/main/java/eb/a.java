package eb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

@Deprecated
/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0088a f8640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8641b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8642c;

    /* renamed from: eb.a$a, reason: collision with other inner class name */
    public enum EnumC0088a implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator<EnumC0088a> CREATOR = new f();

        /* renamed from: a, reason: collision with root package name */
        public final int f8646a;

        EnumC0088a(int i10) {
            this.f8646a = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8646a);
        }
    }

    public static class b extends Exception {
    }

    static {
        new a();
        new a("unavailable");
        new a("unused");
    }

    public a() {
        this.f8640a = EnumC0088a.ABSENT;
        this.f8642c = null;
        this.f8641b = null;
    }

    public static EnumC0088a d(int i10) throws b {
        for (EnumC0088a enumC0088a : EnumC0088a.values()) {
            if (i10 == enumC0088a.f8646a) {
                return enumC0088a;
            }
        }
        throw new b(ad.b.b(i10, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        EnumC0088a enumC0088a = aVar.f8640a;
        EnumC0088a enumC0088a2 = this.f8640a;
        if (!enumC0088a2.equals(enumC0088a)) {
            return false;
        }
        int iOrdinal = enumC0088a2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f8641b.equals(aVar.f8641b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f8642c.equals(aVar.f8642c);
    }

    public final int hashCode() {
        int i10;
        int iHashCode;
        EnumC0088a enumC0088a = this.f8640a;
        int iHashCode2 = enumC0088a.hashCode() + 31;
        int iOrdinal = enumC0088a.ordinal();
        if (iOrdinal == 1) {
            i10 = iHashCode2 * 31;
            iHashCode = this.f8641b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i10 = iHashCode2 * 31;
            iHashCode = this.f8642c.hashCode();
        }
        return iHashCode + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.f8640a.f8646a;
        c1.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c1.m(parcel, 3, this.f8641b, false);
        c1.m(parcel, 4, this.f8642c, false);
        c1.r(iQ, parcel);
    }

    public a(int i10, String str, String str2) {
        try {
            this.f8640a = d(i10);
            this.f8641b = str;
            this.f8642c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public a(String str) {
        this.f8641b = str;
        this.f8640a = EnumC0088a.STRING;
        this.f8642c = null;
    }
}
