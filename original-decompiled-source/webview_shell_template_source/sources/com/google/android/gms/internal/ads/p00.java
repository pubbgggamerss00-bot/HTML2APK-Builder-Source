package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p00 implements zzr {
    public final /* synthetic */ zzbrw s;

    public p00(zzbrw zzbrwVar) {
        this.s = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.s;
        zzbrwVar.f11614b.onAdOpened(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.s;
        zzbrwVar.f11614b.onAdClosed(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }
}
