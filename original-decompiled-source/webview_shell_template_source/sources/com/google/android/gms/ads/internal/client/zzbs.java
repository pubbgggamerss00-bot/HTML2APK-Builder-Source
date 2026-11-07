package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.bw;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.yr;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbs extends rh implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() {
        zzbr zzbpVar;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbpVar = iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(wr wrVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(yr yrVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, fs fsVar, cs csVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        th.e(parcelZza, fsVar);
        th.e(parcelZza, csVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(jw jwVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(js jsVar, zzs zzsVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, jsVar);
        th.c(parcelZza, zzsVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(ms msVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, msVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) {
        Parcel parcelZza = zza();
        th.e(parcelZza, zzblVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelZza = zza();
        th.c(parcelZza, adManagerAdViewOptions);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(bw bwVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(oq oqVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, oqVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) {
        throw null;
    }
}
