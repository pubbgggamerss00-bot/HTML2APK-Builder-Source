package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends f3.a implements d3.i {
    public static final Parcelable.Creator<g> CREATOR = new h();
    public final List<String> s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14602t;

    public g(ArrayList arrayList, String str) {
        this.s = arrayList;
        this.f14602t = str;
    }

    @Override // d3.i
    public final Status getStatus() {
        return this.f14602t != null ? Status.f2395w : Status.f2398z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.o(parcel, 1, this.s);
        e5.i.m(parcel, 2, this.f14602t);
        e5.i.t(iS, parcel);
    }
}
