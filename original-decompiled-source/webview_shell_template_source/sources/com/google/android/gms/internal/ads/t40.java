package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class t40 extends sh implements u40 {
    public t40() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        o40 n40Var;
        switch (i6) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    n40Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    n40Var = iInterfaceQueryLocalInterface instanceof o40 ? (o40) iInterfaceQueryLocalInterface : new n40(strongBinder);
                }
                th.b(parcel);
                e0(n40Var);
                break;
            case 4:
                int i8 = parcel.readInt();
                th.b(parcel);
                i(i8);
                break;
            case 5:
                zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
                th.b(parcel);
                D1(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
