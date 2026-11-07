package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bf0 implements se0 {

    /* renamed from: a, reason: collision with root package name */
    public final sv0 f3154a;

    public bf0(sv0 sv0Var) {
        this.f3154a = sv0Var;
    }

    @Override // com.google.android.gms.internal.ads.se0
    public final void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) zzbe.zzc().a(zn.d9)).booleanValue()) {
                sv0 sv0Var = this.f3154a;
                synchronized (sv0Var) {
                    sv0Var.f9023p = jSONObject;
                }
            }
        }
    }
}
