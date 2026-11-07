package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes2.dex */
public final class y implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = DescriptorProtos.Edition.EDITION_2023_VALUE;
        long jP = 0;
        i0[] i0VarArr = null;
        int iN2 = 1;
        int iN3 = 1;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iN2 = qa.b.n(i10, parcel);
            } else if (c10 == 2) {
                iN3 = qa.b.n(i10, parcel);
            } else if (c10 == 3) {
                jP = qa.b.p(i10, parcel);
            } else if (c10 == 4) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 != 5) {
                qa.b.s(i10, parcel);
            } else {
                i0VarArr = (i0[]) qa.b.h(parcel, i10, i0.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.f6256d = iN;
        locationAvailability.f6253a = iN2;
        locationAvailability.f6254b = iN3;
        locationAvailability.f6255c = jP;
        locationAvailability.f6257e = i0VarArr;
        return locationAvailability;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
