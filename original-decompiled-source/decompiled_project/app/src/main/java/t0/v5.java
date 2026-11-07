package t0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class v5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(eh.p pVar, eh.p pVar2, eh.p pVar3) {
        super(2);
        this.f27223a = pVar;
        this.f27224b = pVar2;
        this.f27225c = pVar3;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), this.f27223a != null ? z5.f27520c : 0, CropImageView.DEFAULT_ASPECT_RATIO, this.f27224b != null ? z5.f27520c : 0, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
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
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            this.f27225c.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
