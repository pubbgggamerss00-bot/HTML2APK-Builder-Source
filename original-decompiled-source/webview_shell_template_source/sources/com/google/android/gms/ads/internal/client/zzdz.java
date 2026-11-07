package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzdz extends rh implements zzeb {
    public zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i6 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() {
        zzee zzecVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzecVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzecVar = iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z6) {
        Parcel parcelZza = zza();
        ClassLoader classLoader = th.f9281a;
        parcelZza.writeInt(z6 ? 1 : 0);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzeeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        boolean zF = th.f(parcelZzcZ);
        parcelZzcZ.recycle();
        return zF;
    }
}
