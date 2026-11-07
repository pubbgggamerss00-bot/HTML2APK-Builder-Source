package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fj extends rh implements hj {
    public fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void K1(zzdr zzdrVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzdrVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void h0(k3.a aVar, oj ojVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, aVar);
        th.e(parcelZza, ojVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final void s(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hj
    public final zzdy zzf() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzdy zzdyVarZzb = zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }
}
