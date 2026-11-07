package z;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class x0 extends d.c implements i2.b0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f34665a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            f3.r rVarB = aVar2.b();
            f3.r rVar = f3.r.f8828a;
            g2.g1 g1Var = this.f34665a;
            if (rVarB == rVar || aVar2.c() == 0) {
                g1.a.a(aVar2, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(0L, g1Var.f11386e), null);
            } else {
                long jC = (((int) 0) & BodyPartID.bodyIdMax) | (((aVar2.c() - g1Var.f11382a) - r1) << 32);
                g1.a.a(aVar2, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(jC, g1Var.f11386e), null);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // i2.b0
    public int F(i2.l0 l0Var, g2.p pVar, int i10) {
        return pVar.O(i10);
    }

    @Override // i2.b0
    public int G(i2.l0 l0Var, g2.p pVar, int i10) {
        return pVar.J(i10);
    }

    public abstract long T1(g2.k0 k0Var, long j10);

    public abstract boolean U1();

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        long jT1 = T1(k0Var, j10);
        if (U1()) {
            jT1 = f3.c.e(j10, jT1);
        }
        g2.g1 g1VarP = k0Var.P(jT1);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP));
    }

    public int r(i2.l0 l0Var, g2.p pVar, int i10) {
        return pVar.z(i10);
    }

    public int w(i2.l0 l0Var, g2.p pVar, int i10) {
        return pVar.b0(i10);
    }
}
