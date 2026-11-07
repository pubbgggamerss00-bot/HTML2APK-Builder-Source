package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j21 extends e21 {

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final ik0 f5909b;

    /* renamed from: c, reason: collision with root package name */
    public final rm0 f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final n21 f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final bc1 f5912e;

    /* renamed from: f, reason: collision with root package name */
    public final e01 f5913f;

    public j21(hc0 hc0Var, ik0 ik0Var, rm0 rm0Var, bc1 bc1Var, n21 n21Var, e01 e01Var) {
        this.f5908a = hc0Var;
        this.f5909b = ik0Var;
        this.f5910c = rm0Var;
        this.f5912e = bc1Var;
        this.f5911d = n21Var;
        this.f5913f = e01Var;
    }

    @Override // com.google.android.gms.internal.ads.e21
    public final vd1 c(ec1 ec1Var, Bundle bundle, tb1 tb1Var, ac1 ac1Var) {
        bc1 bc1Var;
        ik0 ik0Var = this.f5909b;
        ik0Var.f5797b = ec1Var;
        ik0Var.f5798c = bundle;
        ik0Var.f5800e = new k00(ac1Var, tb1Var, this.f5911d);
        if (((Boolean) zzbe.zzc().a(zn.G3)).booleanValue() && (bc1Var = this.f5912e) != null) {
            ik0Var.f5799d = bc1Var;
        }
        if (((Boolean) zzbe.zzc().a(zn.H3)).booleanValue()) {
            ik0Var.f5801f = this.f5913f;
        }
        zd0 zd0VarJ = this.f5908a.j();
        zd0VarJ.f11267w = new jk0(ik0Var);
        zd0VarJ.f11266v = this.f5910c;
        fj0 fj0VarZzb = zd0VarJ.zzh().zzb();
        return fj0VarZzb.a(fj0VarZzb.b());
    }
}
