package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import hb.s;
import hb.u;
import hb.w;
import hb.x;
import qa.a;

/* loaded from: classes2.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final x zzc;
    final PendingIntent zzd;
    final u zze;
    final zzai zzf;

    public zzbc(int i10, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i10;
        this.zzb = zzbaVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : w.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : s.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, hb.x] */
    public static zzbc zza(x xVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, xVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, hb.u] */
    public static zzbc zzc(u uVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, uVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        int i11 = this.zza;
        c1.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c1.l(parcel, 2, this.zzb, i10, false);
        x xVar = this.zzc;
        c1.h(parcel, 3, xVar == null ? null : xVar.asBinder());
        c1.l(parcel, 4, this.zzd, i10, false);
        u uVar = this.zze;
        c1.h(parcel, 5, uVar == null ? null : uVar.asBinder());
        zzai zzaiVar = this.zzf;
        c1.h(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
        c1.r(iQ, parcel);
    }
}
