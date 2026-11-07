package t0;

/* loaded from: classes.dex */
public final class d9 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t8 f25678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d9(t8 t8Var, boolean z10, boolean z11, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f25678a = t8Var;
        this.f25679b = z10;
        this.f25680c = z11;
        this.f25681d = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t2.l0 l0VarA = of.a(v0.v.f30493g, jVar2);
            boolean z10 = this.f25680c;
            t8 t8Var = this.f25678a;
            u0.v0.a(((q1.b1) r.g2.a(!z10 ? t8Var.f27064g : this.f25679b ? t8Var.f27059b : t8Var.f27062e, s.m.d(150, 0, null, 6), null, jVar2, 48, 12).getValue()).f21656a, l0VarA, this.f25681d, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
