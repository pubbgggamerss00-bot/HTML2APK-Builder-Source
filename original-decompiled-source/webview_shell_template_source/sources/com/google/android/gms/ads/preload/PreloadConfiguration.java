package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class PreloadConfiguration {
    private final String zza;
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Builder {
        private final String zza;
        private final AdFormat zzb;
        private AdRequest zzc = new AdRequest.Builder().build();
        private int zzd;

        public Builder(String str, AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }

        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        public Builder setAdRequest(AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        public Builder setBufferSize(int i6) {
            this.zzd = i6;
            return this;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder, zza zzaVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    public AdFormat getAdFormat() {
        return this.zzb;
    }

    public AdRequest getAdRequest() {
        return this.zzc;
    }

    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
