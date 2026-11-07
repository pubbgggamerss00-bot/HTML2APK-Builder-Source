package hb;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class t0 implements Parcelable.Creator<s0> {
    @Override // android.os.Parcelable.Creator
    public final s0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        boolean zK = true;
        long jP = 50;
        float f10 = 0.0f;
        long jP2 = Long.MAX_VALUE;
        int iN = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 == 2) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 == 3) {
                qa.b.v(parcel, i10, 4);
                f10 = parcel.readFloat();
            } else if (c10 == 4) {
                jP2 = qa.b.p(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                iN = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new s0(zK, jP, f10, jP2, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s0[] newArray(int i10) {
        return new s0[i10];
    }
}
