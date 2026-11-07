package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.oq;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final oq zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z6, Location location, int i6, int i7, String str2, String str3, oq oqVar) {
        super(context, str, bundle, bundle2, z6, location, i6, i7, str2, str3);
        this.zza = oqVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return oq.l(this.zza);
    }
}
