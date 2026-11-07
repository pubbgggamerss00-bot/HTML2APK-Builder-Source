package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nt0 {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f7505b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7506c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7507d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f7508e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7504a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7509f = new AtomicBoolean(false);

    public nt0(h70 h70Var) {
        this.f7506c = h70Var;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f7507d = true;
            w60 w60VarZzg = zzv.zzp().d().zzg();
            if (w60VarZzg != null && (jSONObject = w60VarZzg.f10068g) != null) {
                this.f7505b = ((Boolean) zzbe.zzc().a(zn.f11393f4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f7508e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f7504a.containsKey(strOptString2)) {
                                    map = (Map) this.f7504a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f7504a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
