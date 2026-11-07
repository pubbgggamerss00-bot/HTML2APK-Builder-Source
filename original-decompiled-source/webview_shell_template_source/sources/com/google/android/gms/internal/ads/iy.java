package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class iy extends sh implements jy {
    public iy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) throws RemoteException {
        k40 i40Var;
        ur urVar;
        my kyVar = null;
        my kyVar2 = null;
        my kyVar3 = null;
        my kyVar4 = null;
        uv tvVar = null;
        my kyVar5 = null;
        trVar = null;
        tr trVar = null;
        my kyVar6 = null;
        k40 i40Var2 = null;
        my kyVar7 = null;
        my kyVar8 = null;
        my kyVar9 = null;
        switch (i6) {
            case 1:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar = (zzs) th.a(parcel, zzs.CREATOR);
                zzm zzmVar = (zzm) th.a(parcel, zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar = iInterfaceQueryLocalInterface instanceof my ? (my) iInterfaceQueryLocalInterface : new ky(strongBinder);
                }
                my myVar = kyVar;
                th.b(parcel);
                ((fz) this).Z(aVarR, zzsVar, zzmVar, string, null, myVar);
                parcel2.writeNoException();
                return true;
            case 2:
                k3.a aVarZzn = ((fz) this).zzn();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzn);
                return true;
            case 3:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar2 = (zzm) th.a(parcel, zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar9 = iInterfaceQueryLocalInterface2 instanceof my ? (my) iInterfaceQueryLocalInterface2 : new ky(strongBinder2);
                }
                my myVar2 = kyVar9;
                th.b(parcel);
                ((fz) this).o1(aVarR2, zzmVar2, string2, null, myVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                ((fz) this).b();
                parcel2.writeNoException();
                return true;
            case 5:
                ((fz) this).zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) th.a(parcel, zzs.CREATOR);
                zzm zzmVar3 = (zzm) th.a(parcel, zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar8 = iInterfaceQueryLocalInterface3 instanceof my ? (my) iInterfaceQueryLocalInterface3 : new ky(strongBinder3);
                }
                my myVar3 = kyVar8;
                th.b(parcel);
                ((fz) this).Z(aVarR3, zzsVar2, zzmVar3, string3, string4, myVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar4 = (zzm) th.a(parcel, zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar7 = iInterfaceQueryLocalInterface4 instanceof my ? (my) iInterfaceQueryLocalInterface4 : new ky(strongBinder4);
                }
                my myVar4 = kyVar7;
                th.b(parcel);
                ((fz) this).o1(aVarR4, zzmVar4, string5, string6, myVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                ((fz) this).zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                ((fz) this).zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar5 = (zzm) th.a(parcel, zzm.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    i40Var2 = iInterfaceQueryLocalInterface5 instanceof k40 ? (k40) iInterfaceQueryLocalInterface5 : new i40(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String string7 = parcel.readString();
                th.b(parcel);
                ((fz) this).k1(aVarR5, zzmVar5, i40Var2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                zzm zzmVar6 = (zzm) th.a(parcel, zzm.CREATOR);
                String string8 = parcel.readString();
                th.b(parcel);
                ((fz) this).i1(zzmVar6, string8);
                parcel2.writeNoException();
                return true;
            case 12:
                ((fz) this).zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = ((fz) this).zzN();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                k3.a aVarR6 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar7 = (zzm) th.a(parcel, zzm.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar6 = iInterfaceQueryLocalInterface6 instanceof my ? (my) iInterfaceQueryLocalInterface6 : new ky(strongBinder6);
                }
                my myVar5 = kyVar6;
                oq oqVar = (oq) th.a(parcel, oq.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                th.b(parcel);
                ((fz) this).C(aVarR6, zzmVar7, string9, string10, myVar5, oqVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = th.f9281a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                th.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                th.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                th.d(parcel2, bundle3);
                return true;
            case 20:
                zzm zzmVar8 = (zzm) th.a(parcel, zzm.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                th.b(parcel);
                ((fz) this).i1(zzmVar8, string11);
                parcel2.writeNoException();
                return true;
            case dn.zzm /* 21 */:
                ((fz) this).A1(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = th.f9281a;
                parcel2.writeInt(0);
                return true;
            case 23:
                k3.a aVarR7 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    i40Var = iInterfaceQueryLocalInterface7 instanceof k40 ? (k40) iInterfaceQueryLocalInterface7 : new i40(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    i40Var = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                th.b(parcel);
                ((fz) this).N0(aVarR7, i40Var, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                hz hzVar = ((fz) this).f4819t;
                if (hzVar != null && (urVar = hzVar.f5518c) != null) {
                    trVar = urVar.f9618a;
                }
                parcel2.writeNoException();
                th.e(parcel2, trVar);
                return true;
            case 25:
                boolean zF = th.f(parcel);
                th.b(parcel);
                ((fz) this).j1(zF);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzebVarZzh = ((fz) this).zzh();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarZzh);
                return true;
            case 27:
                ty tyVarZzk = ((fz) this).zzk();
                parcel2.writeNoException();
                th.e(parcel2, tyVarZzk);
                return true;
            case 28:
                k3.a aVarR8 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar9 = (zzm) th.a(parcel, zzm.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar5 = iInterfaceQueryLocalInterface8 instanceof my ? (my) iInterfaceQueryLocalInterface8 : new ky(strongBinder8);
                }
                th.b(parcel);
                ((fz) this).J1(aVarR8, zzmVar9, string12, kyVar5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                ((fz) this).t1(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 31:
                k3.a aVarR9 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    tvVar = iInterfaceQueryLocalInterface9 instanceof uv ? (uv) iInterfaceQueryLocalInterface9 : new tv(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zv.CREATOR);
                th.b(parcel);
                ((fz) this).C0(aVarR9, tvVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                k3.a aVarR10 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar10 = (zzm) th.a(parcel, zzm.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar4 = iInterfaceQueryLocalInterface10 instanceof my ? (my) iInterfaceQueryLocalInterface10 : new ky(strongBinder10);
                }
                th.b(parcel);
                ((fz) this).H(aVarR10, zzmVar10, string13, kyVar4);
                parcel2.writeNoException();
                return true;
            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                n00 n00VarZzl = ((fz) this).zzl();
                parcel2.writeNoException();
                th.d(parcel2, n00VarZzl);
                return true;
            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                n00 n00VarZzm = ((fz) this).zzm();
                parcel2.writeNoException();
                th.d(parcel2, n00VarZzm);
                return true;
            case 35:
                k3.a aVarR11 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) th.a(parcel, zzs.CREATOR);
                zzm zzmVar11 = (zzm) th.a(parcel, zzm.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar3 = iInterfaceQueryLocalInterface11 instanceof my ? (my) iInterfaceQueryLocalInterface11 : new ky(strongBinder11);
                }
                my myVar6 = kyVar3;
                th.b(parcel);
                ((fz) this).E(aVarR11, zzsVar3, zzmVar11, string14, string15, myVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                oy oyVarZzj = ((fz) this).zzj();
                parcel2.writeNoException();
                th.e(parcel2, oyVarZzj);
                return true;
            case 37:
                ((fz) this).V0(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                k3.a aVarR12 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzm zzmVar12 = (zzm) th.a(parcel, zzm.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    kyVar2 = iInterfaceQueryLocalInterface12 instanceof my ? (my) iInterfaceQueryLocalInterface12 : new ky(strongBinder12);
                }
                th.b(parcel);
                ((fz) this).G1(aVarR12, zzmVar12, string16, kyVar2);
                parcel2.writeNoException();
                return true;
            case 39:
                ((fz) this).m0(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
        }
    }
}
