package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class gj extends sh implements hj {
    public static final /* synthetic */ int s = 0;

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        oj mjVar;
        switch (i6) {
            case 2:
                parcel2.writeNoException();
                th.e(parcel2, ((ch0) this).f3572u);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                th.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    mjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    mjVar = iInterfaceQueryLocalInterface instanceof oj ? (oj) iInterfaceQueryLocalInterface : new mj(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                th.b(parcel);
                ((ch0) this).h0(aVarR, mjVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdy zzdyVarZzf = ((ch0) this).zzf();
                parcel2.writeNoException();
                th.e(parcel2, zzdyVarZzf);
                return true;
            case 6:
                boolean zF = th.f(parcel);
                th.b(parcel);
                ((ch0) this).f3574w = zF;
                parcel2.writeNoException();
                return true;
            case 7:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                th.b(parcel);
                ((ch0) this).K1(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
