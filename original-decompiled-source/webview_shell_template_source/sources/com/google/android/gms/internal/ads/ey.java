package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ey extends rh implements gy {
    @Override // com.google.android.gms.internal.ads.gy
    public final e00 e(String str) {
        e00 c00Var;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        int i6 = d00.s;
        if (strongBinder == null) {
            c00Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c00Var = iInterfaceQueryLocalInterface instanceof e00 ? (e00) iInterfaceQueryLocalInterface : new c00(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelZzcZ.recycle();
        return c00Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final boolean f(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final jy zzb(String str) {
        jy hyVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            hyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            hyVar = iInterfaceQueryLocalInterface instanceof jy ? (jy) iInterfaceQueryLocalInterface : new hy(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelZzcZ.recycle();
        return hyVar;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final boolean zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
