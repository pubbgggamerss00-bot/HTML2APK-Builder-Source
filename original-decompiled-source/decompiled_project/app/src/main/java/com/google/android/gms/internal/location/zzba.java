package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import qa.a;

/* loaded from: classes2.dex */
public final class zzba extends a {
    final LocationRequest zzb;
    final List<c> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<c> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public zzba(LocationRequest locationRequest, List<c> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = str2;
        this.zzi = z13;
        this.zzj = z14;
        this.zzk = str3;
        this.zzl = j10;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (o.a(this.zzb, zzbaVar.zzb) && o.a(this.zzc, zzbaVar.zzc) && o.a(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && o.a(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && o.a(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.zzb, i10, false);
        c1.p(parcel, 5, this.zzc, false);
        c1.m(parcel, 6, this.zzd, false);
        boolean z10 = this.zze;
        c1.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzf;
        c1.s(parcel, 8, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.zzg;
        c1.s(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        c1.m(parcel, 10, this.zzh, false);
        boolean z13 = this.zzi;
        c1.s(parcel, 11, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzj;
        c1.s(parcel, 12, 4);
        parcel.writeInt(z14 ? 1 : 0);
        c1.m(parcel, 13, this.zzk, false);
        long j10 = this.zzl;
        c1.s(parcel, 14, 8);
        parcel.writeLong(j10);
        c1.r(iQ, parcel);
    }

    public final zzba zzb(long j10) {
        LocationRequest locationRequest = this.zzb;
        long j11 = locationRequest.f6265h;
        long j12 = locationRequest.f6259b;
        if (j11 < j12) {
            j11 = j12;
        }
        if (j11 <= j12) {
            this.zzl = 10000L;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j13 = locationRequest2.f6259b;
        long j14 = locationRequest2.f6265h;
        if (j14 < j13) {
            j14 = j13;
        }
        StringBuilder sb = new StringBuilder(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(j13);
        sb.append("maxWaitTime=");
        sb.append(j14);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z10) {
        this.zzj = true;
        return this;
    }
}
