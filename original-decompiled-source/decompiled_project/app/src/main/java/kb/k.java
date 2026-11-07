package kb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.j0;

/* loaded from: classes2.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final int f16256a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.a f16257b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f16258c;

    public k(int i10, pa.a aVar, j0 j0Var) {
        this.f16256a = i10;
        this.f16257b = aVar;
        this.f16258c = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f16256a);
        c1.l(parcel, 2, this.f16257b, i10, false);
        c1.l(parcel, 3, this.f16258c, i10, false);
        c1.r(iQ, parcel);
    }
}
