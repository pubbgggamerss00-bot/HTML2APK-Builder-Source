package t0;

/* loaded from: classes.dex */
public final class c5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x4 f25582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f25583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(x4 x4Var, f1.b bVar) {
        super(2);
        this.f25582a = x4Var;
        this.f25583b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            h5.c(this.f25582a.f27371b, v0.r.f30467j, this.f25583b, jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
