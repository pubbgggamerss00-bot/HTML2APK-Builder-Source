package rd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c1 implements Parcelable.Creator<d1> {
    @Override // android.os.Parcelable.Creator
    public final d1 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        g gVar = null;
        b1 b1Var = null;
        qd.w0 w0Var = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                gVar = (g) qa.b.e(parcel, i10, g.CREATOR);
            } else if (c10 == 2) {
                b1Var = (b1) qa.b.e(parcel, i10, b1.CREATOR);
            } else if (c10 != 3) {
                qa.b.s(i10, parcel);
            } else {
                w0Var = (qd.w0) qa.b.e(parcel, i10, qd.w0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        d1 d1Var = new d1();
        d1Var.f23360a = gVar;
        d1Var.f23361b = b1Var;
        d1Var.f23362c = w0Var;
        return d1Var;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d1[] newArray(int i10) {
        return new d1[i10];
    }
}
