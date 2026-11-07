package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f30 extends sh implements g30 {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        k30 i30Var = null;
        l30 l30Var = null;
        k30 i30Var2 = null;
        k30 i30Var3 = null;
        k30 i30Var4 = null;
        switch (i6) {
            case 1:
                th.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                th.b(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                r30 r30Var = (r30) th.a(parcel, r30.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    i30Var = iInterfaceQueryLocalInterface instanceof k30 ? (k30) iInterfaceQueryLocalInterface : new i30(strongBinder2);
                }
                th.b(parcel);
                ((yx0) this).r0(r30Var, i30Var);
                parcel2.writeNoException();
                return true;
            case 5:
                r30 r30Var2 = (r30) th.a(parcel, r30.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    i30Var4 = iInterfaceQueryLocalInterface2 instanceof k30 ? (k30) iInterfaceQueryLocalInterface2 : new i30(strongBinder3);
                }
                th.b(parcel);
                ((yx0) this).E0(r30Var2, i30Var4);
                parcel2.writeNoException();
                return true;
            case 6:
                r30 r30Var3 = (r30) th.a(parcel, r30.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    i30Var3 = iInterfaceQueryLocalInterface3 instanceof k30 ? (k30) iInterfaceQueryLocalInterface3 : new i30(strongBinder4);
                }
                th.b(parcel);
                ((yx0) this).J(r30Var3, i30Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    i30Var2 = iInterfaceQueryLocalInterface4 instanceof k30 ? (k30) iInterfaceQueryLocalInterface4 : new i30(strongBinder5);
                }
                th.b(parcel);
                ((yx0) this).Q0(string, i30Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                c30 c30Var = (c30) th.a(parcel, c30.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    l30Var = iInterfaceQueryLocalInterface5 instanceof l30 ? (l30) iInterfaceQueryLocalInterface5 : new l30(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                }
                th.b(parcel);
                yx0 yx0Var = (yx0) this;
                if (((Boolean) eq.f4368a.c()).booleanValue()) {
                    yx0Var.f11115v.c();
                    String str = c30Var.s;
                    ds1 ds1Var = ds1.f4001t;
                    ds1Var.addListener(new as1(0, ds1Var, new j00(l30Var, c30Var)), i70.f5592g);
                } else {
                    try {
                        Parcel parcelZza = l30Var.zza();
                        parcelZza.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        th.c(parcelZza, c30Var);
                        l30Var.zzda(1, parcelZza);
                    } catch (RemoteException e6) {
                        zze.zzb("Service can't call client", e6);
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
