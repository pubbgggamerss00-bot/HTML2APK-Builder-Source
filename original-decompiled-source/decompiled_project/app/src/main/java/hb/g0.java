package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class g0 implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Status status = null;
        k kVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                status = (Status) qa.b.e(parcel, i10, Status.CREATOR);
            } else if (c10 != 2) {
                qa.b.s(i10, parcel);
            } else {
                kVar = (k) qa.b.e(parcel, i10, k.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new j(status, kVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
