package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class t10 extends sh implements u10 {
    public t10() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static u10 zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof u10 ? (u10) iInterfaceQueryLocalInterface : new s10(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 1:
                Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                th.d(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 12:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                Intent intent = (Intent) th.a(parcel, Intent.CREATOR);
                th.b(parcel);
                zzh(i8, i9, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzk(aVarR);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i10 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                th.b(parcel);
                zzp(i10, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
