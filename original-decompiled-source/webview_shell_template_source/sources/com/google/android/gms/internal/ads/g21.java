package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g21 extends e21 {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f4870a;

    /* renamed from: b, reason: collision with root package name */
    public final ik0 f4871b;

    /* renamed from: c, reason: collision with root package name */
    public final v31 f4872c;

    /* renamed from: d, reason: collision with root package name */
    public final rm0 f4873d;

    /* renamed from: e, reason: collision with root package name */
    public final ro0 f4874e;

    /* renamed from: f, reason: collision with root package name */
    public final wl0 f4875f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f4876g;
    public final hm0 h;

    /* renamed from: i, reason: collision with root package name */
    public final n21 f4877i;

    /* renamed from: j, reason: collision with root package name */
    public final e01 f4878j;

    public g21(hc0 hc0Var, ik0 ik0Var, v31 v31Var, rm0 rm0Var, ro0 ro0Var, wl0 wl0Var, ViewGroup viewGroup, hm0 hm0Var, n21 n21Var, e01 e01Var) {
        this.f4870a = hc0Var;
        this.f4871b = ik0Var;
        this.f4872c = v31Var;
        this.f4873d = rm0Var;
        this.f4874e = ro0Var;
        this.f4875f = wl0Var;
        this.f4876g = viewGroup;
        this.h = hm0Var;
        this.f4877i = n21Var;
        this.f4878j = e01Var;
    }

    @Override // com.google.android.gms.internal.ads.e21
    public final vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var) {
        ik0 ik0Var = this.f4871b;
        ik0Var.f5797b = ec1Var;
        ik0Var.f5798c = bundle;
        ik0Var.f5800e = new k00(ac1Var, tb1Var, this.f4877i);
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            ik0Var.f5801f = this.f4878j;
        }
        pd0 pd0VarF = this.f4870a.f();
        pd0VarF.f8033w = new jk0(ik0Var);
        pd0VarF.f8032v = this.f4873d;
        pd0VarF.f8034x = this.f4872c;
        pd0VarF.B = this.f4874e;
        pd0VarF.f8035y = new ni0(0, this.f4875f, this.h);
        pd0VarF.A = new dh0(0, this.f4876g);
        fj0 fj0VarC = pd0VarF.zzh().c();
        return fj0VarC.a(fj0VarC.b());
    }
}
