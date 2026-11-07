package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class sy extends sh implements ty {
    public sy() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                yq yqVarZzl = zzl();
                parcel2.writeNoException();
                th.e(parcel2, yqVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                zzeb zzebVarZzj = zzj();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                k3.a aVarZzm = zzm();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzm);
                return true;
            case 14:
                k3.a aVarZzn = zzn();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzn);
                return true;
            case 15:
                k3.a aVarZzo = zzo();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                th.d(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader3 = th.f9281a;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                H1(aVarR);
                parcel2.writeNoException();
                return true;
            case dn.zzm /* 21 */:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                T0(aVarR2, aVarR3, aVarR4);
                parcel2.writeNoException();
                return true;
            case 22:
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                b0(aVarR5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
