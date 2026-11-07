package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.xv;
import java.util.List;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzcy extends sh implements zzcz {
    public zzcy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        xv vvVar = null;
        zzdl zzdjVar = null;
        switch (i6) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f6 = parcel.readFloat();
                th.b(parcel);
                zzq(f6);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                th.b(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zF = th.f(parcel);
                th.b(parcel);
                zzp(zF);
                parcel2.writeNoException();
                return true;
            case 5:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                String string2 = parcel.readString();
                th.b(parcel);
                zzn(aVarR, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzl(string3, aVarR2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                th.b(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                gy gyVarI1 = fy.i1(parcel.readStrongBinder());
                th.b(parcel);
                zzo(gyVarI1);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    vvVar = iInterfaceQueryLocalInterface instanceof xv ? (xv) iInterfaceQueryLocalInterface : new vv(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                }
                th.b(parcel);
                zzs(vvVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzfv zzfvVar = (zzfv) th.a(parcel, zzfv.CREATOR);
                th.b(parcel);
                zzu(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdjVar = iInterfaceQueryLocalInterface2 instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface2 : new zzdj(strongBinder2);
                }
                th.b(parcel);
                zzm(zzdjVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zF2 = th.f(parcel);
                th.b(parcel);
                zzj(zF2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                th.b(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
