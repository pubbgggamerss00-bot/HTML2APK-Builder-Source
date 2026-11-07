package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Optional;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r extends zzce {
    public final /* synthetic */ PreloadCallback s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzex f2319t;

    public r(zzex zzexVar, PreloadCallback preloadCallback) {
        this.s = preloadCallback;
        this.f2319t = zzexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) {
        Optional optionalZzk = zzex.zzk(this.f2319t, zzftVar);
        final PreloadCallback preloadCallback = this.s;
        optionalZzk.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzeq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsAvailable((PreloadConfiguration) obj);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) {
        Optional optionalZzk = zzex.zzk(this.f2319t, zzftVar);
        final PreloadCallback preloadCallback = this.s;
        optionalZzk.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsExhausted((PreloadConfiguration) obj);
            }
        });
    }
}
