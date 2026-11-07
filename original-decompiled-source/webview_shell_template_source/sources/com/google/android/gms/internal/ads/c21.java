package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c21 extends e21 {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f3379a;

    /* renamed from: b, reason: collision with root package name */
    public final ro0 f3380b;

    /* renamed from: c, reason: collision with root package name */
    public final ik0 f3381c;

    /* renamed from: d, reason: collision with root package name */
    public final rm0 f3382d;

    /* renamed from: e, reason: collision with root package name */
    public final n21 f3383e;

    /* renamed from: f, reason: collision with root package name */
    public final e01 f3384f;

    public c21(hc0 hc0Var, ro0 ro0Var, ik0 ik0Var, rm0 rm0Var, n21 n21Var, e01 e01Var) {
        this.f3379a = hc0Var;
        this.f3380b = ro0Var;
        this.f3381c = ik0Var;
        this.f3382d = rm0Var;
        this.f3383e = n21Var;
        this.f3384f = e01Var;
    }

    @Override // com.google.android.gms.internal.ads.e21
    public final vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var) {
        ik0 ik0Var = this.f3381c;
        ik0Var.f5797b = ec1Var;
        ik0Var.f5798c = bundle;
        ik0Var.f5800e = new k00(ac1Var, tb1Var, this.f3383e);
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            ik0Var.f5801f = this.f3384f;
        }
        gb0 gb0VarI = this.f3379a.i();
        gb0VarI.f4970w = new jk0(ik0Var);
        gb0VarI.f4969v = this.f3382d;
        gb0VarI.f4971x = this.f3380b;
        gb0VarI.f4972y = new dh0(0, null);
        fj0 fj0VarC = gb0VarI.zzh().c();
        return fj0VarC.a(fj0VarC.b());
    }
}
