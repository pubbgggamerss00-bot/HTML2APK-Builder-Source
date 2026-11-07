package g9;

import f9.tb;
import t0.s4;
import t0.x0;
import t8.b4;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class g implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11736b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f11735a = i10;
        this.f11736b = obj;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11735a) {
            case 0:
                x0.j jVar = (x0.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                p5.x xVar = (p5.x) this.f11736b;
                if ((iIntValue & 3) == 2 && jVar.s()) {
                    jVar.v();
                } else {
                    jVar.L(-796435532);
                    boolean zL = jVar.l(xVar);
                    Object objG = jVar.g();
                    if (zL || objG == j.a.f31715a) {
                        objG = new tb(xVar, 1);
                        jVar.C(objG);
                    }
                    jVar.B();
                    s4.c((eh.a) objG, null, false, null, a.f11657b, jVar, 196608, 30);
                }
                break;
            default:
                x0.j jVar2 = (x0.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                n1 n1Var = (n1) this.f11736b;
                if ((iIntValue2 & 3) == 2 && jVar2.s()) {
                    jVar2.v();
                } else {
                    jVar2.L(-501443076);
                    boolean zK = jVar2.K(n1Var);
                    Object objG2 = jVar2.g();
                    if (zK || objG2 == j.a.f31715a) {
                        objG2 = new tb(n1Var, 2);
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    x0.d((eh.a) objG2, null, false, null, null, null, b4.f28125g, jVar2, 805306368, 510);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
