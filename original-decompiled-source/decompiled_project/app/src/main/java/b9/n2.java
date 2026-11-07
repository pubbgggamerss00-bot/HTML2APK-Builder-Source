package b9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;

/* loaded from: classes.dex */
public final class n2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3952a;

    public n2(i iVar) {
        this.f3952a = iVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.f.h(aVar, 24), CropImageView.DEFAULT_ASPECT_RATIO, 360, 1);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarS, jVar2);
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
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 56);
            long j10 = o1.f3959a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.14f, j10), h0.f.f12083a);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
            ph.v1.j(bVar, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            t4.b(r0.x.a(), null, androidx.compose.foundation.layout.g.n(aVar, 28), j10, jVar2, 3504, 0);
            jVar2.H();
            float f10 = 16;
            ff.b(pd.d.a(aVar, f10, jVar2, R.string.pdf_document_error, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26547j, jVar2, 0, 0, 65018);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            t0.x0.b(this.f3952a, null, false, null, null, null, null, a.f3690f, jVar2, 805306368, 510);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
