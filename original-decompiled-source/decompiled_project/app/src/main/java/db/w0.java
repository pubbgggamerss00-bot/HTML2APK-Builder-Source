package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        h hVar = null;
        g gVar = null;
        i iVar = null;
        e eVar = null;
        String strF3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 2:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case 3:
                    bArrC = qa.b.c(i10, parcel);
                    break;
                case 4:
                    hVar = (h) qa.b.e(parcel, i10, h.CREATOR);
                    break;
                case 5:
                    gVar = (g) qa.b.e(parcel, i10, g.CREATOR);
                    break;
                case 6:
                    iVar = (i) qa.b.e(parcel, i10, i.CREATOR);
                    break;
                case 7:
                    eVar = (e) qa.b.e(parcel, i10, e.CREATOR);
                    break;
                case '\b':
                    strF3 = qa.b.f(i10, parcel);
                    break;
                case '\t':
                    qa.b.f(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new t(strF, strF2, bArrC, hVar, gVar, iVar, eVar, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
