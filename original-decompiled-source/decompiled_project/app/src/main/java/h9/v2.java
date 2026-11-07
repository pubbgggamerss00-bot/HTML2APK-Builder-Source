package h9;

/* loaded from: classes.dex */
public final class v2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<k9.a> f12834a;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(x0.r3<? extends k9.a> r3Var) {
        this.f12834a = r3Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            v3.i(this.f12834a.getValue(), 28, jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
