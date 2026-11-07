package z;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class c1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f34479q;

    /* renamed from: r, reason: collision with root package name */
    public float f34480r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f34481s;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34483b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34484c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, g2.o0 o0Var) {
            super(1);
            this.f34483b = g1Var;
            this.f34484c = o0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            c1 c1Var = c1.this;
            boolean z10 = c1Var.f34481s;
            g2.g1 g1Var = this.f34483b;
            g2.o0 o0Var = this.f34484c;
            if (z10) {
                g1.a.g(aVar2, g1Var, o0Var.b1(c1Var.f34479q), o0Var.b1(c1Var.f34480r));
            } else {
                aVar2.d(g1Var, o0Var.b1(c1Var.f34479q), o0Var.b1(c1Var.f34480r), CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP, o0Var));
    }
}
