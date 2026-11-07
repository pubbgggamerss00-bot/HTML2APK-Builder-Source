package u;

import pg.f0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f28918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f28919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, f1.b bVar, int i10) {
        super(2);
        this.f28918a = gVar;
        this.f28919b = bVar;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(385);
        y.a(this.f28918a, this.f28919b, jVar, iN);
        return f0.f21461a;
    }
}
