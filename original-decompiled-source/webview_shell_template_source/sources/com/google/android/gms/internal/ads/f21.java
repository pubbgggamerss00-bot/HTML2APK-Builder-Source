package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f21 extends e21 {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f4454a;

    /* renamed from: b, reason: collision with root package name */
    public final ik0 f4455b;

    /* renamed from: c, reason: collision with root package name */
    public final rm0 f4456c;

    /* renamed from: d, reason: collision with root package name */
    public final n21 f4457d;

    /* renamed from: e, reason: collision with root package name */
    public final e01 f4458e;

    public f21(hc0 hc0Var, ik0 ik0Var, rm0 rm0Var, n21 n21Var, e01 e01Var) {
        this.f4454a = hc0Var;
        this.f4455b = ik0Var;
        this.f4456c = rm0Var;
        this.f4457d = n21Var;
        this.f4458e = e01Var;
    }

    @Override // com.google.android.gms.internal.ads.e21
    public final vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var) {
        ik0 ik0Var = this.f4455b;
        ik0Var.f5797b = ec1Var;
        ik0Var.f5798c = bundle;
        ik0Var.f5800e = new k00(ac1Var, tb1Var, this.f4457d);
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            ik0Var.f5801f = this.f4458e;
        }
        md0 md0VarE = this.f4454a.e();
        md0VarE.f7091w = new jk0(ik0Var);
        md0VarE.f7090v = this.f4456c;
        fj0 fj0VarZzb = md0VarE.zzh().zzb();
        return fj0VarZzb.a(fj0VarZzb.b());
    }
}
