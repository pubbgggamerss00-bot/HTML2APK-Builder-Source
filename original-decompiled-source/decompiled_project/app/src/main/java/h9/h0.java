package h9;

import android.content.Context;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import f9.b7;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.mf;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;

/* loaded from: classes.dex */
public final class h0 {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f12632a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f12633b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w1.d f12634c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f12635d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String[] strArr, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, w1.d dVar, String str) {
            this.f12632a = strArr;
            this.f12633b = pVar;
            this.f12634c = dVar;
            this.f12635d = str;
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
                z.q qVarA = z.o.a(z.b.h(10), d.a.f14614m, jVar2, 6);
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
                float f10 = 12;
                z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
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
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                x0.s3 s3Var = t0.f2.f25858a;
                t4.b(this.f12634c, null, androidx.compose.foundation.layout.g.n(aVar, 26), ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 432, 0);
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26544g;
                d.a aVar3 = aVar;
                ff.b(this.f12635d, null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                x0.j jVar3 = jVar2;
                jVar3.H();
                jVar3.L(754538669);
                String[] strArr = this.f12632a;
                int length = strArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    String[] strArr2 = strArr;
                    String str = strArr2[i11];
                    z.m1 m1VarA2 = z.k1.a(z.b.h(f10), d.a.f14611j, jVar3, 6);
                    int iD3 = jVar3.D();
                    x0.a2 a2VarY3 = jVar3.y();
                    d.a aVar4 = aVar3;
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar4, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar5 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar5);
                    } else {
                        jVar3.z();
                    }
                    ph.v1.j(g.a.f13867f, m1VarA2, jVar3);
                    ph.v1.j(g.a.f13866e, a2VarY3, jVar3);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                        l9.i.a(iD3, jVar3, iD3, c0128a2);
                    }
                    ph.v1.j(g.a.f13865d, dVarC3, jVar3);
                    aVar3 = aVar4;
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar3, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 6);
                    x0.s3 s3Var2 = t0.f2.f25858a;
                    z.g.a(androidx.compose.foundation.a.b(dVarN, ((t0.e2) jVar3.f(s3Var2)).f25751a, h0.f.f12083a), jVar3, i10);
                    x0.j jVar4 = jVar3;
                    ff.b(str, null, ((t0.e2) jVar3.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26548k, jVar4, 0, 0, 65530);
                    jVar3 = jVar4;
                    jVar3.H();
                    i11++;
                    strArr = strArr2;
                    length = length;
                    i10 = i10;
                }
                int i12 = i10;
                jVar3.B();
                jVar3.L(754558259);
                eh.p<x0.j, Integer, pg.f0> pVar = this.f12633b;
                if (pVar != null) {
                    pVar.invoke(jVar3, Integer.valueOf(i12));
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                jVar3.B();
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.x f12636a;

        public b(p5.x xVar) {
            this.f12636a = xVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVar = h9.b.f12519a;
                f1.b bVarB = f1.c.b(-1796757929, new i0(this.f12636a), jVar2);
                float f10 = mf.f26477a;
                t0.g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f12637a;

        public c(Context context) {
            this.f12637a = context;
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
                p9.d.a(padding.c(), f1.c.b(190200115, new l0(padding, this.f12637a), jVar2), jVar2, 48);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.d dVar, final String str, final String[] strArr, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, x0.j jVar, final int i10, final int i11) {
        final eh.p<? super x0.j, ? super Integer, pg.f0> pVar2;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1774611029);
        int i12 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16) | (kVarP.l(strArr) ? 256 : 128);
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 3072) == 0) {
                pVar2 = pVar;
                i12 |= kVarP.l(pVar2) ? 2048 : 1024;
            }
            if ((i12 & 1171) == 1170 || !kVarP.s()) {
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar3 = i13 == 0 ? null : pVar2;
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), kVarP, 0), null, null, f1.c.b(-1938682083, new a(strArr, pVar3, dVar, str), kVarP), kVarP, 196614, 24);
                pVar2 = pVar3;
            } else {
                kVarP.v();
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: h9.g0
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h0.a(dVar, str, strArr, pVar2, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i12 |= 3072;
        pVar2 = pVar;
        if ((i12 & 1171) == 1170) {
            if (i13 == 0) {
            }
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), kVarP, 0), null, null, f1.c.b(-1938682083, new a(strArr, pVar3, dVar, str), kVarP), kVarP, 196614, 24);
            pVar2 = pVar3;
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(p5.x navController, x0.j jVar, int i10) {
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1138800555);
        if ((((kVarP.l(navController) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            ra.a(null, f1.c.b(1587510545, new b(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-961627546, new c((Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b)), kVarP), kVarP, 806879280, 189);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b7(navController, i10, 1);
        }
    }
}
