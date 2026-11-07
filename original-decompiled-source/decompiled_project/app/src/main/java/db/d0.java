package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d0 extends qa.a {
    public static final Parcelable.Creator<d0> CREATOR = new h1();

    /* renamed from: a, reason: collision with root package name */
    public final a f7702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7703b;

    public enum a implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new g1();

        /* renamed from: a, reason: collision with root package name */
        public final String f7705a;

        a(String str) {
            this.f7705a = str;
        }

        public static a a(String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.f7705a)) {
                    return aVar;
                }
            }
            throw new b(i8.n.d("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f7705a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f7705a);
        }
    }

    public static class b extends Exception {
    }

    static {
        new d0("supported", null);
        new d0("not-supported", null);
    }

    public d0(String str, String str2) {
        com.google.android.gms.common.internal.p.f(str);
        try {
            this.f7702a = a.a(str);
            this.f7703b = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return zzbk.zza(this.f7702a, d0Var.f7702a) && zzbk.zza(this.f7703b, d0Var.f7703b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7702a, this.f7703b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 2, this.f7702a.f7705a, false);
        androidx.lifecycle.c1.m(parcel, 3, this.f7703b, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
