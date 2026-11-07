package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wo0 implements yt {
    public final /* synthetic */ int s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10241t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f10242u;

    public /* synthetic */ wo0(bt0 bt0Var, xa0 xa0Var) {
        this.f10241t = bt0Var;
        this.f10242u = xa0Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        switch (this.s) {
            case 0:
                yo0 yo0Var = (yo0) ((WeakReference) this.f10241t).get();
                if (yo0Var == null) {
                    return;
                }
                yo0Var.f11041g.zza();
                nn nnVar = zn.Kc;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f10242u).get();
                    tb1 tb1Var = yo0Var.f11043j;
                    wp0 wp0Var = yo0Var.D;
                    wp0Var.getClass();
                    if (!((Boolean) zzbe.zzc().a(nnVar)).booleanValue() || view == null) {
                        return;
                    }
                    String str = true != zzac.zza(view) ? "0" : "1";
                    bu0 bu0VarA = wp0Var.f10249a.a();
                    bu0VarA.a("action", "hcp");
                    bu0VarA.a("hcp", str);
                    bu0VarA.b(tb1Var);
                    bu0VarA.c();
                    return;
                }
                return;
            default:
                bt0 bt0Var = (bt0) this.f10241t;
                xa0 xa0Var = (xa0) this.f10242u;
                lg0 lg0Var = bt0Var.f3277i;
                synchronized (lg0Var) {
                    lg0Var.f6714u.add(xa0Var);
                    gg0 gg0Var = lg0Var.s;
                    xa0Var.Z("/updateActiveView", gg0Var.f5037e);
                    xa0Var.Z("/untrackActiveViewUnit", gg0Var.f5038f);
                }
                return;
        }
    }

    public /* synthetic */ wo0(yo0 yo0Var, View view) {
        this.f10241t = new WeakReference(yo0Var);
        if (((Boolean) zzbe.zzc().a(zn.Kc)).booleanValue()) {
            this.f10242u = new WeakReference(view);
        } else {
            this.f10242u = new WeakReference(null);
        }
    }
}
