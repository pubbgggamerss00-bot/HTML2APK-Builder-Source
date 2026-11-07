package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfv extends f3.a {
    public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
    public final int zza;
    public final int zzb;

    public zzfv(int i6, int i7) {
        this.zza = i6;
        this.zzb = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        int i8 = this.zzb;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i8);
        e5.i.t(iS, parcel);
    }

    public zzfv(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
