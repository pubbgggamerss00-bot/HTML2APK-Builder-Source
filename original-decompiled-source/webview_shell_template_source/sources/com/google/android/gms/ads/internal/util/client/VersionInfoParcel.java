package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.g0;
import e5.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class VersionInfoParcel extends f3.a {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(int i6, int i7, boolean z6) {
        this(i6, i7, z6, false, false);
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        i.m(parcel, 2, this.afmaVersion);
        int i7 = this.buddyApkVersion;
        i.r(parcel, 3, 4);
        parcel.writeInt(i7);
        int i8 = this.clientJarVersion;
        i.r(parcel, 4, 4);
        parcel.writeInt(i8);
        boolean z6 = this.isClientJar;
        i.r(parcel, 5, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.isLiteSdk;
        i.r(parcel, 6, 4);
        parcel.writeInt(z7 ? 1 : 0);
        i.t(iS, parcel);
    }

    public VersionInfoParcel(int i6, int i7, boolean z6, boolean z7) {
        this(i6, i7, z6, false, z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VersionInfoParcel(int i6, int i7, boolean z6, boolean z7, boolean z8) {
        String str;
        if (z6) {
            str = "0";
        } else {
            str = z7 ? "2" : "1";
        }
        StringBuilder sbA = g0.a("afma-sdk-a-v", i6, ".", i7, ".");
        sbA.append(str);
        this(sbA.toString(), i6, i7, z6, z8);
    }

    public VersionInfoParcel(String str, int i6, int i7, boolean z6, boolean z7) {
        this.afmaVersion = str;
        this.buddyApkVersion = i6;
        this.clientJarVersion = i7;
        this.isClientJar = z6;
        this.isLiteSdk = z7;
    }
}
