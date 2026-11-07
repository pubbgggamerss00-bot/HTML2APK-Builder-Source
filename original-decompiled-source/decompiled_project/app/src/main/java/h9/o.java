package h9;

import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class o implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12744a;

    public o(String str) {
        this.f12744a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f12744a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((nf) jVar2.f(of.f26647a)).f26550m, jVar2, 0, 3072, 57342);
        }
        return pg.f0.f21461a;
    }
}
