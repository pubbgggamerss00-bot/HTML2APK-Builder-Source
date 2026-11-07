package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends f3.a {
    public static final Parcelable.Creator<k> CREATOR = new l();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final c3.b f14604t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f14605u;

    public k(int i6, c3.b bVar, c0 c0Var) {
        this.s = i6;
        this.f14604t = bVar;
        this.f14605u = c0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.l(parcel, 2, this.f14604t, i6);
        e5.i.l(parcel, 3, this.f14605u, i6);
        e5.i.t(iS, parcel);
    }
}
