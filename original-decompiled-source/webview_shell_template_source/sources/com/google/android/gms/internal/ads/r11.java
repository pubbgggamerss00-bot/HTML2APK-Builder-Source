package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r11 implements a01 {

    /* renamed from: a, reason: collision with root package name */
    public final mt0 f8506a;

    public r11(mt0 mt0Var) {
        this.f8506a = mt0Var;
    }

    @Override // com.google.android.gms.internal.ads.a01
    public final b01 a(String str, JSONObject jSONObject) {
        return new b01(this.f8506a.b(str, jSONObject), new e11(), str);
    }
}
