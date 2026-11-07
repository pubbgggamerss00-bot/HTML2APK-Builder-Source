package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import androidx.room.z0;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o;
import hb.s0;
import java.util.Collections;
import java.util.List;
import qa.a;

/* loaded from: classes2.dex */
public final class zzj extends a {
    final s0 zzc;
    final List<c> zzd;
    final String zze;
    static final List<c> zza = Collections.EMPTY_LIST;
    static final s0 zzb = new s0();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(s0 s0Var, List<c> list, String str) {
        this.zzc = s0Var;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return o.a(this.zzc, zzjVar.zzc) && o.a(this.zzd, zzjVar.zzd) && o.a(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        StringBuilder sb = new StringBuilder(m.a.a(strValueOf.length(), 77, strValueOf2.length(), String.valueOf(str).length()));
        z0.a(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.zzc, i10, false);
        c1.p(parcel, 2, this.zzd, false);
        c1.m(parcel, 3, this.zze, false);
        c1.r(iQ, parcel);
    }
}
