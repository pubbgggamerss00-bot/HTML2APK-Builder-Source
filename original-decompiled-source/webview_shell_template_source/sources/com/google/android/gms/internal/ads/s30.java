package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s30 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        Bundle bundleA = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String strD = null;
        ArrayList arrayListF = null;
        PackageInfo packageInfo = null;
        String strD2 = null;
        String strD3 = null;
        cd1 cd1Var = null;
        String strD4 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    bundleA = f3.b.a(i6, parcel);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) f3.b.c(parcel, i6, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) f3.b.c(parcel, i6, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 5:
                    arrayListF = f3.b.f(i6, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) f3.b.c(parcel, i6, PackageInfo.CREATOR);
                    break;
                case 7:
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case '\b':
                default:
                    f3.b.n(i6, parcel);
                    break;
                case '\t':
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case '\n':
                    cd1Var = (cd1) f3.b.c(parcel, i6, cd1.CREATOR);
                    break;
                case 11:
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case '\f':
                    zI = f3.b.i(i6, parcel);
                    break;
                case '\r':
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case 14:
                    bundleA2 = f3.b.a(i6, parcel);
                    break;
                case 15:
                    bundleA3 = f3.b.a(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new r30(bundleA, versionInfoParcel, applicationInfo, strD, arrayListF, packageInfo, strD2, strD3, cd1Var, strD4, zI, zI2, bundleA2, bundleA3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new r30[i6];
    }
}
