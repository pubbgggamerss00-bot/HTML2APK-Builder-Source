package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9461a;

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f9461a) {
            case 0:
                return (f6) obj;
            case 1:
                return "failure_click_attok";
            case 2:
                return new b51(1, (Bundle) obj);
            default:
                String str = ((bc1) obj).f3033b;
                return TextUtils.isEmpty(str) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzk() ? "fakeForAdDebugLog" : str;
        }
    }
}
