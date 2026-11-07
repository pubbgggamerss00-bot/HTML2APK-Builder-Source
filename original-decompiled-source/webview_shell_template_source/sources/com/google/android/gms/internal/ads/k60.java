package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k60 extends sh implements l60 {
    public k60() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static l60 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof l60 ? (l60) iInterfaceQueryLocalInterface : new j60(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        i60 g60Var = null;
        switch (i6) {
            case 1:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                p60 p60Var = (p60) th.a(parcel, p60.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    g60Var = iInterfaceQueryLocalInterface instanceof i60 ? (i60) iInterfaceQueryLocalInterface : new g60(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                th.b(parcel);
                zzf(aVarR, p60Var, g60Var);
                parcel2.writeNoException();
                return true;
            case 2:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzk(aVarR2);
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                f20 f20VarI1 = e20.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzm(arrayListCreateTypedArrayList, aVarR3, f20VarI1);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                f20 f20VarI12 = e20.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzl(arrayListCreateTypedArrayList2, aVarR4, f20VarI12);
                parcel2.writeNoException();
                return true;
            case 7:
                p20 p20Var = (p20) th.a(parcel, p20.CREATOR);
                th.b(parcel);
                zzg(p20Var);
                parcel2.writeNoException();
                return true;
            case 8:
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzj(aVarR5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                k3.a aVarR6 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                f20 f20VarI13 = e20.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzi(arrayListCreateTypedArrayList3, aVarR6, f20VarI13);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                k3.a aVarR7 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                f20 f20VarI14 = e20.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzh(arrayListCreateTypedArrayList4, aVarR7, f20VarI14);
                parcel2.writeNoException();
                return true;
            case 11:
                k3.a aVarZze = zze(a.AbstractBinderC0073a.r(parcel.readStrongBinder()), a.AbstractBinderC0073a.r(parcel.readStrongBinder()), parcel.readString(), androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                th.e(parcel2, aVarZze);
                return true;
            default:
                return false;
        }
    }
}
