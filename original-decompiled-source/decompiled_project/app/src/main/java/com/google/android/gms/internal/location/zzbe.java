package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import hb.d;
import java.util.Locale;
import qa.a;

/* loaded from: classes2.dex */
public final class zzbe extends a implements d {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f10);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d11);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i10);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.zzc = s10;
        this.zza = str;
        this.zzd = d10;
        this.zze = d11;
        this.zzf = f10;
        this.zzb = j10;
        this.zzg = i13;
        this.zzh = i11;
        this.zzi = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s10 = this.zzc;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / DescriptorProtos.Edition.EDITION_2023_VALUE), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.zza, false);
        long j10 = this.zzb;
        c1.s(parcel, 2, 8);
        parcel.writeLong(j10);
        short s10 = this.zzc;
        c1.s(parcel, 3, 4);
        parcel.writeInt(s10);
        double d10 = this.zzd;
        c1.s(parcel, 4, 8);
        parcel.writeDouble(d10);
        double d11 = this.zze;
        c1.s(parcel, 5, 8);
        parcel.writeDouble(d11);
        float f10 = this.zzf;
        c1.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        int i11 = this.zzg;
        c1.s(parcel, 7, 4);
        parcel.writeInt(i11);
        int i12 = this.zzh;
        c1.s(parcel, 8, 4);
        parcel.writeInt(i12);
        int i13 = this.zzi;
        c1.s(parcel, 9, 4);
        parcel.writeInt(i13);
        c1.r(iQ, parcel);
    }
}
