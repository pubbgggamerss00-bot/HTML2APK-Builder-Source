package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d00 extends sh implements e00 {
    public static final /* synthetic */ int s = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.uz] */
    /* JADX WARN: Type inference failed for: r3v36, types: [com.google.android.gms.internal.ads.oz] */
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) throws RemoteException {
        h00 f00Var;
        sz szVar;
        mz mzVar;
        h00 h00Var = null;
        mz mzVar2 = null;
        xz vzVar = null;
        rz pzVar = null;
        b00 yzVar = null;
        xz vzVar2 = null;
        b00 yzVar2 = null;
        sz szVar2 = null;
        rz pzVar2 = null;
        if (i6 == 1) {
            k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) th.a(parcel, creator);
            Bundle bundle2 = (Bundle) th.a(parcel, creator);
            zzs zzsVar = (zzs) th.a(parcel, zzs.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                f00Var = h00Var;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (iInterfaceQueryLocalInterface instanceof h00) {
                    h00Var = (h00) iInterfaceQueryLocalInterface;
                    f00Var = h00Var;
                } else {
                    f00Var = new f00(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                }
            }
            th.b(parcel);
            ((l00) this).h1(aVarR, string, bundle, bundle2, zzsVar, f00Var);
            parcel2.writeNoException();
            return true;
        }
        if (i6 == 2) {
            n00 n00VarZzf = ((l00) this).zzf();
            parcel2.writeNoException();
            th.d(parcel2, n00VarZzf);
            return true;
        }
        if (i6 == 3) {
            n00 n00VarZzg = ((l00) this).zzg();
            parcel2.writeNoException();
            th.d(parcel2, n00VarZzg);
            return true;
        }
        if (i6 == 5) {
            zzeb zzebVarZze = ((l00) this).zze();
            parcel2.writeNoException();
            th.e(parcel2, zzebVarZze);
            return true;
        }
        if (i6 == 10) {
            a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            th.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i6 == 11) {
            parcel.createStringArray();
            th.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i6) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzm zzmVar = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    pzVar2 = iInterfaceQueryLocalInterface2 instanceof rz ? (rz) iInterfaceQueryLocalInterface2 : new pz(strongBinder2);
                }
                rz rzVar = pzVar2;
                my myVarI1 = ly.i1(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) th.a(parcel, zzs.CREATOR);
                th.b(parcel);
                ((l00) this).O1(string2, string3, zzmVar, aVarR2, rzVar, myVarI1, zzsVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzm zzmVar2 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    szVar = szVar2;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof uz) {
                        szVar2 = (uz) iInterfaceQueryLocalInterface3;
                        szVar = szVar2;
                    } else {
                        szVar = new sz(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    }
                }
                my myVarI12 = ly.i1(parcel.readStrongBinder());
                th.b(parcel);
                ((l00) this).o0(string4, string5, zzmVar2, aVarR3, szVar, myVarI12);
                parcel2.writeNoException();
                break;
            case 15:
                boolean zL = ((l00) this).l(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                break;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                zzm zzmVar3 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    yzVar2 = iInterfaceQueryLocalInterface4 instanceof b00 ? (b00) iInterfaceQueryLocalInterface4 : new yz(strongBinder4);
                }
                b00 b00Var = yzVar2;
                my myVarI13 = ly.i1(parcel.readStrongBinder());
                th.b(parcel);
                ((l00) this).P(string6, string7, zzmVar3, aVarR4, b00Var, myVarI13);
                parcel2.writeNoException();
                break;
            case 17:
                boolean zX0 = ((l00) this).x0(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zX0 ? 1 : 0);
                break;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                zzm zzmVar4 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    vzVar2 = iInterfaceQueryLocalInterface5 instanceof xz ? (xz) iInterfaceQueryLocalInterface5 : new vz(strongBinder5);
                }
                xz xzVar = vzVar2;
                my myVarI14 = ly.i1(parcel.readStrongBinder());
                th.b(parcel);
                ((l00) this).Y(string8, string9, zzmVar4, aVarR5, xzVar, myVarI14, null);
                parcel2.writeNoException();
                break;
            case 19:
                String string10 = parcel.readString();
                th.b(parcel);
                ((l00) this).f6545x = string10;
                parcel2.writeNoException();
                break;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzm zzmVar5 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR6 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    yzVar = iInterfaceQueryLocalInterface6 instanceof b00 ? (b00) iInterfaceQueryLocalInterface6 : new yz(strongBinder6);
                }
                b00 b00Var2 = yzVar;
                my myVarI15 = ly.i1(parcel.readStrongBinder());
                th.b(parcel);
                ((l00) this).w(string11, string12, zzmVar5, aVarR6, b00Var2, myVarI15);
                parcel2.writeNoException();
                break;
            case dn.zzm /* 21 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                zzm zzmVar6 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR7 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    pzVar = iInterfaceQueryLocalInterface7 instanceof rz ? (rz) iInterfaceQueryLocalInterface7 : new pz(strongBinder7);
                }
                rz rzVar2 = pzVar;
                my myVarI16 = ly.i1(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) th.a(parcel, zzs.CREATOR);
                th.b(parcel);
                ((l00) this).x1(string13, string14, zzmVar6, aVarR7, rzVar2, myVarI16, zzsVar3);
                parcel2.writeNoException();
                break;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzm zzmVar7 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR8 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    vzVar = iInterfaceQueryLocalInterface8 instanceof xz ? (xz) iInterfaceQueryLocalInterface8 : new vz(strongBinder8);
                }
                xz xzVar2 = vzVar;
                my myVarI17 = ly.i1(parcel.readStrongBinder());
                oq oqVar = (oq) th.a(parcel, oq.CREATOR);
                th.b(parcel);
                ((l00) this).Y(string15, string16, zzmVar7, aVarR8, xzVar2, myVarI17, oqVar);
                parcel2.writeNoException();
                break;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                zzm zzmVar8 = (zzm) th.a(parcel, zzm.CREATOR);
                k3.a aVarR9 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    mzVar = mzVar2;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (iInterfaceQueryLocalInterface9 instanceof oz) {
                        mzVar2 = (oz) iInterfaceQueryLocalInterface9;
                        mzVar = mzVar2;
                    } else {
                        mzVar = new mz(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    }
                }
                my myVarI18 = ly.i1(parcel.readStrongBinder());
                th.b(parcel);
                ((l00) this).R0(string17, string18, zzmVar8, aVarR9, mzVar, myVarI18);
                parcel2.writeNoException();
                break;
            case 24:
                boolean zK = ((l00) this).k(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                break;
        }
        return true;
    }
}
