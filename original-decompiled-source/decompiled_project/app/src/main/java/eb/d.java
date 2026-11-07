package eb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import eb.c;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f8654a;

    /* renamed from: b, reason: collision with root package name */
    public final c f8655b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8656c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8657d;

    public d(int i10, String str, String str2, byte[] bArr) {
        this.f8654a = i10;
        try {
            this.f8655b = c.a(str);
            this.f8656c = bArr;
            this.f8657d = str2;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f8657d;
        if (!Arrays.equals(this.f8656c, dVar.f8656c) || this.f8655b != dVar.f8655b) {
            return false;
        }
        String str2 = this.f8657d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f8655b.hashCode() + ((Arrays.hashCode(this.f8656c) + 31) * 31);
        String str = this.f8657d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f8654a);
        c1.m(parcel, 2, this.f8655b.f8653a, false);
        c1.f(parcel, 3, this.f8656c, false);
        c1.m(parcel, 4, this.f8657d, false);
        c1.r(iQ, parcel);
    }
}
