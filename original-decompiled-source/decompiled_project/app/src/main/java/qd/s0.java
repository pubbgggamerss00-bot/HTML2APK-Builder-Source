package qd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;

/* loaded from: classes2.dex */
public final class s0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        zzair zzairVar = null;
        long jP = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 2) {
                strF2 = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                zzairVar = (zzair) qa.b.e(parcel, i10, zzair.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new e0(strF, strF2, jP, zzairVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i10) {
        return new e0[i10];
    }
}
