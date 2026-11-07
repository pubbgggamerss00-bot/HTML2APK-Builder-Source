package z8;

import a9.d2;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import e0.e1;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.util.Iterator;
import java.util.List;
import p0.a6;
import p0.dc;
import p0.e8;
import p0.n1;
import p0.r0;
import p0.w1;
import ph.i0;
import ph.m0;
import ph.v1;
import q1.b1;
import q1.l1;
import q1.y1;
import q8.o1;
import q8.x1;
import r.g2;
import r.h0;
import r.w0;
import s.p0;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.t4;
import t8.a1;
import t8.y0;
import x0.a2;
import x0.h2;
import x0.j;
import x0.o0;
import x0.r3;
import x0.s3;
import x0.w2;
import z.b;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class j {

    public static final class a implements eh.q<h0, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34817a;

        public a(String str) {
            this.f34817a = str;
        }

        @Override // eh.q
        public final pg.f0 b(h0 h0Var, x0.j jVar, Integer num) {
            h0 AnimatedVisibility = h0Var;
            x0.j jVar2 = jVar;
            num.intValue();
            kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
            List<String> list = com.basitce.htmltoapk.util.a.f5832a;
            String str = this.f34817a;
            if (str == null) {
                str = "default";
            }
            ff.b(f3.q.d(R.string.onboarding_launcher_name_note, new Object[]{f3.q.c(com.basitce.htmltoapk.util.a.f(str), jVar2)}, jVar2), androidx.compose.foundation.layout.f.j(d.a.f1143b, 4, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((e2) jVar2.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 48, 0, 65528);
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.n, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<pg.t<w1.d, b1, Float>> f34818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f34819b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f34820c;

        public b(float f10, long j10, List list) {
            this.f34818a = list;
            this.f34819b = f10;
            this.f34820c = j10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
            z.n BoxWithConstraints = nVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                final float fA = BoxWithConstraints.a();
                h0.e eVarA = h0.f.a(26);
                s3 s3Var = f2.f25858a;
                long j10 = ((e2) jVar2.f(s3Var)).f25770p;
                t.v vVarA = d2.a(3, b1.c(0.18f, ((e2) jVar2.f(s3Var)).f25771q));
                float f10 = 8;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.r(aVar, 0.36f * fA), 0.52f, false);
                jVar2.L(553525213);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = new p5.z(2);
                    jVar2.C(objG);
                }
                jVar2.B();
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (eh.l) objG);
                long j11 = this.f34820c;
                float f11 = this.f34819b;
                d.a aVar2 = aVar;
                md.a(dVarA2, eVarA, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, f10, vVarA, f1.c.b(836510952, new m(f11, j11), jVar2), jVar2, 12779520, 24);
                int i10 = 0;
                for (Object obj : this.f34818a) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    pg.t tVar = (pg.t) obj;
                    w1.d dVar = (w1.d) tVar.f21479a;
                    long j12 = ((b1) tVar.f21480b).f21656a;
                    final float fFloatValue = ((Number) tVar.f21481c).floatValue();
                    final float fL = jh.j.l((f11 - (i10 * 0.12f)) / 0.5f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                    final float fA2 = s.d0.f23703a.a(fL);
                    jVar2.L(-883499533);
                    boolean zH = jVar2.h(fFloatValue) | jVar2.h(fA) | jVar2.h(fA2) | jVar2.h(fL);
                    Object objG2 = jVar2.g();
                    if (zH || objG2 == c0321a) {
                        objG2 = new eh.l() { // from class: z8.k
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                l1 graphicsLayer = (l1) obj2;
                                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                float fN0 = graphicsLayer.N0(fA * 0.3f);
                                float f12 = fFloatValue;
                                float f13 = fA2;
                                float f14 = 1.0f - f13;
                                graphicsLayer.j(fN0 * f12 * f14);
                                graphicsLayer.c((graphicsLayer.N0(40) * f13) + (graphicsLayer.N0(-90) * f14));
                                float f15 = 1.0f - (f13 * 0.6f);
                                graphicsLayer.h(f15);
                                graphicsLayer.d(f15);
                                graphicsLayer.f(1.0f - jh.j.l((fL - 0.85f) / 0.15f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                graphicsLayer.b(f12 * 10.0f * f14);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    d.a aVar3 = aVar2;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(androidx.compose.ui.graphics.a.a(aVar3, (eh.l) objG2), 64), h0.f.a(16)), j12, y1.f21750a);
                    l0 l0VarD = z.g.d(d.a.f14606e, false);
                    int iD = jVar2.D();
                    a2 a2VarY = jVar2.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar4 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar4);
                    } else {
                        jVar2.z();
                    }
                    v1.j(g.a.f13867f, l0VarD, jVar2);
                    v1.j(g.a.f13866e, a2VarY, jVar2);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar2, iD, c0128a);
                    }
                    v1.j(g.a.f13865d, dVarC, jVar2);
                    t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar3, 32), b1.f21650d, jVar2, 3504, 0);
                    jVar2.H();
                    i10 = i11;
                    aVar2 = aVar3;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f34821a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<Float> f34822b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<b1> f34823c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f34824d;

        public c(float f10, List<Float> list, List<b1> list2, long j10) {
            this.f34821a = f10;
            this.f34822b = list;
            this.f34823c = list2;
            this.f34824d = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 16;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                b.k kVar = z.b.f34446c;
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
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
                float f11 = 6;
                b.i iVarH = z.b.h(f11);
                f.b bVar2 = d.a.f14611j;
                m1 m1VarA = k1.a(iVarH, bVar2, jVar2, 6);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                jVar2.L(2136339395);
                Iterator it = qg.p.j(new b1(n0.c(4294926166L)), new b1(n0.c(4294950190L)), new b1(n0.c(4280797503L))).iterator();
                while (it.hasNext()) {
                    z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar, 10), ((b1) it.next()).f21656a, h0.f.f12083a), jVar2, 0);
                }
                jVar2.B();
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 14), jVar2);
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                m1 m1VarA2 = k1.a(z.b.f34444a, bVar2, jVar2, 0);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(fillElement, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar4 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar4);
                } else {
                    jVar2.z();
                }
                g.a.b bVar3 = g.a.f13867f;
                v1.j(bVar3, m1VarA2, jVar2);
                g.a.d dVar2 = g.a.f13866e;
                v1.j(dVar2, a2VarY3, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a2);
                }
                g.a.c cVar2 = g.a.f13865d;
                v1.j(cVar2, dVarC3, jVar2);
                if (1.2f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.2f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.2f, true);
                z.q qVarA2 = z.o.a(z.b.h(9), aVar2, jVar2, 6);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar4);
                } else {
                    jVar2.z();
                }
                v1.j(bVar3, qVarA2, jVar2);
                v1.j(dVar2, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a2);
                }
                v1.j(cVar2, dVarC4, jVar2);
                jVar2.L(-4824155);
                Iterator<T> it2 = this.f34822b.iterator();
                int i10 = 0;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    float f12 = this.f34821a;
                    if (zHasNext) {
                        Object next = it2.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        float fFloatValue = ((Number) next).floatValue();
                        float fL = jh.j.l(((f12 * 1.6f) - (i10 * 0.18f)) / 0.18f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                        m1 m1VarA3 = k1.a(z.b.f34444a, bVar2, jVar2, 0);
                        int iD5 = jVar2.D();
                        a2 a2VarY5 = jVar2.y();
                        androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar, jVar2);
                        i2.g.f13861o.getClass();
                        e0.a aVar5 = g.a.f13863b;
                        if (jVar2.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar5);
                        } else {
                            jVar2.z();
                        }
                        v1.j(g.a.f13867f, m1VarA3, jVar2);
                        v1.j(g.a.f13866e, a2VarY5, jVar2);
                        g.a.C0128a c0128a3 = g.a.f13868g;
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                            l9.i.a(iD5, jVar2, iD5, c0128a3);
                        }
                        v1.j(g.a.f13865d, dVarC5, jVar2);
                        z.g.a(androidx.compose.foundation.layout.g.r(aVar, (i10 % 3) * 10), jVar2, 0);
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, fFloatValue * fL), 8), this.f34823c.get(i10).f21656a, h0.f.a(4)), jVar2, 0);
                        jVar2.H();
                        i10 = i11;
                    } else {
                        jVar2.B();
                        jVar2.H();
                        float f13 = 12;
                        p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f13), jVar2);
                        final float fL2 = jh.j.l(((f12 * 1.6f) - 0.4f) / 0.8f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                        if (1.0f <= 0.0d) {
                            a0.a.a("invalid weight; must be greater than zero");
                        }
                        androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(e1.d.d(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).h(androidx.compose.foundation.layout.g.f975b), h0.f.a(f13)), b1.f21650d, y1.f21750a), 10);
                        float f14 = 8;
                        z.q qVarA3 = z.o.a(z.b.h(f14), aVar2, jVar2, 6);
                        int iD6 = jVar2.D();
                        a2 a2VarY6 = jVar2.y();
                        androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarH2, jVar2);
                        i2.g.f13861o.getClass();
                        e0.a aVar6 = g.a.f13863b;
                        if (jVar2.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar6);
                        } else {
                            jVar2.z();
                        }
                        v1.j(g.a.f13867f, qVarA3, jVar2);
                        v1.j(g.a.f13866e, a2VarY6, jVar2);
                        g.a.C0128a c0128a4 = g.a.f13868g;
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD6))) {
                            l9.i.a(iD6, jVar2, iD6, c0128a4);
                        }
                        v1.j(g.a.f13865d, dVarC6, jVar2);
                        w1.d dVarA = dc.a();
                        androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, f10);
                        long j10 = this.f34824d;
                        t4.b(dVarA, null, dVarN, j10, jVar2, 432, 0);
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 0.8f * fL2), f13), j10, h0.f.a(4)), jVar2, 0);
                        float f15 = 3;
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, fL2), f11), n0.c(4292533472L), h0.f.a(f15)), jVar2, 0);
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 0.7f * fL2), f11), n0.c(4292533472L), h0.f.a(f15)), jVar2, 0);
                        androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 0.6f), 22);
                        jVar2.L(-4762735);
                        boolean zH = jVar2.h(fL2);
                        Object objG = jVar2.g();
                        if (zH || objG == j.a.f31715a) {
                            objG = new eh.l() { // from class: z8.n
                                @Override // eh.l
                                public final Object invoke(Object obj) {
                                    l1 graphicsLayer = (l1) obj;
                                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                    graphicsLayer.f(jh.j.l((fL2 - 0.7f) / 0.3f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG);
                        }
                        jVar2.B();
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF, (eh.l) objG), b1.c(0.85f, j10), h0.f.a(f14)), jVar2, 0);
                        jVar2.H();
                        jVar2.H();
                        jVar2.H();
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<z.n, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f34825a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f34826b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f34827c;

        public d(float f10, float f11, long j10) {
            this.f34825a = f10;
            this.f34826b = j10;
            this.f34827c = f11;
        }

        @Override // eh.q
        public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
            z.n BoxWithConstraints = nVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                final float fA = BoxWithConstraints.a() * 0.42f;
                jVar2.L(-684050114);
                Iterator it = qg.p.j(Float.valueOf(-1.0f), Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO), Float.valueOf(1.0f)).iterator();
                boolean z10 = false;
                final int i10 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    d.a aVar = d.a.f1143b;
                    j.a.C0321a c0321a = j.a.f31715a;
                    final float f10 = this.f34825a;
                    if (zHasNext) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        final float fFloatValue = ((Number) next).floatValue();
                        h0.e eVarA = h0.f.a(10);
                        long j10 = b1.f21650d;
                        float f11 = 6;
                        androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.r(aVar, fA), 0.72f, z10);
                        jVar2.L(958053607);
                        boolean zH = jVar2.h(fFloatValue);
                        final float f12 = this.f34827c;
                        boolean zH2 = zH | jVar2.h(f12) | jVar2.i(i10) | jVar2.h(f10);
                        Object objG = jVar2.g();
                        if (zH2 || objG == c0321a) {
                            objG = new eh.l() { // from class: z8.y
                                @Override // eh.l
                                public final Object invoke(Object obj) {
                                    l1 graphicsLayer = (l1) obj;
                                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                    float f13 = fFloatValue;
                                    float f14 = f12;
                                    graphicsLayer.b(12.0f * f13 * f14);
                                    graphicsLayer.j(graphicsLayer.N0(46) * f13 * f14);
                                    graphicsLayer.c(graphicsLayer.N0(Math.abs(f13) * 10) * f14);
                                    if (i10 == 1) {
                                        float f15 = (f10 * 0.12f) + 1.0f;
                                        graphicsLayer.h(f15);
                                        graphicsLayer.d(f15);
                                    }
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG);
                        }
                        jVar2.B();
                        md.a(androidx.compose.ui.graphics.a.a(dVarA, (eh.l) objG), eVarA, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, f11, null, f1.c.b(1728043260, new c0(this.f34826b), jVar2), jVar2, 12779904, 88);
                        i10 = i11;
                        z10 = false;
                    } else {
                        jVar2.B();
                        w1.d dVarA2 = r0.a();
                        androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 36);
                        jVar2.L(-683996019);
                        boolean zH3 = jVar2.h(fA) | jVar2.h(f10);
                        Object objG2 = jVar2.g();
                        if (zH3 || objG2 == c0321a) {
                            objG2 = new eh.l() { // from class: z8.z
                                @Override // eh.l
                                public final Object invoke(Object obj) {
                                    l1 graphicsLayer = (l1) obj;
                                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                    float f13 = fA;
                                    graphicsLayer.j(graphicsLayer.N0(0.32f * f13));
                                    float f14 = -graphicsLayer.N0(f13 * 0.62f);
                                    float fN0 = graphicsLayer.N0(20);
                                    float f15 = f10;
                                    graphicsLayer.c(f14 - ((1.0f - f15) * fN0));
                                    graphicsLayer.f(f15);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG2);
                        }
                        jVar2.B();
                        t4.b(dVarA2, null, androidx.compose.ui.graphics.a.a(dVarN, (eh.l) objG2), this.f34826b, jVar2, 48, 0);
                        androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, 92);
                        jVar2.L(-683985075);
                        boolean zH4 = jVar2.h(f10);
                        Object objG3 = jVar2.g();
                        if (zH4 || objG3 == c0321a) {
                            objG3 = new eh.l() { // from class: z8.a0
                                @Override // eh.l
                                public final Object invoke(Object obj) {
                                    l1 graphicsLayer = (l1) obj;
                                    kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                    float fN0 = graphicsLayer.N0(60);
                                    float fN02 = graphicsLayer.N0(30);
                                    float f13 = f10;
                                    graphicsLayer.j(fN0 - (fN02 * f13));
                                    graphicsLayer.c(graphicsLayer.N0(70) - (graphicsLayer.N0(20) * f13));
                                    graphicsLayer.f((f13 * 0.65f) + 0.35f);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG3);
                        }
                        jVar2.B();
                        androidx.compose.ui.d dVarA3 = androidx.compose.ui.graphics.a.a(dVarN2, (eh.l) objG3);
                        jVar2.L(-683977589);
                        Object objG4 = jVar2.g();
                        if (objG4 == c0321a) {
                            objG4 = new b0();
                            jVar2.C(objG4);
                        }
                        jVar2.B();
                        t.w.a(dVarA3, (eh.l) objG4, jVar2, 48);
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f34828a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f34829b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f0 f34830c;

        public e(long j10, boolean z10, f0 f0Var) {
            this.f34828a = j10;
            this.f34829b = z10;
            this.f34830c = f0Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 16;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
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
                v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 48);
                long j10 = this.f34828a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, b1.c(0.16f, j10), h0.f.a(14));
                j1.f fVar = d.a.f14606e;
                l0 l0VarD = z.g.d(fVar, false);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
                v1.j(bVar, l0VarD, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                f0 f0Var = this.f34830c;
                t4.b(f0Var.f34809c, null, null, j10, jVar2, 48, 4);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
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
                v1.j(bVar, qVarA, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar2);
                String strC = f3.q.c(f0Var.f34810d, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                float f11 = 2;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                ff.b(f3.q.c(f0Var.f34811e, jVar2), null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 12), jVar2);
                androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, 24);
                jVar2.L(1635089379);
                boolean z10 = this.f34829b;
                long j11 = z10 ? j10 : ((e2) jVar2.f(s3Var2)).B;
                jVar2.B();
                h0.e eVar = h0.f.f12083a;
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(t.o.a(dVarN2, f11, j11, eVar), z10 ? j10 : b1.f21653g, eVar);
                l0 l0VarD2 = z.g.d(fVar, false);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB2, jVar2);
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
                v1.j(bVar, l0VarD2, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar2);
                jVar2.L(1364477079);
                if (z10) {
                    t4.b(n1.a(), null, androidx.compose.foundation.layout.g.n(aVar, f10), b1.f21650d, jVar2, 3504, 0);
                }
                jVar2.B();
                jVar2.H();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(String str, eh.l<? super String, pg.f0> lVar, x0.j jVar, int i10) {
        eh.l<? super String, pg.f0> lVar2;
        int i11;
        x0.k kVarP = jVar.p(167710223);
        int i12 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16);
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            lVar2 = lVar;
            i11 = 1;
        } else {
            List<f0> listJ = qg.p.j(new f0("default", ProjectKind.APK, p0.p.a(), R.string.use_case_app, R.string.use_case_app_desc), new f0("pdf_viewer", ProjectKind.PDF, e8.a(), R.string.use_case_pdf, R.string.use_case_pdf_desc), new f0("html_editor", ProjectKind.HTML, w1.a(), R.string.use_case_html_edit, R.string.use_case_html_edit_desc));
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(m0.e(androidx.compose.foundation.layout.g.f976c, m0.c(kVarP), true), 24, 16);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f);
            z.q qVarA2 = z.o.a(z.b.h(12), d.a.f14614m, kVarP, 6);
            int i14 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(bVar, qVarA2, kVarP);
            v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            String strC = f3.q.c(R.string.onboarding_choice_title, kVarP);
            s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) kVarP.f(s3Var)).f26542e;
            x2.p pVar = x2.p.f32034g;
            s3 s3Var2 = f2.f25858a;
            ff.b(strC, null, ((e2) kVarP.f(s3Var2)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            ff.b(f3.q.c(R.string.onboarding_choice_subtitle, kVarP), null, ((e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var)).f26548k, kVarP, 0, 0, 65530);
            kVarP = kVarP;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 4), kVarP);
            kVarP.L(1408156710);
            for (f0 f0Var : listJ) {
                boolean zA = kotlin.jvm.internal.r.a(str, f0Var.f34807a);
                kVarP.L(-518265688);
                boolean zK = ((i12 & 112) == 32) | kVarP.K(f0Var);
                Object objG = kVarP.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new g9.n(1, lVar, f0Var);
                    kVarP.C(objG);
                }
                kVarP.T(false);
                h(f0Var, zA, (eh.a) objG, kVarP, 0);
            }
            lVar2 = lVar;
            kVarP.T(false);
            androidx.compose.animation.d.b(z.s.f34624a, (str == null || str.equals("default")) ? false : true, null, w0.c(null, 3), w0.d(null, 3), null, f1.c.b(892849363, new a(str), kVarP), kVarP, 1600518, 18);
            i11 = 1;
            kVarP.T(true);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new t8.r0(str, lVar2, i10, i11);
        }
    }

    public static final void b(final long j10, x0.j jVar, final int i10) {
        int i11;
        x0.k kVarP = jVar.p(1390931767);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            z.m.a(androidx.compose.foundation.layout.g.f976c, d.a.f14606e, f1.c.b(-1993779955, new b(i(3600, kVarP), j10, qg.p.j(new pg.t(w1.a(), new b1(o1.b(ProjectKind.HTML).f22292a), Float.valueOf(-1.0f)), new pg.t(a6.a(), new b1(n0.c(4287323382L)), Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)), new pg.t(e8.a(), new b1(o1.b(ProjectKind.PDF).f22292a), Float.valueOf(1.0f)))), kVarP), kVarP, 3126, 4);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: z8.g
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    j.b(j10, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final long j10, x0.j jVar, final int i10) {
        int i11;
        x0.k kVar;
        x0.k kVarP = jVar.p(-2004697715);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            md.a(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 0.92f), 1.25f, false), h0.f.a(20), n0.c(4280163886L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, 8, null, f1.c.b(-1002902062, new c(i(4200, kVarP), qg.p.j(Float.valueOf(0.55f), Float.valueOf(0.8f), Float.valueOf(0.45f), Float.valueOf(0.7f), Float.valueOf(0.6f), Float.valueOf(0.35f)), qg.p.j(new b1(j10), new b1(n0.c(4284524026L)), new b1(n0.c(4294286859L)), new b1(j10), new b1(n0.c(4294210230L)), new b1(n0.c(4284524026L))), j10), kVarP), kVar, 12779910, 88);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: z8.f
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    j.c(j10, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final int i10, final e0.b bVar, final long j10, x0.j jVar, final int i11) {
        int i12;
        e0.b bVar2;
        x0.k kVar;
        x0.k kVarP = jVar.p(-227071996);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.i(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            bVar2 = bVar;
            i12 |= kVarP.K(bVar2) ? 32 : 16;
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 384) == 0) {
            i12 |= kVarP.j(j10) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            int i13 = i10 != 0 ? i10 != 1 ? R.string.onboarding_title3 : R.string.onboarding_title2 : R.string.onboarding_title1;
            int i14 = i10 != 0 ? i10 != 1 ? R.string.onboarding_desc3 : R.string.onboarding_desc2 : R.string.onboarding_desc1;
            final float fK = bVar2.k() + (bVar2.j() - i10);
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(m0.e(androidx.compose.foundation.layout.g.f976c, m0.c(kVarP), true), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z.q qVarA = z.o.a(z.b.f34448e, d.a.f14615n, kVarP, 54);
            int i15 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar3 = g.a.f13867f;
            v1.j(bVar3, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            int i16 = i12;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, 360, 1), 1.0f), 1.1f, false);
            kVarP.L(-1612843186);
            boolean zH = kVarP.h(fK);
            Object objG = kVarP.g();
            if (zH || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: z8.c
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        l1 graphicsLayer = (l1) obj;
                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayer.i() >> 32));
                        float f10 = fK;
                        graphicsLayer.j(fIntBitsToFloat * f10 * 0.35f);
                        graphicsLayer.f(1.0f - (jh.j.l(Math.abs(f10), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 0.8f));
                        float fL = 1.0f - (jh.j.l(Math.abs(f10), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 0.1f);
                        graphicsLayer.h(fL);
                        graphicsLayer.d(fL);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (eh.l) objG);
            l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i17 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA2, kVarP);
            kVarP.r();
            int i18 = i14;
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(bVar3, l0VarD, kVarP);
            v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            if (i10 == 0) {
                kVarP.L(-1512186928);
                b(j10, kVarP, (i16 >> 6) & 14);
                kVarP.T(false);
                pg.f0 f0Var = pg.f0.f21461a;
            } else if (i10 != 1) {
                kVarP.L(-1512183732);
                f(j10, kVarP, (i16 >> 6) & 14);
                kVarP.T(false);
                pg.f0 f0Var2 = pg.f0.f21461a;
            } else {
                kVarP.L(-1512185361);
                c(j10, kVarP, (i16 >> 6) & 14);
                kVarP.T(false);
                pg.f0 f0Var3 = pg.f0.f21461a;
            }
            kVarP.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 28), kVarP);
            String strC = f3.q.c(i13, kVarP);
            s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) kVarP.f(s3Var)).f26543f;
            x2.p pVar = x2.p.f32034g;
            s3 s3Var2 = f2.f25858a;
            ff.b(strC, null, ((e2) kVarP.f(s3Var2)).f25769o, 0L, pVar, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 64986);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 12), kVarP);
            ff.b(f3.q.c(i18, kVarP), null, ((e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var)).f26547j, kVarP, 0, 0, 65018);
            kVar = kVarP;
            kVar.T(true);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: z8.d
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.d(i10, bVar, j10, (x0.j) obj, f3.i.n(i11 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(p5.x navController, e0 e0Var, x0.j jVar, int i10) {
        e0 e0Var2;
        b1 b1Var;
        x0.k kVar;
        int i11;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1565877776);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            e0Var2 = e0Var;
            kVar = kVarP;
            i11 = 1;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(e0.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                e0Var2 = (e0) w0VarB;
            } else {
                kVarP.v();
                e0Var2 = e0Var;
            }
            kVarP.U();
            Object[] objArr = new Object[0];
            kVarP.L(683975779);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new y0(1);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.l1 l1Var = (x0.l1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            int iG = l1Var.g();
            kVarP.L(683979033);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new h();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            e0.b bVarB = e1.b(iG, (eh.a) objG2, kVarP);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                x0.l0 l0Var = o0.f31834a;
                Object w2Var = new w2(kVarP.x());
                kVarP.C(w2Var);
                objG3 = w2Var;
            }
            i0 i0Var = (i0) objG3;
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object[] objArr2 = new Object[0];
            kVarP.L(683983276);
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                objG4 = new a1(1);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG4, kVarP, 3072, 6);
            Integer numValueOf = Integer.valueOf(bVarB.j());
            kVarP.L(683985789);
            boolean zK = kVarP.K(l1Var) | kVarP.K(bVarB);
            Object objG5 = kVarP.g();
            if (zK || objG5 == obj) {
                objG5 = new o(bVarB, l1Var, null);
                kVarP.C(objG5);
            }
            kVarP.T(false);
            o0.d((eh.p) objG5, numValueOf, kVarP);
            String str = ProjectKind.APK;
            b1 b1Var2 = new b1(o1.b(ProjectKind.APK).f22292a);
            b1 b1Var3 = new b1(o1.b(ProjectKind.HTML).f22292a);
            b1 b1Var4 = new b1(o1.b(ProjectKind.PDF).f22292a);
            String str2 = (String) n1Var.getValue();
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1827323610) {
                    if (iHashCode != -1621628417) {
                        if (iHashCode == 1976447105 && str2.equals("html_editor")) {
                            str = ProjectKind.HTML;
                        }
                    } else if (str2.equals("pdf_viewer")) {
                        str = ProjectKind.PDF;
                    }
                    b1Var = new b1(o1.b(str).f22292a);
                } else {
                    if (str2.equals("html_viewer")) {
                    }
                    b1Var = new b1(o1.b(str).f22292a);
                }
            } else {
                b1Var = null;
            }
            kVarP.L(684009202);
            long j10 = b1Var == null ? ((e2) kVarP.f(f2.f25858a)).f25751a : b1Var.f21656a;
            kVarP.T(false);
            List listJ = qg.p.j(b1Var2, b1Var3, b1Var4, new b1(j10));
            float fK = bVarB.k() + bVarB.j();
            int iM = jh.j.m((int) fK, 0, qg.p.i(listJ));
            int i12 = iM + 1;
            int i13 = qg.p.i(listJ);
            if (i12 > i13) {
                i12 = i13;
            }
            long jG = n0.g(((b1) listJ.get(iM)).f21656a, ((b1) listJ.get(i12)).f21656a, jh.j.l(fK - iM, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
            r3 r3VarA = g2.a(jG, null, "onboarding_accent", kVarP, 384, 10);
            kVar = kVarP;
            i11 = 1;
            q8.i.a(null, null, f1.c.b(-580442121, new w(jG, bVarB, i0Var, e0Var2, navController, n1Var, fK, listJ, context, r3VarA), kVar), kVar, 384);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new x8.v1(navController, i10, i11, e0Var2);
        }
    }

    public static final void f(final long j10, x0.j jVar, final int i10) {
        int i11;
        x0.k kVarP = jVar.p(920053622);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            z.m.a(androidx.compose.foundation.layout.g.f976c, d.a.f14606e, f1.c.b(607168588, new d((float) Math.sin(jh.j.l((r9 - 0.35f) / 0.65f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 3.141592653589793d), s.d0.f23703a.a(jh.j.l(i(4000, kVarP) / 0.35f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)), j10), kVarP), kVarP, 3126, 4);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: z8.b
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    j.f(j10, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final float f10, final List list, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(531369125);
        int i11 = 4;
        int i12 = 2;
        if ((((kVarP.h(f10) ? 4 : 2) | i10 | (kVarP.l(list) ? 32 : 16) | (kVarP.K(dVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            m1 m1VarA = k1.a(z.b.h(6), d.a.f14611j, kVarP, 6);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, m1VarA, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(1803952634);
            boolean z10 = true;
            jh.f it = new jh.g(0, list.size() - 1, 1).iterator();
            while (it.f15749c) {
                int iNextInt = it.nextInt();
                float fL = jh.j.l((f10 - iNextInt) + 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.f(new LayoutWeightElement(1.0f, z10), i11), h0.f.a(i12));
                long jC = b1.c(0.12f, ((e2) kVarP.f(f2.f25858a)).f25771q);
                y1.a aVar2 = y1.f21750a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, jC, aVar2);
                l0 l0VarD = z.g.d(d.a.f14602a, false);
                int i14 = kVarP.P;
                a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar3);
                } else {
                    kVarP.z();
                }
                v1.j(g.a.f13867f, l0VarD, kVarP);
                v1.j(g.a.f13866e, a2VarP2, kVarP);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a2);
                }
                v1.j(g.a.f13865d, dVarC2, kVarP);
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.f975b, fL), ((b1) list.get(iNextInt)).f21656a, aVar2), kVarP, 0);
                kVarP.T(true);
                z10 = true;
                i11 = 4;
                i12 = 2;
            }
            kVarP.T(false);
            kVarP.T(z10);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(f10, list, dVar, i10) { // from class: z8.i

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f34814a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f34815b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f34816c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    j.g(this.f34814a, this.f34815b, this.f34816c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void h(final f0 f0Var, final boolean z10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1384301260);
        int i11 = i10 | (kVarP.K(f0Var) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            long j10 = o1.b(f0Var.f34808b).f22292a;
            kVarP.L(-1953689452);
            long jC = z10 ? j10 : b1.c(0.08f, ((e2) kVarP.f(f2.f25858a)).f25771q);
            kVarP.T(false);
            r3 r3VarA = g2.a(jC, null, "use_case_border", kVarP, 384, 10);
            h0.e eVarA = h0.f.a(20);
            kVarP.L(-1953682747);
            long jC2 = z10 ? b1.c(0.12f, j10) : b1.c(0.9f, ((e2) kVarP.f(f2.f25858a)).f25770p);
            kVarP.T(false);
            md.b(aVar, androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), false, eVarA, jC2, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, d2.a(z10 ? 2 : 1, ((b1) r3VarA.getValue()).f21656a), null, f1.c.b(-1962080233, new e(j10, z10, f0Var), kVarP), kVarP, ((i11 >> 6) & 14) | 48, 740);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar, i10) { // from class: z8.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f34801b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f34802c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    j.h(this.f34800a, this.f34801b, this.f34802c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float i(int i10, x0.j jVar) {
        jVar.L(-1366360165);
        if (x1.a(jVar)) {
            jVar.B();
            return 0.75f;
        }
        float fFloatValue = ((Number) p0.a(p0.c("onboarding_loop", jVar, 0), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, s.m.a(s.m.d(i10, 0, s.d0.f23706d, 2), s.y0.f23998a, 4), "onboarding_loop_value", jVar, 29112, 0).f23810d.getValue()).floatValue();
        jVar.B();
        return fFloatValue;
    }
}
