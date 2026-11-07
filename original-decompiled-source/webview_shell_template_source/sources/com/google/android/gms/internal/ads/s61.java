package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s61 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f8817a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8818b;

    public s61(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8817a = jSONObject;
        this.f8818b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        JSONObject jSONObject = this.f8817a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f8818b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ck0 ck0Var = (ck0) obj;
        JSONObject jSONObject = this.f8818b;
        if (jSONObject != null) {
            ck0Var.f3611b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
