package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xa0 f6060t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JSONObject f6061u;

    public /* synthetic */ jg0(xa0 xa0Var, JSONObject jSONObject, int i6) {
        this.s = i6;
        this.f6060t = xa0Var;
        this.f6061u = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.s;
        JSONObject jSONObject = this.f6061u;
        xa0 xa0Var = this.f6060t;
        switch (i6) {
            case 0:
                xa0Var.l0("AFMA_updateActiveView", jSONObject);
                break;
            default:
                int i7 = fp0.G;
                xa0Var.j("onVideoEvent", jSONObject);
                break;
        }
    }
}
