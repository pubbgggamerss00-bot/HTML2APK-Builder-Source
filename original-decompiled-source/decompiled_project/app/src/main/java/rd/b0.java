package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b0 extends qa.a {
    public static final Parcelable.Creator<b0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final List<qd.b0> f23344a;

    /* renamed from: b, reason: collision with root package name */
    public final List<qd.e0> f23345b;

    public b0(ArrayList arrayList, ArrayList arrayList2) {
        this.f23344a = arrayList == null ? new ArrayList() : arrayList;
        this.f23345b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.p(parcel, 1, this.f23344a, false);
        androidx.lifecycle.c1.p(parcel, 2, this.f23345b, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
