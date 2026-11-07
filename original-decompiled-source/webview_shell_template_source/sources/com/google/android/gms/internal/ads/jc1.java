package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jc1 implements zr1 {
    public final /* synthetic */ xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vf0 f6022t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ cf1 f6023u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ dz0 f6024v;

    public jc1(xa0 xa0Var, vf0 vf0Var, cf1 cf1Var, dz0 dz0Var) {
        this.s = xa0Var;
        this.f6022t = vf0Var;
        this.f6023u = cf1Var;
        this.f6024v = dz0Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        String str = (String) obj;
        tb1 tb1VarD = this.s.d();
        if (tb1VarD == null || tb1VarD.f9187i0) {
            vb1 vb1VarH = this.s.h();
            if (vb1VarH == null) {
                zzv.zzp().h("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                return;
            }
            long jA = zzv.zzC().a();
            boolean zA = zzv.zzp().a(this.s.getContext());
            boolean z6 = false;
            boolean z7 = ((Boolean) zzbe.zzc().a(zn.f11380d6)).booleanValue() && tb1VarD != null && tb1VarD.S;
            if (tb1VarD != null && tb1VarD.f9178d0 != null) {
                z6 = true;
            }
            fz0 fz0Var = new fz0(jA, vb1VarH.f9774b, str, (zA || z7 || z6) ? 2 : 1);
            dz0 dz0Var = this.f6024v;
            dz0Var.getClass();
            dz0Var.b(new ni0(13, dz0Var, fz0Var));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = tb1VarD.f9215x0;
        if (!((Boolean) zzbe.zzc().a(zn.T9)).booleanValue() || this.f6022t == null || !vf0.b(str)) {
            this.f6023u.a(str, zzvVar, null);
            return;
        }
        vf0 vf0Var = this.f6022t;
        cf1 cf1Var = this.f6023u;
        Random randomZze = zzbc.zze();
        vf0Var.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c5.a aVarQ = bs1.q(vf0Var.c(str, vf0Var.f9847d.f5841a, randomZze), ((Integer) zzbe.zzc().a(zn.ga)).intValue(), TimeUnit.MILLISECONDS, vf0Var.f9850g);
        aVarQ.addListener(new as1(0, aVarQ, new uf0(vf0Var, cf1Var, str, zzvVar)), vf0Var.f9848e);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
    }
}
