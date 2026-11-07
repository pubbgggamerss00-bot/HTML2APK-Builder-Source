package t0;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class y8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f27470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8 f27471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f27472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(x0.r3<Float> r3Var, t8 t8Var, q1.f2 f2Var) {
        super(2);
        this.f27470a = r3Var;
        this.f27471b = t8Var;
        this.f27472c = f2Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(d.a.f1143b, "indicator");
            x0.r3<Float> r3Var = this.f27470a;
            boolean zK = jVar2.K(r3Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new x8(r3Var);
                jVar2.C(objG);
            }
            z.g.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarB, (eh.l) objG), this.f27471b.f27060c, this.f27472c), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
