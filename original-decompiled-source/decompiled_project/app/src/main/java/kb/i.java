package kb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.h0;

/* loaded from: classes2.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f16254a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f16255b;

    public i(int i10, h0 h0Var) {
        this.f16254a = i10;
        this.f16255b = h0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f16254a);
        c1.l(parcel, 2, this.f16255b, i10, false);
        c1.r(iQ, parcel);
    }
}
