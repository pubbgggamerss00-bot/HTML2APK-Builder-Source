package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tx implements ku {

    /* renamed from: a, reason: collision with root package name */
    public final o70 f9406a;

    public tx(o70 o70Var) {
        this.f9406a = o70Var;
    }

    @Override // com.google.android.gms.internal.ads.ku
    public final void a(JSONObject jSONObject) {
        o70 o70Var = this.f9406a;
        try {
            o70Var.a(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e6) {
            o70Var.b(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.ku
    public final void zza(String str) {
        o70 o70Var = this.f9406a;
        try {
            if (str == null) {
                o70Var.b(new fx());
            } else {
                o70Var.b(new fx(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
