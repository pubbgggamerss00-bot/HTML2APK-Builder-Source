package a3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import f3.b;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int i6;
        int iO = b.o(parcel);
        long jL = 0;
        int iK = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Uri uri = null;
        String strD5 = null;
        String strD6 = null;
        ArrayList arrayList = null;
        String strD7 = null;
        String strD8 = null;
        while (true) {
            long j6 = jL;
            while (parcel.dataPosition() < iO) {
                i6 = parcel.readInt();
                switch ((char) i6) {
                    case 1:
                        iK = b.k(i6, parcel);
                        break;
                    case 2:
                        strD = b.d(i6, parcel);
                        break;
                    case 3:
                        strD2 = b.d(i6, parcel);
                        break;
                    case 4:
                        strD3 = b.d(i6, parcel);
                        break;
                    case 5:
                        strD4 = b.d(i6, parcel);
                        break;
                    case 6:
                        uri = (Uri) b.c(parcel, i6, Uri.CREATOR);
                        break;
                    case 7:
                        strD5 = b.d(i6, parcel);
                        break;
                    case '\b':
                        break;
                    case '\t':
                        strD6 = b.d(i6, parcel);
                        break;
                    case '\n':
                        Parcelable.Creator<Scope> creator = Scope.CREATOR;
                        int iM = b.m(i6, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iM != 0) {
                            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iM);
                            arrayList = arrayListCreateTypedArrayList;
                            break;
                        } else {
                            arrayList = null;
                            break;
                        }
                    case 11:
                        strD7 = b.d(i6, parcel);
                        break;
                    case '\f':
                        strD8 = b.d(i6, parcel);
                        break;
                    default:
                        b.n(i6, parcel);
                        break;
                }
            }
            b.h(iO, parcel);
            return new GoogleSignInAccount(iK, strD, strD2, strD3, strD4, uri, strD5, j6, strD6, arrayList, strD7, strD8);
            jL = b.l(i6, parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i6) {
        return new GoogleSignInAccount[i6];
    }
}
