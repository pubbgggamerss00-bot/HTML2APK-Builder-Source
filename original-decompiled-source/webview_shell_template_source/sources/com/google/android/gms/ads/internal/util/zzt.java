package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.eb0;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.oz0;
import com.google.android.gms.internal.ads.tb0;
import com.google.android.gms.internal.ads.xa0;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@TargetApi(dn.zzm)
/* loaded from: classes.dex */
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzo.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzv.zzp().g("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzb(String str, String str2, int i6, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i6, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final eb0 zzc(xa0 xa0Var, kk kkVar, boolean z6, oz0 oz0Var) {
        return new tb0(xa0Var, kkVar, z6, new a10(xa0Var, xa0Var.zzE(), new kn(xa0Var.getContext())), oz0Var);
    }
}
