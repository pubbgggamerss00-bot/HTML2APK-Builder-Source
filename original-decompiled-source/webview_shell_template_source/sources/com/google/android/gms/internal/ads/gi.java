package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzcl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gi extends zzcl {
    public final AppEventListener s;

    public gi(AppEventListener appEventListener) {
        this.s = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String str, String str2) {
        this.s.onAppEvent(str, str2);
    }
}
