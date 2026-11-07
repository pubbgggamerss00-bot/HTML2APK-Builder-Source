package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        boolean zI = false;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        Intent intent = null;
        IBinder iBinderJ = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 2:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 3:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case 4:
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case 5:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case 6:
                    strD5 = f3.b.d(i6, parcel);
                    break;
                case 7:
                    strD6 = f3.b.d(i6, parcel);
                    break;
                case '\b':
                    strD7 = f3.b.d(i6, parcel);
                    break;
                case '\t':
                    intent = (Intent) f3.b.c(parcel, i6, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderJ = f3.b.j(i6, parcel);
                    break;
                case 11:
                    zI = f3.b.i(i6, parcel);
                    break;
                default:
                    f3.b.n(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new zzc(strD, strD2, strD3, strD4, strD5, strD6, strD7, intent, iBinderJ, zI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zzc[i6];
    }
}
