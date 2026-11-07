package g2;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public interface d extends i2.b0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f11323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var) {
            super(1);
            this.f11323a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f11323a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    default int W0(c cVar, p pVar, int i10) {
        i2.g1 g1Var = B().f1151h;
        kotlin.jvm.internal.r.b(g1Var);
        i2.o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        if (!o0VarG1.u0()) {
            return pVar.O(i10);
        }
        i2.m1 m1Var = i2.m1.f13953a;
        i2.n1 n1Var = i2.n1.f13960a;
        f3.c.b(0, i10, 7);
        cVar.getLayoutDirection();
        return o0().a();
    }

    default int d1(c cVar, p pVar, int i10) {
        i2.g1 g1Var = B().f1151h;
        kotlin.jvm.internal.r.b(g1Var);
        i2.o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        if (!o0VarG1.u0()) {
            return pVar.b0(i10);
        }
        i2.m1 m1Var = i2.m1.f13953a;
        i2.n1 n1Var = i2.n1.f13960a;
        f3.c.b(i10, 0, 13);
        cVar.getLayoutDirection();
        return o0().getHeight();
    }

    default int f1(c cVar, p pVar, int i10) {
        i2.g1 g1Var = B().f1151h;
        kotlin.jvm.internal.r.b(g1Var);
        i2.o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        if (!o0VarG1.u0()) {
            return pVar.z(i10);
        }
        i2.m1 m1Var = i2.m1.f13953a;
        i2.n1 n1Var = i2.n1.f13960a;
        f3.c.b(i10, 0, 13);
        cVar.getLayoutDirection();
        return o0().getHeight();
    }

    @Override // i2.b0
    default m0 m(o0 o0Var, k0 k0Var, long j10) {
        g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }

    default int m0(c cVar, p pVar, int i10) {
        i2.g1 g1Var = B().f1151h;
        kotlin.jvm.internal.r.b(g1Var);
        i2.o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        if (!o0VarG1.u0()) {
            return pVar.J(i10);
        }
        i2.m1 m1Var = i2.m1.f13953a;
        i2.n1 n1Var = i2.n1.f13960a;
        f3.c.b(0, i10, 7);
        cVar.getLayoutDirection();
        return o0().a();
    }

    m0 o0();

    boolean q0();
}
