package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class xi0 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10607a;

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f10607a) {
            case 0:
                return new yi0((ti0) obj);
            case 1:
                return (va1) obj;
            default:
                String str = ((bc1) obj).f3032a;
                return TextUtils.isEmpty(str) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzk() ? "fakeForAdDebugLog" : str;
        }
    }
}
