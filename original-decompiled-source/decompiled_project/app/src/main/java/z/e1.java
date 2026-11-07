package z;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class e1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f34495q;

    /* renamed from: r, reason: collision with root package name */
    public float f34496r;

    /* renamed from: s, reason: collision with root package name */
    public float f34497s;

    /* renamed from: t, reason: collision with root package name */
    public float f34498t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34499v;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34501b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, g2.o0 o0Var) {
            super(1);
            this.f34501b = g1Var;
            this.f34502c = o0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            e1 e1Var = e1.this;
            boolean z10 = e1Var.f34499v;
            g2.g1 g1Var = this.f34501b;
            g2.o0 o0Var = this.f34502c;
            if (z10) {
                g1.a.g(aVar2, g1Var, o0Var.b1(e1Var.f34495q), o0Var.b1(e1Var.f34496r));
            } else {
                aVar2.d(g1Var, o0Var.b1(e1Var.f34495q), o0Var.b1(e1Var.f34496r), CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        int iB1 = o0Var.b1(this.f34497s) + o0Var.b1(this.f34495q);
        int iB12 = o0Var.b1(this.f34498t) + o0Var.b1(this.f34496r);
        g2.g1 g1VarP = k0Var.P(f3.c.i(-iB1, -iB12, j10));
        return o0Var.i0(f3.c.g(g1VarP.f11382a + iB1, j10), f3.c.f(g1VarP.f11383b + iB12, j10), qg.a0.f22708a, new a(g1VarP, o0Var));
    }
}
