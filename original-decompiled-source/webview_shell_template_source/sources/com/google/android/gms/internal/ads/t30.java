package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t30 {

    /* renamed from: a, reason: collision with root package name */
    public final List f9085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9087c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9088d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9089e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9090f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9091g;
    public final JSONObject h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9092i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9093j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9094k;

    public t30(JSONObject jSONObject) throws NumberFormatException {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f9090f = jSONObject.optString("url");
        this.f9086b = jSONObject.optString("base_uri");
        this.f9087c = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.f9088d = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        String strOptString2 = jSONObject.optString("cookies_include", "true");
        this.f9089e = strOptString2 != null && (strOptString2.equals("1") || strOptString2.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString3 = jSONObject.optString("errors");
        this.f9085a = strOptString3 == null ? null : Arrays.asList(strOptString3.split(","));
        this.f9091g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f9092i = jSONObject.optString("pool_key");
        String strOptString4 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString4)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString4);
            } catch (NumberFormatException unused) {
            }
        }
        this.f9093j = lValueOf.longValue();
        String strOptString5 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString5)) {
            try {
                lValueOf2 = Long.valueOf(strOptString5);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f9094k = lValueOf2.longValue();
    }
}
