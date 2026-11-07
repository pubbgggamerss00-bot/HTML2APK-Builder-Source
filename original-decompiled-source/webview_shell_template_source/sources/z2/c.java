package z2;

import android.os.Parcel;
import android.os.Parcelable;
import e5.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends f3.a {
    public static final Parcelable.Creator<c> CREATOR = new d();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f15430t;

    public c(String str, String str2) {
        this.s = str;
        this.f15430t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        i.m(parcel, 1, this.s);
        i.m(parcel, 2, this.f15430t);
        i.t(iS, parcel);
    }
}
