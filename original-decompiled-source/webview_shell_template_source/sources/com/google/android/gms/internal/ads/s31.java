package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s31 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8779a;

    /* renamed from: b, reason: collision with root package name */
    public final wh0 f8780b;

    /* renamed from: c, reason: collision with root package name */
    public final to f8781c;

    /* renamed from: d, reason: collision with root package name */
    public final hs1 f8782d;

    /* renamed from: e, reason: collision with root package name */
    public final ae1 f8783e;

    public s31(Context context, wh0 wh0Var, ae1 ae1Var, hs1 hs1Var, to toVar) {
        this.f8779a = context;
        this.f8780b = wh0Var;
        this.f8783e = ae1Var;
        this.f8782d = hs1Var;
        this.f8781c = toVar;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var;
        return (this.f8781c == null || (xb1Var = tb1Var.s) == null || xb1Var.f10472a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        q31 q31Var = new q31(new View(this.f8779a), null, new d0(24), (ub1) tb1Var.f9208u.get(0));
        od0 od0VarA = this.f8780b.a(new androidx.camera.view.b(ac1Var, tb1Var, null), q31Var);
        r31 r31Var = new r31((nk0) od0VarA.C.zzb(), (yk0) od0VarA.F.zzb(), (pn0) od0VarA.H.zzb(), (ln0) od0VarA.Q.zzb(), (lg0) od0VarA.f7723x.zzb());
        xb1 xb1Var = tb1Var.s;
        e61 e61Var = new e61(3, new ni0(14, this, new po(r31Var, xb1Var.f10473b, xb1Var.f10472a)));
        ds1 ds1Var = ae1.f2730d;
        List list = Collections.EMPTY_LIST;
        c5.a aVarU = this.f8782d.u(e61Var);
        ae1 ae1Var = this.f8783e;
        wd1 wd1Var = new wd1(ae1Var, yd1.I, null, ds1Var, list, aVarU);
        wd1 wd1VarA = ae1Var.a(wd1Var.a(), yd1.J);
        rf0 rf0Var = new rf0(3, bs1.m(od0VarA.q()));
        h70 h70Var = i70.f5592g;
        return new wd1(wd1VarA.f10171f, wd1VarA.f10166a, null, wd1VarA.f10168c, wd1VarA.f10169d, bs1.p(wd1VarA.f10170e, rf0Var, h70Var)).a();
    }
}
