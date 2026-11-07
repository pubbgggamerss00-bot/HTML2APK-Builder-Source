package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzef extends f3.a {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    public final int zza;

    public zzef(int i6) {
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
