package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yx {

    /* renamed from: a, reason: collision with root package name */
    public final List f11110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11111b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11112c;

    public yx(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(jSONArray.getString(i6));
        }
        this.f11110a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        zzv.zzh();
        ay.a("clickurl", jSONObject);
        zzv.zzh();
        ay.a("imp_urls", jSONObject);
        zzv.zzh();
        ay.a("downloaded_imp_urls", jSONObject);
        zzv.zzh();
        ay.a("fill_urls", jSONObject);
        zzv.zzh();
        ay.a("video_start_urls", jSONObject);
        zzv.zzh();
        ay.a("video_complete_urls", jSONObject);
        zzv.zzh();
        ay.a("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzv.zzh();
            ay.a("manual_impression_urls", jSONObjectOptJSONObject);
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f11111b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzv.zzh();
        ay.a("template_ids", jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f11112c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
