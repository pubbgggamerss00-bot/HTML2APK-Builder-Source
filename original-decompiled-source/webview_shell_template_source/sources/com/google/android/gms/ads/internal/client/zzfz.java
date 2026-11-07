package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfz extends zzed {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzfz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z6) {
        this.zza.onVideoMute(z6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        this.zza.onVideoStart();
    }
}
