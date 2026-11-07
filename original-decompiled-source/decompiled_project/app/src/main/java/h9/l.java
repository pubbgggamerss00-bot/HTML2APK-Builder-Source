package h9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.Iterator;
import java.util.List;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class l implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1.d f12704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f12707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f12709h;

    public l(x0.n1<Boolean> n1Var, long j10, w1.d dVar, String str, String str2, List<String> list, String str3, eh.a<pg.f0> aVar) {
        this.f12702a = n1Var;
        this.f12703b = j10;
        this.f12704c = dVar;
        this.f12705d = str;
        this.f12706e = str2;
        this.f12707f = list;
        this.f12708g = str3;
        this.f12709h = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        x0.j jVar2;
        eh.a<pg.f0> aVar;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            b.k kVar = z.b.f34446c;
            f.a aVar3 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar3, jVar3, 0);
            int iD = jVar3.D();
            x0.a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar3);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            final x0.n1<Boolean> n1Var = this.f12702a;
            boolean zBooleanValue = n1Var.getValue().booleanValue();
            q2.i iVar = new q2.i(0);
            jVar3.L(1020841399);
            boolean zK = jVar3.K(n1Var);
            Object objG = jVar3.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: h9.j
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        n1Var.setValue(bool);
                        return pg.f0.f21461a;
                    }
                };
                jVar3.C(objG);
            }
            jVar3.B();
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.ui.c.a(dVarD2, j2.c3.f14686a, new g0.d(zBooleanValue, true, iVar, (eh.l) objG)), 16);
            z.m1 m1VarA = z.k1.a(z.b.h(14), d.a.f14612k, jVar3, 54);
            int iD2 = jVar3.D();
            x0.a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, m1VarA, jVar3);
            ph.v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar3);
            androidx.compose.ui.d dVarD3 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar2, 44), h0.f.a(13));
            long j10 = this.f12703b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD3, q1.b1.c(0.15f, j10), q1.y1.f21750a);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD3 = jVar3.D();
            x0.a2 a2VarY3 = jVar3.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, l0VarD, jVar3);
            ph.v1.j(dVar, a2VarY3, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar3, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar3);
            t4.b(this.f12704c, null, androidx.compose.foundation.layout.g.n(aVar2, 23), j10, jVar3, 432, 0);
            jVar3.H();
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA2 = z.o.a(kVar, aVar3, jVar3, 0);
            int iD4 = jVar3.D();
            x0.a2 a2VarY4 = jVar3.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar4);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar, qVarA2, jVar3);
            ph.v1.j(dVar, a2VarY4, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                l9.i.a(iD4, jVar3, iD4, c0128a);
            }
            ph.v1.j(cVar, dVarC4, jVar3);
            x0.s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar3.f(s3Var)).f26545h;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var2 = t0.f2.f25858a;
            ff.b(this.f12705d, null, ((t0.e2) jVar3.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 196608, 0, 65498);
            ff.b(this.f12706e, null, ((t0.e2) jVar3.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26549l, jVar3, 0, 0, 65530);
            x0.j jVar4 = jVar3;
            jVar4.H();
            t4.b(n1Var.getValue().booleanValue() ? p0.p3.a() : p0.q3.a(), f3.q.c(R.string.howto_expand_hint, jVar4), null, ((t0.e2) jVar4.f(s3Var2)).f25773s, jVar4, 0, 4);
            jVar4.H();
            jVar4.L(1020896279);
            if (n1Var.getValue().booleanValue()) {
                float f10 = 20;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar2, f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, 18, 2);
                z.q qVarA3 = z.o.a(z.b.h(12), aVar3, jVar4, 6);
                int iD5 = jVar4.D();
                x0.a2 a2VarY5 = jVar4.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarL, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar4);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar, qVarA3, jVar4);
                ph.v1.j(dVar, a2VarY5, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar4, iD5, c0128a);
                }
                ph.v1.j(cVar, dVarC5, jVar4);
                jVar4.L(1093622121);
                Iterator<T> it = this.f12707f.iterator();
                while (it.hasNext()) {
                    x0.j jVar5 = jVar4;
                    ff.b((String) it.next(), null, ((t0.e2) jVar4.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(of.f26647a)).f26548k, jVar5, 0, 0, 65530);
                    jVar4 = jVar5;
                }
                jVar4.B();
                jVar4.L(1093632322);
                String str = this.f12708g;
                if (str == null || (aVar = this.f12709h) == null) {
                    jVar2 = jVar4;
                } else {
                    jVar2 = jVar4;
                    t0.x0.b(aVar, null, false, null, null, null, null, f1.c.b(-1439838342, new k(str), jVar4), jVar2, 805306368, 510);
                }
                jVar2.B();
                jVar2.H();
            } else {
                jVar2 = jVar4;
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
