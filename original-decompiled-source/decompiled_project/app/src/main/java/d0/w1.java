package d0;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f7293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f7294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(f1.b bVar, r1 r1Var) {
        super(2);
        this.f7293a = bVar;
        this.f7294b = r1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f7293a.b(this.f7294b, jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
