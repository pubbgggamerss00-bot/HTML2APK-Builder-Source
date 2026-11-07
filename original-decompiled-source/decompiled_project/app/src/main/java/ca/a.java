package ca;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import androidx.room.y0;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5340c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5342e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5343f;

    public a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f5338a = i10;
        this.f5339b = j10;
        p.f(str);
        this.f5340c = str;
        this.f5341d = i11;
        this.f5342e = i12;
        this.f5343f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f5338a == aVar.f5338a && this.f5339b == aVar.f5339b && o.a(this.f5340c, aVar.f5340c) && this.f5341d == aVar.f5341d && this.f5342e == aVar.f5342e && o.a(this.f5343f, aVar.f5343f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5338a), Long.valueOf(this.f5339b), this.f5340c, Integer.valueOf(this.f5341d), Integer.valueOf(this.f5342e), this.f5343f});
    }

    public final String toString() {
        int i10 = this.f5341d;
        StringBuilder sbA = y0.a("AccountChangeEvent {accountName = ", this.f5340c, ", changeType = ", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        sbA.append(this.f5343f);
        sbA.append(", eventIndex = ");
        sbA.append(this.f5342e);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f5338a);
        c1.s(parcel, 2, 8);
        parcel.writeLong(this.f5339b);
        c1.m(parcel, 3, this.f5340c, false);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f5341d);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f5342e);
        c1.m(parcel, 6, this.f5343f, false);
        c1.r(iQ, parcel);
    }
}
