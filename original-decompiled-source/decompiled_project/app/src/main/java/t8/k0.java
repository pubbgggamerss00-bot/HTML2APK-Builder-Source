package t8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import t0.ff;
import t0.n7;
import t0.nf;
import t0.of;
import t0.t4;
import t0.z9;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class k0 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f28264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f28265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<List<x>> f28266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f28267d;

    public k0(p5.x xVar, q0 q0Var, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f28264a = xVar;
        this.f28265b = q0Var;
        this.f28266c = n1Var;
        this.f28267d = n1Var2;
    }

    @Override // eh.q
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        z.f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            final List<x> value = this.f28266c.getValue();
            if (value == null) {
                jVar2.L(-501527872);
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, jVar2);
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
                z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, null, jVar2);
                jVar2.H();
                jVar2.B();
            } else if (value.isEmpty()) {
                jVar2.L(1632649521);
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, padding), 32);
                z.q qVarA = z.o.a(z.b.f34448e, d.a.f14615n, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar2);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY2, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                ph.v1.j(g.a.f13865d, dVarC2, jVar2);
                w1.d dVarA = p0.y.a();
                long j10 = k9.d.f16192n;
                d.a aVar3 = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar3, 40), j10, jVar2, 432, 0);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 12), jVar2);
                ff.b(f3.q.c(this.f28267d.getValue().booleanValue() ? R.string.ai_error_unavailable : R.string.ai_history_empty, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.B();
            } else {
                jVar2.L(-501500020);
                FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
                float f10 = 20;
                z.g1 g1Var = new z.g1(f10, padding.c() + 8, f10, 24);
                b.i iVarH = z.b.h(10);
                jVar2.L(-501491371);
                boolean zL = jVar2.l(value);
                final p5.x xVar = this.f28264a;
                boolean zL2 = zL | jVar2.l(xVar);
                final q0 q0Var = this.f28265b;
                boolean zL3 = zL2 | jVar2.l(q0Var);
                Object objG = jVar2.g();
                if (zL3 || objG == j.a.f31715a) {
                    objG = new eh.l() { // from class: t8.e0
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            b0.j0 LazyColumn = (b0.j0) obj;
                            kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                            b0.j0.b(LazyColumn, null, b4.f28122d, 3);
                            q5.z zVar = new q5.z(2);
                            List list = value;
                            LazyColumn.d(list.size(), new n7(1, zVar, list), new i0(h0.f28230a, list), new f1.b(-632812321, true, new j0(list, xVar, q0Var)));
                            b0.j0.b(LazyColumn, null, b4.f28123e, 3);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                b0.d.a(fillElement2, null, g1Var, iVarH, null, null, false, null, (eh.l) objG, jVar2, 24582, 490);
                jVar2.B();
            }
        }
        return pg.f0.f21461a;
    }
}
