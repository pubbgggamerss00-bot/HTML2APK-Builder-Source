package f9;

import java.util.List;

/* loaded from: classes.dex */
public final class n4 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f10102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(List list) {
        super(4);
        this.f10102a = list;
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
            String str = (String) this.f10102a.get(iIntValue);
            jVar2.L(-966030753);
            d1.v(str, true, jVar2, 48);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
