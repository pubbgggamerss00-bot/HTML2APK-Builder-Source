package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q01 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb1 f8190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8192d;

    public /* synthetic */ q01(Object obj, Object obj2, tb1 tb1Var, int i6) {
        this.f8189a = i6;
        this.f8191c = obj;
        this.f8192d = obj2;
        this.f8190b = tb1Var;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f8189a) {
            case 0:
                r01 r01Var = (r01) this.f8191c;
                ac1 ac1Var = (ac1) this.f8192d;
                Executor executor = r01Var.f8499e;
                Context context = r01Var.f8496b;
                zt0 zt0Var = r01Var.f8501g;
                nn nnVar = zn.f11437m2;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-start", zt0Var.f11577c);
                }
                tb1 tb1Var = this.f8190b;
                List list = tb1Var.f9208u;
                xb1 xb1Var = tb1Var.s;
                zzs zzsVarG = ed0.g(context, list);
                final xa0 xa0VarA = r01Var.f8497c.a(zzsVarG, tb1Var, (vb1) ac1Var.f2648b.f1103u);
                xa0VarA.q(tb1Var.W);
                View viewA = (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && tb1Var.f9184g0) ? hi0.a(context, xa0VarA.zzF(), tb1Var) : new ft0(context, xa0VarA.zzF(), (zzau) r01Var.f8500f.apply(tb1Var));
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", zt0Var.f11577c);
                }
                od0 od0VarA = r01Var.f8495a.a(new androidx.camera.view.b(ac1Var, tb1Var, null), new lh0(viewA, xa0VarA, new v31(11, xa0VarA), zzsVarG.zzi ? new ub1(-3, 0, true) : new ub1(zzsVarG.zze, zzsVarG.zzb, false)));
                w92 w92Var = od0VarA.R;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-ad-component-creation-end", zt0Var.f11577c);
                }
                ((bt0) w92Var.zzb()).a(xa0VarA, false, null, zt0Var.f11577c);
                yk0 yk0VarM = od0VarA.m();
                al0 al0Var = new al0() { // from class: com.google.android.gms.internal.ads.p01
                    @Override // com.google.android.gms.internal.ads.al0
                    public final void zzr() {
                        xa0 xa0Var = xa0VarA;
                        if (xa0Var.zzN() != null) {
                            xa0Var.zzN().k0();
                        }
                    }
                };
                h70 h70Var = i70.f5592g;
                yk0VarM.l0(al0Var, h70Var);
                String strB = xb1Var.f10472a;
                if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && ((uz0) od0VarA.D.zzb()).d()) {
                    strB = vb0.b(strB, vb0.a(tb1Var));
                }
                o70 o70VarB = bt0.b(xa0VarA, xb1Var.f10473b, strB, zt0Var.f11577c);
                ps1 ps1Var = o70VarB.s;
                if (tb1Var.M) {
                    ps1Var.addListener(new ci0(xa0VarA, 1), executor);
                }
                ps1Var.addListener(new ni(r01Var, xa0VarA, 3, false), executor);
                return bs1.o(o70VarB, new ir0(1, od0VarA), h70Var);
            default:
                return bs1.m(hi0.a(((x01) this.f8191c).f10325a, (View) this.f8192d, this.f8190b));
        }
    }
}
