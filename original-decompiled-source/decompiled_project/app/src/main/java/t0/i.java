package t0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f26040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(eh.p pVar, f1.b bVar) {
        super(2);
        this.f26039a = pVar;
        this.f26040b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1497073862);
            eh.p<x0.j, Integer, pg.f0> pVar = this.f26039a;
            if (pVar != null) {
                pVar.invoke(jVar2, 0);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            jVar2.B();
            this.f26040b.invoke(jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
