package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fb1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4589a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4590b;

    /* renamed from: c, reason: collision with root package name */
    public final hc0 f4591c;

    /* renamed from: d, reason: collision with root package name */
    public final j41 f4592d;

    /* renamed from: e, reason: collision with root package name */
    public final hb1 f4593e;

    /* renamed from: f, reason: collision with root package name */
    public to f4594f;

    /* renamed from: g, reason: collision with root package name */
    public final ie1 f4595g;
    public final dc1 h;

    /* renamed from: i, reason: collision with root package name */
    public vd1 f4596i;

    public fb1(Context context, Executor executor, hc0 hc0Var, j41 j41Var, hb1 hb1Var, dc1 dc1Var) {
        this.f4589a = context;
        this.f4590b = executor;
        this.f4591c = hc0Var;
        this.f4592d = j41Var;
        this.h = dc1Var;
        this.f4593e = hb1Var;
        this.f4595g = hc0Var.r();
    }

    public final boolean a() {
        vd1 vd1Var = this.f4596i;
        return (vd1Var == null || vd1Var.f9834u.isDone()) ? false : true;
    }

    public final boolean b(zzm zzmVar, String str, f0 f0Var, p41 p41Var) {
        xd0 xd0VarC;
        he1 he1Var;
        Executor executor = this.f4590b;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new b(18, this));
            return false;
        }
        if (a()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.N8)).booleanValue();
        hc0 hc0Var = this.f4591c;
        if (zBooleanValue && zzmVar.zzf) {
            hc0Var.k().e(true);
        }
        zzs zzsVar = ((db1) f0Var).A;
        Bundle bundleF = ed0.f(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(zzv.zzC().a())));
        dc1 dc1Var = this.h;
        dc1Var.f3831c = str;
        dc1Var.f3830b = zzsVar;
        dc1Var.f3829a = zzmVar;
        dc1Var.f3846t = bundleF;
        ec1 ec1VarA = dc1Var.a();
        int iB = ge1.b(ec1VarA);
        Context context = this.f4589a;
        de1 de1VarG = d0.g(context, iB, 4, zzmVar);
        boolean zBooleanValue2 = ((Boolean) zzbe.zzc().a(zn.b8)).booleanValue();
        j41 j41Var = this.f4592d;
        if (zBooleanValue2) {
            wd0 wd0VarH = hc0Var.h();
            ik0 ik0Var = new ik0();
            ik0Var.f5796a = context;
            ik0Var.f5797b = ec1VarA;
            wd0VarH.f10164w = new jk0(ik0Var);
            qm0 qm0Var = new qm0();
            qm0Var.b(j41Var, executor);
            qm0Var.c(j41Var, executor);
            wd0VarH.f10163v = new rm0(qm0Var);
            wd0VarH.f10165x = new v31(0, this.f4594f);
            xd0VarC = wd0VarH.zzh();
        } else {
            qm0 qm0Var2 = new qm0();
            hb1 hb1Var = this.f4593e;
            HashSet hashSet = qm0Var2.h;
            HashSet hashSet2 = qm0Var2.f8409e;
            if (hb1Var != null) {
                hashSet2.add(new kn0(hb1Var, executor));
                hashSet.add(new kn0(hb1Var, executor));
                qm0Var2.a(hb1Var, executor);
            }
            wd0 wd0VarH2 = hc0Var.h();
            ik0 ik0Var2 = new ik0();
            ik0Var2.f5796a = context;
            ik0Var2.f5797b = ec1VarA;
            wd0VarH2.f10164w = new jk0(ik0Var2);
            qm0Var2.b(j41Var, executor);
            hashSet2.add(new kn0(j41Var, executor));
            hashSet.add(new kn0(j41Var, executor));
            qm0Var2.a(j41Var, executor);
            qm0Var2.f8407c.add(new kn0(j41Var, executor));
            qm0Var2.d(j41Var, executor);
            qm0Var2.c(j41Var, executor);
            qm0Var2.f8416m.add(new kn0(j41Var, executor));
            qm0Var2.f8415l.add(new kn0(j41Var, executor));
            wd0VarH2.f10163v = new rm0(qm0Var2);
            wd0VarH2.f10165x = new v31(0, this.f4594f);
            xd0VarC = wd0VarH2.zzh();
        }
        xd0 xd0Var = xd0VarC;
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            he1Var = (he1) xd0Var.A.zzb();
            he1Var.i(4);
            he1Var.b(zzmVar.zzp);
            he1Var.f(zzmVar.zzm);
        } else {
            he1Var = null;
        }
        he1 he1Var2 = he1Var;
        fj0 fj0VarB = xd0Var.b();
        vd1 vd1VarA = fj0VarB.a(fj0VarB.b());
        this.f4596i = vd1VarA;
        vd1VarA.addListener(new as1(0, vd1VarA, new eb1(this, p41Var, he1Var2, de1VarG, xd0Var)), executor);
        return true;
    }
}
