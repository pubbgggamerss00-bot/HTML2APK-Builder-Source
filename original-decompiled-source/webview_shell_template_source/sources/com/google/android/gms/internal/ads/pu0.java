package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pu0 {

    /* renamed from: a, reason: collision with root package name */
    public Long f8150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8151b;

    /* renamed from: c, reason: collision with root package name */
    public String f8152c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f8153d;

    /* renamed from: e, reason: collision with root package name */
    public String f8154e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f8155f;

    public static /* bridge */ /* synthetic */ String a(pu0 pu0Var) throws JSONException {
        String str = (String) zzbe.zzc().a(zn.Q9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", pu0Var.f8150a);
            jSONObject.put("eventCategory", pu0Var.f8151b);
            jSONObject.putOpt("event", pu0Var.f8152c);
            jSONObject.putOpt("errorCode", pu0Var.f8153d);
            jSONObject.putOpt("rewardType", pu0Var.f8154e);
            jSONObject.putOpt("rewardAmount", pu0Var.f8155f);
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
