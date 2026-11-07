package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.h10;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.pc1;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class AdLoader {
    private final zzr zza;
    private final Context zzb;
    private final zzbr zzc;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Builder {
        private final Context zza;
        private final zzbu zzb;

        public Builder(Context context, String str) {
            l.g("context cannot be null", context);
            zzbu zzbuVarZzd = zzbc.zza().zzd(context, str, new dy());
            this.zza = context;
            this.zzb = zzbuVarZzd;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzr.zza);
            } catch (RemoteException e6) {
                zzo.zzh("Failed to build AdLoader.", e6);
                return new AdLoader(this.zza, new zzfi().zzc(), zzr.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new ct(onAdManagerAdViewLoadedListener), new zzs(this.zza, adSizeArr));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to add Google Ad Manager banner ad listener", e6);
                return this;
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            h10 h10Var = new h10(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, new g10(h10Var), onCustomClickListener == null ? null : new f10(h10Var));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to add custom format ad listener", e6);
                return this;
            }
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new j10(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to add google native ad listener", e6);
                return this;
            }
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to set AdListener.", e6);
                return this;
            }
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", e6);
                return this;
            }
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new oq(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to specify native ad options", e6);
                return this;
            }
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
            pc1 pc1Var = new pc1(zzgVar, zzfVar);
            try {
                this.zzb.zzh(str, new at(pc1Var), zzfVar == null ? null : new zs(pc1Var));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to add custom template ad listener", e6);
                return this;
            }
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.zzb.zzk(new dt(zziVar));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to add google native ad listener", e6);
                return this;
            }
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new oq(nativeAdOptions));
                return this;
            } catch (RemoteException e6) {
                zzo.zzk("Failed to specify native ad options", e6);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbr zzbrVar, zzr zzrVar) {
        this.zzb = context;
        this.zzc = zzbrVar;
        this.zza = zzrVar;
    }

    private final void zzb(final zzei zzeiVar) {
        zn.a(this.zzb);
        if (((Boolean) pp.f8117c.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(zzeiVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e6) {
            zzo.zzh("Failed to load ad.", e6);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e6) {
            zzo.zzk("Failed to check if ad is loading.", e6);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i6) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i6);
        } catch (RemoteException e6) {
            zzo.zzh("Failed to load ads.", e6);
        }
    }

    public final /* synthetic */ void zza(zzei zzeiVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e6) {
            zzo.zzh("Failed to load ad.", e6);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
