package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dk1 extends cr1 {

    /* renamed from: z, reason: collision with root package name */
    public v3.p f3974z;

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        v3.p pVar = this.f3974z;
        return pVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : pVar.toString();
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        this.f3974z = null;
    }
}
