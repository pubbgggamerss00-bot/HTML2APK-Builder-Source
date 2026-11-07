package s8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Iterator;
import java.util.List;
import s8.e2;
import t0.f2;
import t0.j9;
import x0.j;

/* loaded from: classes.dex */
public final class m1 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q8.w0 f24688e;

    public m1(boolean z10, p5.s0 s0Var, String str, boolean z11, q8.w0 w0Var) {
        this.f24684a = z10;
        this.f24685b = s0Var;
        this.f24686c = str;
        this.f24687d = z11;
        this.f24688e = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        final z.f1 innerPadding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(innerPadding, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(innerPadding) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.f976c, CropImageView.DEFAULT_ASPECT_RATIO, innerPadding.c(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14611j, jVar2, 0);
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
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.L(-984194667);
            boolean z10 = this.f24684a;
            final p5.s0 s0Var = this.f24685b;
            if (z10) {
                p5.s sVar = (p5.s) bg.b.a(new sh.k0(s0Var.f21304b.f24504z), null, null, jVar2, 48, 2).getValue();
                p5.k0 k0Var = sVar != null ? sVar.f21269b : null;
                List<pg.t<e2, w1.d, w1.d>> list = b2.f24610a;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((e2) ((pg.t) it.next()).f21479a).f24627a.equals(k0Var != null ? k0Var.f21235b.f24512e : null)) {
                            j9.a(androidx.compose.foundation.layout.g.f975b, q1.b1.c(0.95f, ((t0.e2) jVar2.f(f2.f25858a)).f25770p), 0L, null, f1.c.b(-158932053, new c0(k0Var, s0Var), jVar2), jVar2, 196614);
                            jVar2 = jVar2;
                            break;
                        }
                    }
                }
            }
            jVar2.B();
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarH = fillElement.h(new LayoutWeightElement(1.0f, true));
            jVar2.L(-984094836);
            final boolean z11 = this.f24687d;
            boolean zC = jVar2.c(z11);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            final q8.w0 w0Var = this.f24688e;
            if (zC || objG == c0321a) {
                objG = new eh.l() { // from class: s8.g
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        r.p NavHost = (r.p) obj;
                        kotlin.jvm.internal.r.e(NavHost, "$this$NavHost");
                        return w0Var.a(((p5.s) NavHost.c()).f21273f, ((p5.s) NavHost.e()).f21273f) ? r.u1.f22959a : d2.b(NavHost, z11, false);
                    }
                };
                jVar2.C(objG);
            }
            eh.l lVar = (eh.l) objG;
            jVar2.B();
            jVar2.L(-984086938);
            boolean zC2 = jVar2.c(z11);
            Object objG2 = jVar2.g();
            if (zC2 || objG2 == c0321a) {
                objG2 = new eh.l() { // from class: s8.p
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        r.p NavHost = (r.p) obj;
                        kotlin.jvm.internal.r.e(NavHost, "$this$NavHost");
                        String fromId = ((p5.s) NavHost.c()).f21273f;
                        q8.w0 w0Var2 = w0Var;
                        w0Var2.getClass();
                        kotlin.jvm.internal.r.e(fromId, "fromId");
                        x0.x1 x1Var = w0Var2.f22438k;
                        if (kotlin.jvm.internal.r.a((String) x1Var.getValue(), fromId)) {
                            x1Var.setValue(null);
                        }
                        return w0Var2.a(((p5.s) NavHost.c()).f21273f, ((p5.s) NavHost.e()).f21273f) ? r.w0.d(s.m.d(80, 240, null, 4), 2) : d2.c(NavHost, z11, false);
                    }
                };
                jVar2.C(objG2);
            }
            eh.l lVar2 = (eh.l) objG2;
            jVar2.B();
            jVar2.L(-984076211);
            boolean zC3 = jVar2.c(z11);
            Object objG3 = jVar2.g();
            if (zC3 || objG3 == c0321a) {
                objG3 = new eh.l() { // from class: s8.q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        r.p NavHost = (r.p) obj;
                        kotlin.jvm.internal.r.e(NavHost, "$this$NavHost");
                        return w0Var.c(((p5.s) NavHost.c()).f21273f, ((p5.s) NavHost.e()).f21273f) ? r.u1.f22959a : d2.b(NavHost, z11, true);
                    }
                };
                jVar2.C(objG3);
            }
            eh.l lVar3 = (eh.l) objG3;
            jVar2.B();
            jVar2.L(-984068277);
            boolean zC4 = jVar2.c(z11);
            Object objG4 = jVar2.g();
            if (zC4 || objG4 == c0321a) {
                objG4 = new eh.l() { // from class: s8.r
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        r.p NavHost = (r.p) obj;
                        kotlin.jvm.internal.r.e(NavHost, "$this$NavHost");
                        return w0Var.c(((p5.s) NavHost.c()).f21273f, ((p5.s) NavHost.e()).f21273f) ? r.w1.f22979a : d2.c(NavHost, z11, true);
                    }
                };
                jVar2.C(objG4);
            }
            eh.l lVar4 = (eh.l) objG4;
            jVar2.B();
            jVar2.L(-984052053);
            boolean zL = jVar2.l(s0Var) | ((i10 & 14) == 4);
            Object objG5 = jVar2.g();
            if (zL || objG5 == c0321a) {
                objG5 = new eh.l() { // from class: s8.s
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        p5.p0 NavHost = (p5.p0) obj;
                        kotlin.jvm.internal.r.e(NavHost, "$this$NavHost");
                        String str = e2.o.f24645c.f24627a;
                        p5.s0 navController = s0Var;
                        b2.c(NavHost, str, qg.z.f22752a, new f1.b(539430252, true, new k0(navController)));
                        String str2 = e2.j.f24640c.f24627a;
                        z.f1 f1Var2 = innerPadding;
                        b2.c(NavHost, str2, qg.z.f22752a, new f1.b(-1492931741, true, new u0(navController, f1Var2)));
                        b2.c(NavHost, e2.z.f24656c.f24627a, qg.z.f22752a, new f1.b(-1608639516, true, new f1(navController, f1Var2)));
                        b2.c(NavHost, e2.b0.f24632c.f24627a, qg.z.f22752a, new f1.b(-1724347291, true, new i1(navController)));
                        b2.c(NavHost, e2.a0.f24630c.f24627a, c0.g0.c(p5.o.b(new t(), "category")), new f1.b(-1840055066, true, new j1(navController)));
                        b2.c(NavHost, e2.y.f24655c.f24627a, c0.g0.c(p5.o.b(new i(), "templateId")), new f1.b(-1955762841, true, new k1(navController)));
                        b2.c(NavHost, e2.u.f24651c.f24627a, qg.z.f22752a, new f1.b(-2071470616, true, new l1(navController, f1Var2)));
                        b2.c(NavHost, e2.r.f24648c.f24627a, qg.z.f22752a, new f1.b(2107788905, true, new d0(navController)));
                        b2.c(NavHost, e2.s.f24649c.f24627a, qg.z.f22752a, new f1.b(1992081130, true, new e0(navController)));
                        b2.c(NavHost, e2.v.f24652c.f24627a, qg.p.j(p5.o.b(new j(), "projectId"), p5.o.b(new j9.k1(1), "openHtmlEditor"), p5.o.b(new k(), "initialHtmlUri")), new f1.b(1876373355, true, new f0(navController)));
                        b2.c(NavHost, e2.w.f24653c.f24627a, qg.z.f22752a, new f1.b(605822431, true, new g0(navController)));
                        b2.c(NavHost, e2.b.f24631c.f24627a, qg.z.f22752a, new f1.b(490114656, true, new h0(navController)));
                        b2.c(NavHost, e2.a.f24629c.f24627a, qg.z.f22752a, new f1.b(374406881, true, new j0(navController)));
                        b2.c(NavHost, e2.c.f24633c.f24627a, qg.p.j(p5.o.b(new l(), "prompt"), p5.o.b(new l8.a(1), "mode"), p5.o.b(new m(), "projectId"), p5.o.b(new n(), "sessionId")), new f1.b(258699106, true, new l0(navController)));
                        b2.c(NavHost, e2.l.f24642c.f24627a, c0.g0.c(p5.o.b(new o(), "projectId")), new f1.b(142991331, true, new s0(navController)));
                        b2.c(NavHost, e2.e.f24635c.f24627a, c0.g0.c(p5.o.b(new u(), "projectId")), new f1.b(27283556, true, new t0(navController)));
                        b2.c(NavHost, e2.d.f24634c.f24627a, qg.p.j(p5.o.b(new v(), "projectId"), p5.o.b(new w(), "outputPath")), new f1.b(-88424219, true, new v0(navController)));
                        b2.c(NavHost, e2.m.f24643c.f24627a, qg.z.f22752a, new f1.b(-204131994, true, new w0(navController)));
                        b2.c(NavHost, e2.n.f24644c.f24627a, qg.z.f22752a, new f1.b(-319839769, true, new x0(navController)));
                        b2.c(NavHost, e2.p.f24646c.f24627a, qg.z.f22752a, new f1.b(-435547544, true, new y0(navController)));
                        b2.c(NavHost, e2.q.f24647c.f24627a, qg.z.f22752a, new f1.b(1313848702, true, new z0(navController)));
                        b2.c(NavHost, e2.k.f24641c.f24627a, qg.z.f22752a, new f1.b(1198140927, true, new a1(navController)));
                        b2.c(NavHost, e2.i.f24639c.f24627a, qg.z.f22752a, new f1.b(1082433152, true, new b1(navController)));
                        q5.s.a(NavHost, e2.f.f24636c.f24627a, null, new x(), new f1.b(-94424336, true, new d1(navController)), 246);
                        b2.c(NavHost, e2.x.f24654c.f24627a, qg.z.f22752a, new f1.b(966725377, true, new e1(navController)));
                        b2.c(NavHost, e2.h.f24638c.f24627a, c0.g0.c(p5.o.b(new h(), "uri")), new f1.b(851017602, true, new g1(navController)));
                        b2.c(NavHost, e2.t.f24650c.f24627a, qg.z.f22752a, new f1.b(735309827, true, new h1(navController)));
                        kotlin.jvm.internal.r.e(navController, "navController");
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG5);
            }
            jVar2.B();
            x0.j jVar3 = jVar2;
            q5.q0.a(s0Var, this.f24686c, dVarH, null, lVar, lVar2, lVar3, lVar4, (eh.l) objG5, jVar3, 0);
            jVar3.H();
        }
        return pg.f0.f21461a;
    }
}
