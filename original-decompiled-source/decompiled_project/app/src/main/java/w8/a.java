package w8;

import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import eh.l;
import eh.p;
import f3.q;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import l9.i;
import p0.h8;
import p5.a1;
import pg.f0;
import ph.v1;
import q1.b1;
import q1.i2;
import t0.d1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import t0.z0;
import t2.l0;
import w1.d;
import w1.g;
import w1.m;
import x0.a2;
import x0.j;
import x0.s3;
import z.n1;
import z.o;
import z.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f31428a = new f1.b(1102648929, false, C0317a.f31435a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f31429b = new f1.b(1657577122, false, b.f31436a);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.b f31430c = new f1.b(-676100821, false, c.f31437a);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.b f31431d = new f1.b(-2067150549, false, d.f31438a);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.b f31432e = new f1.b(-487612375, false, e.f31439a);

    /* renamed from: f, reason: collision with root package name */
    public static final f1.b f31433f = new f1.b(-1315869179, false, f.f31440a);

    /* renamed from: g, reason: collision with root package name */
    public static final f1.b f31434g = new f1.b(1671775635, false, g.f31441a);

    /* renamed from: w8.a$a, reason: collision with other inner class name */
    public static final class C0317a implements p<j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0317a f31435a = new C0317a();

        @Override // eh.p
        public final f0 invoke(j jVar, Integer num) {
            j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(q.c(R.string.free_premium_title, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return f0.f21461a;
        }
    }

    public static final class b implements p<j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31436a = new b();

        @Override // eh.p
        public final f0 invoke(j jVar, Integer num) {
            j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(n0.a.a(), q.c(R.string.common_back, jVar2), null, 0L, jVar2, 0, 12);
            }
            return f0.f21461a;
        }
    }

    public static final class c implements eh.q<r, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31437a = new c();

        @Override // eh.q
        public final f0 b(r rVar, j jVar, Integer num) {
            r Card = rVar;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 20);
                z.q qVarA = o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
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
                v1.j(g.a.f13867f, qVarA, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                String strC = q.c(R.string.free_premium_title, jVar2);
                s3 s3Var = of.f26647a;
                l0 l0Var = ((nf) jVar2.f(s3Var)).f26544g;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar2.f(s3Var2)).f25751a, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                ff.b(pd.d.a(aVar, 8, jVar2, R.string.free_premium_intro, jVar2), null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    public static final class d implements eh.q<n1, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f31438a = new d();

        @Override // eh.q
        public final f0 b(n1 n1Var, j jVar, Integer num) {
            n1 OutlinedButton = n1Var;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = h8.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 18), 0L, jVar2, 432, 8);
                p1.d.b(androidx.compose.foundation.layout.g.n(aVar, 8), jVar2);
                ff.b(q.c(R.string.free_premium_watch_sample, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return f0.f21461a;
        }
    }

    public static final class e implements eh.q<n1, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f31439a = new e();

        @Override // eh.q
        public final f0 b(n1 n1Var, j jVar, Integer num) {
            n1 Button = n1Var;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarB = n0.h.f18296a;
                if (dVarB == null) {
                    d.a aVar = new d.a("AutoMirrored.Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    int i10 = m.f31210a;
                    i2 i2Var = new i2(b1.f21648b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new g.f(2.01f, 21.0f));
                    arrayList.add(new g.e(23.0f, 12.0f));
                    arrayList.add(new g.e(2.01f, 3.0f));
                    arrayList.add(new g.e(2.0f, 10.0f));
                    arrayList.add(new g.m(15.0f, 2.0f));
                    arrayList.add(new g.m(-15.0f, 2.0f));
                    arrayList.add(g.b.f31130c);
                    d.a.a(aVar, arrayList, 0, i2Var);
                    dVarB = aVar.b();
                    n0.h.f18296a = dVarB;
                }
                w1.d dVar = dVarB;
                d.a aVar2 = d.a.f1143b;
                t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar2, 18), 0L, jVar2, 432, 8);
                p1.d.b(androidx.compose.foundation.layout.g.n(aVar2, 8), jVar2);
                ff.b(q.c(R.string.free_premium_send_email, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return f0.f21461a;
        }
    }

    public static final class f implements eh.q<r, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f31440a = new f();

        @Override // eh.q
        public final f0 b(r rVar, j jVar, Integer num) {
            r Card = rVar;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 0.46153846f, false);
                jVar2.L(-399050279);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = new w8.b();
                    jVar2.C(objG);
                }
                l lVar = (l) objG;
                jVar2.B();
                jVar2.L(-399027377);
                Object objG2 = jVar2.g();
                if (objG2 == c0321a) {
                    objG2 = new a1(1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                androidx.compose.ui.viewinterop.a.a(lVar, dVarA, (l) objG2, null, jVar2, 3126, 20);
            }
            return f0.f21461a;
        }
    }

    public static final class g implements p<j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f31441a = new g();

        @Override // eh.p
        public final f0 invoke(j jVar, Integer num) {
            j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d1.a(null, h0.f.a(20), z0.a(b1.f21648b, jVar2, 6), null, null, a.f31433f, jVar2, 196608, 25);
            }
            return f0.f21461a;
        }
    }
}
