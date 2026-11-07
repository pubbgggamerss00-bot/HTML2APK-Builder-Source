package com.google.android.gms.ads.internal.util.client;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzv {
    private final zzx zza;

    public zzv() {
        this.zza = new e(1, 0, 1.0d, false);
    }

    public static zzv zza(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new zzv(jSONObjectOptJSONObject == null ? new e(1, 0, 1.0d, false) : new e(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final zzx zzb() {
        return this.zza;
    }

    private zzv(zzx zzxVar) {
        this.zza = zzxVar;
    }
}
