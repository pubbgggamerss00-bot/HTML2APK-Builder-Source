package pa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final String f21383a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final int f21384b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21385c;

    public c(String str, long j10) {
        this.f21383a = str;
        this.f21385c = j10;
        this.f21384b = -1;
    }

    public final long d() {
        long j10 = this.f21385c;
        return j10 == -1 ? this.f21384b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f21383a;
            String str2 = this.f21383a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && d() == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21383a, Long.valueOf(d())});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f21383a, "name");
        aVar.a(Long.valueOf(d()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f21383a, false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f21384b);
        long jD = d();
        c1.s(parcel, 3, 8);
        parcel.writeLong(jD);
        c1.r(iQ, parcel);
    }

    public c(String str, long j10, int i10) {
        this.f21383a = str;
        this.f21384b = i10;
        this.f21385c = j10;
    }
}
