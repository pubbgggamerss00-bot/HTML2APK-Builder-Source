package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hh0 extends fh0 {

    /* renamed from: j, reason: collision with root package name */
    public final Context f5387j;

    /* renamed from: k, reason: collision with root package name */
    public final View f5388k;

    /* renamed from: l, reason: collision with root package name */
    public final xa0 f5389l;

    /* renamed from: m, reason: collision with root package name */
    public final ub1 f5390m;

    /* renamed from: n, reason: collision with root package name */
    public final ri0 f5391n;

    /* renamed from: o, reason: collision with root package name */
    public final pp0 f5392o;

    /* renamed from: p, reason: collision with root package name */
    public final pn0 f5393p;

    /* renamed from: q, reason: collision with root package name */
    public final u92 f5394q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f5395r;
    public zzs s;

    public hh0(si0 si0Var, Context context, ub1 ub1Var, View view, xa0 xa0Var, ri0 ri0Var, pp0 pp0Var, pn0 pn0Var, u92 u92Var, Executor executor) {
        super(si0Var);
        this.f5387j = context;
        this.f5388k = view;
        this.f5389l = xa0Var;
        this.f5390m = ub1Var;
        this.f5391n = ri0Var;
        this.f5392o = pp0Var;
        this.f5393p = pn0Var;
        this.f5394q = u92Var;
        this.f5395r = executor;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void a() {
        this.f5395r.execute(new t(5, this));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int b() {
        return ((vb1) this.f9288a.f2648b.f1103u).f9776d;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int c() {
        if (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && this.f9289b.f9184g0) {
            if (!((Boolean) zzbe.zzc().a(zn.K7)).booleanValue()) {
                return 0;
            }
        }
        return ((vb1) this.f9288a.f2648b.f1103u).f9775c;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final View d() {
        return this.f5388k;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final zzeb e() {
        try {
            return this.f5391n.zza();
        } catch (gc1 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final ub1 f() {
        zzs zzsVar = this.s;
        if (zzsVar != null) {
            return zzsVar.zzi ? new ub1(-3, 0, true) : new ub1(zzsVar.zze, zzsVar.zzb, false);
        }
        tb1 tb1Var = this.f9289b;
        if (tb1Var.f9176c0) {
            for (String str : tb1Var.f9171a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f5388k;
            return new ub1(view.getWidth(), view.getHeight(), false);
        }
        return (ub1) tb1Var.f9203r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final ub1 g() {
        return this.f5390m;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void h() {
        this.f5393p.zza();
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void i(FrameLayout frameLayout, zzs zzsVar) {
        xa0 xa0Var;
        if (frameLayout == null || (xa0Var = this.f5389l) == null) {
            return;
        }
        xa0Var.h0(cc0.a(zzsVar));
        frameLayout.setMinimumHeight(zzsVar.zzc);
        frameLayout.setMinimumWidth(zzsVar.zzf);
        this.s = zzsVar;
    }
}
