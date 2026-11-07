package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r41 implements zr1 {
    public final /* synthetic */ ck1 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ he1 f8537t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ de1 f8538u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ id0 f8539v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s41 f8540w;

    public r41(s41 s41Var, ck1 ck1Var, he1 he1Var, de1 de1Var, id0 id0Var) {
        this.s = ck1Var;
        this.f8537t = he1Var;
        this.f8538u = de1Var;
        this.f8539v = id0Var;
        this.f8540w = s41Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        he1 he1Var;
        ti0 ti0Var = (ti0) obj;
        synchronized (this.f8540w) {
            try {
                ((bm0) ti0Var.f9294g.s.f9702t).f3222t = this.f8540w.f8787d.f7594b;
                this.s.g(ti0Var);
                this.f8540w.f8785b.a().execute(new t(11, this));
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f8537t) == null) {
                    ie1 ie1Var = this.f8540w.f8788e;
                    de1 de1Var = this.f8538u;
                    de1Var.d(ti0Var.f9288a.f2648b);
                    de1Var.f(ti0Var.f9293f.s);
                    de1Var.s(true);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.g(ti0Var.f9288a.f2648b);
                    he1Var.e(ti0Var.f9293f.s);
                    de1 de1Var2 = this.f8538u;
                    de1Var2.s(true);
                    he1Var.a(de1Var2);
                    he1Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        he1 he1Var;
        if (((Boolean) zzbe.zzc().a(zn.G5)).booleanValue()) {
            zze.zzb("Native ad failed to load", th);
        }
        id0 id0Var = this.f8539v;
        com.google.android.gms.ads.internal.client.zze zzeVarB = tc1.b(th, id0Var.c().f4703l);
        ((qk0) id0Var.f5716y.zzb()).k0(zzeVarB);
        s41 s41Var = this.f8540w;
        s41Var.f8785b.a().execute(new as1(8, this, zzeVarB));
        qc1.b(zzeVarB.zza, "NativeAdLoader.onFailure", th);
        this.s.mo1zza();
        boolean zBooleanValue = ((Boolean) mp.f7199c.c()).booleanValue();
        de1 de1Var = this.f8538u;
        if (!zBooleanValue || (he1Var = this.f8537t) == null) {
            ie1 ie1Var = s41Var.f8788e;
            de1Var.c(zzeVarB);
            de1Var.g(th);
            de1Var.s(false);
            ie1Var.b(de1Var.zzm());
            return;
        }
        he1Var.c(zzeVarB);
        de1Var.g(th);
        de1Var.s(false);
        he1Var.a(de1Var);
        he1Var.h();
    }
}
