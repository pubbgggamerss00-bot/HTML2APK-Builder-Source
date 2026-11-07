package j9;

import androidx.compose.ui.d;
import j9.x1;
import java.util.List;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3 f15409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(List list, x1 x1Var, q8.d0 d0Var, long j10, p5.x xVar, r3 r3Var) {
        super(4);
        this.f15405a = list;
        this.f15406b = d0Var;
        this.f15407c = j10;
        this.f15408d = xVar;
        this.f15409e = r3Var;
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
            x1.a aVar = (x1.a) this.f15405a.get(iIntValue);
            jVar2.L(957923874);
            boolean zI = x1.i(aVar, ((Boolean) this.f15409e.getValue()).booleanValue());
            jVar2.L(-1077475096);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new q8.e0();
                jVar2.C(objG);
            }
            q8.e0 e0Var = (q8.e0) objG;
            jVar2.B();
            jVar2.L(-1077469205);
            boolean zK = jVar2.K(this.f15406b) | jVar2.l(e0Var) | jVar2.j(this.f15407c) | jVar2.l(this.f15408d) | jVar2.l(aVar);
            Object objG2 = jVar2.g();
            if (zK || objG2 == obj) {
                Object c1Var = new c1(this.f15406b, e0Var, this.f15407c, this.f15408d, aVar);
                jVar2.C(c1Var);
                objG2 = c1Var;
            }
            jVar2.B();
            d0.a(aVar, zI, (eh.a) objG2, q8.p0.c(d.a.f1143b, e0Var), jVar2, 0);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
