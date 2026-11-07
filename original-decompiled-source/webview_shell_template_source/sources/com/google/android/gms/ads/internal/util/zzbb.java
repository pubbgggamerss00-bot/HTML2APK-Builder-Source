package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.rj1;
import com.google.android.gms.internal.ads.tc1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbb extends f3.a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final String zza;
    public final int zzb;

    public zzbb(String str, int i6) {
        this.zza = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        this.zzb = i6;
    }

    public static zzbb zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarA = tc1.a(th);
        return new zzbb(rj1.j(th.getMessage()) ? zzeVarA.zzb : th.getMessage(), zzeVarA.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, str);
        int i7 = this.zzb;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i7);
        e5.i.t(iS, parcel);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
