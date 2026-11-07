package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ia1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5637a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5638b;

    /* renamed from: c, reason: collision with root package name */
    public final hc0 f5639c;

    /* renamed from: d, reason: collision with root package name */
    public final j41 f5640d;

    /* renamed from: e, reason: collision with root package name */
    public final l41 f5641e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f5642f;

    /* renamed from: g, reason: collision with root package name */
    public to f5643g;
    public final wl0 h;

    /* renamed from: i, reason: collision with root package name */
    public final ie1 f5644i;

    /* renamed from: j, reason: collision with root package name */
    public final hm0 f5645j;

    /* renamed from: k, reason: collision with root package name */
    public final dc1 f5646k;

    /* renamed from: l, reason: collision with root package name */
    public vd1 f5647l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5648m;

    /* renamed from: n, reason: collision with root package name */
    public zze f5649n;

    /* renamed from: o, reason: collision with root package name */
    public p41 f5650o;

    public ia1(Context context, Executor executor, zzs zzsVar, hc0 hc0Var, j41 j41Var, l41 l41Var, dc1 dc1Var, hm0 hm0Var) {
        this.f5637a = context;
        this.f5638b = executor;
        this.f5639c = hc0Var;
        this.f5640d = j41Var;
        this.f5641e = l41Var;
        this.f5646k = dc1Var;
        this.h = hc0Var.g();
        this.f5644i = hc0Var.r();
        this.f5642f = new FrameLayout(context);
        this.f5645j = hm0Var;
        dc1Var.f3830b = zzsVar;
        this.f5648m = true;
        this.f5649n = null;
        this.f5650o = null;
    }

    public final boolean a() {
        vd1 vd1Var = this.f5647l;
        return (vd1Var == null || vd1Var.f9834u.isDone()) ? false : true;
    }

    public final boolean b(zzm zzmVar, String str, f0 f0Var, p41 p41Var) {
        qd0 qd0VarC;
        Executor executor = this.f5638b;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for banner ad.");
            executor.execute(new b(17, this));
            return false;
        }
        boolean zA = a();
        dc1 dc1Var = this.f5646k;
        if (!zA) {
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.N8)).booleanValue();
            hc0 hc0Var = this.f5639c;
            if (zBooleanValue && zzmVar.zzf) {
                hc0Var.k().e(true);
            }
            Bundle bundleF = ed0.f(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(zzv.zzC().a())));
            dc1Var.f3831c = str;
            dc1Var.f3829a = zzmVar;
            dc1Var.f3846t = bundleF;
            ec1 ec1VarA = dc1Var.a();
            int iB = ge1.b(ec1VarA);
            Context context = this.f5637a;
            de1 de1VarG = d0.g(context, iB, 3, zzmVar);
            boolean zBooleanValue2 = ((Boolean) xp.f10657d.c()).booleanValue();
            he1 he1Var = null;
            j41 j41Var = this.f5640d;
            if (!zBooleanValue2 || !dc1Var.f3830b.zzk) {
                boolean zBooleanValue3 = ((Boolean) zzbe.zzc().a(zn.Z7)).booleanValue();
                FrameLayout frameLayout = this.f5642f;
                hm0 hm0Var = this.f5645j;
                wl0 wl0Var = this.h;
                if (zBooleanValue3) {
                    pd0 pd0VarF = hc0Var.f();
                    ik0 ik0Var = new ik0();
                    ik0Var.f5796a = context;
                    ik0Var.f5797b = ec1VarA;
                    pd0VarF.f8033w = new jk0(ik0Var);
                    qm0 qm0Var = new qm0();
                    qm0Var.b(j41Var, executor);
                    qm0Var.c(j41Var, executor);
                    pd0VarF.f8032v = new rm0(qm0Var);
                    pd0VarF.f8034x = new v31(0, this.f5643g);
                    pd0VarF.B = new ro0(pp0.h, null);
                    int i6 = 0;
                    pd0VarF.f8035y = new ni0(i6, wl0Var, hm0Var);
                    pd0VarF.A = new dh0(i6, frameLayout);
                    qd0VarC = pd0VarF.zzh();
                } else {
                    pd0 pd0VarF2 = hc0Var.f();
                    ik0 ik0Var2 = new ik0();
                    ik0Var2.f5796a = context;
                    ik0Var2.f5797b = ec1VarA;
                    pd0VarF2.f8033w = new jk0(ik0Var2);
                    qm0 qm0Var2 = new qm0();
                    qm0Var2.b(j41Var, executor);
                    kn0 kn0Var = new kn0(j41Var, executor);
                    HashSet hashSet = qm0Var2.f8407c;
                    hashSet.add(kn0Var);
                    hashSet.add(new kn0(this.f5641e, executor));
                    qm0Var2.d(j41Var, executor);
                    qm0Var2.f8410f.add(new kn0(j41Var, executor));
                    qm0Var2.f8409e.add(new kn0(j41Var, executor));
                    qm0Var2.h.add(new kn0(j41Var, executor));
                    qm0Var2.a(j41Var, executor);
                    qm0Var2.c(j41Var, executor);
                    qm0Var2.f8416m.add(new kn0(j41Var, executor));
                    pd0VarF2.f8032v = new rm0(qm0Var2);
                    pd0VarF2.f8034x = new v31(0, this.f5643g);
                    pd0VarF2.B = new ro0(pp0.h, null);
                    int i7 = 0;
                    pd0VarF2.f8035y = new ni0(i7, wl0Var, hm0Var);
                    pd0VarF2.A = new dh0(i7, frameLayout);
                    qd0VarC = pd0VarF2.zzh();
                }
                if (((Boolean) mp.f7199c.c()).booleanValue()) {
                    he1Var = (he1) qd0VarC.D.zzb();
                    he1Var.i(3);
                    he1Var.b(zzmVar.zzp);
                    he1Var.f(zzmVar.zzm);
                }
                this.f5650o = p41Var;
                fj0 fj0VarC = qd0VarC.c();
                vd1 vd1VarA = fj0VarC.a(fj0VarC.b());
                this.f5647l = vd1VarA;
                vd1VarA.addListener(new as1(0, vd1VarA, new androidx.fragment.app.f0(this, he1Var, de1VarG, qd0VarC)), executor);
                return true;
            }
            if (j41Var != null) {
                j41Var.k0(tc1.d(7, null, null));
            }
        } else if (!dc1Var.f3843p) {
            this.f5648m = true;
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        synchronized (this) {
            try {
                vd1 vd1Var = this.f5647l;
                if (vd1Var != null && vd1Var.f9834u.isDone()) {
                    try {
                        fh0 fh0Var = (fh0) this.f5647l.f9834u.get();
                        this.f5647l = null;
                        this.f5642f.removeAllViews();
                        if (fh0Var.d() != null) {
                            ViewParent parent = fh0Var.d().getParent();
                            if (parent instanceof ViewGroup) {
                                zzo.zzj("Banner view provided from " + fh0Var.f9293f.s + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(fh0Var.d());
                            }
                        }
                        nn nnVar = zn.Z7;
                        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                            v31 v31Var = fh0Var.f9294g.s;
                            j41 j41Var = this.f5640d;
                            bm0 bm0Var = (bm0) v31Var.f9702t;
                            bm0Var.f3222t = j41Var;
                            bm0Var.f3223u = this.f5641e;
                        }
                        this.f5642f.addView(fh0Var.d());
                        p41 p41Var = this.f5650o;
                        if (p41Var != null) {
                            p41Var.g(fh0Var);
                        }
                        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                            Executor executor = this.f5638b;
                            j41 j41Var2 = this.f5640d;
                            Objects.requireNonNull(j41Var2);
                            executor.execute(new u(10, j41Var2));
                        }
                        if (fh0Var.b() >= 0) {
                            this.f5648m = false;
                            this.h.p0(fh0Var.b());
                            this.h.q0(fh0Var.c());
                        } else {
                            this.f5648m = true;
                            this.h.p0(fh0Var.c());
                        }
                    } catch (InterruptedException e6) {
                        e = e6;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f5648m = true;
                        this.h.zza();
                    } catch (ExecutionException e7) {
                        e = e7;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f5648m = true;
                        this.h.zza();
                    }
                } else if (this.f5647l != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.f5648m = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f5648m = true;
                    this.h.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f5647l = null;
        zze zzeVar = this.f5649n;
        this.f5649n = null;
        if (((Boolean) zzbe.zzc().a(zn.Z7)).booleanValue() && zzeVar != null) {
            this.f5638b.execute(new bb(this, zzeVar, 9, false));
        }
        p41 p41Var = this.f5650o;
        if (p41Var != null) {
            p41Var.mo1zza();
        }
    }
}
