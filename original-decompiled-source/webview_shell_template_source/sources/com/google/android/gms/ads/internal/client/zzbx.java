package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.internal.ads.a20;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.so;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.to;
import com.google.android.gms.internal.ads.z10;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbx extends sh implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        zzbl zzbjVar = null;
        zzct zzcrVar = null;
        zzbo zzbmVar = null;
        zzdr zzdpVar = null;
        kj ijVar = null;
        zzcc zzcaVar = null;
        f40 e40Var = null;
        zzcq zzcqVar = null;
        zzbi zzbgVar = null;
        to soVar = null;
        c20 b20Var = null;
        a20 z10Var = null;
        zzcm zzckVar = null;
        switch (i6) {
            case 1:
                k3.a aVarZzn = zzn();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) th.a(parcel, zzm.CREATOR);
                th.b(parcel);
                boolean zZzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                th.b(parcel);
                zzD(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzckVar = iInterfaceQueryLocalInterface2 instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface2 : new zzck(strongBinder2);
                }
                th.b(parcel);
                zzG(zzckVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzs zzsVarZzg = zzg();
                parcel2.writeNoException();
                th.d(parcel2, zzsVarZzg);
                return true;
            case 13:
                zzs zzsVar = (zzs) th.a(parcel, zzs.CREATOR);
                th.b(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    z10Var = iInterfaceQueryLocalInterface3 instanceof a20 ? (a20) iInterfaceQueryLocalInterface3 : new z10(strongBinder3, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                th.b(parcel);
                zzM(z10Var);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    b20Var = iInterfaceQueryLocalInterface4 instanceof c20 ? (c20) iInterfaceQueryLocalInterface4 : new b20(strongBinder4, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                String string = parcel.readString();
                th.b(parcel);
                zzQ(b20Var, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    soVar = iInterfaceQueryLocalInterface5 instanceof to ? (to) iInterfaceQueryLocalInterface5 : new so(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                th.b(parcel);
                zzO(soVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbgVar = iInterfaceQueryLocalInterface6 instanceof zzbi ? (zzbi) iInterfaceQueryLocalInterface6 : new zzbg(strongBinder6);
                }
                th.b(parcel);
                zzC(zzbgVar);
                parcel2.writeNoException();
                return true;
            case dn.zzm /* 21 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface7 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface7 : new zzcq(strongBinder7);
                }
                th.b(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zF = th.f(parcel);
                th.b(parcel);
                zzN(zF);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    e40Var = iInterfaceQueryLocalInterface8 instanceof f40 ? (f40) iInterfaceQueryLocalInterface8 : new e40(strongBinder8);
                }
                th.b(parcel);
                zzS(e40Var);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                th.b(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzebVarZzl = zzl();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarZzl);
                return true;
            case 29:
                zzga zzgaVar = (zzga) th.a(parcel, zzga.CREATOR);
                th.b(parcel);
                zzU(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzef zzefVar = (zzef) th.a(parcel, zzef.CREATOR);
                th.b(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                zzcm zzcmVarZzj = zzj();
                parcel2.writeNoException();
                th.e(parcel2, zzcmVarZzj);
                return true;
            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                zzbl zzblVarZzi = zzi();
                parcel2.writeNoException();
                th.e(parcel2, zzblVarZzi);
                return true;
            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                boolean zF2 = th.f(parcel);
                th.b(parcel);
                zzL(zF2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzcaVar = iInterfaceQueryLocalInterface9 instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface9 : new zzca(strongBinder9);
                }
                th.b(parcel);
                zzE(zzcaVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                th.d(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                th.b(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzy zzyVar = (zzy) th.a(parcel, zzy.CREATOR);
                th.b(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    ijVar = iInterfaceQueryLocalInterface10 instanceof kj ? (kj) iInterfaceQueryLocalInterface10 : new ij(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                th.b(parcel);
                zzH(ijVar);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdy zzdyVarZzk = zzk();
                parcel2.writeNoException();
                th.e(parcel2, zzdyVarZzk);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdpVar = iInterfaceQueryLocalInterface11 instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface11 : new zzdp(strongBinder11);
                }
                th.b(parcel);
                zzP(zzdpVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) th.a(parcel, zzm.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbmVar = iInterfaceQueryLocalInterface12 instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface12 : new zzbm(strongBinder12);
                }
                th.b(parcel);
                zzy(zzmVar2, zzbmVar);
                parcel2.writeNoException();
                return true;
            case 44:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzW(aVarR);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcrVar = iInterfaceQueryLocalInterface13 instanceof zzct ? (zzct) iInterfaceQueryLocalInterface13 : new zzcr(strongBinder13);
                }
                th.b(parcel);
                zzJ(zzcrVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                ClassLoader classLoader3 = th.f9281a;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
