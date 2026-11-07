package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import qa.b;

/* loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        List<c> listI = zzba.zza;
        LocationRequest locationRequest = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        boolean zK4 = false;
        boolean zK5 = false;
        long jP = Long.MAX_VALUE;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 != 1) {
                switch (c10) {
                    case 5:
                        listI = b.i(parcel, i10, c.CREATOR);
                        break;
                    case 6:
                        strF = b.f(i10, parcel);
                        break;
                    case 7:
                        zK = b.k(i10, parcel);
                        break;
                    case '\b':
                        zK2 = b.k(i10, parcel);
                        break;
                    case '\t':
                        zK3 = b.k(i10, parcel);
                        break;
                    case '\n':
                        strF2 = b.f(i10, parcel);
                        break;
                    case 11:
                        zK4 = b.k(i10, parcel);
                        break;
                    case '\f':
                        zK5 = b.k(i10, parcel);
                        break;
                    case '\r':
                        strF3 = b.f(i10, parcel);
                        break;
                    case 14:
                        jP = b.p(i10, parcel);
                        break;
                    default:
                        b.s(i10, parcel);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.e(parcel, i10, LocationRequest.CREATOR);
            }
        }
        b.j(iT, parcel);
        return new zzba(locationRequest, listI, strF, zK, zK2, zK3, strF2, zK4, zK5, strF3, jP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
