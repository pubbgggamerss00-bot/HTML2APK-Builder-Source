package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z21 implements a01 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11131a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final mt0 f11132b;

    public z21(mt0 mt0Var) {
        this.f11132b = mt0Var;
    }

    @Override // com.google.android.gms.internal.ads.a01
    public final b01 a(String str, JSONObject jSONObject) {
        b01 b01Var;
        synchronized (this) {
            try {
                b01Var = (b01) this.f11131a.get(str);
                if (b01Var == null) {
                    b01Var = new b01(this.f11132b.b(str, jSONObject), new f11(), str);
                    this.f11131a.put(str, b01Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b01Var;
    }
}
