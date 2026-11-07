package t0;

import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class q5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.u1 f26785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f26786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(androidx.compose.ui.d dVar, t.u1 u1Var, f1.b bVar) {
        super(2);
        this.f26784a = dVar;
        this.f26785b = u1Var;
        this.f26786c = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(this.f26784a, CropImageView.DEFAULT_ASPECT_RATIO, z5.f27521d, 1);
            z.w0 w0Var = z.w0.f34658a;
            androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.d.b(dVarJ), this.f26785b, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, jVar2);
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
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            this.f26786c.b(z.s.f34624a, jVar2, 6);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
