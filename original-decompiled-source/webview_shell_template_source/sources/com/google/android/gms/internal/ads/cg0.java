package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cg0 implements pk0, jl0, al0, zza, xk0, jn0 {
    public final mf A;
    public final cp B;
    public final WeakReference C;
    public final WeakReference D;
    public final k00 E;
    public boolean F;
    public final AtomicBoolean G = new AtomicBoolean();
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f3563t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f3564u;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f3565v;

    /* renamed from: w, reason: collision with root package name */
    public final ac1 f3566w;

    /* renamed from: x, reason: collision with root package name */
    public final tb1 f3567x;

    /* renamed from: y, reason: collision with root package name */
    public final af1 f3568y;

    /* renamed from: z, reason: collision with root package name */
    public final kc1 f3569z;

    public cg0(Context context, h70 h70Var, Executor executor, ScheduledExecutorService scheduledExecutorService, ac1 ac1Var, tb1 tb1Var, af1 af1Var, kc1 kc1Var, View view, xa0 xa0Var, mf mfVar, cp cpVar, k00 k00Var) {
        this.s = context;
        this.f3563t = h70Var;
        this.f3564u = executor;
        this.f3565v = scheduledExecutorService;
        this.f3566w = ac1Var;
        this.f3567x = tb1Var;
        this.f3568y = af1Var;
        this.f3569z = kc1Var;
        this.A = mfVar;
        this.C = new WeakReference(view);
        this.D = new WeakReference(xa0Var);
        this.B = cpVar;
        this.E = k00Var;
    }

    public final List a() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.lb)).booleanValue();
        tb1 tb1Var = this.f3567x;
        if (zBooleanValue) {
            zzv.zzq();
            Context context = this.s;
            if (zzs.zzC(context)) {
                zzv.zzq();
                Integer numZzt = zzs.zzt(context);
                if (numZzt != null) {
                    int iMin = Math.min(numZzt.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = tb1Var.f9177d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return tb1Var.f9177d;
    }

    public final void c() {
        int i6;
        tb1 tb1Var = this.f3567x;
        List list = tb1Var.f9177d;
        if (list == null || list.isEmpty()) {
            return;
        }
        String strZzh = ((Boolean) zzbe.zzc().a(zn.E3)).booleanValue() ? this.A.f7110b.zzh(this.s, (View) this.C.get(), null) : null;
        if ((((Boolean) zzbe.zzc().a(zn.B0)).booleanValue() && ((vb1) this.f3566w.f2648b.f1103u).h) || !((Boolean) qp.h.c()).booleanValue()) {
            this.f3569z.a(this.f3568y.b(this.f3566w, this.f3567x, false, strZzh, null, a()));
            return;
        }
        if (((Boolean) qp.f8436g.c()).booleanValue() && ((i6 = tb1Var.f9173b) == 1 || i6 == 2 || i6 == 5)) {
        }
        xr1 xr1Var = (xr1) bs1.q(xr1.p(ds1.f4001t), ((Long) zzbe.zzc().a(zn.f11383e1)).longValue(), TimeUnit.MILLISECONDS, this.f3565v);
        xr1Var.addListener(new as1(0, xr1Var, new ni0(this, strZzh, 7, false)), this.f3563t);
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final void e(zze zzeVar) {
        if (((Boolean) zzbe.zzc().a(zn.D1)).booleanValue()) {
            int i6 = zzeVar.zza;
            tb1 tb1Var = this.f3567x;
            List list = tb1Var.f9198o;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(af1.c((String) it.next(), "@gw_mpe@", "2." + i6));
            }
            this.f3569z.a(this.f3568y.a(this.f3566w, tb1Var, arrayList));
        }
    }

    public final void f(final int i6, final int i7) {
        View view;
        if (i6 <= 0 || !((view = (View) this.C.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            c();
        } else {
            this.f3565v.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ag0
                @Override // java.lang.Runnable
                public final void run() {
                    final cg0 cg0Var = this.s;
                    final int i8 = i6;
                    final int i9 = i7;
                    cg0Var.f3563t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            cg0Var.f(i8 - 1, i9);
                        }
                    });
                }
            }, i7, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.B0)).booleanValue();
        ac1 ac1Var = this.f3566w;
        if ((zBooleanValue && ((vb1) ac1Var.f2648b.f1103u).h) || !((Boolean) qp.f8433d.c()).booleanValue()) {
            tb1 tb1Var = this.f3567x;
            this.f3569z.b(true == zzv.zzp().a(this.s) ? 2 : 1, this.f3568y.a(ac1Var, tb1Var, tb1Var.f9175c));
        } else {
            cp cpVar = this.B;
            cpVar.getClass();
            pq1 pq1VarJ = bs1.j(xr1.p((xr1) bs1.q(xr1.p(ds1.f4001t), ((Long) qp.f8432c.c()).longValue(), TimeUnit.MILLISECONDS, cpVar.f3634c)), Throwable.class, new u5(1), i70.f5592g);
            pq1VarJ.addListener(new as1(0, pq1VarJ, new ej0(4, this)), this.f3563t);
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final synchronized void t() {
        k00 k00Var;
        long j6;
        try {
            if (this.F) {
                ArrayList arrayList = new ArrayList(a());
                arrayList.addAll(this.f3567x.f9181f);
                this.f3569z.a(this.f3568y.b(this.f3566w, this.f3567x, true, null, null, arrayList));
            } else {
                kc1 kc1Var = this.f3569z;
                af1 af1Var = this.f3568y;
                ac1 ac1Var = this.f3566w;
                tb1 tb1Var = this.f3567x;
                kc1Var.a(af1Var.a(ac1Var, tb1Var, tb1Var.f9194m));
                if (((Boolean) zzbe.zzc().a(zn.J3)).booleanValue() && (k00Var = this.E) != null) {
                    List list = ((tb1) k00Var.f6201t).f9194m;
                    String strB = ((n21) k00Var.f6202u).b();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(af1.c((String) it.next(), "@gw_adnetstatus@", strB));
                    }
                    n21 n21Var = (n21) this.E.f6202u;
                    synchronized (n21Var) {
                        j6 = n21Var.h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        arrayList3.add(af1.c((String) obj, "@gw_ttr@", Long.toString(j6, 10)));
                    }
                    kc1 kc1Var2 = this.f3569z;
                    af1 af1Var2 = this.f3568y;
                    k00 k00Var2 = this.E;
                    kc1Var2.a(af1Var2.a((ac1) k00Var2.s, (tb1) k00Var2.f6201t, arrayList3));
                }
                kc1 kc1Var3 = this.f3569z;
                af1 af1Var3 = this.f3568y;
                ac1 ac1Var2 = this.f3566w;
                tb1 tb1Var2 = this.f3567x;
                kc1Var3.a(af1Var3.a(ac1Var2, tb1Var2, tb1Var2.f9181f));
            }
            this.F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
        bc1 bc1Var;
        tb1 tb1Var = this.f3567x;
        List list = tb1Var.h;
        af1 af1Var = this.f3568y;
        af1Var.getClass();
        ArrayList arrayList = new ArrayList();
        long jA = af1Var.h.a();
        try {
            String str3 = y30Var.s;
            String string = Integer.toString(y30Var.f10823t);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.F3)).booleanValue();
            rl1 vl1Var = kl1.s;
            if (zBooleanValue) {
                cc1 cc1Var = af1Var.f2745g;
                if (cc1Var != null && (bc1Var = cc1Var.f3515a) != null) {
                    vl1Var = new vl1(bc1Var);
                }
            } else {
                bc1 bc1Var2 = af1Var.f2744f;
                if (bc1Var2 != null) {
                    vl1Var = new vl1(bc1Var2);
                }
            }
            String str4 = (String) vl1Var.a(new xi0(2)).b();
            String str5 = (String) vl1Var.a(new u5(3)).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c60.b(af1.c(af1.c(af1.c(af1.c(af1.c(af1.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jA)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", af1Var.f2740b), af1Var.f2743e, tb1Var.W, tb1Var.f9213w0));
            }
        } catch (RemoteException e6) {
            zzo.zzh("Unable to determine award type and amount.", e6);
        }
        this.f3569z.a(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
        tb1 tb1Var = this.f3567x;
        this.f3569z.a(this.f3568y.a(this.f3566w, tb1Var, tb1Var.f9186i));
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
        tb1 tb1Var = this.f3567x;
        this.f3569z.a(this.f3568y.a(this.f3566w, tb1Var, tb1Var.f9183g));
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        if (this.G.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzbe.zzc().a(zn.N3)).intValue();
            if (iIntValue > 0) {
                f(iIntValue, ((Integer) zzbe.zzc().a(zn.O3)).intValue());
                return;
            }
            if (!((Boolean) zzbe.zzc().a(zn.M3)).booleanValue()) {
                c();
            } else {
                this.f3564u.execute(new p(8, this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jn0
    public final void zzt() {
        tb1 tb1Var = this.f3567x;
        this.f3569z.a(this.f3568y.a(this.f3566w, tb1Var, tb1Var.f9209u0));
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
    }
}
