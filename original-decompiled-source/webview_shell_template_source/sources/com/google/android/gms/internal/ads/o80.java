package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o80 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7635e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7637g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7638i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7639j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7640k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7641l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7642m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7643n;

    public o80(String str) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f7631a = a(jSONObject, "aggressive_media_codec_release", zn.V);
        this.f7632b = b(jSONObject, "byte_buffer_precache_limit", zn.f11407i);
        this.f7633c = b(jSONObject, "exo_cache_buffer_size", zn.s);
        this.f7634d = b(jSONObject, "exo_connect_timeout_millis", zn.f11381e);
        sn snVar = zn.f11373d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f7635e = b(jSONObject, "exo_read_timeout_millis", zn.f11388f);
        this.f7636f = b(jSONObject, "load_check_interval_bytes", zn.f11395g);
        this.f7637g = b(jSONObject, "player_precache_limit", zn.h);
        this.h = b(jSONObject, "socket_receive_buffer_size", zn.f11414j);
        this.f7638i = a(jSONObject, "use_cache_data_source", zn.f11457p4);
        b(jSONObject, "min_retry_count", zn.f11421k);
        this.f7639j = a(jSONObject, "treat_load_exception_as_non_fatal", zn.f11434m);
        this.f7640k = a(jSONObject, "enable_multiple_video_playback", zn.Z1);
        this.f7641l = a(jSONObject, "use_range_http_data_source", zn.f11360b2);
        pn pnVar = zn.f11368c2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
            }
        } else {
            jLongValue = ((Long) zzbe.zzc().a(pnVar)).longValue();
        }
        this.f7642m = jLongValue;
        pn pnVar2 = zn.f11376d2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
            }
        } else {
            jLongValue2 = ((Long) zzbe.zzc().a(pnVar2)).longValue();
        }
        this.f7643n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, tn tnVar) {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(tnVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, tn tnVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzbe.zzc().a(tnVar)).intValue();
    }
}
