package q5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p5.b1;
import p5.d1;
import p5.u0;
import r.u1;
import sh.z0;
import x0.x1;

@b1.a("composable")
/* loaded from: classes.dex */
public final class e extends b1<a> {

    /* renamed from: c, reason: collision with root package name */
    public final x1 f21950c = bg.b.h(Boolean.FALSE);

    public static final class a extends p5.k0 {

        /* renamed from: f, reason: collision with root package name */
        public final eh.r<r.n, p5.s, x0.j, Integer, pg.f0> f21951f;

        /* renamed from: g, reason: collision with root package name */
        public eh.l<r.p<p5.s>, u1> f21952g;

        /* renamed from: h, reason: collision with root package name */
        public s8.x f21953h;

        public a(e eVar, f1.b bVar) {
            super(eVar);
            this.f21951f = bVar;
        }
    }

    @Override // p5.b1
    public final p5.k0 a() {
        return new a(this, b.f21926a);
    }

    @Override // p5.b1
    public final void d(List list, u0 u0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p5.s backStackEntry = (p5.s) it.next();
            d1 d1VarB = b();
            sh.l0 l0Var = (sh.l0) d1VarB.f21204e;
            kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
            z0 z0Var = (z0) d1VarB.f21203d;
            Iterable iterable = (Iterable) z0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((p5.s) it2.next()) == backStackEntry) {
                        Iterable iterable2 = (Iterable) l0Var.f25021a.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((p5.s) it3.next()) == backStackEntry) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            p5.s sVar = (p5.s) qg.x.K((List) l0Var.f25021a.getValue());
            if (sVar != null) {
                z0Var.j(null, qg.n0.d((Set) z0Var.getValue(), sVar));
            }
            z0Var.j(null, qg.n0.d((Set) z0Var.getValue(), backStackEntry));
            d1VarB.j(backStackEntry);
        }
        this.f21950c.setValue(Boolean.FALSE);
    }

    @Override // p5.b1
    public final void e(p5.s sVar, boolean z10) {
        b().h(sVar, z10);
        this.f21950c.setValue(Boolean.TRUE);
    }
}
