package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import qa.a;

/* loaded from: classes2.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        p.f(str);
        this.zzb = str;
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.zza;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c1.m(parcel, 2, this.zzb, false);
        int i12 = this.zzc;
        c1.s(parcel, 3, 4);
        parcel.writeInt(i12);
        c1.r(iQ, parcel);
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }
}
