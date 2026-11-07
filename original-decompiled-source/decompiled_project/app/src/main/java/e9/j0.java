package e9;

import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import q1.y1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import x0.a2;
import x0.s3;

/* loaded from: classes.dex */
public final class j0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8453a;

    public j0(String str) {
        this.f8453a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2;
        x0.j jVar3 = jVar;
        if ((num.intValue() & 3) == 2 && jVar3.s()) {
            jVar3.v();
        } else {
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
            int iD = jVar3.D();
            a2 a2VarY = jVar3.y();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar3);
            String strC = f3.q.c(R.string.build_failed_dialog_message, jVar3);
            s3 s3Var = of.f26647a;
            ff.b(strC, null, c2.n0.c(4291939035L), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26548k, jVar3, 384, 0, 65530);
            jVar3.L(-1593081419);
            String str = this.f8453a;
            if (mh.x.A(str)) {
                jVar2 = jVar3;
            } else {
                float f10 = 10;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar3);
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(8)), c2.n0.c(4279505182L), y1.f21750a), f10);
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar, l0VarD, jVar3);
                v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar3);
                jVar2 = jVar3;
                ff.b(str, null, ((e2) jVar3.f(f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, t2.l0.a(((nf) jVar3.f(s3Var)).f26549l, 0L, 0L, null, x2.f.f32016c, 0L, 0L, null, null, 16777183), jVar2, 0, 0, 65530);
                jVar2.H();
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
