package j3;

import androidx.compose.ui.d;
import x0.n1;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f15056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n1 n1Var) {
        super(2);
        this.f15056a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            j.b(q2.q.a(d.a.f1143b, false, e.f15050a), (eh.p) this.f15056a.getValue(), jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
