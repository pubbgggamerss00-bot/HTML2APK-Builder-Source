package t0;

import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class v8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.u1 f27230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f27231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(z.u1 u1Var, f1.b bVar) {
        super(2);
        this.f27230a = u1Var;
        this.f27231b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(z.y1.a(androidx.compose.foundation.layout.g.f975b, this.f27230a), v0.v.f30489c, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            float f10 = j9.f26151a;
            androidx.compose.ui.d dVarA = q2.q.a(androidx.compose.foundation.layout.f.j(dVarS, CropImageView.DEFAULT_ASPECT_RATIO, f10, 1), false, g0.a.f11258a);
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14615n, jVar2, 54);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, jVar2);
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
            jVar2.L(722845512);
            jVar2.B();
            this.f27231b.b(z.s.f34624a, jVar2, 6);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
