package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzfa {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzfa(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final Bundle zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        if (!TextUtils.isEmpty(this.zzc)) {
            try {
                return new JSONObject(this.zzc).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
