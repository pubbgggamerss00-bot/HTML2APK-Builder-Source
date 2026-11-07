package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        String strF = null;
        int iN = 0;
        short s10 = 0;
        int iN2 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long jP = 0;
        int iN3 = -1;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strF = b.f(i10, parcel);
                    break;
                case 2:
                    jP = b.p(i10, parcel);
                    break;
                case 3:
                    b.v(parcel, i10, 4);
                    s10 = (short) parcel.readInt();
                    break;
                case 4:
                    b.v(parcel, i10, 8);
                    d10 = parcel.readDouble();
                    break;
                case 5:
                    b.v(parcel, i10, 8);
                    d11 = parcel.readDouble();
                    break;
                case 6:
                    b.v(parcel, i10, 4);
                    f10 = parcel.readFloat();
                    break;
                case 7:
                    iN = b.n(i10, parcel);
                    break;
                case '\b':
                    iN2 = b.n(i10, parcel);
                    break;
                case '\t':
                    iN3 = b.n(i10, parcel);
                    break;
                default:
                    b.s(i10, parcel);
                    break;
            }
        }
        b.j(iT, parcel);
        return new zzbe(strF, iN, s10, d10, d11, f10, jP, iN2, iN3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i10) {
        return new zzbe[i10];
    }
}
