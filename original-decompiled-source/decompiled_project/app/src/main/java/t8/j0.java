package t8;

import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f28251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f28252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f28253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(List list, p5.x xVar, q0 q0Var) {
        super(4);
        this.f28251a = list;
        this.f28252b = xVar;
        this.f28253c = q0Var;
    }

    @Override // eh.r
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        b0.e eVar2 = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            x xVar = (x) this.f28251a.get(iIntValue);
            jVar2.L(-1940863729);
            jVar2.L(-616795382);
            p5.x xVar2 = this.f28252b;
            boolean zL = jVar2.l(xVar2) | jVar2.K(xVar);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new f0(xVar2, xVar);
                jVar2.C(objG);
            }
            eh.a aVar = (eh.a) objG;
            jVar2.B();
            jVar2.L(-616786822);
            q0 q0Var = this.f28253c;
            boolean zL2 = jVar2.l(q0Var) | jVar2.K(xVar);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new g0(q0Var, xVar);
                jVar2.C(objG2);
            }
            jVar2.B();
            n0.b(xVar, aVar, (eh.a) objG2, jVar2, 0);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
