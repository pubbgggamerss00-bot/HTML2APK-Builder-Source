package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i0 extends qa.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final int f12945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12946b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12947c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12948d;

    public i0(int i10, int i11, long j10, long j11) {
        this.f12945a = i10;
        this.f12946b = i11;
        this.f12947c = j10;
        this.f12948d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f12945a == i0Var.f12945a && this.f12946b == i0Var.f12946b && this.f12947c == i0Var.f12947c && this.f12948d == i0Var.f12948d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12946b), Integer.valueOf(this.f12945a), Long.valueOf(this.f12948d), Long.valueOf(this.f12947c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f12945a + " Cell status: " + this.f12946b + " elapsed time NS: " + this.f12948d + " system time ms: " + this.f12947c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f12945a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12946b);
        c1.s(parcel, 3, 8);
        parcel.writeLong(this.f12947c);
        c1.s(parcel, 4, 8);
        parcel.writeLong(this.f12948d);
        c1.r(iQ, parcel);
    }
}
