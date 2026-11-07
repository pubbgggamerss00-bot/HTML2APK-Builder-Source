package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzds extends rh implements zzdu {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, k3.a aVar, k3.a aVar2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        th.e(parcelZza, aVar);
        th.e(parcelZza, aVar2);
        zzda(1, parcelZza);
    }
}
