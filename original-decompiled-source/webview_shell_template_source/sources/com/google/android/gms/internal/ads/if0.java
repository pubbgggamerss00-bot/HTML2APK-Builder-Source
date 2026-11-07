package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class if0 implements se0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f5737a;

    public if0(r0 r0Var) {
        this.f5737a = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.u50] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.se0
    public final void c(JSONObject jSONObject) {
        ((u50) this.f5737a.f8494t).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
