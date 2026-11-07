package hb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public final class z implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationRequest createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 102;
        long jP = 3600000;
        long jP2 = SignalCredentialStateController.MAX_RETRY_TIME;
        boolean zK = false;
        long jP3 = 0;
        float f10 = 0.0f;
        int iN2 = Integer.MAX_VALUE;
        long jP4 = Long.MAX_VALUE;
        boolean zK2 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            boolean z10 = zK2;
            switch ((char) i10) {
                case 1:
                    iN = qa.b.n(i10, parcel);
                    break;
                case 2:
                    jP = qa.b.p(i10, parcel);
                    break;
                case 3:
                    jP2 = qa.b.p(i10, parcel);
                    break;
                case 4:
                    zK = qa.b.k(i10, parcel);
                    break;
                case 5:
                    jP4 = qa.b.p(i10, parcel);
                    break;
                case 6:
                    iN2 = qa.b.n(i10, parcel);
                    break;
                case 7:
                    qa.b.v(parcel, i10, 4);
                    f10 = parcel.readFloat();
                    break;
                case '\b':
                    jP3 = qa.b.p(i10, parcel);
                    break;
                case '\t':
                    zK2 = qa.b.k(i10, parcel);
                    continue;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
            zK2 = z10;
        }
        qa.b.j(iT, parcel);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f6258a = iN;
        locationRequest.f6259b = jP;
        locationRequest.f6260c = jP2;
        locationRequest.f6261d = zK;
        locationRequest.f6262e = jP4;
        locationRequest.f6263f = iN2;
        locationRequest.f6264g = f10;
        locationRequest.f6265h = jP3;
        locationRequest.f6266j = zK2;
        return locationRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
