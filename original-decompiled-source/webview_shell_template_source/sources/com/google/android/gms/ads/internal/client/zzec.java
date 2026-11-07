package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzec extends rh implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        zzda(1, zza());
    }
}
