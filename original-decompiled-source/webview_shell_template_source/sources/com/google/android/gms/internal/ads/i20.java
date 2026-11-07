package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i20 extends e20 {
    public final /* synthetic */ UpdateImpressionUrlsCallback s;

    public i20(UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.s = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void W(List list) {
        this.s.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze(String str) {
        this.s.onFailure(str);
    }
}
