package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i21 extends e21 {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f5536a;

    /* renamed from: b, reason: collision with root package name */
    public final ik0 f5537b;

    /* renamed from: c, reason: collision with root package name */
    public final v31 f5538c;

    /* renamed from: d, reason: collision with root package name */
    public final rm0 f5539d;

    /* renamed from: e, reason: collision with root package name */
    public final n21 f5540e;

    /* renamed from: f, reason: collision with root package name */
    public final e01 f5541f;

    public i21(hc0 hc0Var, ik0 ik0Var, v31 v31Var, rm0 rm0Var, n21 n21Var, e01 e01Var) {
        this.f5536a = hc0Var;
        this.f5537b = ik0Var;
        this.f5538c = v31Var;
        this.f5539d = rm0Var;
        this.f5540e = n21Var;
        this.f5541f = e01Var;
    }

    @Override // com.google.android.gms.internal.ads.e21
    public final vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var) {
        ik0 ik0Var = this.f5537b;
        ik0Var.f5797b = ec1Var;
        ik0Var.f5798c = bundle;
        ik0Var.f5800e = new k00(ac1Var, tb1Var, this.f5540e);
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            ik0Var.f5801f = this.f5541f;
        }
        wd0 wd0VarH = this.f5536a.h();
        wd0VarH.f10164w = new jk0(ik0Var);
        wd0VarH.f10163v = this.f5539d;
        wd0VarH.f10165x = this.f5538c;
        fj0 fj0VarB = wd0VarH.zzh().b();
        return fj0VarB.a(fj0VarB.b());
    }
}
