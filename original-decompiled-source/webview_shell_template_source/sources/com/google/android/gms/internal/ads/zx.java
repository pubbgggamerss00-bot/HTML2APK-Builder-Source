package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zx {

    /* renamed from: a, reason: collision with root package name */
    public final List f11594a;

    public zx(JSONObject jSONObject) throws JSONException {
        if (zzo.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i6 = -1;
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            try {
                yx yxVar = new yx(jSONArray.getJSONObject(i7));
                "banner".equalsIgnoreCase(yxVar.f11112c);
                arrayList.add(yxVar);
                if (i6 < 0) {
                    Iterator it = yxVar.f11110a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i6 = i7;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f11594a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            zzv.zzh();
            ay.a("click_urls", jSONObjectOptJSONObject);
            zzv.zzh();
            ay.a("imp_urls", jSONObjectOptJSONObject);
            zzv.zzh();
            ay.a("downloaded_imp_urls", jSONObjectOptJSONObject);
            zzv.zzh();
            ay.a("nofill_urls", jSONObjectOptJSONObject);
            zzv.zzh();
            ay.a("remote_ping_urls", jSONObjectOptJSONObject);
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            l40.l(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
