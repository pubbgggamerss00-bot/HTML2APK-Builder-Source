package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wd1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10167b;

    /* renamed from: c, reason: collision with root package name */
    public final c5.a f10168c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10169d;

    /* renamed from: e, reason: collision with root package name */
    public final c5.a f10170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae1 f10171f;

    public wd1(ae1 ae1Var, Object obj, String str, c5.a aVar, List list, c5.a aVar2) {
        this.f10171f = ae1Var;
        this.f10166a = obj;
        this.f10167b = str;
        this.f10168c = aVar;
        this.f10169d = list;
        this.f10170e = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vd1 a() {
        ae1 ae1Var = this.f10171f;
        Object obj = this.f10166a;
        String str = this.f10167b;
        if (str == null) {
            ae1Var.getClass();
            str = ((yd1) obj).s;
        }
        vd1 vd1Var = new vd1(obj, str, this.f10170e);
        ae1Var.f2733c.o0(new v31(14, vd1Var));
        ni niVar = new ni(this, vd1Var, 4, false);
        h70 h70Var = i70.f5592g;
        this.f10168c.addListener(niVar, h70Var);
        vd1Var.addListener(new as1(0 == true ? 1 : 0, vd1Var, new com.google.android.gms.ads.mediation.customevent.a(this, vd1Var, 9, false)), h70Var);
        return vd1Var;
    }

    public final wd1 b(td1 td1Var) {
        return c(new dr0(1, td1Var));
    }

    public final wd1 c(pr1 pr1Var) {
        ae1 ae1Var = this.f10171f;
        hs1 hs1Var = ae1Var.f2731a;
        return new wd1(ae1Var, this.f10166a, this.f10167b, this.f10168c, this.f10169d, bs1.p(this.f10170e, pr1Var, hs1Var));
    }

    public final wd1 d(long j6) {
        c5.a aVarQ = bs1.q(this.f10170e, j6, TimeUnit.SECONDS, this.f10171f.f2732b);
        return new wd1(this.f10171f, this.f10166a, this.f10167b, this.f10168c, this.f10169d, aVarQ);
    }
}
