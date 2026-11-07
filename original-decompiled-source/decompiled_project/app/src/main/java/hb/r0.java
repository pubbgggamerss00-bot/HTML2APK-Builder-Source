package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        String strF = null;
        ArrayList arrayListI2 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, b.CREATOR);
            } else if (c10 == 2) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 == 3) {
                arrayListI2 = qa.b.i(parcel, i10, com.google.android.gms.common.internal.c.CREATOR);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                strF2 = qa.b.f(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new c(arrayListI, strF, arrayListI2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
