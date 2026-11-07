package t0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class h7 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, z.u1> f25990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f25991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hb f25993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f25994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f25995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f25996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(eh.p pVar, s.b bVar, eh.p pVar2, hb hbVar, eh.a aVar, ph.i0 i0Var, f1.b bVar2) {
        super(2);
        this.f25990a = pVar;
        this.f25991b = bVar;
        this.f25992c = pVar2;
        this.f25993d = hbVar;
        this.f25994e = aVar;
        this.f25995f = i0Var;
        this.f25996g = bVar2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        z.s sVar;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarA = z.y1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), this.f25990a.invoke(jVar2, 0));
            s.b<Float, s.o> bVar = this.f25991b;
            boolean zL = jVar2.l(bVar);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new a7(bVar);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (eh.l) objG);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA2, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            jVar2.L(-1636564008);
            eh.p<x0.j, Integer, pg.f0> pVar = this.f25992c;
            z.s sVar2 = z.s.f34624a;
            if (pVar != null) {
                String strB = di.a.b(R.string.m3c_bottom_sheet_collapse_description, jVar2);
                String strB2 = di.a.b(R.string.m3c_bottom_sheet_dismiss_description, jVar2);
                String strB3 = di.a.b(R.string.m3c_bottom_sheet_expand_description, jVar2);
                sVar2.getClass();
                sVar = sVar2;
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(d.a.f14615n);
                aVar.h(horizontalAlignElement);
                hb hbVar = this.f25993d;
                boolean zK = jVar2.K(hbVar) | jVar2.K(strB2);
                eh.a<pg.f0> aVar3 = this.f25994e;
                boolean zK2 = zK | jVar2.K(aVar3) | jVar2.K(strB3);
                ph.i0 i0Var = this.f25995f;
                boolean zL2 = zK2 | jVar2.l(i0Var) | jVar2.K(strB);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == c0321a) {
                    g7 g7Var = new g7(hbVar, strB2, strB3, strB, aVar3, i0Var);
                    jVar2.C(g7Var);
                    objG2 = g7Var;
                }
                androidx.compose.ui.d dVarA3 = q2.q.a(horizontalAlignElement, true, (eh.l) objG2);
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA3, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar2, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                pVar.invoke(jVar2, 0);
                jVar2.H();
            } else {
                sVar = sVar2;
            }
            jVar2.B();
            this.f25996g.b(sVar, jVar2, 6);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
