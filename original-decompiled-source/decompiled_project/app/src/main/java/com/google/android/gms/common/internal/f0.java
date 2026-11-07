package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        int iN = -1;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        String strF = null;
        String strF2 = null;
        long jP = 0;
        long jP2 = 0;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iN2 = qa.b.n(i10, parcel);
                    break;
                case 2:
                    iN3 = qa.b.n(i10, parcel);
                    break;
                case 3:
                    iN4 = qa.b.n(i10, parcel);
                    break;
                case 4:
                    jP = qa.b.p(i10, parcel);
                    break;
                case 5:
                    jP2 = qa.b.p(i10, parcel);
                    break;
                case 6:
                    strF = qa.b.f(i10, parcel);
                    break;
                case 7:
                    strF2 = qa.b.f(i10, parcel);
                    break;
                case '\b':
                    iN5 = qa.b.n(i10, parcel);
                    break;
                case '\t':
                    iN = qa.b.n(i10, parcel);
                    break;
                default:
                    qa.b.s(i10, parcel);
                    break;
            }
        }
        qa.b.j(iT, parcel);
        return new n(iN2, iN3, iN4, jP, jP2, strF, strF2, iN5, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
