package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8304a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8305b;

    public /* synthetic */ qc0(int i6, Object obj) {
        this.f8304a = i6;
        this.f8305b = obj;
    }

    public jp0 a() {
        jp0 jp0Var = (jp0) ((ck1) this.f8305b).f3613t;
        ih1.j(jp0Var);
        return jp0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8304a) {
            case 0:
                return new iq(((kc0) this.f8305b).f6321b);
            case 1:
                return ((lh0) this.f8305b).f6731a;
            case 2:
                return ((androidx.camera.view.b) this.f8305b).a();
            case 3:
                JSONObject jSONObject = (JSONObject) ((j00) this.f8305b).f5891t;
                ih1.j(jSONObject);
                return jSONObject;
            case 4:
                jp0 jp0Var = (jp0) ((ck1) this.f8305b).f3613t;
                ih1.j(jp0Var);
                return jp0Var;
            default:
                return ((lk0) this.f8305b).a().f4219o.f2239a == 3 ? "rewarded_interstitial" : "rewarded";
        }
    }
}
