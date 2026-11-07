package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7449a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f7450b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f7451c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f7452d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f7453e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f7454f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f7455g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ga2 f7456i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f7457j;

    public nj0(rc0 rc0Var, qi0 qi0Var, w92 w92Var, ca2 ca2Var, ym0 ym0Var, ji0 ji0Var, w92 w92Var2, ok0 ok0Var, w92 w92Var3) {
        this.f7453e = rc0Var;
        this.f7454f = qi0Var;
        this.f7450b = w92Var;
        this.f7455g = ca2Var;
        this.h = ym0Var;
        this.f7456i = ji0Var;
        this.f7451c = w92Var2;
        this.f7457j = ok0Var;
        this.f7452d = w92Var3;
    }

    public si0 a() {
        ac1 ac1Var = (ac1) ((androidx.camera.view.b) ((rc0) this.f7453e).f8608b).f674t;
        ih1.j(ac1Var);
        return new si0(ac1Var, ((qi0) this.f7454f).a(), (dl0) this.f7450b.zzb(), (hl0) ((ca2) this.f7455g).zzb(), ((ym0) this.h).f11027a.f8669o, ((ji0) this.f7456i).a(), (bm0) this.f7451c.zzb(), new kl0(((ok0) this.f7457j).f7802b.zzb()), (in0) ((w92) this.f7452d).zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7449a) {
            case 0:
                return a();
            case 1:
                Executor executor = (Executor) this.f7450b.zzb();
                Context contextA = ((oc0) this.f7453e).a();
                WeakReference weakReference = ((kc0) ((pc0) this.f7454f).f8025b).f6323d;
                ih1.j(weakReference);
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new fv0(executor, contextA, weakReference, h70Var, (mt0) this.f7451c.zzb(), (ScheduledExecutorService) ((w92) this.f7452d).zzb(), (iu0) ((w92) this.f7455g).zzb(), ((bd0) this.h).a(), new an0(((wk0) this.f7456i).f10212b.zzb()), (ie1) ((w92) this.f7457j).zzb());
            case 2:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new f81(h70Var2, (ScheduledExecutorService) this.h.zzb(), (String) this.f7453e.zzb(), (a41) this.f7454f.zzb(), (Context) this.f7450b.zzb(), ((lk0) this.f7452d).a(), (z31) this.f7451c.zzb(), (mt0) this.f7455g.zzb(), (gv0) this.f7456i.zzb(), ((Integer) this.f7457j.zzb()).intValue());
            default:
                n21 n21Var = (n21) this.f7450b.zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.h).a();
                String str = ((hj0) ((sc0) this.f7453e).f8893b.zzb()).f5430t.f9726e;
                ih1.j(str);
                return new af1(n21Var, versionInfoParcelA, str, (String) this.f7454f.zzb(), (Context) this.f7451c.zzb(), ((jk0) ((af0) this.f7455g).f2738b).f6098d, (cc1) ((w92) this.f7452d).zzb(), (i3.a) this.f7456i.zzb(), (mf) this.f7457j.zzb());
        }
    }

    public nj0(w92 w92Var, oc0 oc0Var, pc0 pc0Var, w92 w92Var2, w92 w92Var3, w92 w92Var4, bd0 bd0Var, wk0 wk0Var, w92 w92Var5) {
        this.f7450b = w92Var;
        this.f7453e = oc0Var;
        this.f7454f = pc0Var;
        this.f7451c = w92Var2;
        this.f7452d = w92Var3;
        this.f7455g = w92Var4;
        this.h = bd0Var;
        this.f7456i = wk0Var;
        this.f7457j = w92Var5;
    }

    public nj0(w92 w92Var, bd0 bd0Var, sc0 sc0Var, w92 w92Var2, w92 w92Var3, af0 af0Var, w92 w92Var4, w92 w92Var5, w92 w92Var6) {
        this.f7450b = w92Var;
        this.h = bd0Var;
        this.f7453e = sc0Var;
        this.f7454f = w92Var2;
        this.f7451c = w92Var3;
        this.f7455g = af0Var;
        this.f7452d = w92Var4;
        this.f7456i = w92Var5;
        this.f7457j = w92Var6;
    }

    public nj0(w92 w92Var, ca2 ca2Var, w92 w92Var2, w92 w92Var3, lk0 lk0Var, w92 w92Var4, w92 w92Var5, w92 w92Var6, w92 w92Var7) {
        this.h = w92Var;
        this.f7453e = ca2Var;
        this.f7454f = w92Var2;
        this.f7450b = w92Var3;
        this.f7452d = lk0Var;
        this.f7451c = w92Var4;
        this.f7455g = w92Var5;
        this.f7456i = w92Var6;
        this.f7457j = w92Var7;
    }
}
