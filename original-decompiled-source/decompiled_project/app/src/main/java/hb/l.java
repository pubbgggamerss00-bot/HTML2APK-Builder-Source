package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends qa.a {
    public static final Parcelable.Creator<l> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final List<n0> f12960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12961b;

    public l(ArrayList arrayList, int i10) {
        this.f12960a = arrayList;
        this.f12961b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.o.a(this.f12960a, lVar.f12960a) && this.f12961b == lVar.f12961b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12960a, Integer.valueOf(this.f12961b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.p.f(parcel);
        int iQ = c1.q(20293, parcel);
        c1.p(parcel, 1, this.f12960a, false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f12961b);
        c1.r(iQ, parcel);
    }
}
