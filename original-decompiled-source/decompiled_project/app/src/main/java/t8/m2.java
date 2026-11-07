package t8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.wc;
import f9.yc;
import f9.zc;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Iterator;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class m2 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.d f28295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f28296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3 f28298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.x f28300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Integer> f28301g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f28302h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f28303j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28304k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f28305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1.w<Integer, Boolean> f28306m;

    public m2(f3.d dVar, b0.m0 m0Var, x0.n1 n1Var, m3 m3Var, eh.a aVar, p5.x xVar, x0.n1 n1Var2, ph.i0 i0Var, x0.n1 n1Var3, x0.n1 n1Var4, x0.l1 l1Var, h1.w wVar) {
        this.f28295a = dVar;
        this.f28296b = m0Var;
        this.f28297c = n1Var;
        this.f28298d = m3Var;
        this.f28299e = aVar;
        this.f28300f = xVar;
        this.f28301g = n1Var2;
        this.f28302h = i0Var;
        this.f28303j = n1Var3;
        this.f28304k = n1Var4;
        this.f28305l = l1Var;
        this.f28306m = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        final x0.n1 n1Var;
        m3 m3Var;
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
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            androidx.compose.ui.d dVarE = d0.h.e(androidx.compose.foundation.layout.f.l(fillElement, CropImageView.DEFAULT_ASPECT_RATIO, padding.c(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
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
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            float f10 = 16;
            x0.l1 l1Var = this.f28305l;
            z.g1 g1Var = new z.g1(f10, 8, f10, this.f28295a.u(l1Var.g()) + f10);
            jVar2.L(1987510997);
            x0.n1 n1Var2 = this.f28297c;
            boolean zK = jVar2.K(n1Var2);
            final m3 m3Var2 = this.f28298d;
            boolean zL = zK | jVar2.l(m3Var2);
            final eh.a<pg.f0> aVar2 = this.f28299e;
            boolean zK2 = zL | jVar2.K(aVar2);
            final p5.x xVar = this.f28300f;
            boolean zL2 = zK2 | jVar2.l(xVar);
            final x0.n1<Integer> n1Var3 = this.f28301g;
            boolean zK3 = zL2 | jVar2.K(n1Var3);
            final ph.i0 i0Var = this.f28302h;
            boolean zL3 = zK3 | jVar2.l(i0Var);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL3 || objG == c0321a) {
                final h1.w<Integer, Boolean> wVar = this.f28306m;
                n1Var = n1Var2;
                objG = new eh.l() { // from class: t8.w1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Iterator it;
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(d.a.f1143b, CropImageView.DEFAULT_ASPECT_RATIO, 640, 1), 1.0f);
                        mh.k kVar = v2.f28495e;
                        x0.n1 n1Var4 = n1Var;
                        boolean z10 = ((b3) n1Var4.getValue()).f28116f;
                        m3 m3Var3 = m3Var2;
                        if (z10) {
                            b0.j0.b(LazyColumn, "history", new f1.b(1419219408, true, new x1(dVarD)), 2);
                        } else if (((b3) n1Var4.getValue()).f28117g) {
                            b0.j0.b(LazyColumn, "history", new f1.b(1862924935, true, new y1(m3Var3, dVarD)), 2);
                        } else if (((b3) n1Var4.getValue()).f28111a.isEmpty()) {
                            b0.j0.b(LazyColumn, null, new f1.b(-488070456, true, new z1(n1Var4)), 3);
                        }
                        y3 y3Var = (y3) qg.x.K(((b3) n1Var4.getValue()).f28111a);
                        Integer numValueOf = y3Var != null ? Integer.valueOf(y3Var.f28581a) : null;
                        Iterator it2 = ((b3) n1Var4.getValue()).f28111a.iterator();
                        while (it2.hasNext()) {
                            y3 y3Var2 = (y3) it2.next();
                            int i10 = y3Var2.f28581a;
                            List<String> list = y3Var2.f28589i;
                            b0.j0.b(LazyColumn, j2.y.a(i10, "u"), new f1.b(-1169146126, true, new a2(dVarD, y3Var2)), 2);
                            b0.j0.b(LazyColumn, "a" + i10, new f1.b(2055301481, true, new c2(y3Var2, numValueOf, aVar2, dVarD)), 2);
                            if (list.isEmpty()) {
                                it = it2;
                            } else {
                                Integer numValueOf2 = Integer.valueOf(i10);
                                h1.w wVar2 = wVar;
                                Boolean bool = (Boolean) wVar2.get(numValueOf2);
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : y3Var2.f28602v;
                                it = it2;
                                b0.j0.b(LazyColumn, j2.y.a(i10, "ch"), new f1.b(2014287501, true, new e2(y3Var2, zBooleanValue, dVarD, wVar2)), 2);
                                if (!zBooleanValue) {
                                    LazyColumn.d(list.size(), new zc(y3Var2, 1), b0.i0.f3369a, new f1.b(-202088719, true, new f2(dVarD, y3Var2)));
                                }
                                b0.j0.b(LazyColumn, j2.y.a(i10, "cf"), new f1.b(715348036, true, new g2(dVarD)), 2);
                            }
                            b0.j0.b(LazyColumn, j2.y.a(i10, "e"), new f1.b(-606768086, true, new l2(dVarD, y3Var2, m3Var3, xVar, n1Var3, numValueOf, i0Var, n1Var4)), 2);
                            it2 = it;
                        }
                        return pg.f0.f21461a;
                    }
                };
                m3Var = m3Var2;
                jVar2.C(objG);
            } else {
                n1Var = n1Var2;
                m3Var = m3Var2;
            }
            jVar2.B();
            b0.d.a(fillElement, this.f28296b, g1Var, null, d.a.f14615n, null, false, null, (eh.l) objG, jVar2, 196614, 472);
            x0.n1<String> n1Var4 = this.f28303j;
            String value = n1Var4.getValue();
            jVar2.L(1987668186);
            boolean zK4 = jVar2.K(n1Var4);
            Object objG2 = jVar2.g();
            int i10 = 1;
            if (zK4 || objG2 == c0321a) {
                objG2 = new wc(n1Var4, i10);
                jVar2.C(objG2);
            }
            eh.l lVar = (eh.l) objG2;
            jVar2.B();
            boolean z10 = ((b3) n1Var.getValue()).f28115e;
            String strC = f3.q.c(((b3) n1Var.getValue()).f28115e ? R.string.ai_session_input_running : ((b3) n1Var.getValue()).f28112b == null ? R.string.ai_session_input_new : R.string.ai_session_input_edit, jVar2);
            jVar2.L(1987681420);
            boolean zL4 = jVar2.l(m3Var) | jVar2.K(n1Var4);
            x0.n1<Boolean> n1Var5 = this.f28304k;
            boolean zK5 = zL4 | jVar2.K(n1Var5);
            Object objG3 = jVar2.g();
            if (zK5 || objG3 == c0321a) {
                objG3 = new c9.l0(m3Var, n1Var5, n1Var4);
                jVar2.C(objG3);
            }
            eh.a aVar3 = (eh.a) objG3;
            jVar2.B();
            jVar2.L(1987686615);
            boolean zL5 = jVar2.l(m3Var);
            Object objG4 = jVar2.g();
            if (zL5 || objG4 == c0321a) {
                objG4 = new e9.k(m3Var, 1);
                jVar2.C(objG4);
            }
            eh.a aVar4 = (eh.a) objG4;
            jVar2.B();
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.b.f961a.b(d.a.f1143b, d.a.f14609h);
            jVar2.L(1987691292);
            Object objG5 = jVar2.g();
            if (objG5 == c0321a) {
                objG5 = new yc(l1Var, 2);
                jVar2.C(objG5);
            }
            jVar2.B();
            v2.m(value, lVar, z10, strC, aVar3, aVar4, androidx.compose.ui.layout.d.a(dVarB, (eh.l) objG5), jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
