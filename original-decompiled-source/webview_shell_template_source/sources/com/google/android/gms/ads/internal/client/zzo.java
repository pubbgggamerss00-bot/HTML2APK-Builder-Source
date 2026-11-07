package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.dn;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        long jL = 0;
        long jL2 = 0;
        int iK = 0;
        int iK2 = 0;
        boolean zI = false;
        int iK3 = 0;
        boolean zI2 = false;
        boolean zI3 = false;
        int iK4 = 0;
        int iK5 = 0;
        int iK6 = 0;
        Bundle bundleA = null;
        ArrayList arrayListF = null;
        String strD = null;
        zzfx zzfxVar = null;
        Location location = null;
        String strD2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList arrayListF2 = null;
        String strD3 = null;
        String strD4 = null;
        zzc zzcVar = null;
        String strD5 = null;
        ArrayList arrayListF3 = null;
        String strD6 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 2:
                    jL = f3.b.l(i6, parcel);
                    break;
                case 3:
                    bundleA = f3.b.a(i6, parcel);
                    break;
                case 4:
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 5:
                    arrayListF = f3.b.f(i6, parcel);
                    break;
                case 6:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 7:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case '\b':
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case '\t':
                    strD = f3.b.d(i6, parcel);
                    break;
                case '\n':
                    zzfxVar = (zzfx) f3.b.c(parcel, i6, zzfx.CREATOR);
                    break;
                case 11:
                    location = (Location) f3.b.c(parcel, i6, Location.CREATOR);
                    break;
                case '\f':
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case '\r':
                    bundleA2 = f3.b.a(i6, parcel);
                    break;
                case 14:
                    bundleA3 = f3.b.a(i6, parcel);
                    break;
                case 15:
                    arrayListF2 = f3.b.f(i6, parcel);
                    break;
                case 16:
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case 17:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case 18:
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case 19:
                    zzcVar = (zzc) f3.b.c(parcel, i6, zzc.CREATOR);
                    break;
                case 20:
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case dn.zzm /* 21 */:
                    strD5 = f3.b.d(i6, parcel);
                    break;
                case 22:
                    arrayListF3 = f3.b.f(i6, parcel);
                    break;
                case 23:
                    iK5 = f3.b.k(i6, parcel);
                    break;
                case 24:
                    strD6 = f3.b.d(i6, parcel);
                    break;
                case 25:
                    iK6 = f3.b.k(i6, parcel);
                    break;
                case 26:
                    jL2 = f3.b.l(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new zzm(iK, jL, bundleA, iK2, arrayListF, zI, iK3, zI2, strD, zzfxVar, location, strD2, bundleA2, bundleA3, arrayListF2, strD3, strD4, zI3, zzcVar, iK4, strD5, arrayListF3, iK5, strD6, iK6, jL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzm[i6];
    }
}
