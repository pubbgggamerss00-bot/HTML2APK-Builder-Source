package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import qa.a;

/* loaded from: classes2.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.zza;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c1.m(parcel, 2, this.zzb, false);
        c1.r(iQ, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
