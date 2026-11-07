package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzft extends f3.a {
    public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
    public final String zza;
    public final int zzb;
    public final zzm zzc;
    public final int zzd;

    public zzft(String str, int i6, zzm zzmVar, int i7) {
        this.zza = str;
        this.zzb = i6;
        this.zzc = zzmVar;
        this.zzd = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (this.zza.equals(zzftVar.zza) && this.zzb == zzftVar.zzb && this.zzc.zza(zzftVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, str);
        int i7 = this.zzb;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i7);
        e5.i.l(parcel, 3, this.zzc, i6);
        int i8 = this.zzd;
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(i8);
        e5.i.t(iS, parcel);
    }
}
