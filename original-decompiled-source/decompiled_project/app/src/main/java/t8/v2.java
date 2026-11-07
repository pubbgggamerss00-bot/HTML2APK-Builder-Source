package t8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.basitce.htmltoapk.R;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import f9.ic;
import f9.sd;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import lh.f;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import p0.e4;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.ra;
import t0.s4;
import t0.t4;
import t0.w9;
import t0.z9;
import t2.b;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f28491a = c2.n0.c(4280490496L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f28492b = c2.n0.c(4281019182L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f28493c = c2.n0.c(4293125094L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f28494d = c2.n0.c(4291414478L);

    /* renamed from: e, reason: collision with root package name */
    public static final mh.k f28495e = new mh.k("</?[a-zA-Z][\\w-]*|/?>");

    /* renamed from: f, reason: collision with root package name */
    public static final mh.k f28496f = new mh.k("(?<=\\s)[a-zA-Z_:@][\\w:.-]*(?==)");

    /* renamed from: g, reason: collision with root package name */
    public static final mh.k f28497g = new mh.k("\"[^\"\\n]*\"|'[^'\\n]*'");

    /* renamed from: h, reason: collision with root package name */
    public static final mh.k f28498h = new mh.k("<!--.*?-->|//[^\\n]*");

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28499a;

        public a(String str) {
            this.f28499a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(this.f28499a, androidx.compose.foundation.layout.f.h(d.a.f1143b, 12), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 48, 0, 65528);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f28500a;

        public b(long j10) {
            this.f28500a = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            long j10;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, 10, 6);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
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
                ph.v1.j(g.a.f13867f, m1VarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 16), k9.d.f16192n, jVar2, 432, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 4), jVar2);
                long j11 = this.f28500a;
                String strValueOf = String.valueOf(j11);
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26550m;
                x2.p pVar = x2.p.f32033f;
                if (j11 < 0) {
                    jVar2.L(2024104500);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w;
                } else {
                    jVar2.L(2024105688);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
                }
                jVar2.B();
                ff.b(strValueOf, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28501a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28502b;

        public c(String str, eh.a<pg.f0> aVar) {
            this.f28501a = str;
            this.f28502b = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                float f10 = 12;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                int iD = jVar3.D();
                x0.a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
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
                ph.v1.j(g.a.f13867f, m1VarA, jVar3);
                ph.v1.j(g.a.f13866e, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar3);
                w1.d dVarB = p0.m3.f20942a;
                if (dVarB == null) {
                    d.a aVar3 = new d.a("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVar = new w1.e();
                    eVar.h(11.0f, 15.0f);
                    eVar.e(2.0f);
                    eVar.l(2.0f);
                    eVar.e(-2.0f);
                    eVar.a();
                    p0.n.a(eVar, 11.0f, 7.0f, 2.0f, 6.0f);
                    eVar.e(-2.0f);
                    eVar.a();
                    eVar.h(11.99f, 2.0f);
                    eVar.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    eVar.j(4.47f, 10.0f, 9.99f, 10.0f);
                    eVar.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    eVar.i(17.52f, 2.0f, 11.99f, 2.0f);
                    eVar.a();
                    eVar.h(12.0f, 20.0f);
                    eVar.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, -3.58f, -8.0f, -8.0f);
                    eVar.j(3.58f, -8.0f, 8.0f, -8.0f);
                    eVar.j(8.0f, 3.58f, 8.0f, 8.0f);
                    eVar.j(-3.58f, 8.0f, -8.0f, 8.0f);
                    eVar.a();
                    d.a.a(aVar3, eVar.f31100a, 0, i2Var);
                    dVarB = aVar3.b();
                    p0.m3.f20942a = dVarB;
                }
                x0.s3 s3Var = t0.f2.f25858a;
                t4.b(dVarB, null, androidx.compose.foundation.layout.g.n(aVar, 20), ((t0.e2) jVar3.f(s3Var)).f25777w, jVar3, 432, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 10), jVar3);
                String str = this.f28501a;
                String strC = f3.q.c(g8.w.a(str), jVar3);
                t2.l0 l0Var = ((nf) jVar3.f(of.f26647a)).f26549l;
                long j10 = ((t0.e2) jVar3.f(s3Var)).f25771q;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                ff.b(strC, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 0, 0, 65528);
                jVar3.L(-2137512707);
                if (kotlin.jvm.internal.r.a(str, "insufficient_credits")) {
                    h0.e eVarA = h0.f.a(f10);
                    z.g1 g1Var = t0.m0.f26400a;
                    jVar2 = jVar3;
                    t0.x0.a(this.f28502b, null, false, eVarA, t0.m0.a(k9.d.f16192n, v2.f28491a, 0L, jVar2, 12), null, null, null, c4.f28161m, jVar2, 805306368, 486);
                } else {
                    jVar2 = jVar3;
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28503a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28504b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28505c;

        public d(String str, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2) {
            this.f28503a = str;
            this.f28504b = aVar;
            this.f28505c = aVar2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            d.a aVar;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar2, 14);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
                String strC = f3.q.c(R.string.ai_session_settings_title, jVar2);
                x0.s3 s3Var = of.f26647a;
                ff.b(strC, null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26546i, jVar2, 196608, 0, 65502);
                x0.j jVar3 = jVar2;
                String str = this.f28503a;
                if (str == null || mh.x.A(str)) {
                    str = null;
                }
                jVar3.L(-42950773);
                if (str == null) {
                    aVar = aVar2;
                } else {
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 4), jVar3);
                    aVar = aVar2;
                    ff.b(str, null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26549l, jVar3, 0, 0, 65530);
                    jVar3 = jVar3;
                }
                jVar3.B();
                float f10 = 8;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                z.m1 m1VarA = z.k1.a(z.b.f34445b, d.a.f14611j, jVar3, 6);
                int iD2 = jVar3.D();
                x0.a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar3);
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                ph.v1.j(bVar, m1VarA, jVar3);
                ph.v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar3);
                x0.j jVar4 = jVar3;
                t0.x0.d(this.f28504b, null, false, null, null, null, c4.f28162n, jVar4, 805306368, 510);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar4);
                h0.e eVarA = h0.f.a(12);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f28505c, null, false, eVarA, t0.m0.a(k9.d.f16192n, v2.f28491a, 0L, jVar4, 12), null, null, null, c4.f28163o, jVar4, 805306368, 486);
                jVar4.H();
                jVar4.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f28506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f28507b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(eh.l<? super String, pg.f0> lVar, x0.n1<String> n1Var) {
            this.f28506a = lVar;
            this.f28507b = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(905619493);
                eh.l<String, pg.f0> lVar = this.f28506a;
                boolean zK = jVar2.K(lVar);
                x0.n1<String> n1Var = this.f28507b;
                boolean zK2 = zK | jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    objG = new b9.x2(lVar, n1Var, 1);
                    jVar2.C(objG);
                }
                eh.a aVar = (eh.a) objG;
                jVar2.B();
                String text = n1Var.getValue();
                kotlin.jvm.internal.r.e(text, "text");
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u0008\\u000B-\\u001F\\u007F-\\u009F\\u200B-\\u200F\\u202A-\\u202E\\u2066-\\u2069]");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(text).replaceAll("");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                t0.x0.a(aVar, null, mh.y.b0(DescriptorProtos.Edition.EDITION_2023_VALUE, mh.x.W(strReplaceAll).toString()).length() > 0, null, null, null, null, null, c4.f28155g, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28508a;

        public f(eh.a<pg.f0> aVar) {
            this.f28508a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f28508a, null, false, null, null, null, c4.f28156h, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f28509a;

        public g(x0.n1<String> n1Var) {
            this.f28509a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                x0.n1<String> n1Var = this.f28509a;
                String value = n1Var.getValue();
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                jVar2.L(289642220);
                boolean zK = jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new sd(n1Var, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                w9.a(value, (eh.l) objG, dVarD, false, false, null, null, c4.f28159k, null, null, null, f1.c.b(711260514, new x2(n1Var), jVar2), false, null, null, null, false, 8, 4, null, null, jVar2, 12583296, 905970048, 7597944);
                ff.b(f3.q.c(R.string.ai_session_report_note, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y3 f28510a;

        public h(y3 y3Var) {
            this.f28510a = y3Var;
        }

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 TextButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                w1.d dVarA = e4.a();
                d.a aVar = d.a.f1143b;
                t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 16), 0L, jVar2, 432, 8);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 4), jVar2);
                ff.b(f3.q.c(this.f28510a.f28601u ? R.string.ai_session_reported_label : R.string.ai_session_report, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26550m, jVar2, 0, 0, 65534);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$ThinkingBlock$1$1", f = "AiSessionScreen.kt", l = {464}, m = "invokeSuspend")
    public static final class i extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28511a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f28512b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28513c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28514d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f28515e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10, String str, eh.a<pg.f0> aVar, x0.l1 l1Var, tg.e<? super i> eVar) {
            super(2, eVar);
            this.f28512b = z10;
            this.f28513c = str;
            this.f28514d = aVar;
            this.f28515e = l1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new i(this.f28512b, this.f28513c, this.f28514d, this.f28515e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28511a;
            String str = this.f28513c;
            x0.l1 l1Var = this.f28515e;
            if (i10 == 0) {
                pg.q.b(obj);
                if (!this.f28512b) {
                    int length = str.length();
                    mh.k kVar = v2.f28495e;
                    l1Var.f(length);
                    return pg.f0.f21461a;
                }
                mh.k kVar2 = v2.f28495e;
                if (l1Var.g() < str.length()) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                int length2 = str.length();
                mh.k kVar3 = v2.f28495e;
                l1Var.f(Math.min(length2, ((str.length() - l1Var.g()) / 24) + l1Var.g() + 1));
                this.f28514d.invoke();
                mh.k kVar22 = v2.f28495e;
                if (l1Var.g() < str.length()) {
                    y2 y2Var = new y2();
                    this.f28511a = 1;
                    if (x0.f1.a(getContext()).f0(y2Var, this) == aVar) {
                        return aVar;
                    }
                    int length22 = str.length();
                    mh.k kVar32 = v2.f28495e;
                    l1Var.f(Math.min(length22, ((str.length() - l1Var.g()) / 24) + l1Var.g() + 1));
                    this.f28514d.invoke();
                    mh.k kVar222 = v2.f28495e;
                    if (l1Var.g() < str.length()) {
                        return pg.f0.f21461a;
                    }
                }
            }
        }
    }

    public static final class j implements eh.q<r.h0, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f28516a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28517b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f28518c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f28519d;

        public j(boolean z10, String str, x0.l1 l1Var, long j10) {
            this.f28516a = z10;
            this.f28517b = str;
            this.f28518c = l1Var;
            this.f28519d = j10;
        }

        @Override // eh.q
        public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
            r.h0 AnimatedVisibility = h0Var;
            x0.j jVar2 = jVar;
            num.intValue();
            kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
            boolean z10 = this.f28516a;
            String strB0 = this.f28517b;
            if (z10) {
                strB0 = mh.y.b0(this.f28518c.g(), strB0);
            }
            jVar2.L(-883215018);
            boolean zK = jVar2.K(strB0);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                String string = mh.x.W(strB0).toString();
                b.C0288b c0288b = new b.C0288b();
                boolean z11 = false;
                for (String str : mh.x.O(string, new String[]{"**"})) {
                    if (z11) {
                        b.C0288b.a aVar = new b.C0288b.a(new t2.b0(0L, 0L, x2.p.f32032e, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65531), c0288b.f27764a.length(), 0, 12);
                        ArrayList arrayList = c0288b.f27765b;
                        arrayList.add(aVar);
                        c0288b.f27766c.add(aVar);
                        int size = arrayList.size() - 1;
                        try {
                            c0288b.b(str);
                            pg.f0 f0Var = pg.f0.f21461a;
                        } finally {
                            c0288b.d(size);
                        }
                    } else {
                        c0288b.b(str);
                    }
                    z11 = !z11;
                }
                objG = c0288b.e();
                jVar2.C(objG);
            }
            t2.b bVar = (t2.b) objG;
            jVar2.B();
            z.w0 w0Var = z.w0.f34658a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.d.a(), CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14611j, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
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
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.r(aVar3, 2).h(androidx.compose.foundation.layout.g.f975b);
            long j10 = this.f28519d;
            z.g.a(androidx.compose.foundation.a.b(dVarH, q1.b1.c(0.3f, j10), h0.f.a(1)), jVar2, 0);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, 12), jVar2);
            ff.c(bVar, null, j10, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, ((nf) jVar2.f(of.f26647a)).f26549l, jVar2, 0, 0, 131066);
            jVar2.H();
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28520a;

        public k(String str) {
            this.f28520a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(this.f28520a, androidx.compose.foundation.layout.f.h(d.a.f1143b, 12), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26548k, jVar2, 48, 0, 65528);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v46 */
    public static final void a(final p5.x navController, m3 m3Var, x0.j jVar, final int i10) {
        final m3 m3Var2;
        eh.a aVar;
        boolean z10;
        x0.n1 n1Var;
        int i11;
        x0.k kVar;
        x0.n1 n1Var2;
        List<String> list;
        String str;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-952484300);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            m3Var2 = m3Var;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(m3.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                m3Var2 = (m3) w0VarB;
            } else {
                kVarP.v();
                m3Var2 = m3Var;
            }
            kVarP.U();
            final x0.n1 n1VarB = bg.b.b(m3Var2.f28313h, kVarP);
            x0.n1 n1VarB2 = bg.b.b(m3Var2.f28314i, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(1214316281);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new y0(0);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(1214318273);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new a1(0);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            final x0.n1 n1Var4 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 3072, 6);
            final b0.m0 m0VarA = b0.u0.a(kVarP);
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                x0.w2 w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG3 = w2Var;
            }
            final ph.i0 i0Var = (ph.i0) objG3;
            f3.d dVar = (f3.d) kVarP.f(j2.j2.f14779h);
            kVarP.L(1214325220);
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                objG4 = new x0.v1(0);
                kVarP.C(objG4);
            }
            x0.l1 l1Var = (x0.l1) objG4;
            kVarP.T(false);
            kVarP.L(-1840868180);
            kVarP.L(-392095103);
            Object objG5 = kVarP.g();
            if (objG5 == obj) {
                objG5 = bg.b.h(Boolean.TRUE);
                kVarP.C(objG5);
            }
            final x0.n1 n1Var5 = (x0.n1) objG5;
            kVarP.T(false);
            kVarP.L(-392093038);
            boolean zK = kVarP.K(m0VarA);
            Object objG6 = kVarP.g();
            if (zK || objG6 == obj) {
                objG6 = new z2(m0VarA, n1Var5, null);
                kVarP.C(objG6);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG6, m0VarA, kVarP);
            Boolean boolValueOf = Boolean.valueOf(m0VarA.f3389h.a());
            kVarP.L(-392085955);
            boolean zK2 = kVarP.K(m0VarA);
            Object objG7 = kVarP.g();
            if (zK2 || objG7 == obj) {
                objG7 = new a3(m0VarA, n1Var5, null);
                kVarP.C(objG7);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG7, boolValueOf, kVarP);
            kVarP.T(false);
            y3 y3Var = (y3) qg.x.K(((b3) n1VarB.getValue()).f28111a);
            Object[] objArr3 = {Integer.valueOf(((b3) n1VarB.getValue()).f28111a.size()), (y3Var == null || (str = y3Var.f28584d) == null) ? null : Integer.valueOf(str.length()), (y3Var == null || (list = y3Var.f28589i) == null) ? null : Integer.valueOf(list.size()), y3Var != null ? Boolean.valueOf(y3Var.f28590j) : null, y3Var != null ? y3Var.f28588h : null, ((b3) n1VarB.getValue()).f28112b};
            kVarP.L(1214337272);
            boolean zK3 = kVarP.K(n1Var5) | kVarP.K(n1VarB) | kVarP.K(m0VarA);
            Object objG8 = kVarP.g();
            if (zK3 || objG8 == obj) {
                objG8 = new v1(n1Var5, m0VarA, n1VarB, null);
                kVarP.C(objG8);
            }
            kVarP.T(false);
            x0.o0.g(objArr3, (eh.p) objG8, kVarP);
            kVarP.L(1214346274);
            boolean zK4 = kVarP.K(n1Var5) | kVarP.K(m0VarA) | kVarP.l(i0Var);
            Object objG9 = kVarP.g();
            if (zK4 || objG9 == obj) {
                objG9 = new eh.a() { // from class: t8.b1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        if (((Boolean) n1Var5.getValue()).booleanValue()) {
                            b0.m0 m0Var = m0VarA;
                            if (!m0Var.f3389h.a()) {
                                ph.h.c(i0Var, null, null, new u2(m0Var, null), 3);
                            }
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG9);
            }
            eh.a aVar2 = (eh.a) objG9;
            Object objA = p0.h.a(kVarP, false, 1214354417);
            if (objA == obj) {
                objA = new h1.w();
                kVarP.C(objA);
            }
            h1.w wVar = (h1.w) objA;
            kVarP.T(false);
            Integer numValueOf = Integer.valueOf(((b3) n1VarB.getValue()).f28111a.size());
            kVarP.L(1214356986);
            boolean zK5 = kVarP.K(n1Var5);
            Object objG10 = kVarP.g();
            if (zK5 || objG10 == obj) {
                aVar = aVar2;
                objG10 = new n2(n1Var5, null);
                kVarP.C(objG10);
            } else {
                aVar = aVar2;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG10, numValueOf, kVarP);
            h8.j jVar2 = ((b3) n1VarB.getValue()).f28118h;
            kVarP.L(1214358504);
            if (jVar2 == null) {
                z10 = false;
            } else {
                kVarP.L(2044923298);
                boolean zL = kVarP.l(m3Var2);
                Object objG11 = kVarP.g();
                if (zL || objG11 == obj) {
                    objG11 = new b9.p0(m3Var2, 2);
                    kVarP.C(objG11);
                }
                z10 = false;
                kVarP.T(false);
                s0.a(jVar2, (eh.l) objG11, kVarP, 0);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kVarP.T(z10);
            Integer num = (Integer) n1Var4.getValue();
            kVarP.L(1214361745);
            if (num == null) {
                n1Var = n1Var3;
                i11 = 0;
            } else {
                final int iIntValue = num.intValue();
                kVarP.L(2044926935);
                boolean zK6 = kVarP.K(n1Var4);
                Object objG12 = kVarP.g();
                if (zK6 || objG12 == obj) {
                    objG12 = new b9.q0(n1Var4, 1);
                    kVarP.C(objG12);
                }
                eh.a aVar3 = (eh.a) objG12;
                kVarP.T(false);
                kVarP.L(2044928726);
                boolean zK7 = kVarP.K(n1Var4) | kVarP.l(m3Var2) | kVarP.i(iIntValue) | kVarP.l(context);
                n1Var = n1Var3;
                Object objG13 = kVarP.g();
                if (zK7 || objG13 == obj) {
                    objG13 = new eh.l() { // from class: t8.d1
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            int i12;
                            Object next;
                            String str2;
                            ae.m mVar;
                            String details = (String) obj2;
                            kotlin.jvm.internal.r.e(details, "details");
                            n1Var4.setValue(null);
                            ic icVar = new ic(context, 1);
                            m3 m3Var3 = m3Var2;
                            Iterator<T> it = ((b3) m3Var3.f28312g.getValue()).f28111a.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                i12 = iIntValue;
                                if (!zHasNext) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                if (((y3) next).f28581a == i12) {
                                    break;
                                }
                            }
                            y3 y3Var2 = (y3) next;
                            if (y3Var2 != null) {
                                String str3 = y3Var2.f28599s;
                                if (str3 == null || (str2 = y3Var2.f28600t) == null || (mVar = m3Var3.f28310e.f11600d) == null) {
                                    icVar.invoke(Boolean.FALSE);
                                } else {
                                    ph.h.c(androidx.lifecycle.x0.a(m3Var3), null, null, new t3(m3Var3, i12, icVar, mVar, str3, str2, details, null), 3);
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG13);
                }
                i11 = 0;
                kVarP.T(false);
                q(aVar3, (eh.l) objG13, kVarP, 0);
                pg.f0 f0Var2 = pg.f0.f21461a;
            }
            kVarP.T(i11);
            Object[] objArr4 = new Object[i11];
            kVarP.L(1214385468);
            Object objG14 = kVarP.g();
            if (objG14 == obj) {
                objG14 = new e1();
                kVarP.C(objG14);
            }
            kVarP.T(i11);
            final x0.n1 n1Var6 = (x0.n1) b0.a0.d(objArr4, null, (eh.a) objG14, kVarP, 3072, 6);
            kVarP.L(1214387248);
            boolean zK8 = kVarP.K(n1VarB) | kVarP.K(n1Var6) | kVarP.l(navController);
            Object objG15 = kVarP.g();
            if (zK8 || objG15 == obj) {
                objG15 = new eh.a() { // from class: t8.f1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        if (((b3) n1VarB.getValue()).f28115e) {
                            v2.b(n1Var6, true);
                        } else {
                            s8.b2.e(navController);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG15);
            }
            eh.a aVar4 = (eh.a) objG15;
            kVarP.T(false);
            boolean z11 = ((b3) n1VarB.getValue()).f28115e;
            kVarP.L(1214391738);
            boolean zK9 = kVarP.K(n1Var6);
            Object objG16 = kVarP.g();
            if (zK9 || objG16 == obj) {
                objG16 = new c9.q(n1Var6, 1);
                kVarP.C(objG16);
            }
            kVarP.T(false);
            c.e.a(0, 0, (eh.a) objG16, kVarP, z11);
            kVarP.L(1214393483);
            if (((Boolean) n1Var6.getValue()).booleanValue()) {
                if (!((b3) n1VarB.getValue()).f28115e) {
                    n1Var6.setValue(Boolean.FALSE);
                }
                kVarP.L(1214396411);
                boolean zK10 = kVarP.K(n1Var6);
                Object objG17 = kVarP.g();
                if (zK10 || objG17 == obj) {
                    objG17 = new p5.c0(n1Var6, 1);
                    kVarP.C(objG17);
                }
                kVarP.T(false);
                n1Var2 = n1Var4;
                t0.r.a((eh.a) objG17, f1.c.b(125683655, new o2(navController, n1Var6), kVarP), null, f1.c.b(-797483771, new p2(n1Var6, m3Var2, navController), kVarP), null, c4.f28151c, c4.f28152d, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1772592, 0, 16276);
                kVar = kVarP;
            } else {
                kVar = kVarP;
                n1Var2 = n1Var4;
            }
            kVar.T(false);
            kVarP = kVar;
            ra.a(null, f1.c.b(-1462266120, new t2(n1VarB, aVar4, n1VarB2, navController), kVar), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1207471933, new m2(dVar, m0VarA, n1VarB, m3Var2, aVar, navController, n1Var2, i0Var, n1Var, n1Var5, l1Var, wVar), kVar), kVarP, 806879280, 189);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(m3Var2, i10) { // from class: t8.z0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m3 f28606b;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    v2.a(this.f28605a, this.f28606b, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void c(final String str, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-916036298);
        if ((((kVarP.K(str) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 18;
            md.a(null, h0.f.b(f10, f10, f10, 4), q1.b1.c(0.9f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-267669999, new a(str), kVarP), kVarP, 12582912, 121);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, i10) { // from class: t8.w0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f28530a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.c(this.f28530a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final y3 y3Var, final eh.a aVar, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-70512063);
        int i11 = (kVarP.l(y3Var) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            String str = y3Var.f28588h;
            String str2 = y3Var.f28584d;
            boolean z10 = y3Var.f28590j;
            boolean z11 = kotlin.jvm.internal.r.a(str, "planning") && y3Var.f28586f == null;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(dVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, kVarP, 6);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            if (!mh.x.A(y3Var.f28585e)) {
                kVarP.L(348628592);
                s(y3Var.f28585e, z11 && z10, y3Var.f28586f, aVar, kVarP, (i11 << 6) & V4Signature.MAX_SIGNING_INFOS_SIZE);
                kVarP.T(false);
            } else if (z11 && z10) {
                kVarP.L(348806191);
                o("planning", 0, kVarP, 54);
                kVarP.T(false);
            } else {
                kVarP.L(348851358);
                kVarP.T(false);
            }
            kVarP.L(-1651314367);
            if (!mh.x.A(str2)) {
                c(mh.x.W(str2).toString(), kVarP, 0);
            }
            kVarP.T(false);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, dVar, i10) { // from class: t8.p1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28382b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f28383c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(393);
                    v2.d(this.f28381a, this.f28382b, this.f28383c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final y3 y3Var, final boolean z10, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.a<pg.f0> aVar3, final eh.a<pg.f0> aVar4, x0.j jVar, final int i10) {
        x0.k kVar;
        boolean z11;
        int i11;
        x0.k kVarP = jVar.p(1399502113);
        int i12 = i10 | (kVarP.l(y3Var) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.l(aVar2) ? 2048 : 1024) | (kVarP.l(aVar3) ? 16384 : 8192) | (kVarP.l(aVar4) ? 131072 : 65536);
        if ((i12 & 74899) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, kVarP, 6);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar5);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            String str = y3Var.f28588h;
            String str2 = y3Var.f28598r;
            if (str == null || str.equals("planning")) {
                str = null;
            }
            kVarP.L(-812734905);
            if (str != null) {
                o(str, y3Var.f28589i.size(), kVarP, 0);
            }
            kVarP.T(false);
            kVarP.L(-812732912);
            if (str2 != null) {
                l(str2, aVar3, kVarP, (i12 >> 9) & 112);
            }
            kVarP.T(false);
            kVarP.L(-812730627);
            if (y3Var.f28590j || str2 != null) {
                kVar = kVarP;
                z11 = false;
            } else {
                kVarP.L(-812729267);
                if (z10) {
                    j(y3Var.f28583c, kVarP, 0);
                }
                kVarP.T(false);
                kVarP.L(-812727253);
                int i14 = y3Var.f28597q;
                if (i14 > 0) {
                    String strD = f3.q.d(R.string.ai_session_failed_blocks, new Object[]{Integer.valueOf(i14)}, kVarP);
                    t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26549l;
                    long j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25777w;
                    i11 = 8;
                    z11 = false;
                    ff.b(strD, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 0, 0, 65530);
                    kVar = kVarP;
                } else {
                    i11 = 8;
                    kVar = kVarP;
                    z11 = false;
                }
                kVar.T(z11);
                h8.u uVar = y3Var.f28596p;
                kVar.L(-812716880);
                if (uVar != null) {
                    n(uVar.f12471i, aVar, aVar2, kVar, (i12 >> 3) & 1008);
                }
                kVar.T(z11);
                r(y3Var, aVar4, kVar, i11 | (i12 & 14) | ((i12 >> 12) & 112));
            }
            kVar.T(z11);
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar, aVar2, aVar3, aVar4, i10) { // from class: t8.t0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f28456b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f28457c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f28458d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f28459e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f28460f;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(9);
                    v2.e(this.f28455a, this.f28456b, this.f28457c, this.f28458d, this.f28459e, this.f28460f, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final long j10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1227740707);
        int i11 = i10 | (kVarP.j(j10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            h0.e eVar = h0.f.f12083a;
            h0.d dVar = new h0.d(50);
            h0.e eVar2 = new h0.e(dVar, dVar, dVar, dVar);
            long j11 = k9.d.f16192n;
            md.b(aVar, null, false, eVar2, q1.b1.c(0.15f, j11), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.5f, j11)), null, f1.c.b(-747178264, new b(j10), kVarP), kVarP, (i11 >> 3) & 14, 742);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j10, aVar, i10) { // from class: t8.i1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f28242a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28243b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.f(this.f28242a, this.f28243b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1914158634);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 18;
            z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(dVar, 14), f28492b, h0.f.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, f10, 3)), kVarP, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: t8.o1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(7);
                    v2.g(this.f28363a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void h(final List list, final boolean z10, final boolean z11, final eh.a aVar, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1420477390);
        if (((i10 | (kVarP.l(list) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.c(z11) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024)) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            float f10 = 18;
            float f11 = 4;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVar, f28492b, h0.f.c(f10, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12)), false, null, null, aVar, 7), 16, f11, f11, f11);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarK, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(-1200667272);
            String strC = z10 ? f3.q.c(R.string.ai_session_code_changes, kVarP) : "HTML";
            kVarP.T(false);
            x0.s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) kVarP.f(s3Var)).f26550m;
            x2.p pVar = x2.p.f32033f;
            long j10 = f28494d;
            ff.b(strC, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196992, 0, 65498);
            d.a aVar3 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, 8), kVarP);
            String strD = f3.q.d(R.string.ai_session_code_lines, new Object[]{Integer.valueOf(list.size())}, kVarP);
            t2.l0 l0Var2 = ((nf) kVarP.f(s3Var)).f26551n;
            long jC = q1.b1.c(0.7f, j10);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            ff.b(strD, new LayoutWeightElement(1.0f, true), jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, kVarP, 384, 0, 65528);
            kVarP = kVarP;
            kVarP.L(-1200650181);
            boolean zL = kVarP.l(context) | kVarP.l(list);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: t8.c1
                    @Override // eh.a
                    public final Object invoke() {
                        Context context2 = context;
                        Object systemService = context2.getSystemService("clipboard");
                        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("HTML", qg.x.I(list, "\n", null, null, null, 62)));
                        Toast.makeText(context2, R.string.ai_session_code_copied, 0).show();
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            s4.c((eh.a) objG, null, false, null, c4.f28160l, kVarP, 196608, 30);
            t4.b(z11 ? p0.q3.a() : p0.p3.a(), null, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, 11), 22), j10, kVarP, 3504, 0);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(list, z10, z11, aVar, dVar, i10) { // from class: t8.k1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f28268a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f28269b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f28270c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f28271d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f28272e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(24577);
                    v2.h(this.f28268a, this.f28269b, this.f28270c, this.f28271d, this.f28272e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(final String str, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(1670777306);
        int i11 = (kVarP.K(str) ? 4 : 2) | i10;
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(-1035615074);
            boolean z10 = (i11 & 14) == 4;
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                b.C0288b c0288b = new b.C0288b();
                c0288b.b(str);
                f.a aVar = new f.a(mh.k.c(f28495e, str));
                while (aVar.hasNext()) {
                    mh.h hVar = (mh.h) aVar.next();
                    c0288b.a(new t2.b0(c2.n0.c(4293961952L), 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65534), hVar.b().f15744a, hVar.b().f15745b + 1);
                }
                f.a aVar2 = new f.a(mh.k.c(f28496f, str));
                while (aVar2.hasNext()) {
                    mh.h hVar2 = (mh.h) aVar2.next();
                    c0288b.a(new t2.b0(c2.n0.c(4293319052L), 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65534), hVar2.b().f15744a, hVar2.b().f15745b + 1);
                }
                f.a aVar3 = new f.a(mh.k.c(f28497g, str));
                while (aVar3.hasNext()) {
                    mh.h hVar3 = (mh.h) aVar3.next();
                    c0288b.a(new t2.b0(c2.n0.c(4287416575L), 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65534), hVar3.b().f15744a, hVar3.b().f15745b + 1);
                }
                f.a aVar4 = new f.a(mh.k.c(f28498h, str));
                while (aVar4.hasNext()) {
                    mh.h hVar4 = (mh.h) aVar4.next();
                    c0288b.a(new t2.b0(c2.n0.c(4286350484L), 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (q1.e2) null, 65534), hVar4.b().f15744a, hVar4.b().f15745b + 1);
                }
                objG = c0288b.e();
                kVarP.C(objG);
            }
            kVarP.T(false);
            kVar = kVarP;
            ff.c((t2.b) objG, androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(dVar, f28492b, q1.y1.f21750a), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), f28493c, f3.u.c(12), x2.f.f32016c, 0L, f3.u.c(18), 0, false, 0, 0, null, null, null, kVar, 3456, 6, 261040);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, dVar, i10) { // from class: t8.n1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f28349a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f28350b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    v2.i(this.f28349a, this.f28350b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(final boolean z10, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1326754076);
        if ((((kVarP.c(z10) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            c(f3.q.c(z10 ? R.string.ai_session_done_edit : R.string.ai_session_done_new, kVarP), kVarP, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, i10) { // from class: t8.s1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f28447a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.j(this.f28447a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void k(final boolean z10, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-2087280171);
        if ((((kVarP.c(z10) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 48, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 56);
            long j10 = k9.d.f16192n;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.15f, j10), h0.f.a(16));
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i12 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, l0VarD, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 28), j10, kVarP, 432, 0);
            kVarP.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 12), kVarP);
            ff.b(f3.q.c(z10 ? R.string.ai_session_empty_edit : R.string.ai_create_heading, kVarP), null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26548k, kVarP, 0, 0, 65530);
            kVarP = kVarP;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, i10) { // from class: t8.m1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f28294a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.k(this.f28294a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void l(String str, eh.a<pg.f0> aVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-1125876840);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(14), q1.b1.c(0.1f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25777w), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(196337395, new c(str, aVar), kVarP), kVarP, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new q8.i0(str, i10, 1, aVar);
        }
    }

    public static final void m(final String str, final eh.l lVar, final boolean z10, final String str2, final eh.a aVar, final eh.a aVar2, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1739693734);
        if (((i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.K(str2) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.l(aVar2) ? 131072 : 65536) | (kVarP.K(dVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted)) & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d0.h.f(androidx.compose.foundation.layout.g.d(dVar, 1.0f)), 12, 10);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            androidx.compose.ui.d dVarA = androidx.compose.animation.e.a(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(d.a.f1143b, CropImageView.DEFAULT_ASPECT_RATIO, 640, 1), 1.0f));
            h0.e eVarA = h0.f.a(26);
            x0.s3 s3Var = t0.f2.f25858a;
            md.a(dVarA, eVarA, ((t0.e2) kVarP.f(s3Var)).G, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 8, a9.d2.a(1, q1.b1.c(0.6f, ((t0.e2) kVarP.f(s3Var)).B)), f1.c.b(898948377, new w2(z10, aVar2, str, aVar, str2, lVar), kVarP), kVarP, 12779520, 24);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, z10, str2, aVar, aVar2, dVar, i10) { // from class: t8.j1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f28254a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f28255b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f28256c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f28257d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f28258e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f28259f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f28260g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.m(this.f28254a, this.f28255b, this.f28256c, this.f28257d, this.f28258e, this.f28259f, this.f28260g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void n(final String str, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        int i11;
        x0.k kVarP = jVar.p(1371601310);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(16), q1.b1.c(0.9f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.6f, k9.d.f16192n)), f1.c.b(-1000332935, new d(str, aVar2, aVar), kVarP), kVarP, 12582918, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: t8.r1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    v2.n(str, aVar, aVar2, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final String str, final int i10, x0.j jVar, final int i11) {
        int i12;
        String strC;
        x0.k kVarP = jVar.p(575473124);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.K(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= kVarP.i(i10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            z9.a(2, 0, 390, 24, k9.d.f16192n, 0L, androidx.compose.foundation.layout.g.n(aVar, 16), kVarP);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 10), kVarP);
            switch (str.hashCode()) {
                case -762498763:
                    if (!str.equals("repairing")) {
                        kVarP.L(-1020437921);
                        strC = f3.q.c(R.string.ai_phase_planning, kVarP);
                        kVarP.T(false);
                        break;
                    } else {
                        kVarP.L(-1020442560);
                        strC = f3.q.c(R.string.ai_phase_repairing, kVarP);
                        kVarP.T(false);
                        break;
                    }
                case 851230718:
                    if (str.equals("recovering")) {
                        kVarP.L(-1020440127);
                        strC = f3.q.c(R.string.ai_phase_recovering, kVarP);
                        kVarP.T(false);
                        break;
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        kVarP.L(-1020447265);
                        strC = f3.q.c(R.string.ai_phase_settings, kVarP);
                        kVarP.T(false);
                        break;
                    }
                    break;
                case 1536898522:
                    if (str.equals("checking")) {
                        kVarP.L(-1020444929);
                        strC = f3.q.c(R.string.ai_phase_checking, kVarP);
                        kVarP.T(false);
                        break;
                    }
                    break;
                case 1603008732:
                    if (str.equals("writing")) {
                        kVarP.L(-1020449787);
                        strC = f3.q.d(R.string.ai_phase_writing, new Object[]{Integer.valueOf(i10)}, kVarP);
                        kVarP.T(false);
                        break;
                    }
                    break;
                case 1869375325:
                    if (str.equals("planning")) {
                        kVarP.L(-1020452097);
                        strC = f3.q.c(R.string.ai_phase_planning, kVarP);
                        kVarP.T(false);
                        break;
                    }
                    break;
            }
            ff.b(strC, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26549l, kVarP, 0, 0, 65530);
            kVarP = kVarP;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: t8.t1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i11 | 1);
                    v2.o(str, i10, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void p(eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, x0.j jVar, final int i10) {
        final eh.a<pg.f0> aVar4;
        final eh.a<pg.f0> aVar5 = aVar2;
        final eh.a<pg.f0> aVar6 = aVar3;
        x0.k kVarP = jVar.p(-63857383);
        int i11 = (kVarP.l(aVar) ? 4 : 2) | i10 | (kVarP.l(aVar5) ? 32 : 16) | (kVarP.l(aVar6) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar4 = aVar;
        } else {
            d.a aVar7 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar7, 1.0f);
            z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, kVarP, 6);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar8 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar8);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            float f10 = 52;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar7, 1.0f), f10);
            float f11 = 16;
            h0.e eVarA = h0.f.a(f11);
            z.g1 g1Var = t0.m0.f26400a;
            t0.x0.a(aVar, dVarF, false, eVarA, t0.m0.a(k9.d.f16192n, f28491a, 0L, kVarP, 12), null, null, null, c4.f28164p, kVarP, (i11 & 14) | 805306416, 484);
            aVar4 = aVar;
            kVarP = kVarP;
            t0.x0.b(aVar2, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar7, 1.0f), f10), false, h0.f.a(f11), null, null, null, c4.f28165q, kVarP, ((i11 >> 3) & 14) | 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            aVar5 = aVar2;
            t0.x0.c(aVar3, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar7, 1.0f), f10), false, h0.f.a(f11), null, null, null, c4.f28166r, kVarP, ((i11 >> 6) & 14) | 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            aVar6 = aVar3;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar5, aVar6, i10) { // from class: t8.q1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28410b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f28411c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.p(this.f28409a, this.f28410b, this.f28411c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void q(final eh.a<pg.f0> aVar, final eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-883969844);
        int i11 = i10 | (kVarP.l(aVar) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(51727753);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new g1();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(2050831748, new e(lVar, n1Var), kVarP), null, f1.c.b(-1297097662, new f(aVar), kVarP), c4.f28157i, c4.f28158j, f1.c.b(123459167, new g(n1Var), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, (i11 & 14) | 1797168, 0, 16260);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(lVar, i10) { // from class: t8.h1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f28232b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.q(this.f28231a, this.f28232b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void r(final y3 y3Var, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        String strD;
        boolean z10;
        x0.k kVarP = jVar.p(1882819774);
        int i11 = (kVarP.l(y3Var) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(-251967021);
            if (y3Var.f28600t != null) {
                t0.x0.d(aVar, null, !y3Var.f28601u, null, null, androidx.compose.foundation.layout.f.c(6, CropImageView.DEFAULT_ASPECT_RATIO, 2), f1.c.b(-290797958, new h(y3Var), kVarP), kVarP, ((i11 >> 3) & 14) | 817889280, 378);
            }
            kVarP.T(false);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            p1.d.b(new LayoutWeightElement(1.0f, true), kVarP);
            Integer num = y3Var.f28591k;
            kVarP.L(-251945775);
            if (num == null) {
                z10 = true;
            } else {
                int iIntValue = num.intValue();
                if (y3Var.f28592l && iIntValue == 0) {
                    kVarP.L(-952532267);
                    strD = f3.q.c(R.string.ai_session_free, kVarP);
                    kVarP.T(false);
                } else {
                    kVarP.L(-952530266);
                    strD = f3.q.d(R.string.ai_session_credits_used, new Object[]{Integer.valueOf(iIntValue)}, kVarP);
                    kVarP.T(false);
                }
                z10 = true;
                ff.b(strD, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26551n, kVarP, 0, 0, 65530);
            }
            kVarP.T(false);
            kVarP.T(z10);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: t8.x0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    v2.r(y3Var, aVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final String str, final boolean z10, final Integer num, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        int i11;
        eh.a<pg.f0> aVar2;
        Object obj;
        x0.l1 l1Var;
        x0.l1 l1Var2;
        boolean zK;
        Object objG;
        int i12;
        x0.n1 n1Var;
        d.a aVar3;
        long j10;
        boolean z11;
        boolean z12;
        String strD;
        x0.k kVarP = jVar.p(1105212670);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(num) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            aVar2 = aVar;
            i11 |= kVarP.l(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(-1270312577);
            Object objG2 = kVarP.g();
            Object obj2 = j.a.f31715a;
            if (objG2 == obj2) {
                objG2 = new u1();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            final x0.n1 n1Var2 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            boolean z13 = z10 || ((Boolean) n1Var2.getValue()).booleanValue();
            kVarP.L(-1270310169);
            Object objG3 = kVarP.g();
            if (objG3 == obj2) {
                objG3 = new x0.v1(0);
                kVarP.C(objG3);
            }
            x0.l1 l1Var3 = (x0.l1) objG3;
            kVarP.T(false);
            Boolean boolValueOf = Boolean.valueOf(z10);
            kVarP.L(-1270307778);
            boolean z14 = ((i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | ((i11 & 112) == 32) | ((i11 & 14) == 4);
            Object objG4 = kVarP.g();
            if (z14 || objG4 == obj2) {
                obj = obj2;
                Object iVar = new i(z10, str, aVar2, l1Var3, null);
                l1Var = l1Var3;
                kVarP.C(iVar);
                objG4 = iVar;
            } else {
                obj = obj2;
                l1Var = l1Var3;
            }
            kVarP.T(false);
            x0.o0.e(str, boolValueOf, (eh.p) objG4, kVarP);
            long j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar4 = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar4, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar5);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                l1Var2 = l1Var;
            } else {
                l1Var2 = l1Var;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                boolean z15 = !z10;
                kVarP.L(147720661);
                zK = kVarP.K(n1Var2);
                objG = kVarP.g();
                if (!zK || objG == obj) {
                    objG = new eh.a() { // from class: t8.u0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var2.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(aVar4, z15, null, null, (eh.a) objG, 6), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar5);
                }
                ph.v1.j(bVar, m1VarA, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                kVarP.L(-883245363);
                if (z10) {
                    n1Var = n1Var2;
                    aVar3 = aVar4;
                    j10 = j11;
                    z11 = 1;
                    z12 = false;
                } else {
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar4, 14);
                    n1Var = n1Var2;
                    aVar3 = aVar4;
                    j10 = j11;
                    z12 = false;
                    z11 = 1;
                    z9.a(2, 0, 390, 24, j10, 0L, dVarN, kVarP);
                    kVarP = kVarP;
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar3, 8), kVarP);
                }
                kVarP.T(z12);
                if (z10) {
                    kVarP.L(-883236613);
                    strD = f3.q.d(R.string.ai_thinking_done, new Object[]{Integer.valueOf(num != null ? num.intValue() : z11)}, kVarP);
                    kVarP.T(z12);
                } else {
                    kVarP.L(-883238643);
                    strD = f3.q.c(R.string.ai_thinking_live, kVarP);
                    kVarP.T(z12);
                }
                long j12 = j10;
                x0.k kVar = kVarP;
                ff.b(strD, null, j12, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26550m, kVar, 0, 0, 65530);
                long j13 = j12;
                x0.k kVar2 = kVar;
                kVar2.L(-883230815);
                x0.k kVar3 = kVar2;
                if (!z10) {
                    t4.b(((Boolean) n1Var.getValue()).booleanValue() ? p0.p3.a() : p0.q3.a(), null, androidx.compose.foundation.layout.g.n(aVar3, 18), j13, kVar2, 432, 0);
                    kVar3 = kVar2;
                    j13 = j13;
                }
                kVar3.T(z12);
                kVar3.T(z11);
                x0.k kVar4 = kVar3;
                androidx.compose.animation.d.b(z.s.f34624a, z13, null, r.w0.b(null, 15).b(r.w0.c(null, 3)), r.w0.g(null, 15).b(r.w0.d(null, 3)), null, f1.c.b(-1707804212, new j(z10, str, l1Var2, j13), kVar3), kVar4, 1600518, 18);
                kVarP = kVar4;
                kVarP.T(z11);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            boolean z152 = !z10;
            kVarP.L(147720661);
            zK = kVarP.K(n1Var2);
            objG = kVarP.g();
            if (!zK) {
                objG = new eh.a() { // from class: t8.u0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var2.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
                kVarP.T(false);
                androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(aVar4, z152, null, null, (eh.a) objG, 6), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
                z.m1 m1VarA2 = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                i12 = kVarP.P;
                x0.a2 a2VarP22 = kVarP.P();
                androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarJ2, kVarP);
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(bVar, m1VarA2, kVarP);
                ph.v1.j(dVar, a2VarP22, kVarP);
                if (!kVarP.O) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                    ph.v1.j(cVar2, dVarC22, kVarP);
                    kVarP.L(-883245363);
                    if (z10) {
                    }
                    kVarP.T(z12);
                    if (z10) {
                    }
                    long j122 = j10;
                    x0.k kVar5 = kVarP;
                    ff.b(strD, null, j122, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26550m, kVar5, 0, 0, 65530);
                    long j132 = j122;
                    x0.k kVar22 = kVar5;
                    kVar22.L(-883230815);
                    x0.k kVar32 = kVar22;
                    if (!z10) {
                    }
                    kVar32.T(z12);
                    kVar32.T(z11);
                    x0.k kVar42 = kVar32;
                    androidx.compose.animation.d.b(z.s.f34624a, z13, null, r.w0.b(null, 15).b(r.w0.c(null, 3)), r.w0.g(null, 15).b(r.w0.d(null, 3)), null, f1.c.b(-1707804212, new j(z10, str, l1Var2, j132), kVar32), kVar42, 1600518, 18);
                    kVarP = kVar42;
                    kVarP.T(z11);
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: t8.v0
                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    v2.s(str, z10, num, aVar, (x0.j) obj3, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void t(final String str, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1194281087);
        if ((((kVarP.K(str) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34445b, d.a.f14611j, kVarP, 6);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            float f10 = 18;
            md.a(androidx.compose.foundation.layout.g.s(aVar, CropImageView.DEFAULT_ASPECT_RATIO, DilithiumEngine.DilithiumPolyT1PackedBytes, 1), h0.f.b(f10, f10, 4, f10), q1.b1.c(0.16f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(1419146784, new k(str), kVarP), kVarP, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, i10) { // from class: t8.l1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f28281a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v2.t(this.f28281a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
