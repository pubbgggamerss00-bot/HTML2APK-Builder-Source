package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzch extends sh implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        zzcf zzcdVar;
        switch (i6) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder);
                }
                th.b(parcel);
                zzi(arrayListCreateTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                th.b(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                th.b(parcel);
                r40 r40VarZzg = zzg(string2);
                parcel2.writeNoException();
                th.e(parcel2, r40VarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                th.b(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                th.b(parcel);
                hj hjVarZze = zze(string4);
                parcel2.writeNoException();
                th.e(parcel2, hjVarZze);
                return true;
            case 6:
                String string5 = parcel.readString();
                th.b(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                th.b(parcel);
                zzby zzbyVarZzf = zzf(string6);
                parcel2.writeNoException();
                th.e(parcel2, zzbyVarZzf);
                return true;
            case 8:
                gy gyVarI1 = fy.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzh(gyVarI1);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
