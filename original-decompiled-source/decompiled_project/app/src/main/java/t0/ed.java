package t0;

/* loaded from: classes.dex */
public final class ed extends kotlin.jvm.internal.s implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(String str) {
        super(3);
        this.f25817a = str;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f25817a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
