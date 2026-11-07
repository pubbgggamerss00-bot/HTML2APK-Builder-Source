package q8;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class v1 {
    public static final void a(eh.a onDismiss, final eh.a onReviewRequested, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        final eh.a aVar;
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.r.e(onReviewRequested, "onReviewRequested");
        x0.k kVarP = jVar.p(-1321527863);
        int i11 = (kVarP.l(onDismiss) ? 4 : 2) | i10 | (kVarP.l(onReviewRequested) ? 32 : 16) | 384;
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar = onDismiss;
        } else {
            kVarP.L(-1559484938);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new x0.v1(0);
                kVarP.C(objG);
            }
            kVarP.T(false);
            d.a aVar2 = d.a.f1143b;
            aVar = onDismiss;
            t0.p.d(aVar, aVar2, new j3.d0(3), f1.c.b(870839759, new u1(onDismiss, (x0.l1) objG, onReviewRequested), kVarP), kVarP, (i11 & 14) | 3504, 0);
            dVar = aVar2;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(onReviewRequested, dVar, i10) { // from class: q8.p1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f22360b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f22361c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v1.a(this.f22359a, this.f22360b, this.f22361c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
