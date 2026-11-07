package t0;

/* loaded from: classes.dex */
public final class m8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a8 f26441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m8(a8 a8Var, boolean z10, boolean z11, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f26441a = a8Var;
        this.f26442b = z10;
        this.f26443c = z11;
        this.f26444d = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t2.l0 l0VarA = of.a(v0.u.f30486g, jVar2);
            boolean z10 = this.f26443c;
            a8 a8Var = this.f26441a;
            u0.v0.a(((q1.b1) r.g2.a(!z10 ? a8Var.f25469g : this.f26442b ? a8Var.f25464b : a8Var.f25467e, s.m.d(100, 0, null, 6), null, jVar2, 48, 12).getValue()).f21656a, l0VarA, this.f26444d, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
