package h9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t0.af;
import t0.ff;
import t0.he;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class m {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12722a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f12723b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f12724c;

        public a(List list, String str, String str2) {
            this.f12722a = str;
            this.f12723b = str2;
            this.f12724c = list;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 20);
                z.q qVarA = z.o.a(z.b.h(16), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26543f;
                x2.p pVar = x2.p.f32033f;
                x0.s3 s3Var2 = t0.f2.f25858a;
                ff.b(this.f12722a, null, ((t0.e2) jVar2.f(s3Var2)).f25757d, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                ff.b(this.f12723b, null, q1.b1.c(0.82f, ((t0.e2) jVar2.f(s3Var2)).f25757d), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 0, 65530);
                x0.j jVar3 = jVar2;
                float f10 = 1.0f;
                d.a aVar3 = aVar;
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
                float f11 = 8;
                z.m1 m1VarA = z.k1.a(z.b.h(f11), d.a.f14611j, jVar3, 6);
                int iD2 = jVar3.D();
                x0.a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar3);
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                ph.v1.j(bVar, m1VarA, jVar3);
                ph.v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar3);
                jVar3.L(-1309286816);
                boolean z10 = false;
                int i10 = 0;
                for (Object obj : this.f12724c) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    String str = (String) obj;
                    if (f10 <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f10, true);
                    z.q qVarA2 = z.o.a(z.b.h(f11), d.a.f14615n, jVar3, 54);
                    int iD3 = jVar3.D();
                    x0.a2 a2VarY3 = jVar3.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
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
                    g.a.b bVar2 = g.a.f13867f;
                    ph.v1.j(bVar2, qVarA2, jVar3);
                    g.a.d dVar2 = g.a.f13866e;
                    ph.v1.j(dVar2, a2VarY3, jVar3);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                        l9.i.a(iD3, jVar3, iD3, c0128a2);
                    }
                    g.a.c cVar2 = g.a.f13865d;
                    ph.v1.j(cVar2, dVarC3, jVar3);
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar3, 30);
                    x0.s3 s3Var3 = t0.f2.f25858a;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, ((t0.e2) jVar3.f(s3Var3)).f25751a, h0.f.f12083a);
                    g2.l0 l0VarD = z.g.d(d.a.f14606e, z10);
                    int iD4 = jVar3.D();
                    x0.a2 a2VarY4 = jVar3.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB, jVar3);
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
                    ph.v1.j(bVar2, l0VarD, jVar3);
                    ph.v1.j(dVar2, a2VarY4, jVar3);
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar3, iD4, c0128a2);
                    }
                    ph.v1.j(cVar2, dVarC4, jVar3);
                    String strValueOf = String.valueOf(i11);
                    x0.s3 s3Var4 = of.f26647a;
                    x0.j jVar4 = jVar3;
                    ff.b(strValueOf, null, ((t0.e2) jVar3.f(s3Var3)).f25753b, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var4)).f26550m, jVar4, 196608, 0, 65498);
                    jVar4.H();
                    ff.b(str, null, ((t0.e2) jVar4.f(s3Var3)).f25757d, 0L, x2.p.f32032e, null, 0L, new e3.h(3), 0L, 0, false, 2, 0, ((nf) jVar4.f(s3Var4)).f26551n, jVar4, 196608, 3072, 56794);
                    jVar4.H();
                    jVar3 = jVar4;
                    i10 = i11;
                    f11 = f11;
                    z10 = z10;
                    aVar3 = aVar3;
                    f10 = 1.0f;
                }
                x0.j jVar5 = jVar3;
                jVar5.B();
                jVar5.H();
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f12725a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12726b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f12727c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<String> list, int i10, eh.l<? super Integer, pg.f0> lVar) {
            this.f12725a = list;
            this.f12726b = i10;
            this.f12727c = lVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                final int i10 = 0;
                for (Object obj : this.f12725a) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    String str = (String) obj;
                    boolean z10 = this.f12726b == i10;
                    jVar2.L(1489163119);
                    final eh.l<Integer, pg.f0> lVar = this.f12727c;
                    boolean zK = jVar2.K(lVar) | jVar2.i(i10);
                    Object objG = jVar2.g();
                    if (zK || objG == j.a.f31715a) {
                        objG = new eh.a() { // from class: h9.n
                            @Override // eh.a
                            public final Object invoke() {
                                lVar.invoke(Integer.valueOf(i10));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    he.b(z10, (eh.a) objG, null, false, f1.c.b(-2028893284, new o(str), jVar2), null, 0L, 0L, jVar2, 24576, 492);
                    i10 = i11;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final w1.d dVar, final long j10, final String title, final String summary, final List list, String str, eh.a aVar, x0.j jVar, final int i10, final int i11) {
        String str2;
        int i12;
        eh.a aVar2;
        int i13;
        x0.k kVar;
        final String str3;
        final eh.a aVar3;
        kotlin.jvm.internal.r.e(title, "title");
        kotlin.jvm.internal.r.e(summary, "summary");
        x0.k kVarP = jVar.p(1256172116);
        int i14 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.K(title) ? 256 : 128) | (kVarP.K(summary) ? 2048 : 1024) | (kVarP.l(list) ? 16384 : 8192);
        int i15 = i11 & 32;
        if (i15 != 0) {
            i12 = i14 | 196608;
            str2 = str;
        } else {
            str2 = str;
            i12 = i14 | (kVarP.K(str2) ? 131072 : 65536);
        }
        int i16 = i11 & 64;
        if (i16 != 0) {
            i13 = i12 | 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i13 = i12 | (kVarP.l(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (((i13 | 12582912) & 4793491) == 4793490 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            str3 = str2;
            aVar3 = aVar2;
        } else {
            String str4 = i15 != 0 ? null : str2;
            eh.a aVar4 = i16 == 0 ? aVar2 : null;
            Object[] objArr = {title};
            kVarP.L(1297399437);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new h();
                kVarP.C(objG);
            }
            kVarP.T(false);
            kVar = kVarP;
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVar, 0, 6);
            eh.a aVar5 = aVar4;
            String str5 = str4;
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.9f, ((t0.e2) kVar.f(t0.f2.f25858a)).I), kVar, 0), null, null, f1.c.b(1109154118, new l(n1Var, j10, dVar, title, summary, list, str5, aVar5), kVar), kVar, 196614, 24);
            str3 = str5;
            aVar3 = aVar5;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j10, title, summary, list, str3, aVar3, i10, i11) { // from class: h9.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f12642b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f12643c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f12644d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f12645e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f12646f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f12647g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f12648h;

                {
                    this.f12648h = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.a(this.f12641a, this.f12642b, this.f12643c, this.f12644d, this.f12645e, this.f12646f, this.f12647g, (x0.j) obj, iN, this.f12648h);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final String title, final String body, final List<String> list, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(title, "title");
        kotlin.jvm.internal.r.e(body, "body");
        x0.k kVarP = jVar.p(-850639272);
        if ((((kVarP.K(title) ? 4 : 2) | i10 | (kVarP.K(body) ? 32 : 16) | (kVarP.l(list) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(24), t0.z0.a(q1.b1.c(0.72f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25755c), kVarP, 0), null, null, f1.c.b(953246026, new a(list, title, body), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(title, body, i10, list) { // from class: h9.g

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12616a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f12617b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f12618c;

                {
                    this.f12618c = list;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.b(this.f12616a, this.f12617b, this.f12618c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final int i10, final List<String> list, final eh.l<? super Integer, pg.f0> onSelect, x0.j jVar, final int i11) {
        kotlin.jvm.internal.r.e(onSelect, "onSelect");
        x0.k kVarP = jVar.p(1953726898);
        int i12 = (kVarP.i(i10) ? 4 : 2) | i11 | (kVarP.l(list) ? 32 : 16) | (kVarP.l(onSelect) ? 256 : 128);
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            af.a(i10, androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), q1.b1.f21653g, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, null, null, f1.c.b(-1920364696, new b(list, i10, onSelect), kVarP), kVarP, (i12 & 14) | 1573296, 48);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, list, onSelect, i11) { // from class: h9.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f12606a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f12607b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f12608c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.c(this.f12606a, this.f12607b, this.f12608c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
