package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z20 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        float f6 = 0.0f;
        float f7 = 0.0f;
        long jL = 0;
        long jL2 = 0;
        int iK = 0;
        Bundle bundleA = null;
        zzm zzmVar = null;
        zzs zzsVar = null;
        String strD = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundleA2 = null;
        int iK2 = 0;
        ArrayList arrayListF = null;
        Bundle bundleA3 = null;
        boolean zI = false;
        int iK3 = 0;
        int iK4 = 0;
        String strD5 = null;
        String strD6 = null;
        ArrayList arrayListF2 = null;
        String strD7 = null;
        oq oqVar = null;
        ArrayList arrayListF3 = null;
        String strD8 = null;
        boolean zI2 = false;
        int iK5 = 0;
        int iK6 = 0;
        boolean zI3 = false;
        String strD9 = null;
        String strD10 = null;
        boolean zI4 = false;
        int iK7 = 0;
        Bundle bundleA4 = null;
        String strD11 = null;
        zzef zzefVar = null;
        boolean zI5 = false;
        Bundle bundleA5 = null;
        String strD12 = null;
        String strD13 = null;
        String strD14 = null;
        boolean zI6 = false;
        ArrayList arrayList = null;
        String strD15 = null;
        ArrayList arrayListF4 = null;
        int iK8 = 0;
        boolean zI7 = false;
        boolean zI8 = false;
        boolean zI9 = false;
        ArrayList arrayListF5 = null;
        String strD16 = null;
        bw bwVar = null;
        String strD17 = null;
        Bundle bundleA6 = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    iK = f3.b.k(i6, parcel);
                    break;
                case 2:
                    bundleA = f3.b.a(i6, parcel);
                    break;
                case 3:
                    zzmVar = (zzm) f3.b.c(parcel, i6, zzm.CREATOR);
                    break;
                case 4:
                    zzsVar = (zzs) f3.b.c(parcel, i6, zzs.CREATOR);
                    break;
                case 5:
                    strD = f3.b.d(i6, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) f3.b.c(parcel, i6, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) f3.b.c(parcel, i6, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strD2 = f3.b.d(i6, parcel);
                    break;
                case '\t':
                    strD3 = f3.b.d(i6, parcel);
                    break;
                case '\n':
                    strD4 = f3.b.d(i6, parcel);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) f3.b.c(parcel, i6, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundleA2 = f3.b.a(i6, parcel);
                    break;
                case '\r':
                    iK2 = f3.b.k(i6, parcel);
                    break;
                case 14:
                    arrayListF = f3.b.f(i6, parcel);
                    break;
                case 15:
                    bundleA3 = f3.b.a(i6, parcel);
                    break;
                case 16:
                    zI = f3.b.i(i6, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    f3.b.n(i6, parcel);
                    break;
                case 18:
                    iK3 = f3.b.k(i6, parcel);
                    break;
                case 19:
                    iK4 = f3.b.k(i6, parcel);
                    break;
                case 20:
                    f3.b.p(parcel, i6, 4);
                    f6 = parcel.readFloat();
                    break;
                case dn.zzm /* 21 */:
                    strD5 = f3.b.d(i6, parcel);
                    break;
                case 25:
                    jL = f3.b.l(i6, parcel);
                    break;
                case 26:
                    strD6 = f3.b.d(i6, parcel);
                    break;
                case 27:
                    arrayListF2 = f3.b.f(i6, parcel);
                    break;
                case 28:
                    strD7 = f3.b.d(i6, parcel);
                    break;
                case 29:
                    oqVar = (oq) f3.b.c(parcel, i6, oq.CREATOR);
                    break;
                case 30:
                    arrayListF3 = f3.b.f(i6, parcel);
                    break;
                case 31:
                    jL2 = f3.b.l(i6, parcel);
                    break;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    strD8 = f3.b.d(i6, parcel);
                    break;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    f3.b.p(parcel, i6, 4);
                    f7 = parcel.readFloat();
                    break;
                case '#':
                    iK5 = f3.b.k(i6, parcel);
                    break;
                case '$':
                    iK6 = f3.b.k(i6, parcel);
                    break;
                case '%':
                    zI3 = f3.b.i(i6, parcel);
                    break;
                case '\'':
                    strD9 = f3.b.d(i6, parcel);
                    break;
                case '(':
                    zI2 = f3.b.i(i6, parcel);
                    break;
                case ')':
                    strD10 = f3.b.d(i6, parcel);
                    break;
                case '*':
                    zI4 = f3.b.i(i6, parcel);
                    break;
                case '+':
                    iK7 = f3.b.k(i6, parcel);
                    break;
                case ',':
                    bundleA4 = f3.b.a(i6, parcel);
                    break;
                case '-':
                    strD11 = f3.b.d(i6, parcel);
                    break;
                case '.':
                    zzefVar = (zzef) f3.b.c(parcel, i6, zzef.CREATOR);
                    break;
                case '/':
                    zI5 = f3.b.i(i6, parcel);
                    break;
                case '0':
                    bundleA5 = f3.b.a(i6, parcel);
                    break;
                case '1':
                    strD12 = f3.b.d(i6, parcel);
                    break;
                case '2':
                    strD13 = f3.b.d(i6, parcel);
                    break;
                case '3':
                    strD14 = f3.b.d(i6, parcel);
                    break;
                case '4':
                    zI6 = f3.b.i(i6, parcel);
                    break;
                case '5':
                    int iM = f3.b.m(i6, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iM == 0) {
                        arrayList = null;
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = parcel.readInt();
                        for (int i8 = 0; i8 < i7; i8++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iM);
                        arrayList = arrayList2;
                        break;
                    }
                case '6':
                    strD15 = f3.b.d(i6, parcel);
                    break;
                case '7':
                    arrayListF4 = f3.b.f(i6, parcel);
                    break;
                case '8':
                    iK8 = f3.b.k(i6, parcel);
                    break;
                case '9':
                    zI7 = f3.b.i(i6, parcel);
                    break;
                case ':':
                    zI8 = f3.b.i(i6, parcel);
                    break;
                case ';':
                    zI9 = f3.b.i(i6, parcel);
                    break;
                case '<':
                    arrayListF5 = f3.b.f(i6, parcel);
                    break;
                case '=':
                    strD16 = f3.b.d(i6, parcel);
                    break;
                case '?':
                    bwVar = (bw) f3.b.c(parcel, i6, bw.CREATOR);
                    break;
                case '@':
                    strD17 = f3.b.d(i6, parcel);
                    break;
                case 'A':
                    bundleA6 = f3.b.a(i6, parcel);
                    break;
            }
        }
        f3.b.h(iO, parcel);
        return new y20(iK, bundleA, zzmVar, zzsVar, strD, applicationInfo, packageInfo, strD2, strD3, strD4, versionInfoParcel, bundleA2, iK2, arrayListF, bundleA3, zI, iK3, iK4, f6, strD5, jL, strD6, arrayListF2, strD7, oqVar, arrayListF3, jL2, strD8, f7, zI2, iK5, iK6, zI3, strD9, strD10, zI4, iK7, bundleA4, strD11, zzefVar, zI5, bundleA5, strD12, strD13, strD14, zI6, arrayList, strD15, arrayListF4, iK8, zI7, zI8, zI9, arrayListF5, strD16, bwVar, strD17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new y20[i6];
    }
}
