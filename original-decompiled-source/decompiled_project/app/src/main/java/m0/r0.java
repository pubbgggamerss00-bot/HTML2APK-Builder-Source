package m0;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f17467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f17468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(f1.b bVar, r1 r1Var, l2 l2Var) {
        super(2);
        this.f17466a = r1Var;
        this.f17467b = l2Var;
        this.f17468c = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            l2 l2Var = this.f17467b;
            f1.b bVar = this.f17468c;
            r1 r1Var = this.f17466a;
            i0.s0.a(r1Var, f1.c.b(577209674, new q0(bVar, r1Var, l2Var), jVar2), jVar2, 48);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
