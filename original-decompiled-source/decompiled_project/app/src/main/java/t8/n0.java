package t8;

import android.text.format.DateUtils;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.fb;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.ra;
import t0.s4;
import t0.t4;
import x0.j;

/* loaded from: classes.dex */
public final class n0 {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28346a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f28347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f28348c;

        public a(eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, x xVar) {
            this.f28346a = aVar;
            this.f28347b = aVar2;
            this.f28348c = xVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                eh.a<pg.f0> aVar = this.f28346a;
                d.a aVar2 = d.a.f1143b;
                float f10 = 12;
                androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.b.c(aVar2, false, null, null, aVar, 7), 16, f10, 4, f10);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarK, jVar2);
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
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar2, 40);
                long j10 = k9.d.f16192n;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.15f, j10), h0.f.a(f10));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                t4.b(p0.y.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 20), j10, jVar2, 432, 0);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 14), jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
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
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                x xVar = this.f28348c;
                String str = xVar.f28558b;
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26547j;
                x0.s3 s3Var2 = t0.f2.f25858a;
                ff.b(str, null, ((t0.e2) jVar2.f(s3Var2)).f25771q, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, l0Var, jVar2, 0, 3120, 55290);
                CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(xVar.f28559c);
                int i10 = xVar.f28560d;
                ff.b(((Object) relativeTimeSpanString) + " · " + f3.q.a(R.plurals.ai_history_turns, i10, new Object[]{Integer.valueOf(i10)}, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                s4.c(this.f28347b, null, false, null, b4.f28128j, jVar2, 196608, 30);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final p5.x navController, q0 q0Var, x0.j jVar, final int i10) {
        final q0 q0Var2;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1248050062);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            q0Var2 = q0Var;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(q0.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                q0Var2 = (q0) w0VarB;
            } else {
                kVarP.v();
                q0Var2 = q0Var;
            }
            kVarP.U();
            x0.n1 n1VarB = bg.b.b(q0Var2.f28406e, kVarP);
            x0.n1 n1VarB2 = bg.b.b(q0Var2.f28408g, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(-1270520646);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new y();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            ra.a(null, f1.c.b(-1757831882, new d0(navController, n1Var, n1VarB), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1503037695, new k0(navController, q0Var2, n1VarB, n1VarB2), kVarP), kVarP, 806879280, 189);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(-1270417315);
                boolean zK = kVarP.K(n1Var);
                Object objG2 = kVarP.g();
                if (zK || objG2 == obj) {
                    objG2 = new fb(n1Var, 1);
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                t0.r.a((eh.a) objG2, f1.c.b(-169882107, new m0(q0Var2, n1Var), kVarP), null, f1.c.b(-1093049533, new g9.g(n1Var, 1), kVarP), null, b4.f28126h, b4.f28127i, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1772592, 0, 16276);
                kVarP = kVarP;
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(q0Var2, i10) { // from class: t8.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q0 f28604b;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    n0.a(this.f28603a, this.f28604b, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final x xVar, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-338667438);
        if ((((kVarP.K(xVar) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            md.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(18), q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1002587411, new a(aVar, aVar2, xVar), kVarP), kVarP, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, aVar2, i10) { // from class: t8.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f28081b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f28082c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    n0.b(this.f28080a, this.f28081b, this.f28082c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
