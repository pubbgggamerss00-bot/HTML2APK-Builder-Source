package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final String f11883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11885c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11886d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11887e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11888f;

    public f(String str, String str2, String str3, String str4, boolean z10, int i10) {
        com.google.android.gms.common.internal.p.f(str);
        this.f11883a = str;
        this.f11884b = str2;
        this.f11885c = str3;
        this.f11886d = str4;
        this.f11887e = z10;
        this.f11888f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.google.android.gms.common.internal.o.a(this.f11883a, fVar.f11883a) && com.google.android.gms.common.internal.o.a(this.f11886d, fVar.f11886d) && com.google.android.gms.common.internal.o.a(this.f11884b, fVar.f11884b) && com.google.android.gms.common.internal.o.a(Boolean.valueOf(this.f11887e), Boolean.valueOf(fVar.f11887e)) && this.f11888f == fVar.f11888f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11883a, this.f11884b, this.f11886d, Boolean.valueOf(this.f11887e), Integer.valueOf(this.f11888f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f11883a, false);
        c1.m(parcel, 2, this.f11884b, false);
        c1.m(parcel, 3, this.f11885c, false);
        c1.m(parcel, 4, this.f11886d, false);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f11887e ? 1 : 0);
        c1.s(parcel, 6, 4);
        parcel.writeInt(this.f11888f);
        c1.r(iQ, parcel);
    }
}
