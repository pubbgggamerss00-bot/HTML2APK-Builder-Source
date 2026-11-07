package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class y91 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10898a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10899b;

    /* renamed from: c, reason: collision with root package name */
    public final hc0 f10900c;

    /* renamed from: d, reason: collision with root package name */
    public final ba1 f10901d;

    /* renamed from: e, reason: collision with root package name */
    public final bb1 f10902e;

    /* renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f10903f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f10904g;
    public final ie1 h;

    /* renamed from: i, reason: collision with root package name */
    public final dc1 f10905i;

    /* renamed from: j, reason: collision with root package name */
    public c5.a f10906j;

    public y91(Context context, Executor executor, hc0 hc0Var, bb1 bb1Var, ba1 ba1Var, dc1 dc1Var, VersionInfoParcel versionInfoParcel) {
        this.f10898a = context;
        this.f10899b = executor;
        this.f10900c = hc0Var;
        this.f10902e = bb1Var;
        this.f10901d = ba1Var;
        this.f10905i = dc1Var;
        this.f10903f = versionInfoParcel;
        this.f10904g = new FrameLayout(context);
        this.h = hc0Var.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(zzm zzmVar, String str, f0 f0Var, p41 p41Var) throws Throwable {
        Throwable th;
        he1 he1Var;
        ug0 ug0Var;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) pp.f8118d.c()).booleanValue()) {
                        try {
                            boolean z6 = ((Boolean) zzbe.zzc().a(zn.ab)).booleanValue();
                            if (this.f10903f.clientJarVersion < ((Integer) zzbe.zzc().a(zn.bb)).intValue() || !z6) {
                                com.google.android.gms.common.internal.l.d("loadAd must be called on the main UI thread.");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                if (str == null) {
                    zzo.zzg("Ad unit ID should not be null for app open ad.");
                    this.f10899b.execute(new yh(14, this));
                    return false;
                }
                if (this.f10906j != null) {
                    return false;
                }
                Object obj = null;
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (ug0Var = (ug0) this.f10902e.zzd()) == null) {
                    he1Var = null;
                } else {
                    he1 he1VarZzh = ug0Var.zzh();
                    he1VarZzh.i(7);
                    he1VarZzh.b(zzmVar.zzp);
                    he1VarZzh.f(zzmVar.zzm);
                    he1Var = he1VarZzh;
                }
                qc1.a(this.f10898a, zzmVar.zzf);
                if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() && zzmVar.zzf) {
                    this.f10900c.k().e(true);
                }
                Bundle bundleF = ed0.f(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(zzv.zzC().a())));
                dc1 dc1Var = this.f10905i;
                dc1Var.f3831c = str;
                dc1Var.f3830b = zzs.zzb();
                dc1Var.f3829a = zzmVar;
                dc1Var.f3846t = bundleF;
                Context context = this.f10898a;
                ec1 ec1VarA = dc1Var.a();
                de1 de1VarG = d0.g(context, ge1.b(ec1VarA), 7, zzmVar);
                x91 x91Var = new x91();
                x91Var.f10450a = ec1VarA;
                c5.a aVarF = this.f10902e.f(new com.google.android.gms.ads.mediation.customevent.a(x91Var, obj, 8, false), new ck1(11, this));
                this.f10906j = aVarF;
                aVarF.addListener(new as1(0, aVarF, new w91(this, p41Var, he1Var, de1VarG, x91Var)), this.f10899b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized md0 b(za1 za1Var) {
        x91 x91Var = (x91) za1Var;
        if (((Boolean) zzbe.zzc().a(zn.a8)).booleanValue()) {
            ik0 ik0Var = new ik0();
            ik0Var.f5796a = this.f10898a;
            ik0Var.f5797b = x91Var.f10450a;
            jk0 jk0Var = new jk0(ik0Var);
            qm0 qm0Var = new qm0();
            qm0Var.f8415l.add(new kn0(this.f10901d, this.f10899b));
            qm0Var.d(this.f10901d, this.f10899b);
            rm0 rm0Var = new rm0(qm0Var);
            md0 md0VarE = ((ca1) this).f10900c.e();
            md0VarE.f7091w = jk0Var;
            md0VarE.f7090v = rm0Var;
            return md0VarE;
        }
        ba1 ba1Var = this.f10901d;
        ba1 ba1Var2 = new ba1(ba1Var.s);
        ba1Var2.f3024z = ba1Var;
        qm0 qm0Var2 = new qm0();
        qm0Var2.a(ba1Var2, this.f10899b);
        qm0Var2.f8411g.add(new kn0(ba1Var2, this.f10899b));
        qm0Var2.f8417n.add(new kn0(ba1Var2, this.f10899b));
        qm0Var2.f8416m.add(new kn0(ba1Var2, this.f10899b));
        qm0Var2.f8415l.add(new kn0(ba1Var2, this.f10899b));
        qm0Var2.d(ba1Var2, this.f10899b);
        qm0Var2.f8418o = ba1Var2;
        ik0 ik0Var2 = new ik0();
        ik0Var2.f5796a = this.f10898a;
        ik0Var2.f5797b = x91Var.f10450a;
        jk0 jk0Var2 = new jk0(ik0Var2);
        rm0 rm0Var2 = new rm0(qm0Var2);
        md0 md0VarE2 = ((ca1) this).f10900c.e();
        md0VarE2.f7091w = jk0Var2;
        md0VarE2.f7090v = rm0Var2;
        return md0VarE2;
    }
}
