package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w60 {

    /* renamed from: d, reason: collision with root package name */
    public String f10065d;

    /* renamed from: e, reason: collision with root package name */
    public String f10066e;

    /* renamed from: f, reason: collision with root package name */
    public long f10067f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f10068g;
    public boolean h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10070j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10062a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10063b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10064c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10069i = new ArrayList();

    public w60(String str, long j6) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f10065d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.h = false;
        this.f10070j = false;
        this.f10066e = str;
        this.f10067f = j6;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f10068g = new JSONObject(str);
            if (((Boolean) zzbe.zzc().a(zn.yb)).booleanValue() && a()) {
                return;
            }
            if (this.f10068g.optInt("status", -1) != 1) {
                this.h = false;
                zzo.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.f10065d = this.f10068g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f10068g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i6);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f10063b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f10064c.put(strOptString2, new zx(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f10068g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray3.length(); i7++) {
                    this.f10062a.add(jSONArrayOptJSONArray3.optString(i7));
                }
            }
            if (((Boolean) zzbe.zzc().a(zn.I6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f10068g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    this.f10069i.add(jSONArrayOptJSONArray.get(i8).toString());
                }
            }
            if (!((Boolean) zzbe.zzc().a(zn.e6)).booleanValue() || (jSONObjectOptJSONObject = this.f10068g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f10070j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e6) {
            zzo.zzk("Exception occurred while processing app setting json", e6);
            zzv.zzp().h("AppSettings.parseAppSettingsJson", e6);
        }
    }

    public final boolean a() {
        if (!TextUtils.isEmpty(this.f10066e) && this.f10068g != null) {
            pn pnVar = zn.Bb;
            long jLongValue = ((Long) zzbe.zzc().a(pnVar)).longValue();
            if (((Boolean) zzbe.zzc().a(zn.Ab)).booleanValue() && !TextUtils.isEmpty(this.f10066e)) {
                jLongValue = this.f10068g.optLong("cache_ttl_sec", ((Long) zzbe.zzc().a(pnVar)).longValue());
            }
            long jA = zzv.zzC().a();
            if (jLongValue >= 0) {
                long j6 = this.f10067f;
                if (j6 > jA || TimeUnit.MILLISECONDS.toSeconds(jA - j6) > jLongValue) {
                    this.f10062a.clear();
                    this.f10063b.clear();
                    this.f10064c.clear();
                    this.f10065d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    this.f10066e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    this.f10068g = null;
                    this.h = false;
                    this.f10069i.clear();
                    this.f10070j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
