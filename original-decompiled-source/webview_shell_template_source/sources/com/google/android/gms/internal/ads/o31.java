package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o31 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final a01 f7585a;

    /* renamed from: b, reason: collision with root package name */
    public final f01 f7586b;

    /* renamed from: c, reason: collision with root package name */
    public final ae1 f7587c;

    /* renamed from: d, reason: collision with root package name */
    public final hs1 f7588d;

    public o31(ae1 ae1Var, hs1 hs1Var, a01 a01Var, f01 f01Var) {
        this.f7587c = ae1Var;
        this.f7588d = hs1Var;
        this.f7586b = f01Var;
        this.f7585a = a01Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        return !tb1Var.f9206t.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.gl0, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        b01 b01VarA;
        Iterator it = tb1Var.f9206t.iterator();
        while (true) {
            if (!it.hasNext()) {
                b01VarA = null;
                break;
            }
            try {
                b01VarA = this.f7585a.a((String) it.next(), tb1Var.f9210v);
                break;
            } catch (gc1 unused) {
            }
        }
        if (b01VarA == null) {
            return bs1.l(new y11(3, "Unable to instantiate mediation adapter class."));
        }
        o70 o70Var = new o70();
        b01VarA.f2885c.r(new n31(b01VarA, o70Var));
        if (tb1Var.M) {
            Bundle bundle = ((ec1) ac1Var.f2647a.f9702t).f4209d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        e61 e61Var = new e61(3, new androidx.fragment.app.f0(this, ac1Var, tb1Var, b01VarA));
        ds1 ds1Var = ae1.f2730d;
        List list = Collections.EMPTY_LIST;
        c5.a aVarU = this.f7588d.u(e61Var);
        ae1 ae1Var = this.f7587c;
        wd1 wd1Var = new wd1(ae1Var, yd1.F, null, ds1Var, list, aVarU);
        wd1 wd1VarA = ae1Var.a(wd1Var.a(), yd1.G);
        rf0 rf0Var = new rf0(3, o70Var);
        h70 h70Var = i70.f5592g;
        c5.a aVar = wd1VarA.f10170e;
        ae1 ae1Var2 = wd1VarA.f10171f;
        wd1 wd1Var2 = new wd1(ae1Var2, wd1VarA.f10166a, null, wd1VarA.f10168c, wd1VarA.f10169d, bs1.p(aVar, rf0Var, h70Var));
        return ae1Var2.a(wd1Var2.a(), yd1.H).b(new p2.g(this, ac1Var, tb1Var, b01VarA)).a();
    }
}
