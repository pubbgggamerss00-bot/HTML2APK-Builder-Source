package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        g0 g0Var = null;
        r1 r1Var = null;
        f fVar = null;
        t1 t1Var = null;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                g0Var = (g0) qa.b.e(parcel, i10, g0.CREATOR);
            } else if (c10 == 2) {
                r1Var = (r1) qa.b.e(parcel, i10, r1.CREATOR);
            } else if (c10 == 3) {
                fVar = (f) qa.b.e(parcel, i10, f.CREATOR);
            } else if (c10 == 4) {
                t1Var = (t1) qa.b.e(parcel, i10, t1.CREATOR);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                strF = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new e(g0Var, r1Var, fVar, t1Var, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
