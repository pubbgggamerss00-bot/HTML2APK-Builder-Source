package fb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z implements Parcelable.Creator<GetCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        ArrayList arrayListI = null;
        Bundle bundleB = null;
        String strF = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListI = qa.b.i(parcel, i10, s.CREATOR);
            } else if (c10 == 2) {
                bundleB = qa.b.b(i10, parcel);
            } else if (c10 == 3) {
                strF = qa.b.f(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                resultReceiver = (ResultReceiver) qa.b.e(parcel, i10, ResultReceiver.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new GetCredentialRequest(arrayListI, bundleB, strF, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest[] newArray(int i10) {
        return new GetCredentialRequest[i10];
    }
}
