package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.gj;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcg extends rh implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final hj zze(String str) {
        hj fjVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        int i6 = gj.s;
        if (strongBinder == null) {
            fjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            fjVar = iInterfaceQueryLocalInterface instanceof hj ? (hj) iInterfaceQueryLocalInterface : new fj(strongBinder);
        }
        parcelZzcZ.recycle();
        return fjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(7, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final r40 zzg(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        r40 r40VarZzq = q40.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return r40VarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(gy gyVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, gyVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        th.e(parcelZza, zzcfVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
