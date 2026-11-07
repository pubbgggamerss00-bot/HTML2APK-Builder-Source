package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2363a;

    public h(Context context) {
        this.f2363a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f2363a);
        } catch (c3.i | IOException | IllegalStateException e6) {
            zzo.zzh("Fail to get isAdIdFakeForDebugLogging", e6);
            isAdIdFakeForDebugLogging = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(isAdIdFakeForDebugLogging);
        zzo.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
