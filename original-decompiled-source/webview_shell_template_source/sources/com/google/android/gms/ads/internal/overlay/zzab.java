package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.t10;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzab extends t10 {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzab(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.zzd) {
                return;
            }
            zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzds(4);
            }
            this.zzd = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzl(Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbe.zzc().a(zn.L8)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z6 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z6 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z6) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            on0 on0Var = this.zza.zzu;
            if (on0Var != null) {
                on0Var.O();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = this.zza.zzc) != null) {
                zzrVar.zzdp();
            }
        }
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        com.google.android.gms.ads.internal.zzv.zzi();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            return;
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzm() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzo() {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzr() {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzu() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzv() {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzx() {
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzk(k3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzh(int i6, int i7, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzp(int i6, String[] strArr, int[] iArr) {
    }
}
