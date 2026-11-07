package db;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < iT) {
                int i10 = parcel.readInt();
                if (((char) i10) != 1) {
                    qa.b.s(i10, parcel);
                } else {
                    int iR = qa.b.r(i10, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iR == 0) {
                        break;
                    }
                    int i11 = parcel.readInt();
                    byte[][] bArr2 = new byte[i11][];
                    for (int i12 = 0; i12 < i11; i12++) {
                        bArr2[i12] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(iDataPosition + iR);
                    bArr = bArr2;
                }
            }
            qa.b.j(iT, parcel);
            return new t0(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
