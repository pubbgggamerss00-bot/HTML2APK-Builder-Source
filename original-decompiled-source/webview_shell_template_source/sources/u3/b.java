package u3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends f3.a implements d3.i {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14600t;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f14601u;

    public b() {
        this(2, 0, null);
    }

    @Override // d3.i
    public final Status getStatus() {
        return this.f14600t == 0 ? Status.f2395w : Status.f2398z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f14600t);
        e5.i.l(parcel, 3, this.f14601u, i6);
        e5.i.t(iS, parcel);
    }

    public b(int i6, int i7, Intent intent) {
        this.s = i6;
        this.f14600t = i7;
        this.f14601u = intent;
    }
}
