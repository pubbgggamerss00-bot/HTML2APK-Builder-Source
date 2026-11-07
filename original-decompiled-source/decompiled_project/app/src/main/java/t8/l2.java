package t8;

import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class l2 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y3 f28283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f28284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f28285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Integer> f28286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f28287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f28288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28289h;

    public l2(androidx.compose.ui.d dVar, y3 y3Var, m3 m3Var, p5.x xVar, x0.n1 n1Var, Integer num, ph.i0 i0Var, x0.n1 n1Var2) {
        this.f28282a = dVar;
        this.f28283b = y3Var;
        this.f28284c = m3Var;
        this.f28285d = xVar;
        this.f28286e = n1Var;
        this.f28287f = num;
        this.f28288g = i0Var;
        this.f28289h = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        final p5.x xVar;
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 8;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(this.f28282a, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar2, 6);
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
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            mh.k kVar = v2.f28495e;
            final x0.n1 n1Var = this.f28289h;
            boolean z10 = ((b3) n1Var.getValue()).f28112b != null;
            jVar2.L(-1312350297);
            final m3 m3Var = this.f28284c;
            boolean zL = jVar2.l(m3Var);
            y3 y3Var = this.f28283b;
            boolean zL2 = zL | jVar2.l(y3Var);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL2 || objG == obj) {
                objG = new b9.h2(1, m3Var, y3Var);
                jVar2.C(objG);
            }
            eh.a aVar2 = (eh.a) objG;
            jVar2.B();
            jVar2.L(-1312347191);
            boolean zL3 = jVar2.l(m3Var) | jVar2.l(y3Var);
            Object objG2 = jVar2.g();
            if (zL3 || objG2 == obj) {
                objG2 = new h2(0, m3Var, y3Var);
                jVar2.C(objG2);
            }
            eh.a aVar3 = (eh.a) objG2;
            jVar2.B();
            jVar2.L(-1312344173);
            p5.x xVar2 = this.f28285d;
            boolean zL4 = jVar2.l(xVar2);
            Object objG3 = jVar2.g();
            if (zL4 || objG3 == obj) {
                objG3 = new a9.p0(xVar2, 1);
                jVar2.C(objG3);
            }
            eh.a aVar4 = (eh.a) objG3;
            x0.n1<Integer> n1Var2 = this.f28286e;
            boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, -1312341004, n1Var2) | jVar2.l(y3Var);
            Object objG4 = jVar2.g();
            if (zB || objG4 == obj) {
                objG4 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.h(2, y3Var, n1Var2);
                jVar2.C(objG4);
            }
            jVar2.B();
            v2.e(y3Var, z10, aVar2, aVar3, aVar4, (eh.a) objG4, jVar2, 8);
            final Long l10 = ((b3) n1Var.getValue()).f28112b;
            jVar2.L(-1312335076);
            int i10 = y3Var.f28581a;
            Integer num2 = this.f28287f;
            if (num2 != null && i10 == num2.intValue() && l10 != null && !((b3) n1Var.getValue()).f28115e && y3Var.f28598r == null) {
                jVar2.L(-1312329701);
                final ph.i0 i0Var = this.f28288g;
                boolean zL5 = jVar2.l(i0Var) | jVar2.l(m3Var) | jVar2.K(n1Var) | jVar2.K(l10) | jVar2.l(xVar2);
                Object objG5 = jVar2.g();
                if (zL5 || objG5 == obj) {
                    xVar = xVar2;
                    objG5 = new eh.a() { // from class: t8.i2
                        @Override // eh.a
                        public final Object invoke() {
                            ph.h.c(i0Var, null, null, new k2(m3Var, l10, xVar, n1Var, null), 3);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG5);
                } else {
                    xVar = xVar2;
                }
                eh.a aVar5 = (eh.a) objG5;
                jVar2.B();
                jVar2.L(-1312297373);
                boolean zL6 = jVar2.l(xVar) | jVar2.K(l10);
                Object objG6 = jVar2.g();
                if (zL6 || objG6 == obj) {
                    objG6 = new c9.h1(2, xVar, l10);
                    jVar2.C(objG6);
                }
                eh.a aVar6 = (eh.a) objG6;
                jVar2.B();
                jVar2.L(-1312293600);
                boolean zL7 = jVar2.l(xVar) | jVar2.K(l10);
                Object objG7 = jVar2.g();
                if (zL7 || objG7 == obj) {
                    objG7 = new eh.a() { // from class: t8.j2
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.l.f24642c.a(l10.longValue()), xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG7);
                }
                jVar2.B();
                v2.p(aVar5, aVar6, (eh.a) objG7, jVar2, 0);
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
