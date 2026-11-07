package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class q40 extends sh implements r40 {
    public q40() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static r40 zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof r40 ? (r40) iInterfaceQueryLocalInterface : new p40(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        y40 w40Var = null;
        y40 w40Var2 = null;
        z40 z40Var = null;
        u40 s40Var = null;
        switch (i6) {
            case 1:
                zzm zzmVar = (zzm) th.a(parcel, zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    w40Var = iInterfaceQueryLocalInterface instanceof y40 ? (y40) iInterfaceQueryLocalInterface : new w40(strongBinder);
                }
                th.b(parcel);
                zzf(zzmVar, w40Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    s40Var = iInterfaceQueryLocalInterface2 instanceof u40 ? (u40) iInterfaceQueryLocalInterface2 : new s40(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                th.b(parcel);
                zzk(s40Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzm(aVarR);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    z40Var = iInterfaceQueryLocalInterface3 instanceof z40 ? (z40) iInterfaceQueryLocalInterface3 : new z40(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                th.b(parcel);
                zzp(z40Var);
                parcel2.writeNoException();
                return true;
            case 7:
                e50 e50Var = (e50) th.a(parcel, e50.CREATOR);
                th.b(parcel);
                zzl(e50Var);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdo zzdoVarZzb = zzdn.zzb(parcel.readStrongBinder());
                th.b(parcel);
                zzi(zzdoVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                th.d(parcel2, bundleZzb);
                return true;
            case 10:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                ClassLoader classLoader2 = th.f9281a;
                boolean z6 = parcel.readInt() != 0;
                th.b(parcel);
                zzn(aVarR2, z6);
                parcel2.writeNoException();
                return true;
            case 11:
                o40 o40VarZzd = zzd();
                parcel2.writeNoException();
                th.e(parcel2, o40VarZzd);
                return true;
            case 12:
                zzdy zzdyVarZzc = zzc();
                parcel2.writeNoException();
                th.e(parcel2, zzdyVarZzc);
                return true;
            case 13:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                th.b(parcel);
                zzj(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                zzm zzmVar2 = (zzm) th.a(parcel, zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    w40Var2 = iInterfaceQueryLocalInterface4 instanceof y40 ? (y40) iInterfaceQueryLocalInterface4 : new w40(strongBinder4);
                }
                th.b(parcel);
                zzg(zzmVar2, w40Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zF = th.f(parcel);
                th.b(parcel);
                zzh(zF);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
