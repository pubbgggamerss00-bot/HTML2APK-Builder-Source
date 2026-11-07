package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        String strF2 = null;
        ArrayList arrayListG = null;
        String strF3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    pendingIntent = (PendingIntent) qa.b.e(parcel, i10, PendingIntent.CREATOR);
                    break;
                case 2:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 3:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 4:
                    arrayListG = qa.b.g(i10, parcel);
                    break;
                case 5:
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case 6:
                    iN = qa.b.n(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strF, strF2, arrayListG, strF3, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
