package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        boolean zK = false;
        boolean zK2 = false;
        d0 d0Var = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, LocationRequest.CREATOR);
            } else if (c10 == 2) {
                zK = qa.b.k(i10, parcel);
            } else if (c10 == 3) {
                zK2 = qa.b.k(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                d0Var = (d0) qa.b.e(parcel, i10, d0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new i(arrayListI, zK, zK2, d0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
