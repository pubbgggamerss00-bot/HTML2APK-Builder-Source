package h9;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import p0.ec;
import t0.ff;
import t0.md;
import t0.mf;
import t0.nf;
import t0.of;
import t0.p7;
import t0.ra;
import t0.t4;
import w1.d;
import w1.g;
import x0.j;

/* loaded from: classes.dex */
public final class s0 {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f12785a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f12786b;

        public a(boolean z10, String str) {
            this.f12785a = z10;
            this.f12786b = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            long j10;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d.a.f1143b, 8, 3);
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26552o;
                if (this.f12785a) {
                    jVar2.L(2083219769);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25757d;
                } else {
                    jVar2.L(2083221367);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s;
                }
                jVar2.B();
                ff.b(this.f12786b, dVarI, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 48, 0, 65528);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OpenSourceLicenses.a f12787a;

        public b(OpenSourceLicenses.a aVar) {
            this.f12787a = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            x0.s3 s3Var;
            OpenSourceLicenses.a aVar;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar2, 16, 14);
                float f10 = 6;
                z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
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
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                OpenSourceLicenses.a aVar4 = this.f12787a;
                String str = aVar4.f5694b;
                List<String> list = aVar4.f5695c;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                x0.s3 s3Var2 = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26546i;
                x2.p pVar = x2.p.f32032e;
                x0.s3 s3Var3 = t0.f2.f25858a;
                ff.b(str, layoutWeightElement, ((t0.e2) jVar2.f(s3Var3)).f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar2, 196608, 3120, 55256);
                x0.j jVar3 = jVar2;
                jVar3.L(1089377317);
                if (list.isEmpty()) {
                    s3Var = s3Var3;
                } else {
                    s3Var = s3Var3;
                    ff.b(qg.x.I(list, " · ", null, null, null, 62), null, ((t0.e2) jVar3.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var2)).f26551n, jVar3, 0, 0, 65530);
                    jVar3 = jVar3;
                }
                jVar3.B();
                jVar3.H();
                String str2 = aVar4.f5698f;
                jVar3.L(1189026379);
                if (str2 == null) {
                    aVar = aVar4;
                } else {
                    x0.j jVar4 = jVar3;
                    aVar = aVar4;
                    ff.b(str2, null, ((t0.e2) jVar3.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nf) jVar3.f(s3Var2)).f26549l, jVar4, 0, 3120, 55290);
                    jVar3 = jVar4;
                }
                jVar3.B();
                z.f0.a(null, z.b.h(f10), z.b.h(f10), null, 0, 0, f1.c.b(-1418260225, new t0(aVar), jVar3), jVar3, 1573296, 57);
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OpenSourceLicenses.a f12788a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f12789b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(OpenSourceLicenses.a aVar, eh.l<? super String, pg.f0> lVar) {
            this.f12788a = aVar;
            this.f12789b = lVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            eh.l<String, pg.f0> lVar;
            x0.j jVar2;
            eh.l<String, pg.f0> lVar2;
            Object obj;
            int i10;
            x0.j jVar3;
            z.r ModalBottomSheet = rVar;
            x0.j jVar4 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar4.s()) {
                jVar4.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.j(ph.m0.e(androidx.compose.foundation.layout.g.d(aVar, 1.0f), ph.m0.c(jVar4), true), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7);
                z.q qVarA = z.o.a(z.b.h(10), d.a.f14614m, jVar4, 6);
                int iD = jVar4.D();
                x0.a2 a2VarY = jVar4.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar4);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar2);
                } else {
                    jVar4.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, jVar4);
                ph.v1.j(g.a.f13866e, a2VarY, jVar4);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar4, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar4);
                OpenSourceLicenses.a aVar3 = this.f12788a;
                ff.b(aVar3.f5694b, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(of.f26647a)).f26544g, jVar4, 196608, 0, 65502);
                List listJ = qg.p.j(aVar3.f5693a, qg.x.I(aVar3.f5695c, " · ", null, null, null, 62));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listJ) {
                    if (!mh.x.A((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                String strI = qg.x.I(arrayList, "  ·  ", null, null, null, 62);
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar4.f(s3Var)).f26551n;
                x0.s3 s3Var2 = t0.f2.f25858a;
                ff.b(strI, null, ((t0.e2) jVar4.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 0, 0, 65530);
                x0.j jVar5 = jVar4;
                String str = aVar3.f5698f;
                jVar5.L(135446107);
                if (str != null) {
                    ff.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar5.f(s3Var)).f26548k, jVar5, 0, 0, 65534);
                    jVar5 = jVar5;
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                jVar5.B();
                String str2 = aVar3.f5696d;
                jVar5.L(135449099);
                if (str2 != null) {
                    x0.j jVar6 = jVar5;
                    ff.b(str2, null, ((t0.e2) jVar5.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar5.f(s3Var)).f26548k, jVar6, 0, 0, 65530);
                    jVar5 = jVar6;
                    pg.f0 f0Var2 = pg.f0.f21461a;
                }
                jVar5.B();
                String str3 = aVar3.f5697e;
                jVar5.L(135454650);
                int i11 = 0;
                Object obj3 = j.a.f31715a;
                eh.l<String, pg.f0> lVar3 = this.f12789b;
                if (str3 == null) {
                    lVar = lVar3;
                } else {
                    jVar5.L(862530093);
                    boolean zK = jVar5.K(lVar3) | jVar5.K(str3);
                    Object objG = jVar5.g();
                    if (zK || objG == obj3) {
                        objG = new u0(str3, i11, lVar3);
                        jVar5.C(objG);
                    }
                    jVar5.B();
                    lVar = lVar3;
                    t0.x0.c((eh.a) objG, null, false, null, null, null, null, h9.c.f12553g, jVar5, 805306368, 510);
                    pg.f0 f0Var3 = pg.f0.f21461a;
                }
                jVar5.B();
                jVar5.L(135467619);
                Iterator it = aVar3.f5699g.iterator();
                while (it.hasNext()) {
                    OpenSourceLicenses.b bVar = (OpenSourceLicenses.b) it.next();
                    t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 6, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar5, 6, 6);
                    String str4 = bVar.f5702a;
                    x0.s3 s3Var3 = of.f26647a;
                    x0.j jVar7 = jVar5;
                    Object obj4 = obj3;
                    eh.l<String, pg.f0> lVar4 = lVar;
                    Iterator it2 = it;
                    ff.b(str4, null, 0L, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar5.f(s3Var3)).f26545h, jVar7, 196608, 0, 65502);
                    x0.j jVar8 = jVar7;
                    if (bVar.f5704c != null) {
                        jVar8.L(969203291);
                        m0.w0.a(null, f1.c.b(171993218, new w0(bVar), jVar8), jVar8, 48);
                        jVar8.B();
                        jVar2 = jVar8;
                    } else {
                        jVar8.L(969596743);
                        ff.b(f3.q.c(R.string.licenses_text_online_only, jVar8), null, ((t0.e2) jVar8.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar8.f(s3Var3)).f26549l, jVar8, 0, 0, 65530);
                        x0.j jVar9 = jVar8;
                        jVar9.B();
                        jVar2 = jVar9;
                    }
                    String str5 = bVar.f5703b;
                    jVar2.L(135497458);
                    if (str5 == null) {
                        jVar3 = jVar2;
                        lVar2 = lVar4;
                        obj = obj4;
                        i10 = 0;
                    } else {
                        jVar2.L(1878888524);
                        lVar2 = lVar4;
                        boolean zK2 = jVar2.K(lVar2) | jVar2.K(str5);
                        Object objG2 = jVar2.g();
                        obj = obj4;
                        if (zK2 || objG2 == obj) {
                            i10 = 0;
                            objG2 = new v0(str5, 0, lVar2);
                            jVar2.C(objG2);
                        } else {
                            i10 = 0;
                        }
                        jVar2.B();
                        t0.x0.c((eh.a) objG2, null, false, null, null, null, null, h9.c.f12554h, jVar2, 805306368, 510);
                        jVar3 = jVar2;
                        pg.f0 f0Var4 = pg.f0.f21461a;
                    }
                    jVar3.B();
                    int i12 = i10;
                    obj3 = obj;
                    i11 = i12;
                    lVar = lVar2;
                    jVar5 = jVar3;
                    it = it2;
                }
                x0.j jVar10 = jVar5;
                jVar10.B();
                jVar10.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12790a;

        public d(int i10) {
            this.f12790a = i10;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) throws Throwable {
            Throwable th2;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 20);
                z.m1 m1VarA = z.k1.a(z.b.h(14), d.a.f14611j, jVar2, 54);
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
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                w1.d dVarB = ec.f20842a;
                if (dVarB != null) {
                    th2 = null;
                } else {
                    d.a aVar3 = new d.a("Filled.VolunteerActivism", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    long j10 = q1.b1.f21648b;
                    q1.i2 i2Var = new q1.i2(j10);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new g.f(1.0f, 11.0f));
                    arrayList.add(new g.l(4.0f));
                    arrayList.add(new g.r(11.0f));
                    arrayList.add(new g.l(-4.0f));
                    g.b bVar2 = g.b.f31130c;
                    arrayList.add(bVar2);
                    d.a.a(aVar3, arrayList, 0, i2Var);
                    q1.i2 i2Var2 = new q1.i2(j10);
                    ArrayList arrayList2 = new ArrayList(32);
                    th2 = null;
                    arrayList2.add(new g.f(16.0f, 3.25f));
                    arrayList2.add(new g.c(16.65f, 2.49f, 17.66f, 2.0f, 18.7f, 2.0f));
                    arrayList2.add(new g.c(20.55f, 2.0f, 22.0f, 3.45f, 22.0f, 5.3f));
                    arrayList2.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, 2.27f, -2.91f, 4.9f, -6.0f, 7.7f));
                    arrayList2.add(new g.k(-3.09f, -2.81f, -6.0f, -5.44f, -6.0f, -7.7f));
                    arrayList2.add(new g.c(10.0f, 3.45f, 11.45f, 2.0f, 13.3f, 2.0f));
                    arrayList2.add(new g.c(14.34f, 2.0f, 15.35f, 2.49f, 16.0f, 3.25f));
                    arrayList2.add(bVar2);
                    d.a.a(aVar3, arrayList2, 0, i2Var2);
                    q1.i2 i2Var3 = new q1.i2(j10);
                    w1.e eVar = new w1.e();
                    eVar.h(20.0f, 17.0f);
                    eVar.e(-7.0f);
                    eVar.g(-2.09f, -0.73f);
                    eVar.g(0.33f, -0.94f);
                    eVar.f(13.0f, 16.0f);
                    eVar.e(2.82f);
                    eVar.c(0.65f, CropImageView.DEFAULT_ASPECT_RATIO, 1.18f, -0.53f, 1.18f, -1.18f);
                    eVar.l(CropImageView.DEFAULT_ASPECT_RATIO);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
                    eVar.f(8.97f, 11.0f);
                    eVar.d(7.0f);
                    eVar.l(9.02f);
                    eVar.f(14.0f, 22.0f);
                    eVar.g(8.01f, -3.0f);
                    eVar.l(CropImageView.DEFAULT_ASPECT_RATIO);
                    eVar.b(22.0f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
                    eVar.a();
                    d.a.a(aVar3, eVar.f31100a, 0, i2Var3);
                    dVarB = aVar3.b();
                    ec.f20842a = dVarB;
                }
                w1.d dVar2 = dVarB;
                x0.s3 s3Var = t0.f2.f25858a;
                t4.b(dVar2, null, androidx.compose.foundation.layout.g.n(aVar, 26), ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 432, 0);
                z.q qVarA = z.o.a(z.b.h(6), d.a.f14614m, jVar2, 6);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw th2;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                String strC = f3.q.c(R.string.licenses_intro, jVar2);
                x0.s3 s3Var2 = of.f26647a;
                ff.b(strC, null, ((t0.e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26548k, jVar2, 0, 0, 65530);
                ff.b(f3.q.d(R.string.licenses_count, new Object[]{Integer.valueOf(this.f12790a)}, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26550m, jVar2, 196608, 0, 65498);
                jVar2.H();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.x f12791a;

        public e(p5.x xVar) {
            this.f12791a = xVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVar = h9.c.f12547a;
                f1.b bVarB = f1.c.b(807699405, new y0(this.f12791a), jVar2);
                float f10 = mf.f26477a;
                t0.g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f12792a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f12793b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.r3<pg.p<List<OpenSourceLicenses.a>>> f12794c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f12795d;

        public f(x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, Context context) {
            this.f12792a = n1Var;
            this.f12793b = n1Var2;
            this.f12794c = n1Var3;
            this.f12795d = context;
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
                p9.d.a(padding.c(), f1.c.b(-699728983, new l1(padding, this.f12792a, this.f12793b, this.f12794c, this.f12795d), jVar2), jVar2, 48);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.OpenSourceLicensesScreenKt$OpenSourceLicensesScreen$libraries$2$1", f = "OpenSourceLicensesScreen.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<x0.c2<pg.p<? extends List<? extends OpenSourceLicenses.a>>>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f12796a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12797b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f12798c;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.OpenSourceLicensesScreenKt$OpenSourceLicensesScreen$libraries$2$1$1", f = "OpenSourceLicensesScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.p<? extends List<? extends OpenSourceLicenses.a>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f12799a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f12800b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f12800b = context;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f12800b, eVar);
                aVar.f12799a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.p<? extends List<? extends OpenSourceLicenses.a>>> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                Context context = this.f12800b;
                try {
                    kotlinx.serialization.json.p pVar = OpenSourceLicenses.f5676a;
                    Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.r.d(applicationContext, "getApplicationContext(...)");
                    objA = OpenSourceLicenses.a(applicationContext);
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                return new pg.p(objA);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, tg.e<? super g> eVar) {
            super(2, eVar);
            this.f12798c = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            g gVar = new g(this.f12798c, eVar);
            gVar.f12797b = obj;
            return gVar;
        }

        @Override // eh.p
        public final Object invoke(x0.c2<pg.p<? extends List<? extends OpenSourceLicenses.a>>> c2Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            x0.c2 c2Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f12796a;
            if (i10 == 0) {
                pg.q.b(obj);
                x0.c2 c2Var2 = (x0.c2) this.f12797b;
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(this.f12798c, null);
                this.f12797b = c2Var2;
                this.f12796a = 1;
                Object objE = ph.h.e(bVar, aVar2, this);
                if (objE == aVar) {
                    return aVar;
                }
                c2Var = c2Var2;
                obj = objE;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2Var = (x0.c2) this.f12797b;
                pg.q.b(obj);
            }
            c2Var.setValue(obj);
            return pg.f0.f21461a;
        }
    }

    public static final void a(final String str, final boolean z10, x0.j jVar, final int i10) {
        long j10;
        x0.k kVarP = jVar.p(132930238);
        if ((((kVarP.K(str) ? 4 : 2) | i10) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            h0.e eVarA = h0.f.a(8);
            if (z10) {
                kVarP.L(423152792);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25755c;
            } else {
                kVarP.L(423154335);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).H;
            }
            kVarP.T(false);
            md.a(null, eVarA, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(1123824409, new a(z10, str), kVarP), kVarP, 12582912, 121);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, i10) { // from class: h9.m0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12728a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f12729b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    s0.a(this.f12728a, this.f12729b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final OpenSourceLicenses.a aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-187476209);
        int i11 = (kVarP.l(aVar) ? 4 : 2) | i10 | (kVarP.l(aVar2) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.b(aVar2, androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), false, h0.f.a(16), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), kVarP, 0), null, null, null, f1.c.b(-577761286, new b(aVar), kVarP), kVarP, ((i11 >> 3) & 14) | 100663344, 228);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, i10) { // from class: h9.r0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f12774b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(9);
                    s0.b(this.f12773a, this.f12774b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final OpenSourceLicenses.a aVar, final eh.a<pg.f0> aVar2, final eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(589151457);
        int i11 = i10 | (kVarP.l(aVar) ? 4 : 2) | (kVarP.l(aVar2) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            float f10 = 24;
            kVar = kVarP;
            p7.a(aVar2, null, p7.f(6, 2, kVarP), CropImageView.DEFAULT_ASPECT_RATIO, h0.f.c(f10, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(-362334748, new c(aVar, lVar), kVarP), kVar, (i11 >> 3) & 14, 4042);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, lVar, i10) { // from class: h9.p0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f12752b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f12753c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(9);
                    s0.c(this.f12751a, this.f12752b, this.f12753c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final int i10, final int i11, x0.j jVar) {
        x0.k kVarP = jVar.p(557676598);
        if ((((kVarP.i(i10) ? 4 : 2) | i11) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), kVarP, 0), null, null, f1.c.b(617654184, new d(i10), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11) { // from class: h9.q0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f12762a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s0.d(this.f12762a, iN, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final p5.x navController, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(177439819);
        if ((((kVarP.l(navController) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(796739738);
            boolean zL = kVarP.l(context);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new g(context, null);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1VarI = bg.b.i((eh.p) objG, null, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(796744693);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new d9.d(1);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(796746688);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                objG3 = new n0(0);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            ra.a(null, f1.c.b(469960199, new e(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-667249892, new f(n1Var, (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG3, kVarP, 3072, 6), n1VarI, context), kVarP), kVarP, 806879280, 189);
            kVarP = kVarP;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: h9.o0
                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    s0.e(this.f12745a, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
