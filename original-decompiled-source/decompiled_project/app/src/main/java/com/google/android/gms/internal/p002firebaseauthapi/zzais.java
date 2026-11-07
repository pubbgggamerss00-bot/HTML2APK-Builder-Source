package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes2.dex */
public final class zzais implements Parcelable.Creator<zzait> {
    @Override // android.os.Parcelable.Creator
    public final zzait createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        String strF12 = null;
        String strF13 = null;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strF = b.f(i10, parcel);
                    break;
                case 3:
                    strF2 = b.f(i10, parcel);
                    break;
                case 4:
                    strF3 = b.f(i10, parcel);
                    break;
                case 5:
                    strF4 = b.f(i10, parcel);
                    break;
                case 6:
                    strF5 = b.f(i10, parcel);
                    break;
                case 7:
                    strF6 = b.f(i10, parcel);
                    break;
                case '\b':
                    strF7 = b.f(i10, parcel);
                    break;
                case '\t':
                    strF8 = b.f(i10, parcel);
                    break;
                case '\n':
                    zK = b.k(i10, parcel);
                    break;
                case 11:
                    zK2 = b.k(i10, parcel);
                    break;
                case '\f':
                    strF9 = b.f(i10, parcel);
                    break;
                case '\r':
                    strF10 = b.f(i10, parcel);
                    break;
                case 14:
                    strF11 = b.f(i10, parcel);
                    break;
                case 15:
                    strF12 = b.f(i10, parcel);
                    break;
                case 16:
                    zK3 = b.k(i10, parcel);
                    break;
                case 17:
                    strF13 = b.f(i10, parcel);
                    break;
                default:
                    b.s(i10, parcel);
                    break;
            }
        }
        b.j(iT, parcel);
        return new zzait(strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, zK, zK2, strF9, strF10, strF11, strF12, zK3, strF13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzait[] newArray(int i10) {
        return new zzait[i10];
    }
}
