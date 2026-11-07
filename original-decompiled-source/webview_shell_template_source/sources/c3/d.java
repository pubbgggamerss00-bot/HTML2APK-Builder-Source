package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f3.a {
    public static final Parcelable.Creator<d> CREATOR = new r();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public final int f2178t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2179u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2180v;

    public d(String str, int i6, long j6, boolean z6) {
        this.s = str;
        this.f2178t = i6;
        this.f2179u = j6;
        this.f2180v = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (com.google.android.gms.common.internal.k.a(this.s, dVar.s) && l() == dVar.l() && this.f2180v == dVar.f2180v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, Long.valueOf(l()), Boolean.valueOf(this.f2180v)});
    }

    public final long l() {
        long j6 = this.f2179u;
        return j6 == -1 ? this.f2178t : j6;
    }

    public final String toString() {
        k.a aVar = new k.a(this);
        aVar.a("name", this.s);
        aVar.a("version", Long.valueOf(l()));
        aVar.a("is_fully_rolled_out", Boolean.valueOf(this.f2180v));
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f2178t);
        long jL = l();
        e5.i.r(parcel, 3, 8);
        parcel.writeLong(jL);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f2180v ? 1 : 0);
        e5.i.t(iS, parcel);
    }

    public d(String str) {
        this(str, -1, 1L, false);
    }
}
