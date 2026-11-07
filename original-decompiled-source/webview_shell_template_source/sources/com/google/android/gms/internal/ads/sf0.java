package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.io.Serializable;
import java.util.UUID;
import t2.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf0 implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8915t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f8916u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8917v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8918w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8919x;

    public /* synthetic */ sf0(uf0 uf0Var, Throwable th, cf1 cf1Var, String str, zzv zzvVar) {
        this.f8915t = uf0Var;
        this.f8916u = th;
        this.f8917v = cf1Var;
        this.f8918w = str;
        this.f8919x = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.ha)).booleanValue();
                vf0 vf0Var = ((uf0) this.f8915t).f9550v;
                Throwable th = (Throwable) this.f8916u;
                if (zBooleanValue) {
                    vf0Var.f9851i = t20.e(vf0Var.f9844a);
                    vf0Var.f9851i.b("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    vf0Var.h = t20.a(vf0Var.f9844a);
                    vf0Var.h.b("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                zzv zzvVar = (zzv) this.f8919x;
                ((cf1) this.f8917v).a((String) this.f8918w, zzvVar, null);
                return;
            default:
                try {
                    if (!(((t2.c) this.f8915t).s instanceof a.b)) {
                        String string = ((UUID) this.f8916u).toString();
                        androidx.work.p pVarF = ((r2.s) ((s2.p) this.f8919x).f14384c).f(string);
                        if (pVarF == null || pVarF.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((j2.d) ((s2.p) this.f8919x).f14383b).f(string, (androidx.work.h) this.f8917v);
                        ((Context) this.f8918w).startService(q2.b.a((Context) this.f8918w, string, (androidx.work.h) this.f8917v));
                    }
                    ((t2.c) this.f8915t).h(null);
                    return;
                } catch (Throwable th2) {
                    ((t2.c) this.f8915t).i(th2);
                    return;
                }
        }
    }

    public sf0(s2.p pVar, t2.c cVar, UUID uuid, androidx.work.h hVar, Context context) {
        this.f8919x = pVar;
        this.f8915t = cVar;
        this.f8916u = uuid;
        this.f8917v = hVar;
        this.f8918w = context;
    }
}
