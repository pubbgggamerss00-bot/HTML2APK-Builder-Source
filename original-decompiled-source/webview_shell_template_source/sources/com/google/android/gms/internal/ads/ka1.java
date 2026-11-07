package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ka1 implements bb1 {
    public gk0 s;

    public final c5.a a(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var, gk0 gk0Var) {
        fk0 fk0VarD = ab1Var.d((za1) aVar.f2373u);
        fk0VarD.a(new cb1());
        gk0 gk0Var2 = (gk0) fk0VarD.zzh();
        this.s = gk0Var2;
        fj0 fj0VarZzb = gk0Var2.zzb();
        ed1 ed1Var = new ed1();
        xr1 xr1VarP = xr1.p(fj0VarZzb.b());
        of0 of0Var = new of0(2, ed1Var, fj0VarZzb);
        ur1 ur1Var = ur1.s;
        return bs1.o(bs1.p(xr1VarP, of0Var, ur1Var), new bs0(1, ed1Var), ur1Var);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final /* bridge */ /* synthetic */ c5.a f(com.google.android.gms.ads.mediation.customevent.a aVar, ab1 ab1Var) {
        return a(aVar, ab1Var, null);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final /* synthetic */ Object zzd() {
        return this.s;
    }
}
