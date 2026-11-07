package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class yq0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11063b;

    public /* synthetic */ yq0(int i6, Object obj) {
        this.f11062a = i6;
        this.f11063b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws p21, JSONException {
        switch (this.f11062a) {
            case 0:
                xa0 xa0Var = (xa0) obj;
                if (xa0Var == null || xa0Var.zzq() == null) {
                    throw new p21(1, "Retrieve video view in html5 ad response failed.");
                }
                return (gr1) this.f11063b;
            default:
                String str = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str2 = (String) this.f11063b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str);
                    jSONObject2.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    jSONObject2.put("signals", new JSONObject(str2));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return bs1.m(jSONObject);
                } catch (JSONException e6) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e6.getCause())));
                }
        }
    }
}
