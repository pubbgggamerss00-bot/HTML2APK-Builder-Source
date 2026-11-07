package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: classes2.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = 0;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bArrC = qa.b.c(i10, parcel);
            } else if (c10 == 2) {
                bArrC2 = qa.b.c(i10, parcel);
            } else if (c10 == 3) {
                bArrC3 = qa.b.c(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                iN = qa.b.n(i10, parcel);
            }
        }
        qa.b.j(iT, parcel);
        return new r0(bArrC == null ? null : zzgx.zzl(bArrC, 0, bArrC.length), bArrC2 == null ? null : zzgx.zzl(bArrC2, 0, bArrC2.length), bArrC3 != null ? zzgx.zzl(bArrC3, 0, bArrC3.length) : null, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r0[i10];
    }
}
