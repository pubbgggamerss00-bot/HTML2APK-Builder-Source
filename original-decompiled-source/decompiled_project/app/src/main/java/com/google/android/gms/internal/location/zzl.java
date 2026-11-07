package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import hb.p;
import hb.q;
import qa.a;

/* loaded from: classes2.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final q zzc;
    final zzai zzd;

    public zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i10;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : p.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.zza;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c1.l(parcel, 2, this.zzb, i10, false);
        q qVar = this.zzc;
        c1.h(parcel, 3, qVar == null ? null : qVar.asBinder());
        zzai zzaiVar = this.zzd;
        c1.h(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
        c1.r(iQ, parcel);
    }
}
