package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzga extends f3.a {
    public static final Parcelable.Creator<zzga> CREATOR = new zzgb();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzga(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        boolean z6 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzb;
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzc;
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(z8 ? 1 : 0);
        e5.i.t(iS, parcel);
    }

    public zzga(boolean z6, boolean z7, boolean z8) {
        this.zza = z6;
        this.zzb = z7;
        this.zzc = z8;
    }
}
