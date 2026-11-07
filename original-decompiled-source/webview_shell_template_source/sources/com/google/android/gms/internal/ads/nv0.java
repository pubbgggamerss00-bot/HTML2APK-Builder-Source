package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nv0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7519d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7520e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7522g;

    public nv0(String str, String str2, String str3, int i6, String str4, int i7, boolean z6) {
        this.f7516a = str;
        this.f7517b = str2;
        this.f7518c = str3;
        this.f7519d = i6;
        this.f7520e = str4;
        this.f7521f = i7;
        this.f7522g = z6;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f7516a);
        jSONObject.put("version", this.f7518c);
        if (((Boolean) zzbe.zzc().a(zn.j9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f7517b);
        }
        jSONObject.put("status", this.f7519d);
        jSONObject.put("description", this.f7520e);
        jSONObject.put("initializationLatencyMillis", this.f7521f);
        if (((Boolean) zzbe.zzc().a(zn.k9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f7522g);
        }
        return jSONObject;
    }
}
