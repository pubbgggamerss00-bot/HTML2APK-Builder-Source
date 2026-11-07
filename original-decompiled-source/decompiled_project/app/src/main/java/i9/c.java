package i9;

import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import p0.x3;
import ph.v1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import t2.l0;
import x0.a2;
import x0.s3;
import z.k1;
import z.m1;
import z.n1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f14287a = new f1.b(-2090922878, false, a.f14291a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f14288b = new f1.b(672747715, false, b.f14292a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f14289c = new f1.b(-1336159412, false, C0135c.f14293a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f14290d = new f1.b(-1994652697, false, d.f14294a);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14291a = new a();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.support_developer_title, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 196608, 0, 131034);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14292a = new b();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), f3.q.c(R.string.common_back, jVar2), null, ((e2) jVar2.f(f2.f25858a)).f25769o, jVar2, 0, 4);
            }
            return pg.f0.f21461a;
        }
    }

    /* renamed from: i9.c$c, reason: collision with other inner class name */
    public static final class C0135c implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0135c f14293a = new C0135c();

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 18;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                t4.b(x3.a(), null, androidx.compose.foundation.layout.g.n(aVar, f10), n0.c(4294918273L), jVar2, 3504, 0);
                float f11 = 8;
                String strB = r.e2.b(aVar, f11, jVar2, R.string.premium_dev_note_title, jVar2);
                s3 s3Var = of.f26647a;
                l0 l0Var = ((nf) jVar2.f(s3Var)).f26550m;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(strB, null, ((e2) jVar2.f(s3Var2)).f25751a, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                ff.b(f3.q.c(R.string.support_developer_desc, jVar2), null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, f3.u.c(22), 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 6, 64506);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14294a = new d();

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.premium_retry, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }
}
