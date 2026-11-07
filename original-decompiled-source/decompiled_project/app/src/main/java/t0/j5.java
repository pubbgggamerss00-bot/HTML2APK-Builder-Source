package t0;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;

/* loaded from: classes.dex */
public final class j5 {

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26137a = new a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        x0.y.c(a.f26137a);
    }

    public static final void a(e2 e2Var, za zaVar, nf nfVar, f1.b bVar, x0.j jVar, int i10) {
        za zaVar2;
        za zaVar3;
        x0.k kVarP = jVar.p(-2127166334);
        if (((i10 | (kVarP.K(e2Var) ? 4 : 2) | 16 | (kVarP.l(bVar) ? 2048 : 1024)) & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            zaVar3 = zaVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                zaVar2 = (za) kVarP.f(ab.f25480a);
            } else {
                kVarP.v();
                zaVar2 = zaVar;
            }
            kVarP.U();
            t.u0 u0VarA = ha.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, kVarP, 0, 7);
            long j10 = e2Var.f25751a;
            boolean zJ = kVarP.j(j10);
            Object objG = kVarP.g();
            if (zJ || objG == j.a.f31715a) {
                objG = new m0.q3(j10, q1.b1.c(0.4f, j10));
                kVarP.C(objG);
            }
            x0.y.b(new x0.f2[]{f2.f25858a.a(e2Var), androidx.compose.foundation.e.f816a.a(u0VarA), s0.t.f24152a.a(g2.f25909a), ab.f25480a.a(zaVar2), m0.r3.f17501a.a((m0.q3) objG), of.f26647a.a(nfVar)}, f1.c.b(-1066563262, new k5(nfVar, bVar), kVarP), kVarP, 56);
            zaVar3 = zaVar2;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l5(e2Var, zaVar3, nfVar, bVar, i10);
        }
    }
}
