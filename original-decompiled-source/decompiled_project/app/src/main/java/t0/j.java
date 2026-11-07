package t0;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f26122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(eh.p pVar, f1.b bVar) {
        super(2);
        this.f26121a = pVar;
        this.f26122b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = p.f26649a;
            p.b(f1.c.b(1887135077, new i(this.f26121a, this.f26122b), jVar2), jVar2, 438);
        }
        return pg.f0.f21461a;
    }
}
