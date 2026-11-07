package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class df0 implements re0 {
    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        if (!((Boolean) zzbe.zzc().a(zn.ma)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzv.zzp().d().zzE(Boolean.parseBoolean(str));
    }
}
