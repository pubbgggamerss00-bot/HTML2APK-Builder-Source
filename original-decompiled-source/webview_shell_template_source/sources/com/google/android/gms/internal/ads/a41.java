package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a41 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2561a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2562b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2563c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2564d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2565e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f2566f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f2567g;

    public a41(h70 h70Var) {
        this.f2566f = h70Var;
    }

    public static final Bundle i(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
        }
        return bundle;
    }

    public final synchronized ip1 a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzv.zzp().d().zzg().f10066e) && (map = (Map) this.f2563c.get(str)) != null) {
                List<b41> list = (List) map.get(str2);
                if (list == null) {
                    String strK = ed0.k(this.f2567g, str2, str);
                    if (((Boolean) zzbe.zzc().a(zn.Ma)).booleanValue()) {
                        strK = strK.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strK);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (b41 b41Var : list) {
                        String str3 = b41Var.f2909a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(b41Var.f2910b);
                    }
                    return eo1.b(map2);
                }
            }
            return ip1.f5823y;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !this.f2561a.containsKey(str)) {
            this.f2561a.put(str, new b41(str, new Bundle()));
        }
    }

    public final synchronized ip1 c(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzv.zzp().d().zzg().f10066e)) {
                boolean zMatches = Pattern.matches((String) zzbe.zzc().a(zn.f11444n3), str);
                boolean zMatches2 = Pattern.matches((String) zzbe.zzc().a(zn.f11450o3), str);
                if (zMatches) {
                    map = new HashMap(this.f2565e);
                } else if (zMatches2) {
                    map = new HashMap(this.f2564d);
                }
                return eo1.b(map);
            }
            return ip1.f5823y;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList d(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleI = i(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str = (String) arrayList2.get(i7);
                        b(str);
                        if (((b41) this.f2561a.get(str)) != null) {
                            arrayList.add(new b41(str, bundleI));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) xp.f10655b.c()).booleanValue()) {
                if (((Boolean) zzbe.zzc().a(zn.U1)).booleanValue() && (jSONObject = zzv.zzp().d().zzg().f10068g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i7);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString("platform");
                                d41 d41Var = new d41(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f2564d.put(strOptString, d41Var);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f2565e.put(strOptString, d41Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e6) {
            zze.zzb("Malformed config loading JSON.", e6);
        } finally {
        }
    }

    public final synchronized void f(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f2563c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f2563c.put(str, map);
            List arrayList2 = (List) map.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map.put(str2, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = zzv.zzp().d().zzg().f10068g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f2567g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i6);
                            String lowerCase = ((Boolean) zzbe.zzc().a(zn.Ma)).booleanValue() ? jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            String strOptString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                                    arrayList.addAll(d(jSONArrayOptJSONArray.getJSONObject(i7)));
                                }
                            }
                            f(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e6) {
                    zze.zzb("Malformed config loading JSON.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h() {
        JSONObject jSONObject;
        if (!((Boolean) xp.f10658e.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.T1)).booleanValue() && (jSONObject = zzv.zzp().d().zzg().f10068g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                        Bundle bundleI = i(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f2562b.put(strOptString, new d41(strOptString, zOptBoolean2, zOptBoolean, true, bundleI));
                        }
                    }
                } catch (JSONException e6) {
                    zze.zzb("Malformed config loading JSON.", e6);
                }
            }
        }
    }
}
