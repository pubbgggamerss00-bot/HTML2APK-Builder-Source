package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends f3.a {
    public static final Parcelable.Creator<i> CREATOR = new j();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f14603t;

    public i(int i6, a0 a0Var) {
        this.s = i6;
        this.f14603t = a0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.l(parcel, 2, this.f14603t, i6);
        e5.i.t(iS, parcel);
    }
}
