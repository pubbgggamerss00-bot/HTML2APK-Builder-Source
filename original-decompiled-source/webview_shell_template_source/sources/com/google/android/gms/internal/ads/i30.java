package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i30 extends rh implements k30 {
    public i30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void G0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelZza = zza();
        th.c(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void Q1(ParcelFileDescriptor parcelFileDescriptor, r30 r30Var) {
        Parcel parcelZza = zza();
        th.c(parcelZza, parcelFileDescriptor);
        th.c(parcelZza, r30Var);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void c0(zzbb zzbbVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }
}
