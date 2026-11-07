package u0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final float f29021a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.d f29022b;

    public static final class a extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29023a = new a(3);

        @Override // eh.q
        public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
            g2.o0 o0Var2 = o0Var;
            long j10 = bVar.f8811a;
            int iB1 = o0Var2.b1(i.f29021a);
            int i10 = iB1 * 2;
            g2.g1 g1VarP = k0Var.P(f3.c.i(i10, 0, j10));
            int i11 = g1VarP.f11383b;
            return o0Var2.i0(g1VarP.f11382a - i10, i11, qg.a0.f22708a, new h(g1VarP, iB1));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29024a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(q2.d0 d0Var) {
            return pg.f0.f21461a;
        }
    }

    static {
        float f10 = 10;
        f29021a = f10;
        f29022b = androidx.compose.foundation.layout.f.j(q2.q.a(androidx.compose.ui.layout.b.a(d.a.f1143b, a.f29023a), true, b.f29024a), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
    }
}
