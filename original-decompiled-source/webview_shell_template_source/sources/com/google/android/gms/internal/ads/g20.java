package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g20 extends h60 {
    public final /* synthetic */ QueryInfoGenerationCallback s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g20(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.s = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void d2(String str, Bundle bundle, String str2) {
        this.s.onSuccess(new QueryInfo(new zzfa(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void zzb(String str) {
        this.s.onFailure(str);
    }
}
