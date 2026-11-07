package ka;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16226b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16227c;

    public a(int i10, int i11, Bundle bundle) {
        this.f16225a = i10;
        this.f16226b = i11;
        this.f16227c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f16225a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f16226b);
        c1.e(parcel, 3, this.f16227c, false);
        c1.r(iQ, parcel);
    }
}
