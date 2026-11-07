package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfb extends f3.a {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzfc();
    private final int zza;
    private final int zzb;
    private final String zzc;

    public zzfb() {
        this(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        int i7 = this.zza;
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        int i8 = this.zzb;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i8);
        e5.i.m(parcel, 3, this.zzc);
        e5.i.t(iS, parcel);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public zzfb(int i6, int i7, String str) {
        this.zza = i6;
        this.zzb = i7;
        this.zzc = str;
    }
}
