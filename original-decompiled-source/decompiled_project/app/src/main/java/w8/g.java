package w8;

import android.content.Context;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import eh.q;
import i2.e0;
import i2.g;
import j1.d;
import kotlin.jvm.internal.r;
import l9.i;
import p5.x;
import pg.f0;
import ph.v1;
import q1.b1;
import t0.d1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.g0;
import t0.mf;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import t0.z0;
import t2.l0;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.n1;
import x0.s3;
import z.f1;
import z.k1;
import z.m1;
import z.o;
import z.z;

/* loaded from: classes.dex */
public final class g {

    public static final class a implements p<j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f31449a;

        public a(x xVar) {
            this.f31449a = xVar;
        }

        @Override // eh.p
        public final f0 invoke(j jVar, Integer num) {
            j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVar = w8.a.f31428a;
                f1.b bVarB = f1.c.b(271995295, new f(this.f31449a), jVar2);
                float f10 = mf.f26477a;
                g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
            }
            return f0.f21461a;
        }
    }

    public static final class b implements q<f1, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31450a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f31451b;

        public b(Context context, n1<Boolean> n1Var) {
            this.f31450a = context;
            this.f31451b = n1Var;
        }

        @Override // eh.q
        public final f0 b(f1 f1Var, j jVar, Integer num) {
            f1 padding = f1Var;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            r.e(padding, "padding");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(padding) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                p9.d.a(padding.c(), f1.c.b(971778883, new h(padding, this.f31450a, this.f31451b), jVar2), jVar2, 48);
            }
            return f0.f21461a;
        }
    }

    public static final class c implements q<z.r, j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f31452a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31453b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31454c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f31455d;

        public c(w1.d dVar, String str, String str2, String str3) {
            this.f31452a = dVar;
            this.f31453b = str;
            this.f31454c = str2;
            this.f31455d = str3;
        }

        @Override // eh.q
        public final f0 b(z.r rVar, j jVar, Integer num) {
            z.r Card = rVar;
            j jVar2 = jVar;
            int iIntValue = num.intValue();
            r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 20);
                m1 m1VarA = k1.a(z.b.h(16), d.a.f14611j, jVar2, 54);
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
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                    i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                s3 s3Var = f2.f25858a;
                t4.b(this.f31452a, null, androidx.compose.foundation.layout.g.n(aVar, 28), ((e2) jVar2.f(s3Var)).f25751a, jVar2, 432, 0);
                z.q qVarA = o.a(z.b.h(4), d.a.f14614m, jVar2, 6);
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
                v1.j(bVar, qVarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                String strD = f3.q.d(R.string.free_premium_step_label, new Object[]{this.f31453b}, jVar2);
                s3 s3Var2 = of.f26647a;
                ff.b(strD, null, ((e2) jVar2.f(s3Var)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26551n, jVar2, 0, 0, 65530);
                l0 l0Var = ((nf) jVar2.f(s3Var2)).f26545h;
                ff.b(this.f31454c, null, ((e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                ff.b(this.f31455d, null, ((e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var2)).f26548k, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final x navController, j jVar, final int i10) {
        r.e(navController, "navController");
        k kVarP = jVar.p(1063433185);
        if ((((kVarP.l(navController) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(-17512889);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            n1 n1Var = (n1) objG;
            kVarP.T(false);
            ra.a(null, f1.c.b(-1793921115, new a(navController), kVarP), null, null, null, 0, b1.f21653g, 0L, new z(), f1.c.b(-730808912, new b(context, n1Var), kVarP), kVarP, 806879280, 189);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(-17356064);
                Object objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = new androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.a(n1Var, 2);
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                j3.j.a((eh.a) objG2, null, w8.a.f31434g, kVarP, 390, 2);
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p(i10) { // from class: w8.d
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    g.a(this.f31443a, (j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void b(final w1.d dVar, final String str, final String str2, final String str3, j jVar, final int i10) {
        k kVarP = jVar.p(-1111531202);
        if ((((kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str2) ? 256 : 128) | (kVarP.K(str3) ? 2048 : 1024)) & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), z0.a(b1.c(0.85f, ((e2) kVarP.f(f2.f25858a)).I), kVarP, 0), null, null, f1.c.b(-352164944, new c(dVar, str, str2, str3), kVarP), kVarP, 196614, 24);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p(str, str2, str3, i10) { // from class: w8.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f31445b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f31446c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f31447d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    g.b(this.f31444a, this.f31445b, this.f31446c, this.f31447d, (j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }
}
