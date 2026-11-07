package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class na1 implements bb1 {
    public final ni0 s;

    /* renamed from: t, reason: collision with root package name */
    public final ra1 f7368t;

    /* renamed from: u, reason: collision with root package name */
    public final md1 f7369u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7370v;

    /* renamed from: w, reason: collision with root package name */
    public gk0 f7371w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f7372x;

    public na1(ni0 ni0Var, ra1 ra1Var, md1 md1Var, String str, h70 h70Var) {
        this.s = ni0Var;
        this.f7368t = ra1Var;
        this.f7369u = md1Var;
        this.f7370v = str;
        this.f7372x = h70Var;
    }

    public final c5.a a(ed1 ed1Var, com.google.android.gms.ads.mediation.customevent.a aVar) {
        gk0 gk0Var = ed1Var.f4234a;
        this.f7371w = gk0Var;
        if (ed1Var.f4236c != null) {
            if (gk0Var.zzf() != null) {
                ed1Var.f4236c.f9292e.a(ed1Var.f4234a.zzf());
            }
            return bs1.m(ed1Var.f4236c);
        }
        gk0Var.zzb().f4699g = ed1Var.f4235b;
        return this.s.k(aVar, null, ed1Var.f4234a);
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final c5.a f(final com.google.android.gms.ads.mediation.customevent.a aVar, final ab1 ab1Var) {
        synchronized (this) {
            fk0 fk0VarD = ab1Var.d((za1) aVar.f2373u);
            fk0VarD.b(new oa1(this.f7370v));
            final gk0 gk0Var = (gk0) fk0VarD.zzh();
            gk0Var.zzg();
            gk0Var.zzg();
            zzm zzmVar = gk0Var.zzg().f4209d;
            if (zzmVar.zzs != null || zzmVar.zzx != null) {
                this.f7371w = gk0Var;
                return this.s.k(aVar, ab1Var, gk0Var);
            }
            ec1 ec1VarZzg = gk0Var.zzg();
            final ma1 ma1Var = new ma1(ab1Var, aVar, ec1VarZzg.f4209d, ec1VarZzg.f4211f, this.f7372x, ec1VarZzg.f4214j, null);
            return bs1.p(xr1.p(this.f7368t.a(aVar, ab1Var, gk0Var)), new pr1() { // from class: com.google.android.gms.internal.ads.la1
                /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
                @Override // com.google.android.gms.internal.ads.pr1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final c5.a zza(Object obj) {
                    qd1 qd1Var;
                    boolean z6;
                    oq1 oq1VarA;
                    na1 na1Var = this.f6638a;
                    com.google.android.gms.ads.mediation.customevent.a aVar2 = aVar;
                    ma1 ma1Var2 = ma1Var;
                    ab1 ab1Var2 = ab1Var;
                    gk0 gk0Var2 = gk0Var;
                    qa1 qa1Var = (qa1) obj;
                    if (qa1Var != null) {
                        ma1 ma1Var3 = new ma1(ma1Var2.f7032a, ma1Var2.f7033b, ma1Var2.f7034c, ma1Var2.f7035d, ma1Var2.f7036e, ma1Var2.f7037f, qa1Var.f8284a);
                        if (qa1Var.f8286c != null) {
                            na1Var.f7371w = null;
                            md1 md1Var = na1Var.f7369u;
                            synchronized (md1Var) {
                                md1Var.f7094c.add(ma1Var3);
                            }
                            return na1Var.a(qa1Var.f8286c, aVar2);
                        }
                        md1 md1Var2 = na1Var.f7369u;
                        synchronized (md1Var2) {
                            md1Var2.f7096e = 2;
                            synchronized (md1Var2) {
                                qd1Var = md1Var2.f7095d;
                                z6 = qd1Var == null;
                            }
                            if (oq1VarA == null) {
                                na1Var.f7371w = null;
                                return bs1.p(oq1VarA, new nv(3, na1Var), na1Var.f7372x);
                            }
                            md1 md1Var3 = na1Var.f7369u;
                            synchronized (md1Var3) {
                                md1Var3.f7094c.add(ma1Var3);
                            }
                            aVar2 = new com.google.android.gms.ads.mediation.customevent.a((za1) aVar2.f2373u, qa1Var.f8285b, 8, false);
                        }
                        oq1VarA = z6 ? null : qd1Var.a(ma1Var3);
                        if (oq1VarA == null) {
                        }
                    }
                    c5.a aVarK = na1Var.s.k(aVar2, ab1Var2, gk0Var2);
                    na1Var.f7371w = gk0Var2;
                    return aVarK;
                }
            }, this.f7372x);
        }
    }

    @Override // com.google.android.gms.internal.ads.bb1
    public final Object zzd() {
        gk0 gk0Var;
        synchronized (this) {
            gk0Var = this.f7371w;
        }
        return gk0Var;
    }
}
