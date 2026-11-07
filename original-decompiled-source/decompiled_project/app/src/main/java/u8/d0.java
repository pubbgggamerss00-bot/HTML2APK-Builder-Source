package u8;

import androidx.compose.ui.d;
import j2.c3;
import java.util.List;
import t0.ie;
import t0.ke;
import t0.me;
import x0.l1;

/* loaded from: classes.dex */
public final class d0 implements eh.q<List<? extends ie>, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f29417a;

    public d0(l1 l1Var) {
        this.f29417a = l1Var;
    }

    @Override // eh.q
    public final pg.f0 b(List<? extends ie> list, x0.j jVar, Integer num) {
        List<? extends ie> tabPositions = list;
        num.intValue();
        kotlin.jvm.internal.r.e(tabPositions, "tabPositions");
        androidx.compose.ui.d dVarA = androidx.compose.ui.c.a(d.a.f1143b, c3.f14686a, new me(tabPositions.get(this.f29417a.g())));
        long jC = c2.n0.c(4294956800L);
        ke.f26292a.b(dVarA, 3, jC, jVar, 432, 0);
        return pg.f0.f21461a;
    }
}
