package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.dn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        long jL = 0;
        boolean zI = false;
        int iK = 0;
        int iK2 = 0;
        boolean zI2 = false;
        zzc zzcVar = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        IBinder iBinderJ3 = null;
        IBinder iBinderJ4 = null;
        String strD = null;
        String strD2 = null;
        IBinder iBinderJ5 = null;
        String strD3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String strD4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinderJ6 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        IBinder iBinderJ7 = null;
        IBinder iBinderJ8 = null;
        IBinder iBinderJ9 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    zzcVar = (zzc) f3.b.c(parcel, i6, zzc.CREATOR);
                    break;
                case 3:
                    iBinderJ = f3.b.j(i6, parcel);
                    break;
                case 4:
                    iBinderJ2 = f3.b.j(i6, parcel);
                    break;
                case 5:
                    iBinderJ3 = f3.b.j(i6, parcel);
                    break;
                case 6:
                    iBinderJ4 = f3.b.j(i6, parcel);
                    break;
                case 7:
                    strD = f3.b.d(i6, parcel);
                    break;
                case '\b':
                    zI = f3.b.i(i6, parcel);
                    break;
                case '\t':
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case '\n':
                    iBinderJ5 = f3.b.j(i6, parcel);
                    break;
                case 11:
                    iK = f3.b.k(i6, parcel);
                    break;
                case '\f':
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case '\r':
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) f3.b.c(parcel, i6, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case dn.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    f3.b.n(i6, parcel);
                    break;
                case 16:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) f3.b.c(parcel, i6, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinderJ6 = f3.b.j(i6, parcel);
                    break;
                case 19:
                    strD5 = f3.b.d(i6, parcel);
                    break;
                case 24:
                    strD6 = f3.b.d(i6, parcel);
                    break;
                case 25:
                    strD7 = f3.b.d(i6, parcel);
                    break;
                case 26:
                    iBinderJ7 = f3.b.j(i6, parcel);
                    break;
                case 27:
                    iBinderJ8 = f3.b.j(i6, parcel);
                    break;
                case 28:
                    iBinderJ9 = f3.b.j(i6, parcel);
                    break;
                case 29:
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 30:
                    jL = f3.b.l(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new AdOverlayInfoParcel(zzcVar, iBinderJ, iBinderJ2, iBinderJ3, iBinderJ4, strD, zI, strD2, iBinderJ5, iK, iK2, strD3, versionInfoParcel, strD4, zzlVar, iBinderJ6, strD5, strD6, strD7, iBinderJ7, iBinderJ8, iBinderJ9, zI2, jL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new AdOverlayInfoParcel[i6];
    }
}
