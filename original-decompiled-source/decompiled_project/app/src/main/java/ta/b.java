package ta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f28621a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28622b;

    public b(int i10, a aVar) {
        this.f28621a = i10;
        this.f28622b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f28621a);
        c1.l(parcel, 2, this.f28622b, i10, false);
        c1.r(iQ, parcel);
    }

    public b(a aVar) {
        this.f28621a = 1;
        this.f28622b = aVar;
    }
}
