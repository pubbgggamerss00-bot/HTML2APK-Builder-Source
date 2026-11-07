package b9;

import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.s implements eh.r<c0.v, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f3830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2 f3831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l f3832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(List list, a3 a3Var, y2 y2Var, eh.l lVar) {
        super(4);
        this.f3829a = list;
        this.f3830b = a3Var;
        this.f3831c = y2Var;
        this.f3832d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.r
    public final pg.f0 f(c0.v vVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        c0.v vVar2 = vVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(vVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            int iIntValue3 = ((Number) this.f3829a.get(iIntValue)).intValue();
            jVar2.L(1984033211);
            y2 y2Var = this.f3831c;
            boolean z10 = iIntValue3 == y2Var.f4160d.g();
            boolean zContains = ((List) y2Var.f4164h.getValue()).contains(Integer.valueOf(iIntValue3));
            boolean zBooleanValue = ((Boolean) y2Var.f4163g.getValue()).booleanValue();
            jVar2.L(895294094);
            eh.l lVar = this.f3832d;
            boolean zK = jVar2.K(lVar) | jVar2.i(iIntValue3);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new b2(iIntValue3, lVar);
                jVar2.C(objG);
            }
            jVar2.B();
            o1.d(iIntValue3, this.f3830b, z10, zContains, zBooleanValue, (eh.a) objG, jVar2, 64);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
