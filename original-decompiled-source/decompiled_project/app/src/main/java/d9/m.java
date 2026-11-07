package d9;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.w0;
import c2.n0;
import c9.u1;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.j;
import g2.l0;
import g8.s;
import h9.v3;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import p0.y7;
import pg.f0;
import ph.v1;
import q1.b1;
import q1.y1;
import q8.n2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.m0;
import t0.md;
import t0.nf;
import t0.of;
import t0.t4;
import t0.x0;
import t0.z9;
import x0.a2;
import x0.h2;
import x0.j;
import x0.n1;
import x0.o0;
import x0.s3;
import z.b;
import z.g1;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final h0.e f7624a = h0.f.a(20);

    /* renamed from: b, reason: collision with root package name */
    public static final long f7625b = n0.c(4280490496L);

    public static final class a implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<f0> f7626a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g8.d f7627b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7628c;

        public a(eh.a<f0> aVar, g8.d dVar, int i10) {
            this.f7626a = aVar;
            this.f7627b = dVar;
            this.f7628c = i10;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            s3 s3Var;
            long j10;
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                float f10 = 16;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, m1VarA, jVar3);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar3);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 48);
                long j11 = k9.d.f16192n;
                float f11 = 14;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, b1.c(0.15f, j11), h0.f.a(f11));
                l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar, l0VarD, jVar3);
                v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar3);
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, 26), j11, jVar3, 432, 0);
                jVar3.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar3);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
                int iD3 = jVar3.D();
                a2 a2VarY3 = jVar3.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar, qVarA, jVar3);
                v1.j(dVar, a2VarY3, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar3, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar3);
                String strC = f3.q.c(R.string.profile_credits, jVar3);
                s3 s3Var2 = of.f26647a;
                t2.l0 l0Var = ((nf) jVar3.f(s3Var2)).f26551n;
                s3 s3Var3 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar3.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar3, 0, 0, 65530);
                g8.d dVar2 = this.f7627b;
                if (dVar2 == null) {
                    jVar3.L(-369417200);
                    z9.a(2, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20), jVar3);
                    jVar3.B();
                    jVar2 = jVar3;
                } else {
                    long j12 = dVar2.f11561a;
                    jVar3.L(-369265517);
                    String strValueOf = String.valueOf(j12);
                    t2.l0 l0Var2 = ((nf) jVar3.f(s3Var2)).f26543f;
                    x2.p pVar = x2.p.f32033f;
                    if (j12 < 0) {
                        jVar3.L(2066306680);
                        s3Var = s3Var3;
                        j10 = ((e2) jVar3.f(s3Var)).f25777w;
                    } else {
                        s3Var = s3Var3;
                        jVar3.L(2066307868);
                        j10 = ((e2) jVar3.f(s3Var)).f25771q;
                    }
                    jVar3.B();
                    s3 s3Var4 = s3Var;
                    ff.b(strValueOf, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar3, 196608, 0, 65498);
                    int i10 = this.f7628c;
                    if (i10 < 1) {
                        i10 = 1;
                    }
                    long j13 = j12 / i10;
                    if (j13 < 0) {
                        j13 = 0;
                    }
                    int i11 = (int) j13;
                    jVar2 = jVar3;
                    ff.b(f3.q.a(R.plurals.profile_credits_apps, i11, new Object[]{Integer.valueOf(i11)}, jVar3), null, ((e2) jVar3.f(s3Var4)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var2)).f26549l, jVar2, 0, 0, 65530);
                    jVar2.B();
                }
                jVar2.H();
                h0.e eVarA = h0.f.a(f11);
                g1 g1Var = m0.f26400a;
                x0.a(this.f7626a, null, false, eVarA, m0.a(j11, m.f7625b, 0L, jVar2, 12), null, null, null, d9.a.f7583e, jVar2, 805306368, 486);
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f7629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f7631c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<f0> f7632d;

        public b(w1.d dVar, String str, String str2, eh.a<f0> aVar) {
            this.f7629a = dVar;
            this.f7630b = str;
            this.f7631c = str2;
            this.f7632d = aVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                m.d(this.f7629a, this.f7630b, this.f7631c, 0L, this.f7632d, jVar2, 0, 8);
            }
            return f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s.a f7633a;

        public c(s.a aVar) {
            this.f7633a = aVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2;
            x0.j jVar3 = jVar;
            if ((num.intValue() & 3) == 2 && jVar3.s()) {
                jVar3.v();
            } else {
                float f10 = 16;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, m1VarA, jVar3);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar3);
                s.a aVar3 = this.f7633a;
                String str = aVar3.f11627d;
                String str2 = aVar3.f11626c;
                String str3 = aVar3.f11625b;
                m.a(str, str3 == null ? str2 : str3, jVar3, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar3);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar, qVarA, jVar3);
                v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar3);
                jVar3.L(-1262986113);
                String strC = str3 == null ? f3.q.c(R.string.profile_signed_in, jVar3) : str3;
                jVar3.B();
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar3.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar3.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar3, 196608, 3120, 55258);
                jVar3.L(-1262973769);
                if (str2 == null) {
                    jVar2 = jVar3;
                } else {
                    jVar2 = jVar3;
                    ff.b(str2, null, ((e2) jVar3.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nf) jVar3.f(s3Var)).f26549l, jVar2, 0, 3120, 55290);
                }
                jVar2.B();
                jVar2.H();
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7634a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<f0> f7635b;

        public d(eh.a aVar, boolean z10) {
            this.f7634a = z10;
            this.f7635b = aVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
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
                b.j jVar3 = z.b.f34444a;
                f.b bVar2 = d.a.f14612k;
                m1 m1VarA = k1.a(jVar3, bVar2, jVar2, 48);
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
                m.a(null, null, jVar2, 54);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
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
                v1.j(bVar, qVarA2, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar2);
                String strC = f3.q.c(R.string.profile_sign_in_title, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(strC, null, ((e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar2);
                m1 m1VarA2 = k1.a(z.b.h(4), bVar2, jVar2, 54);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar, jVar2);
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
                v1.j(bVar, m1VarA2, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar2);
                float f11 = 14;
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar, f11), k9.d.f16192n, jVar2, 432, 0);
                ff.b(f3.q.c(R.string.profile_sign_in_desc, jVar2), null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.H();
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
                boolean z10 = this.f7634a;
                x0.b(this.f7635b, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 48), !z10, h0.f.a(f11), null, null, null, f1.c.b(2143011731, new c0(z10), jVar2), jVar2, 805306416, 496);
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    public static final void a(final String str, final String str2, x0.j jVar, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        String string;
        x0.k kVarP = jVar.p(219172588);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(str2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 56;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, f10);
            h0.e eVar = h0.f.f12083a;
            androidx.compose.ui.d dVarD = e1.d.d(dVarN, eVar);
            s3 s3Var = f2.f25858a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, b1.c(0.15f, ((e2) kVarP.f(s3Var)).f25751a), y1.f21750a);
            l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, l0VarD, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            Character chValueOf = null;
            if (str2 != null && (string = mh.x.W(str2).toString()) != null) {
                Character chValueOf2 = string.length() == 0 ? null : Character.valueOf(string.charAt(0));
                if (chValueOf2 != null) {
                    chValueOf = Character.valueOf(Character.toUpperCase(chValueOf2.charValue()));
                }
            }
            if (chValueOf != null) {
                kVarP.L(666754210);
                z10 = false;
                ff.b(chValueOf.toString(), null, ((e2) kVarP.f(s3Var)).f25751a, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26544g, kVarP, 196608, 0, 65498);
                kVarP = kVarP;
                kVarP.T(false);
            } else {
                z10 = false;
                kVarP.L(666999358);
                t4.b(y7.a(), null, androidx.compose.foundation.layout.g.n(aVar, 30), ((e2) kVarP.f(s3Var)).f25751a, kVarP, 432, 0);
                kVarP.T(false);
            }
            kVarP.L(-255570508);
            if (str != null) {
                z11 = z10;
                h7.r.a(str, null, e1.d.d(androidx.compose.foundation.layout.g.n(aVar, f10), eVar), j.a.f11397a, kVarP, (i11 & 14) | 1572912);
            } else {
                z11 = z10;
            }
            kVarP.T(z11);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: d9.c
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    m.a(str, str2, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void b(final g8.d dVar, final int i10, final eh.a<f0> aVar, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(125960152);
        if ((((kVarP.K(dVar) ? 4 : 2) | i11 | (kVarP.i(i10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f7624a, h(kVarP), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1696571939, new a(aVar, dVar, i10), kVarP), kVarP, 12582966, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar, i11) { // from class: d9.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f7611b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f7612c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.b(this.f7610a, this.f7611b, this.f7612c, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void c(final w1.d dVar, final String str, final String str2, final eh.a<f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-202527998);
        if (((i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024)) & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f7624a, h(kVarP), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1693667001, new b(dVar, str, str2, aVar), kVarP), kVarP, 12582966, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, aVar, i10) { // from class: d9.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f7621b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f7622c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f7623d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.c(this.f7620a, this.f7621b, this.f7622c, this.f7623d, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final w1.d dVar, final String str, final String str2, long j10, final eh.a<f0> aVar, x0.j jVar, final int i10, final int i11) {
        final long j11;
        int i12;
        int i13;
        g.a.C0128a c0128a;
        int i14;
        int i15;
        s3 s3Var;
        boolean z10;
        h2 h2VarV;
        x0.k kVarP = jVar.p(782075796);
        int i16 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i16 |= kVarP.K(str2) ? 256 : 128;
        }
        if ((i11 & 8) == 0) {
            j11 = j10;
            int i17 = kVarP.j(j11) ? 2048 : 1024;
            i12 = i16 | i17 | (!kVarP.l(aVar) ? 16384 : 8192);
            if ((i12 & 9363) == 9362 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    if ((i11 & 8) != 0) {
                        j11 = ((e2) kVarP.f(f2.f25858a)).f25751a;
                        i12 &= -7169;
                    }
                    kVarP.U();
                    d.a aVar2 = d.a.f1143b;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, aVar, 7), 20, 14);
                    m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                    i13 = kVarP.P;
                    a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.w(aVar3);
                    } else {
                        kVarP.z();
                    }
                    g.a.b bVar = g.a.f13867f;
                    v1.j(bVar, m1VarA, kVarP);
                    g.a.d dVar2 = g.a.f13866e;
                    v1.j(dVar2, a2VarP, kVarP);
                    c0128a = g.a.f13868g;
                    if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                    }
                    g.a.c cVar = g.a.f13865d;
                    v1.j(cVar, dVarC, kVarP);
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar2, 40), b1.c(0.12f, j11), h0.f.a(12));
                    l0 l0VarD = z.g.d(d.a.f14606e, false);
                    i14 = kVarP.P;
                    a2 a2VarP2 = kVarP.P();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar3);
                    }
                    v1.j(bVar, l0VarD, kVarP);
                    v1.j(dVar2, a2VarP2, kVarP);
                    if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                    }
                    v1.j(cVar, dVarC2, kVarP);
                    long j12 = j11;
                    t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar2, 22), j12, kVarP, (i12 & 14) | 432 | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE), 0);
                    kVarP.T(true);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 16), kVarP);
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                    i15 = kVarP.P;
                    a2 a2VarP3 = kVarP.P();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar3);
                    }
                    v1.j(bVar, qVarA, kVarP);
                    v1.j(dVar2, a2VarP3, kVarP);
                    if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                    }
                    v1.j(cVar, dVarC3, kVarP);
                    s3 s3Var2 = of.f26647a;
                    t2.l0 l0Var = ((nf) kVarP.f(s3Var2)).f26547j;
                    s3 s3Var3 = f2.f25858a;
                    ff.b(str, null, ((e2) kVarP.f(s3Var3)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, (i12 >> 3) & 14, 0, 65530);
                    kVarP = kVarP;
                    kVarP.L(1420081246);
                    if (str2 != null) {
                        s3Var = s3Var3;
                        z10 = false;
                    } else {
                        s3Var = s3Var3;
                        ff.b(str2, null, ((e2) kVarP.f(s3Var3)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var2)).f26549l, kVarP, 0, 0, 65530);
                        kVarP = kVarP;
                        f0 f0Var = f0.f21461a;
                        z10 = false;
                    }
                    kVarP.T(z10);
                    kVarP.T(true);
                    t4.b(n0.e.a(), null, null, ((e2) kVarP.f(s3Var)).f25773s, kVarP, 48, 4);
                    kVarP.T(true);
                    j11 = j12;
                } else {
                    kVarP.v();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    kVarP.U();
                    d.a aVar22 = d.a.f1143b;
                    androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar22, 1.0f), false, null, null, aVar, 7), 20, 14);
                    m1 m1VarA2 = k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                    i13 = kVarP.P;
                    a2 a2VarP4 = kVarP.P();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarI2, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar32 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                    }
                    g.a.b bVar2 = g.a.f13867f;
                    v1.j(bVar2, m1VarA2, kVarP);
                    g.a.d dVar22 = g.a.f13866e;
                    v1.j(dVar22, a2VarP4, kVarP);
                    c0128a = g.a.f13868g;
                    if (kVarP.O) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                        g.a.c cVar2 = g.a.f13865d;
                        v1.j(cVar2, dVarC4, kVarP);
                        androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar22, 40), b1.c(0.12f, j11), h0.f.a(12));
                        l0 l0VarD2 = z.g.d(d.a.f14606e, false);
                        i14 = kVarP.P;
                        a2 a2VarP22 = kVarP.P();
                        androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarB2, kVarP);
                        kVarP.r();
                        if (kVarP.O) {
                        }
                        v1.j(bVar2, l0VarD2, kVarP);
                        v1.j(dVar22, a2VarP22, kVarP);
                        if (!kVarP.O) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                            v1.j(cVar2, dVarC22, kVarP);
                            long j122 = j11;
                            t4.b(dVar, null, androidx.compose.foundation.layout.g.n(aVar22, 22), j122, kVarP, (i12 & 14) | 432 | (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE), 0);
                            kVarP.T(true);
                            p1.d.b(androidx.compose.foundation.layout.g.r(aVar22, 16), kVarP);
                            if (1.0f <= 0.0d) {
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                            z.q qVarA2 = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                            i15 = kVarP.P;
                            a2 a2VarP32 = kVarP.P();
                            androidx.compose.ui.d dVarC32 = androidx.compose.ui.c.c(layoutWeightElement2, kVarP);
                            kVarP.r();
                            if (kVarP.O) {
                            }
                            v1.j(bVar2, qVarA2, kVarP);
                            v1.j(dVar22, a2VarP32, kVarP);
                            if (!kVarP.O) {
                                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
                                v1.j(cVar2, dVarC32, kVarP);
                                s3 s3Var22 = of.f26647a;
                                t2.l0 l0Var2 = ((nf) kVarP.f(s3Var22)).f26547j;
                                s3 s3Var32 = f2.f25858a;
                                ff.b(str, null, ((e2) kVarP.f(s3Var32)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, kVarP, (i12 >> 3) & 14, 0, 65530);
                                kVarP = kVarP;
                                kVarP.L(1420081246);
                                if (str2 != null) {
                                }
                                kVarP.T(z10);
                                kVarP.T(true);
                                t4.b(n0.e.a(), null, null, ((e2) kVarP.f(s3Var)).f25773s, kVarP, 48, 4);
                                kVarP.T(true);
                                j11 = j122;
                            }
                        }
                    }
                }
            } else {
                kVarP.v();
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: d9.k
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m.d(dVar, str, str2, j11, aVar, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        j11 = j10;
        i12 = i16 | i17 | (!kVarP.l(aVar) ? 16384 : 8192);
        if ((i12 & 9363) == 9362) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if ((i11 & 8) != 0) {
                }
                kVarP.U();
                d.a aVar222 = d.a.f1143b;
                androidx.compose.ui.d dVarI22 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar222, 1.0f), false, null, null, aVar, 7), 20, 14);
                m1 m1VarA22 = k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                i13 = kVarP.P;
                a2 a2VarP42 = kVarP.P();
                androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarI22, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar322 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                }
                g.a.b bVar22 = g.a.f13867f;
                v1.j(bVar22, m1VarA22, kVarP);
                g.a.d dVar222 = g.a.f13866e;
                v1.j(dVar222, a2VarP42, kVarP);
                c0128a = g.a.f13868g;
                if (kVarP.O) {
                }
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(p5.x xVar, float f10, g8.u uVar, x0.j jVar, final int i10) throws Resources.NotFoundException {
        int i11;
        g8.u uVar2;
        boolean z10;
        final float f11;
        final g8.u uVar3;
        final p5.x navController = xVar;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(1453138986);
        int i12 = (kVarP.l(navController) ? 4 : 2) | i10 | (kVarP.h(f10) ? 32 : 16) | 128;
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            uVar3 = uVar;
            f11 = f10;
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
                w0 w0VarB = k5.c.b(g8.u.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                i11 = i12 & (-897);
                uVar2 = (g8.u) w0VarB;
            } else {
                kVarP.v();
                i11 = i12 & (-897);
                uVar2 = uVar;
            }
            kVarP.U();
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            n1 n1VarB = bg.b.b(uVar2.f11634c, kVarP);
            n1 n1VarB2 = bg.b.b(uVar2.f11635d, kVarP);
            n1 n1VarB3 = bg.b.b(uVar2.f11636e, kVarP);
            n1 n1VarB4 = bg.b.b(uVar2.f11638g, kVarP);
            boolean zBooleanValue = ((Boolean) n1VarB4.getValue()).booleanValue();
            kVarP.L(1221449158);
            boolean zL = kVarP.l(context) | kVarP.l(uVar2);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new d9.b(0, context, uVar2);
                kVarP.C(objG);
            }
            kVarP.T(false);
            eh.a aVarD = n2.d(zBooleanValue, (eh.l) objG, kVarP);
            n1 n1VarB5 = bg.b.b(uVar2.f11640i, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(1221455642);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new d9.d(0);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            n1 n1Var = (n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            f0 f0Var = f0.f21461a;
            kVarP.L(1221458408);
            boolean zL2 = kVarP.l(uVar2);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                z10 = false;
                objG3 = new e(uVar2, 0 == true ? 1 : 0);
                kVarP.C(objG3);
            } else {
                z10 = false;
            }
            kVarP.T(z10);
            h5.g.a(f0Var, null, (eh.l) objG3, kVarP, 6);
            Integer num = (Integer) n1VarB5.getValue();
            kVarP.L(1221461719);
            boolean zK = kVarP.K(n1VarB5) | kVarP.l(context) | kVarP.l(uVar2);
            Object objG4 = kVarP.g();
            if (zK || objG4 == c0321a) {
                objG4 = new n(n1VarB5, context, uVar2, null);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            o0.d((eh.p) objG4, num, kVarP);
            g8.u uVar4 = uVar2;
            f11 = f10;
            navController = xVar;
            v3.d(navController, null, null, f11, R.string.nav_profile, f1.c.b(-1744150341, new q(xVar, aVarD, n1VarB, n1VarB2, n1VarB3, n1VarB4), kVarP), f1.c.b(-795660612, new u(uVar4, n1VarB, n1Var), kVarP), kVarP, (i11 & 14) | 1769472 | ((i11 << 6) & V4Signature.MAX_SIGNING_INFOS_SIZE));
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(1221551045);
                boolean zK2 = kVarP.K(n1VarB4) | kVarP.K(n1Var);
                Object objG5 = kVarP.g();
                if (zK2 || objG5 == c0321a) {
                    objG5 = new f(0, n1VarB4, n1Var);
                    kVarP.C(objG5);
                }
                kVarP.T(false);
                uVar3 = uVar4;
                t0.r.a((eh.a) objG5, f1.c.b(-1809541891, new y(uVar4, n1Var, n1VarB4), kVarP), null, f1.c.b(84791995, new a0(n1Var, n1VarB4), kVarP), d9.a.f7580b, d9.a.f7581c, d9.a.f7582d, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1797168, 0, 16260);
                kVarP = kVarP;
            } else {
                uVar3 = uVar4;
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(f11, uVar3, i10) { // from class: d9.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f7605b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g8.u f7606c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.e(this.f7604a, this.f7605b, this.f7606c, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void f(final s.a aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(643473116);
        if ((((kVarP.K(aVar) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f7624a, h(kVarP), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(1274682465, new c(aVar), kVarP), kVarP, 12582966, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: d9.h
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.f(this.f7607a, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void g(final boolean z10, final eh.a<f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-420040570);
        if ((((kVarP.c(z10) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f7624a, h(kVarP), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-672216117, new d(aVar, z10), kVarP), kVarP, 12582966, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar, i10) { // from class: d9.i

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f7608a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f7609b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    m.g(this.f7608a, this.f7609b, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final long h(x0.j jVar) {
        jVar.L(1931710769);
        long jC = b1.c(0.85f, ((e2) jVar.f(f2.f25858a)).I);
        jVar.B();
        return jC;
    }
}
