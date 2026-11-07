package f9;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class d2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f9301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f9302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f9303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9305f;

    public d2(Context context, View view, eh.a aVar, fg fgVar, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f9300a = n1Var;
        this.f9301b = fgVar;
        this.f9302c = context;
        this.f9303d = view;
        this.f9304e = aVar;
        this.f9305f = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14611j, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.L(-2146984388);
            final x0.n1<Boolean> n1Var = this.f9300a;
            boolean zK = jVar2.K(n1Var);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                objG = new b9.k(n1Var, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c.f9141b, jVar2, 805306368, 510);
            jVar2.L(-2146980441);
            boolean zK2 = jVar2.K(n1Var);
            final fg fgVar = this.f9301b;
            boolean zL = zK2 | jVar2.l(fgVar);
            final Context context = this.f9302c;
            boolean zL2 = zL | jVar2.l(context);
            final View view = this.f9303d;
            boolean zL3 = zL2 | jVar2.l(view);
            final eh.a<pg.f0> aVar2 = this.f9304e;
            boolean zK3 = zL3 | jVar2.K(aVar2);
            Object objG2 = jVar2.g();
            if (zK3 || objG2 == c0321a) {
                final x0.n1<Boolean> n1Var2 = this.f9305f;
                objG2 = new eh.a() { // from class: f9.c2
                    @Override // eh.a
                    public final Object invoke() {
                        d1.o(n1Var, false);
                        d1.j(fgVar, aVar2, n1Var2, context, view);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG2, null, false, null, null, null, c.f9142c, jVar2, 805306368, 510);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
