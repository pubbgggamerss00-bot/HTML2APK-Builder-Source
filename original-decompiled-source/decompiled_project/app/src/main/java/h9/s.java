package h9;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import t0.mf;
import t0.ra;
import x0.j;

/* loaded from: classes.dex */
public final class s {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.x f12781a;

        public a(p5.x xVar) {
            this.f12781a = xVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVar = h9.a.f12490a;
                f1.b bVarB = f1.c.b(90353133, new r(this.f12781a), jVar2);
                float f10 = mf.f26477a;
                t0.g0.b(bVar, null, bVarB, null, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(q1.b1.f21653g, 0L, 0L, jVar2, 30), jVar2, 390, 186);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f12782a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p5.x f12783b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f12784c;

        public b(x0.l1 l1Var, p5.x xVar, Context context) {
            this.f12782a = l1Var;
            this.f12783b = xVar;
            this.f12784c = context;
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
                p9.d.a(padding.c(), f1.c.b(888581065, new w(padding, this.f12782a, this.f12783b, this.f12784c), jVar2), jVar2, 48);
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final p5.x navController, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-284403349);
        if ((((kVarP.l(navController) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(-2094516548);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new p(0);
                kVarP.C(objG);
            }
            kVarP.T(false);
            ra.a(null, f1.c.b(1319702823, new a(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1677182276, new b((x0.l1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6), navController, (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b)), kVarP), kVarP, 806879280, 189);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: h9.q
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.a(this.f12761a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
