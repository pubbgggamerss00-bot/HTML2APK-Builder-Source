package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vr0 extends sr {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final jp0 f9927t;

    /* renamed from: u, reason: collision with root package name */
    public up0 f9928u;

    /* renamed from: v, reason: collision with root package name */
    public fp0 f9929v;

    public vr0(Context context, jp0 jp0Var, up0 up0Var, fp0 fp0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.s = context;
        this.f9927t = jp0Var;
        this.f9928u = up0Var;
        this.f9929v = fp0Var;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void U1(k3.a aVar) {
        fp0 fp0Var;
        Object objI1 = k3.b.i1(aVar);
        if (!(objI1 instanceof View) || this.f9927t.o() == null || (fp0Var = this.f9929v) == null) {
            return;
        }
        fp0Var.e((View) objI1);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean k(k3.a aVar) {
        up0 up0Var;
        xa0 xa0Var;
        Object objI1 = k3.b.i1(aVar);
        if (!(objI1 instanceof ViewGroup) || (up0Var = this.f9928u) == null || !up0Var.c((ViewGroup) objI1, false)) {
            return false;
        }
        jp0 jp0Var = this.f9927t;
        synchronized (jp0Var) {
            xa0Var = jp0Var.f6131j;
        }
        xa0Var.S(new ck1(7, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean l(k3.a aVar) {
        up0 up0Var;
        Object objI1 = k3.b.i1(aVar);
        if (!(objI1 instanceof ViewGroup) || (up0Var = this.f9928u) == null || !up0Var.c((ViewGroup) objI1, true)) {
            return false;
        }
        this.f9927t.m().S(new ck1(7, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void p0(String str) {
        fp0 fp0Var = this.f9929v;
        if (fp0Var != null) {
            synchronized (fp0Var) {
                fp0Var.f4750l.k(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final wq zzf() {
        wq wqVar;
        try {
            hp0 hp0Var = this.f9929v.C;
            synchronized (hp0Var) {
                wqVar = hp0Var.f5451a;
            }
            return wqVar;
        } catch (NullPointerException e6) {
            zzv.zzp().h("InternalNativeCustomTemplateAdShim.getMediaContent", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final yq zzg(String str) {
        w.g gVar;
        jp0 jp0Var = this.f9927t;
        synchronized (jp0Var) {
            gVar = jp0Var.f6142v;
        }
        return (yq) gVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final k3.a zzh() {
        return new k3.b(this.s);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final String zzi() {
        return this.f9927t.a();
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final String zzj(String str) {
        w.g gVar;
        jp0 jp0Var = this.f9927t;
        synchronized (jp0Var) {
            gVar = jp0Var.f6143w;
        }
        return (String) gVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final List zzk() {
        w.g gVar;
        w.g gVar2;
        jp0 jp0Var = this.f9927t;
        try {
            synchronized (jp0Var) {
                gVar = jp0Var.f6142v;
            }
            synchronized (jp0Var) {
                gVar2 = jp0Var.f6143w;
            }
            String[] strArr = new String[gVar.f14850u + gVar2.f14850u];
            int i6 = 0;
            for (int i7 = 0; i7 < gVar.f14850u; i7++) {
                strArr[i6] = (String) gVar.f(i7);
                i6++;
            }
            for (int i8 = 0; i8 < gVar2.f14850u; i8++) {
                strArr[i6] = (String) gVar2.f(i8);
                i6++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e6) {
            zzv.zzp().h("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e6);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzl() {
        fp0 fp0Var = this.f9929v;
        if (fp0Var != null) {
            fp0Var.p();
        }
        this.f9929v = null;
        this.f9928u = null;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzm() {
        String str;
        try {
            jp0 jp0Var = this.f9927t;
            synchronized (jp0Var) {
                str = jp0Var.f6145y;
            }
            if (Objects.equals(str, "Google")) {
                zzo.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            fp0 fp0Var = this.f9929v;
            if (fp0Var != null) {
                fp0Var.q(str, false);
            }
        } catch (NullPointerException e6) {
            zzv.zzp().h("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final void zzo() {
        fp0 fp0Var = this.f9929v;
        if (fp0Var != null) {
            synchronized (fp0Var) {
                if (fp0Var.f4760w) {
                    return;
                }
                fp0Var.f4750l.zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean zzq() {
        fp0 fp0Var = this.f9929v;
        if (fp0Var != null && !fp0Var.f4752n.c()) {
            return false;
        }
        jp0 jp0Var = this.f9927t;
        return jp0Var.l() != null && jp0Var.m() == null;
    }

    @Override // com.google.android.gms.internal.ads.tr
    public final boolean zzt() {
        jp0 jp0Var = this.f9927t;
        vz0 vz0VarO = jp0Var.o();
        if (vz0VarO == null) {
            zzo.zzj("Trying to start OMID session before creation.");
            return false;
        }
        ((sz0) zzv.zzB()).e(vz0VarO.f9965a);
        if (jp0Var.l() == null) {
            return true;
        }
        jp0Var.l().G("onSdkLoaded", new w.a());
        return true;
    }
}
