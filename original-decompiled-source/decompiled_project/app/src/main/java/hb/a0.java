package hb;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* loaded from: classes2.dex */
public final class a0 implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationResult createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        List<Location> listI = LocationResult.f6267b;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                listI = qa.b.i(parcel, i10, Location.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new LocationResult(listI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
