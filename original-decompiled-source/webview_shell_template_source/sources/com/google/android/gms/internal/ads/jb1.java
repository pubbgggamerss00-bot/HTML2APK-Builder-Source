package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jb1 implements zr1 {
    public final /* synthetic */ p41 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ he1 f6013t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ de1 f6014u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kb1 f6015v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mb1 f6016w;

    public jb1(mb1 mb1Var, p41 p41Var, he1 he1Var, de1 de1Var, kb1 kb1Var) {
        this.s = p41Var;
        this.f6013t = he1Var;
        this.f6014u = de1Var;
        this.f6015v = kb1Var;
        this.f6016w = mb1Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        he1 he1Var;
        rs0 rs0Var = (rs0) obj;
        synchronized (this.f6016w) {
            try {
                ((bm0) rs0Var.f9294g.s.f9702t).f3225w = this.f6016w.f7070d;
                this.s.g(rs0Var);
                mb1 mb1Var = this.f6016w;
                Executor executor = mb1Var.f7068b;
                hb1 hb1Var = mb1Var.f7070d;
                Objects.requireNonNull(hb1Var);
                executor.execute(new p(15, hb1Var));
                this.f6016w.f7070d.onAdMetadataChanged();
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f6013t) == null) {
                    ie1 ie1Var = this.f6016w.f7073g;
                    de1 de1Var = this.f6014u;
                    de1Var.d(rs0Var.f9288a.f2648b);
                    de1Var.f(rs0Var.f9293f.s);
                    de1Var.s(true);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.g(rs0Var.f9288a.f2648b);
                    he1Var.e(rs0Var.f9293f.s);
                    de1 de1Var2 = this.f6014u;
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
            zze.zzb("Rewarded ad failed to load", th);
        }
        us0 us0Var = (us0) this.f6016w.f7071e.zzd();
        com.google.android.gms.ads.internal.client.zze zzeVarB = us0Var == null ? tc1.b(th, null) : tc1.b(th, ((ae0) us0Var).zzb().f4703l);
        synchronized (this.f6016w) {
            try {
                if (us0Var != null) {
                    us0Var.a().k0(zzeVarB);
                    this.f6016w.f7068b.execute(new o30(3, this, zzeVarB));
                } else {
                    this.f6016w.f7070d.k0(zzeVarB);
                    this.f6016w.b(this.f6015v).zzh().zzb().f4698f.zzh();
                }
                qc1.b(zzeVarB.zza, "RewardedAdLoader.onFailure", th);
                this.s.mo1zza();
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = this.f6013t) == null) {
                    ie1 ie1Var = this.f6016w.f7073g;
                    de1 de1Var = this.f6014u;
                    de1Var.c(zzeVarB);
                    de1Var.g(th);
                    de1Var.s(false);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.c(zzeVarB);
                    de1 de1Var2 = this.f6014u;
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
