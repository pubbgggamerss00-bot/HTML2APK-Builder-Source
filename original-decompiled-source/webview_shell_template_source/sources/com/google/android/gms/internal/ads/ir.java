package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ir extends sh implements jr {
    public ir() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static jr zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof jr ? (jr) iInterfaceQueryLocalInterface : new hr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            th.b(parcel);
            zzc(aVarR);
        } else if (i6 == 2) {
            zzd();
        } else {
            if (i6 != 3) {
                return false;
            }
            k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            th.b(parcel);
            zzb(aVarR2);
        }
        parcel2.writeNoException();
        return true;
    }
}
