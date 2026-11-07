package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mb1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7067a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7068b;

    /* renamed from: c, reason: collision with root package name */
    public final hc0 f7069c;

    /* renamed from: d, reason: collision with root package name */
    public final hb1 f7070d;

    /* renamed from: e, reason: collision with root package name */
    public final bb1 f7071e;

    /* renamed from: f, reason: collision with root package name */
    public final bc1 f7072f;

    /* renamed from: g, reason: collision with root package name */
    public final ie1 f7073g;
    public final dc1 h;

    /* renamed from: i, reason: collision with root package name */
    public c5.a f7074i;

    public mb1(Context context, Executor executor, hc0 hc0Var, bb1 bb1Var, hb1 hb1Var, dc1 dc1Var, bc1 bc1Var) {
        this.f7067a = context;
        this.f7068b = executor;
        this.f7069c = hc0Var;
        this.f7071e = bb1Var;
        this.f7070d = hb1Var;
        this.h = dc1Var;
        this.f7072f = bc1Var;
        this.f7073g = hc0Var.r();
    }

    public final boolean a(zzm zzmVar, String str, f0 f0Var, p41 p41Var) {
        he1 he1Var;
        g40 g40Var = new g40(zzmVar, str);
        Executor executor = this.f7068b;
        String str2 = g40Var.f4895t;
        if (str2 == null) {
            zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new t(12, this));
            return false;
        }
        c5.a aVar = this.f7074i;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) mp.f7199c.c()).booleanValue();
        bb1 bb1Var = this.f7071e;
        zzm zzmVar2 = g40Var.s;
        if (!zBooleanValue || bb1Var.zzd() == null) {
            he1Var = null;
        } else {
            he1 he1VarZzh = ((ae0) ((us0) bb1Var.zzd())).zzh();
            he1VarZzh.i(5);
            he1VarZzh.b(zzmVar2.zzp);
            he1VarZzh.f(zzmVar2.zzm);
            he1Var = he1VarZzh;
        }
        boolean z6 = zzmVar2.zzf;
        Context context = this.f7067a;
        qc1.a(context, z6);
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() && zzmVar2.zzf) {
            this.f7069c.k().e(true);
        }
        Bundle bundleF = ed0.f(new Pair("api-call", Long.valueOf(zzmVar2.zzz)), new Pair("dynamite-enter", Long.valueOf(zzv.zzC().a())));
        dc1 dc1Var = this.h;
        dc1Var.f3831c = str2;
        dc1Var.f3830b = zzs.zzd();
        dc1Var.f3829a = zzmVar2;
        dc1Var.f3846t = bundleF;
        ec1 ec1VarA = dc1Var.a();
        de1 de1VarG = d0.g(context, ge1.b(ec1VarA), 5, zzmVar2);
        kb1 kb1Var = new kb1();
        kb1Var.f6315a = ec1VarA;
        c5.a aVarF = bb1Var.f(new com.google.android.gms.ads.mediation.customevent.a(kb1Var, null, 8, false), new ej0(15, this));
        this.f7074i = aVarF;
        aVarF.addListener(new as1(0, aVarF, new jb1(this, p41Var, he1Var, de1VarG, kb1Var)), executor);
        return true;
    }

    public final zd0 b(za1 za1Var) {
        zd0 zd0VarJ = this.f7069c.j();
        ik0 ik0Var = new ik0();
        ik0Var.f5796a = this.f7067a;
        ik0Var.f5797b = ((kb1) za1Var).f6315a;
        ik0Var.f5799d = this.f7072f;
        zd0VarJ.f11267w = new jk0(ik0Var);
        zd0VarJ.f11266v = new rm0(new qm0());
        return zd0VarJ;
    }
}
