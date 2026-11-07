package t0;

/* loaded from: classes.dex */
public final class k5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf f26229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f26230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(nf nfVar, f1.b bVar) {
        super(2);
        this.f26229a = nfVar;
        this.f26230b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.a(this.f26229a.f26547j, this.f26230b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
