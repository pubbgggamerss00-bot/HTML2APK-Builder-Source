package k9;

import eh.p;
import pg.f0;
import t0.e2;
import t0.j5;

/* loaded from: classes.dex */
public final class i implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2 f16215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f16216b;

    public i(e2 e2Var, f1.b bVar) {
        this.f16215a = e2Var;
        this.f16216b = bVar;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            j5.a(this.f16215a, null, k.f16224a, this.f16216b, jVar2, 384);
        }
        return f0.f21461a;
    }
}
