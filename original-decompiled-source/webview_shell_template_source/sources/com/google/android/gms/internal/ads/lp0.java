package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lp0 extends mp0 {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f6815b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6816c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6817d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6818e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6819f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6820g;
    public final JSONObject h;

    public lp0(tb1 tb1Var, JSONObject jSONObject) {
        super(tb1Var);
        this.f6815b = zzbs.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f6816c = zzbs.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.f6817d = zzbs.zzl(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f6818e = zzbs.zzl(false, jSONObject, "enable_omid");
        this.f6820g = zzbs.zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, jSONObject, "watermark_overlay_png_base64");
        this.f6819f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) zzbe.zzc().a(zn.f11420j5)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final l2 a() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new l2(12, jSONObject) : this.f7202a.V;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final String b() {
        return this.f6820g;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final boolean c() {
        return this.f6818e;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final boolean d() {
        return this.f6816c;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final boolean e() {
        return this.f6817d;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public final boolean f() {
        return this.f6819f;
    }
}
