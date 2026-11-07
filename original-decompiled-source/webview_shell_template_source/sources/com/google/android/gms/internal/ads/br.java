package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class br extends sh implements dr {
    public br() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static dr zzdy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof dr ? (dr) iInterfaceQueryLocalInterface : new ar(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        wq uqVar;
        switch (i6) {
            case 1:
                String string = parcel.readString();
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzdt(string, aVarR);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                th.b(parcel);
                k3.a aVarZzb = zzb(string2);
                parcel2.writeNoException();
                th.e(parcel2, aVarZzb);
                return true;
            case 3:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzdx(aVarR2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                parcel.readInt();
                th.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzdu(aVarR3);
                parcel2.writeNoException();
                return true;
            case 7:
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzd(aVarR4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    uqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    uqVar = iInterfaceQueryLocalInterface instanceof wq ? (wq) iInterfaceQueryLocalInterface : new uq(strongBinder);
                }
                th.b(parcel);
                zzdv(uqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzdw(aVarR5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
