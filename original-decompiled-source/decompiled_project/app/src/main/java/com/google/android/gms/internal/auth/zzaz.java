package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import qa.a;

/* loaded from: classes2.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        p.f(str);
        this.zzb = str;
        p.f(bArr);
        this.zzc = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.zza;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c1.m(parcel, 2, this.zzb, false);
        c1.f(parcel, 3, this.zzc, false);
        c1.r(iQ, parcel);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
