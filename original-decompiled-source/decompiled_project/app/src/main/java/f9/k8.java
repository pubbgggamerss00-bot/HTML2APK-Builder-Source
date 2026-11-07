package f9;

/* loaded from: classes.dex */
public final class k8 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9923a;

    public k8(String str) {
        this.f9923a = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.ff.b(this.f9923a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26552o, jVar2, 0, 0, 65534);
        }
        return pg.f0.f21461a;
    }
}
