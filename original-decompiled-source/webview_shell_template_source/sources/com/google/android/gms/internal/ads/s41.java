package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s41 {

    /* renamed from: a, reason: collision with root package name */
    public final dc1 f8784a;

    /* renamed from: b, reason: collision with root package name */
    public final hc0 f8785b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8786c;

    /* renamed from: d, reason: collision with root package name */
    public final o41 f8787d;

    /* renamed from: e, reason: collision with root package name */
    public final ie1 f8788e;

    /* renamed from: f, reason: collision with root package name */
    public bj0 f8789f;

    public s41(hc0 hc0Var, Context context, o41 o41Var, dc1 dc1Var) {
        this.f8785b = hc0Var;
        this.f8786c = context;
        this.f8787d = o41Var;
        this.f8784a = dc1Var;
        this.f8788e = hc0Var.r();
        dc1Var.f3845r = o41Var.f7594b;
    }

    public final boolean a(zzm zzmVar, String str, f0 f0Var, p41 p41Var) {
        o41 o41Var = this.f8787d;
        j41 j41Var = o41Var.f7594b;
        zzv.zzq();
        Context context = this.f8786c;
        boolean zZzI = zzs.zzI(context);
        hc0 hc0Var = this.f8785b;
        if (zZzI && zzmVar.zzs == null) {
            zzo.zzg("Failed to load the ad because app ID is missing.");
            hc0Var.a().execute(new x(16, this));
            return false;
        }
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            hc0Var.a().execute(new yh(12, this));
            return false;
        }
        qc1.a(context, zzmVar.zzf);
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() && zzmVar.zzf) {
            hc0Var.k().e(true);
        }
        int i6 = ((q41) f0Var).A;
        Long lValueOf = Long.valueOf(zzv.zzC().a());
        Bundle bundleF = ed0.f(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        dc1 dc1Var = this.f8784a;
        dc1Var.f3829a = zzmVar;
        dc1Var.f3846t = bundleF;
        dc1Var.f3840m = i6;
        ec1 ec1VarA = dc1Var.a();
        de1 de1VarG = d0.g(context, ge1.b(ec1VarA), 8, zzmVar);
        zzcm zzcmVar = ec1VarA.f4218n;
        if (zzcmVar != null) {
            j41Var.f(zzcmVar);
        }
        gb0 gb0VarI = hc0Var.i();
        ik0 ik0Var = new ik0();
        ik0Var.f5796a = context;
        ik0Var.f5797b = ec1VarA;
        gb0VarI.f4970w = new jk0(ik0Var);
        qm0 qm0Var = new qm0();
        qm0Var.c(j41Var, hc0Var.a());
        gb0VarI.f4969v = new rm0(qm0Var);
        gb0VarI.f4971x = new ro0(o41Var.f7593a, j41Var.a());
        he1 he1Var = null;
        gb0VarI.f4972y = new dh0(0, he1Var);
        id0 id0VarZzh = gb0VarI.zzh();
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            he1Var = (he1) id0VarZzh.f5688e.zzb();
            he1Var.i(8);
            he1Var.b(zzmVar.zzp);
            he1Var.f(zzmVar.zzm);
        }
        hc0Var.q().b(1);
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        ScheduledExecutorService scheduledExecutorServiceB = hc0Var.b();
        fj0 fj0VarC = id0VarZzh.c();
        vd1 vd1VarA = fj0VarC.a(fj0VarC.b());
        bj0 bj0Var = new bj0(h70Var, scheduledExecutorServiceB, vd1VarA);
        this.f8789f = bj0Var;
        vd1VarA.addListener(new as1(0, vd1VarA, new ni0(bj0Var, new r41(this, (ck1) p41Var, he1Var, de1VarG, id0VarZzh), 9, false)), h70Var);
        return true;
    }
}
