package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w91 implements zr1 {
    public final /* synthetic */ p41 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ he1 f10128t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ de1 f10129u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x91 f10130v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y91 f10131w;

    public w91(y91 y91Var, p41 p41Var, he1 he1Var, de1 de1Var, x91 x91Var) {
        this.s = p41Var;
        this.f10128t = he1Var;
        this.f10129u = de1Var;
        this.f10130v = x91Var;
        this.f10131w = y91Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        he1 he1Var;
        ti0 ti0Var = (ti0) obj;
        synchronized (this.f10131w) {
            try {
                this.f10131w.f10906j = null;
                if (((Boolean) zzbe.zzc().a(zn.a8)).booleanValue()) {
                    ((bm0) ti0Var.f9294g.s.f9702t).f3224v = this.f10131w.f10901d;
                }
                this.s.g(ti0Var);
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f10128t) == null) {
                    ie1 ie1Var = this.f10131w.h;
                    de1 de1Var = this.f10129u;
                    de1Var.d(ti0Var.f9288a.f2648b);
                    de1Var.f(ti0Var.f9293f.s);
                    de1Var.s(true);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.g(ti0Var.f9288a.f2648b);
                    he1Var.e(ti0Var.f9293f.s);
                    de1 de1Var2 = this.f10129u;
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
            zze.zzb("App open ad failed to load", th);
        }
        ug0 ug0Var = (ug0) this.f10131w.f10902e.zzd();
        com.google.android.gms.ads.internal.client.zze zzeVarB = ug0Var == null ? tc1.b(th, null) : tc1.b(th, ug0Var.zzb().f4703l);
        synchronized (this.f10131w) {
            try {
                y91 y91Var = this.f10131w;
                y91Var.f10906j = null;
                if (ug0Var != null) {
                    ug0Var.zzc().k0(zzeVarB);
                    if (((Boolean) zzbe.zzc().a(zn.a8)).booleanValue()) {
                        this.f10131w.f10899b.execute(new as1(9, this, zzeVarB));
                    }
                } else {
                    y91Var.f10901d.k0(zzeVarB);
                    this.f10131w.b(this.f10130v).zzh().zzb().f4698f.zzh();
                }
                qc1.b(zzeVarB.zza, "AppOpenAdLoader.onFailure", th);
                this.s.mo1zza();
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f10128t) == null) {
                    ie1 ie1Var = this.f10131w.h;
                    de1 de1Var = this.f10129u;
                    de1Var.c(zzeVarB);
                    de1Var.g(th);
                    de1Var.s(false);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.c(zzeVarB);
                    de1 de1Var2 = this.f10129u;
                    de1Var2.g(th);
                    de1Var2.s(false);
                    he1Var.a(de1Var2);
                    he1Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
