package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ls extends sh implements ms {
    public ls() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        vs tsVar;
        if (i6 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            tsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            tsVar = iInterfaceQueryLocalInterface instanceof vs ? (vs) iInterfaceQueryLocalInterface : new ts(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        }
        th.b(parcel);
        J0(tsVar);
        parcel2.writeNoException();
        return true;
    }
}
