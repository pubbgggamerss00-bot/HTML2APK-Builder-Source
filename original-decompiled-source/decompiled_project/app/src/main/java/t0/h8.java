package t0;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class h8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f25997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a8 f25998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(x0.r3<Float> r3Var, a8 a8Var) {
        super(2);
        this.f25997a = r3Var;
        this.f25998b = a8Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(d.a.f1143b, "indicator");
            x0.r3<Float> r3Var = this.f25997a;
            boolean zK = jVar2.K(r3Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new g8(r3Var);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarB, (eh.l) objG);
            long j10 = this.f25998b.f25465c;
            float f10 = v0.u.f30480a;
            z.g.a(androidx.compose.foundation.a.b(dVarA, j10, ab.a(v0.c0.f30231d, jVar2)), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
