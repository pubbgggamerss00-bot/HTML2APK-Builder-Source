package z;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class h1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public f1 f34540q;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34541a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34542b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, g2.g1 g1Var) {
            super(1);
            this.f34541a = g1Var;
            this.f34542b = i10;
            this.f34543c = i11;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f34541a, this.f34542b, this.f34543c, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        float fB = this.f34540q.b(o0Var.getLayoutDirection());
        float fC = this.f34540q.c();
        float fD = this.f34540q.d(o0Var.getLayoutDirection());
        float fA = this.f34540q.a();
        float f10 = 0;
        if (!((Float.compare(fA, f10) >= 0) & (Float.compare(fB, f10) >= 0) & (Float.compare(fC, f10) >= 0) & (Float.compare(fD, f10) >= 0))) {
            a0.a.a("Padding must be non-negative");
        }
        int iB1 = o0Var.b1(fB);
        int iB12 = o0Var.b1(fD) + iB1;
        int iB13 = o0Var.b1(fC);
        int iB14 = o0Var.b1(fA) + iB13;
        g2.g1 g1VarP = k0Var.P(f3.c.i(-iB12, -iB14, j10));
        return o0Var.i0(f3.c.g(g1VarP.f11382a + iB12, j10), f3.c.f(g1VarP.f11383b + iB14, j10), qg.a0.f22708a, new a(iB1, iB13, g1VarP));
    }
}
