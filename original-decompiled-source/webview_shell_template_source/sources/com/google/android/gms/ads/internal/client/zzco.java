package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.xu;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzco extends sh implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        uu tuVar = null;
        switch (i6) {
            case 1:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar = (zzs) th.a(parcel, zzs.CREATOR);
                String string = parcel.readString();
                gy gyVarI1 = fy.i1(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                th.b(parcel);
                zzby zzbyVarZzd = zzd(aVarR, zzsVar, string, gyVarI1, i8);
                parcel2.writeNoException();
                th.e(parcel2, zzbyVarZzd);
                return true;
            case 2:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) th.a(parcel, zzs.CREATOR);
                String string2 = parcel.readString();
                gy gyVarI12 = fy.i1(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                th.b(parcel);
                zzby zzbyVarZze = zze(aVarR2, zzsVar2, string2, gyVarI12, i9);
                parcel2.writeNoException();
                th.e(parcel2, zzbyVarZze);
                return true;
            case 3:
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                String string3 = parcel.readString();
                gy gyVarI13 = fy.i1(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                th.b(parcel);
                zzbu zzbuVarZzb = zzb(aVarR3, string3, gyVarI13, i10);
                parcel2.writeNoException();
                th.e(parcel2, zzbuVarZzb);
                return true;
            case 4:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                dr drVarZzj = zzj(aVarR4, aVarR5);
                parcel2.writeNoException();
                th.e(parcel2, drVarZzj);
                return true;
            case 6:
                k3.a aVarR6 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI14 = fy.i1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                th.b(parcel);
                c40 c40VarZzo = zzo(aVarR6, gyVarI14, i11);
                parcel2.writeNoException();
                th.e(parcel2, c40VarZzo);
                return true;
            case 7:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                k3.a aVarR7 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                u10 u10VarZzn = zzn(aVarR7);
                parcel2.writeNoException();
                th.e(parcel2, u10VarZzn);
                return true;
            case 9:
                k3.a aVarR8 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                th.b(parcel);
                zzcz zzczVarZzh = zzh(aVarR8, i12);
                parcel2.writeNoException();
                th.e(parcel2, zzczVarZzh);
                return true;
            case 10:
                k3.a aVarR9 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) th.a(parcel, zzs.CREATOR);
                String string4 = parcel.readString();
                int i13 = parcel.readInt();
                th.b(parcel);
                zzby zzbyVarZzf = zzf(aVarR9, zzsVar3, string4, i13);
                parcel2.writeNoException();
                th.e(parcel2, zzbyVarZzf);
                return true;
            case 11:
                k3.a aVarR10 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                k3.a aVarR11 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                k3.a aVarR12 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                jr jrVarZzk = zzk(aVarR10, aVarR11, aVarR12);
                parcel2.writeNoException();
                th.e(parcel2, jrVarZzk);
                return true;
            case 12:
                k3.a aVarR13 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                String string5 = parcel.readString();
                gy gyVarI15 = fy.i1(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                th.b(parcel);
                r40 r40VarZzp = zzp(aVarR13, string5, gyVarI15, i14);
                parcel2.writeNoException();
                th.e(parcel2, r40VarZzp);
                return true;
            case 13:
                k3.a aVarR14 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                zzs zzsVar4 = (zzs) th.a(parcel, zzs.CREATOR);
                String string6 = parcel.readString();
                gy gyVarI16 = fy.i1(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                th.b(parcel);
                zzby zzbyVarZzc = zzc(aVarR14, zzsVar4, string6, gyVarI16, i15);
                parcel2.writeNoException();
                th.e(parcel2, zzbyVarZzc);
                return true;
            case 14:
                k3.a aVarR15 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI17 = fy.i1(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                th.b(parcel);
                l60 l60VarZzq = zzq(aVarR15, gyVarI17, i16);
                parcel2.writeNoException();
                th.e(parcel2, l60VarZzq);
                return true;
            case 15:
                k3.a aVarR16 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI18 = fy.i1(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                th.b(parcel);
                n10 n10VarZzm = zzm(aVarR16, gyVarI18, i17);
                parcel2.writeNoException();
                th.e(parcel2, n10VarZzm);
                return true;
            case 16:
                k3.a aVarR17 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI19 = fy.i1(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    tuVar = iInterfaceQueryLocalInterface instanceof uu ? (uu) iInterfaceQueryLocalInterface : new tu(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                th.b(parcel);
                xu xuVarZzl = zzl(aVarR17, gyVarI19, i18, tuVar);
                parcel2.writeNoException();
                th.e(parcel2, xuVarZzl);
                return true;
            case 17:
                k3.a aVarR18 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI110 = fy.i1(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                th.b(parcel);
                zzdu zzduVarZzi = zzi(aVarR18, gyVarI110, i19);
                parcel2.writeNoException();
                th.e(parcel2, zzduVarZzi);
                return true;
            case 18:
                k3.a aVarR19 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                gy gyVarI111 = fy.i1(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                th.b(parcel);
                zzci zzciVarZzg = zzg(aVarR19, gyVarI111, i20);
                parcel2.writeNoException();
                th.e(parcel2, zzciVarZzg);
                return true;
            default:
                return false;
        }
    }
}
