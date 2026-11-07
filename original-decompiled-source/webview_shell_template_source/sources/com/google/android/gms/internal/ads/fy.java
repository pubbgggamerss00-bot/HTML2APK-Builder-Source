package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class fy extends sh implements gy {
    public static gy i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof gy ? (gy) iInterfaceQueryLocalInterface : new ey(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            String string = parcel.readString();
            th.b(parcel);
            jy jyVarZzb = ((dy) this).zzb(string);
            parcel2.writeNoException();
            th.e(parcel2, jyVarZzb);
        } else if (i6 == 2) {
            String string2 = parcel.readString();
            th.b(parcel);
            boolean zZze = ((dy) this).zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i6 == 3) {
            String string3 = parcel.readString();
            th.b(parcel);
            e00 e00VarE = ((dy) this).e(string3);
            parcel2.writeNoException();
            th.e(parcel2, e00VarE);
        } else {
            if (i6 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            th.b(parcel);
            boolean zF = ((dy) this).f(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zF ? 1 : 0);
        }
        return true;
    }
}
