package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.br;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.l10;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.t10;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.vu;
import com.google.android.gms.internal.ads.wu;
import com.google.android.gms.internal.ads.xu;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzcn extends rh implements zzcp {
    public zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(k3.a aVar, String str, gy gyVar, int i6) {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(k3.a aVar, zzs zzsVar, String str, int i6) {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.c(parcelZza, zzsVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(k3.a aVar, gy gyVar, int i6) {
        zzci zzcgVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(k3.a aVar, int i6) {
        zzcz zzcxVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcxVar = iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(k3.a aVar, gy gyVar, int i6) {
        zzdu zzdsVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface : new zzds(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final dr zzj(k3.a aVar, k3.a aVar2) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, aVar2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        dr drVarZzdy = br.zzdy(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return drVarZzdy;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final jr zzk(k3.a aVar, k3.a aVar2, k3.a aVar3) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, aVar2);
        th.e(parcelZza, aVar3);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        jr jrVarZze = ir.zze(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return jrVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final xu zzl(k3.a aVar, gy gyVar, int i6, uu uuVar) {
        xu vuVar;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        th.e(parcelZza, uuVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        int i7 = wu.s;
        if (strongBinder == null) {
            vuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            vuVar = iInterfaceQueryLocalInterface instanceof xu ? (xu) iInterfaceQueryLocalInterface : new vu(strongBinder);
        }
        parcelZzcZ.recycle();
        return vuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final n10 zzm(k3.a aVar, gy gyVar, int i6) {
        n10 l10Var;
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        int i7 = m10.s;
        if (strongBinder == null) {
            l10Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            l10Var = iInterfaceQueryLocalInterface instanceof n10 ? (n10) iInterfaceQueryLocalInterface : new l10(strongBinder);
        }
        parcelZzcZ.recycle();
        return l10Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final u10 zzn(k3.a aVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        u10 u10VarZzI = t10.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return u10VarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final c40 zzo(k3.a aVar, gy gyVar, int i6) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final r40 zzp(k3.a aVar, String str, gy gyVar, int i6) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        parcelZza.writeString(str);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        r40 r40VarZzq = q40.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return r40VarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final l60 zzq(k3.a aVar, gy gyVar, int i6) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, gyVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        l60 l60VarZzb = k60.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l60VarZzb;
    }
}
