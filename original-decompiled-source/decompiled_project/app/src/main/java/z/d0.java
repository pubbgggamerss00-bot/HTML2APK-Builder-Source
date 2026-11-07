package z;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f34485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f1.b bVar) {
        super(2);
        this.f34485a = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f34485a.b(p0.f34606a, jVar2, 6);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
