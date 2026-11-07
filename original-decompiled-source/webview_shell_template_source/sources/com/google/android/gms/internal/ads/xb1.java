package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xb1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10473b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f10474c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f10475d;

    public xb1(JsonReader jsonReader) {
        JSONObject jSONObjectZzi = zzbs.zzi(jsonReader);
        this.f10475d = jSONObjectZzi;
        this.f10472a = jSONObjectZzi.optString("ad_html", null);
        this.f10473b = jSONObjectZzi.optString("ad_base_url", null);
        this.f10474c = jSONObjectZzi.optJSONObject("ad_json");
    }
}
