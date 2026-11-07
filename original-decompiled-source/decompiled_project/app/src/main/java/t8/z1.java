package t8;

/* loaded from: classes.dex */
public final class z1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28607a;

    public z1(x0.n1 n1Var) {
        this.f28607a = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            mh.k kVar = v2.f28495e;
            v2.k(((b3) this.f28607a.getValue()).f28113c != null, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
