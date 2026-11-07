package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        String strD = null;
        zze zzeVar = null;
        Bundle bundleA = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        long jL = 0;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 2:
                    jL = f3.b.l(i6, parcel);
                    break;
                case 3:
                    zzeVar = (zze) f3.b.c(parcel, i6, zze.CREATOR);
                    break;
                case 4:
                    bundleA = f3.b.a(i6, parcel);
                    break;
                case 5:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case 6:
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case 7:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case '\b':
                    strD5 = f3.b.d(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new zzw(strD, jL, zzeVar, bundleA, strD2, strD3, strD4, strD5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzw[i6];
    }
}
