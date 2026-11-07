package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uh0 implements al0 {
    public final xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final cu0 f9562t;

    /* renamed from: u, reason: collision with root package name */
    public final tb1 f9563u;

    public uh0(xa0 xa0Var, cu0 cu0Var, tb1 tb1Var) {
        this.s = xa0Var;
        this.f9562t = cu0Var;
        this.f9563u = tb1Var;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        xa0 xa0Var;
        if (!((Boolean) zzbe.zzc().a(zn.Kc)).booleanValue() || (xa0Var = this.s) == null) {
            return;
        }
        String str = true != zzac.zza(xa0Var.zzF()) ? "0" : "1";
        bu0 bu0VarA = this.f9562t.a();
        bu0VarA.a("action", "hcp");
        bu0VarA.a("hcp", str);
        bu0VarA.b(this.f9563u);
        bu0VarA.c();
    }
}
