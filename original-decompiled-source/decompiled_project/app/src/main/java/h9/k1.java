package h9;

import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f12696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(List list, x0.n1 n1Var) {
        super(4);
        this.f12695a = list;
        this.f12696b = n1Var;
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
            OpenSourceLicenses.a aVar = (OpenSourceLicenses.a) this.f12695a.get(iIntValue);
            jVar2.L(-1818813673);
            jVar2.L(911160721);
            x0.n1 n1Var = this.f12696b;
            boolean zK = jVar2.K(n1Var) | jVar2.l(aVar);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new g1(aVar, n1Var);
                jVar2.C(objG);
            }
            jVar2.B();
            s0.b(aVar, (eh.a) objG, jVar2, 8);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
