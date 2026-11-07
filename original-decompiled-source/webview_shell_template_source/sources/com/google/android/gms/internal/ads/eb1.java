package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eb1 implements zr1 {
    public final /* synthetic */ p41 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ he1 f4198t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ de1 f4199u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ xd0 f4200v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fb1 f4201w;

    public eb1(fb1 fb1Var, p41 p41Var, he1 he1Var, de1 de1Var, xd0 xd0Var) {
        this.s = p41Var;
        this.f4198t = he1Var;
        this.f4199u = de1Var;
        this.f4200v = xd0Var;
        this.f4201w = fb1Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        he1 he1Var;
        xn0 xn0Var = (xn0) obj;
        synchronized (this.f4201w) {
            try {
                this.f4201w.f4596i = null;
                nn nnVar = zn.b8;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    v31 v31Var = xn0Var.f9294g.s;
                    fb1 fb1Var = this.f4201w;
                    j41 j41Var = fb1Var.f4592d;
                    bm0 bm0Var = (bm0) v31Var.f9702t;
                    bm0Var.f3222t = j41Var;
                    bm0Var.f3225w = fb1Var.f4593e;
                }
                this.s.g(xn0Var);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    this.f4201w.f4590b.execute(new x(18, this));
                    this.f4201w.f4590b.execute(new yh(15, this));
                }
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f4198t) == null) {
                    ie1 ie1Var = this.f4201w.f4595g;
                    de1 de1Var = this.f4199u;
                    de1Var.d(xn0Var.f9288a.f2648b);
                    de1Var.f(xn0Var.f9293f.s);
                    de1Var.s(true);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.g(xn0Var.f9288a.f2648b);
                    he1Var.e(xn0Var.f9293f.s);
                    de1 de1Var2 = this.f4199u;
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
            zze.zzb("Interstitial ad failed to load", th);
        }
        com.google.android.gms.ads.internal.client.zze zzeVarB = tc1.b(th, this.f4200v.b().f4703l);
        synchronized (this.f4201w) {
            try {
                this.f4201w.f4596i = null;
                ((qk0) this.f4200v.B.zzb()).k0(zzeVarB);
                if (((Boolean) zzbe.zzc().a(zn.b8)).booleanValue()) {
                    this.f4201w.f4590b.execute(new wx(9, this, zzeVarB));
                    this.f4201w.f4590b.execute(new q(10, this, zzeVarB));
                }
                qc1.b(zzeVarB.zza, "InterstitialAdLoader.onFailure", th);
                this.s.mo1zza();
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f4198t) == null) {
                    ie1 ie1Var = this.f4201w.f4595g;
                    de1 de1Var = this.f4199u;
                    de1Var.c(zzeVarB);
                    de1Var.g(th);
                    de1Var.s(false);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.c(zzeVarB);
                    de1 de1Var2 = this.f4199u;
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
