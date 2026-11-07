package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class a6 extends d.c implements i2.h, i2.b0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f25459a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f25460b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, g2.g1 g1Var) {
            super(1);
            this.f25459a = i10;
            this.f25460b = g1Var;
            this.f25461c = i11;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f25460b, gh.a.b((this.f25459a - r0.f11382a) / 2.0f), gh.a.b((this.f25461c - r0.f11383b) / 2.0f), CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        float f10 = ((f3.h) i2.i.a(this, w4.f27281a)).f8817a;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        g2.g1 g1VarP = k0Var.P(j10);
        boolean z10 = this.f1157p && !Float.isNaN(f10) && Float.compare(f10, f11) > 0;
        int iB1 = Float.isNaN(f10) ? 0 : o0Var.b1(f10);
        int iMax = z10 ? Math.max(g1VarP.f11382a, iB1) : g1VarP.f11382a;
        int iMax2 = z10 ? Math.max(g1VarP.f11383b, iB1) : g1VarP.f11383b;
        return o0Var.i0(iMax, iMax2, qg.a0.f22708a, new a(iMax, iMax2, g1VarP));
    }
}
