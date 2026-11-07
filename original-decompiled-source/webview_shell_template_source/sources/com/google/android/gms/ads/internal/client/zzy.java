package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzy extends f3.a {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();

    @AppOpenAd.AppOpenAdOrientation
    public final int zza;

    public zzy(@AppOpenAd.AppOpenAdOrientation int i6) {
        this.zza = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i7);
        e5.i.t(iS, parcel);
    }
}
