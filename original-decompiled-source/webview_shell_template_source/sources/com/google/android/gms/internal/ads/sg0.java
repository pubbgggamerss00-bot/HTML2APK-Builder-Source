package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sg0 implements bi {
    public xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f8922t;

    /* renamed from: u, reason: collision with root package name */
    public final hg0 f8923u;

    /* renamed from: v, reason: collision with root package name */
    public final i3.a f8924v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8925w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8926x = false;

    /* renamed from: y, reason: collision with root package name */
    public final kg0 f8927y = new kg0();

    public sg0(Executor executor, hg0 hg0Var, i3.a aVar) {
        this.f8922t = executor;
        this.f8923u = hg0Var;
        this.f8924v = aVar;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        boolean z6 = this.f8926x ? false : aiVar.f2772j;
        kg0 kg0Var = this.f8927y;
        kg0Var.f6401a = z6;
        kg0Var.f6403c = this.f8924v.b();
        kg0Var.f6405e = aiVar;
        if (this.f8925w) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectA = this.f8923u.a(this.f8927y);
            if (this.s != null) {
                this.f8922t.execute(new o30(1, this, jSONObjectA));
            }
        } catch (JSONException e6) {
            zze.zzb("Failed to call video active view js", e6);
        }
    }
}
