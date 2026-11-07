package m0;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f17458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f17459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f17460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(f1.b bVar, r1 r1Var, l2 l2Var) {
        super(2);
        this.f17458a = l2Var;
        this.f17459b = bVar;
        this.f17460c = r1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.y.a(n2.f17429a.a(this.f17458a), f1.c.b(-272381430, new p0(this.f17459b, this.f17460c), jVar2), jVar2, 56);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
