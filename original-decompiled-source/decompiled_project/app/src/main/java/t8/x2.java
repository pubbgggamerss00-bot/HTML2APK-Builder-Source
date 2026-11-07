package t8;

import androidx.compose.ui.d;
import t0.ff;

/* loaded from: classes.dex */
public final class x2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f28566a;

    public x2(x0.n1<String> n1Var) {
        this.f28566a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            mh.k kVar = v2.f28495e;
            ff.b(i8.c.b(this.f28566a.getValue().length(), " / 1000"), androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 0L, 0L, null, null, 0L, new e3.h(6), 0L, 0, false, 0, 0, null, jVar2, 48, 0, 130556);
        }
        return pg.f0.f21461a;
    }
}
