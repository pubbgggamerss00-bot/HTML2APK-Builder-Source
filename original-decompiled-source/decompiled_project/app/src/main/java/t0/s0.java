package t0;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f26933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.q<z.n1, x0.j, Integer, pg.f0> f26934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(long j10, z.f1 f1Var, eh.q<? super z.n1, ? super x0.j, ? super Integer, pg.f0> qVar) {
        super(2);
        this.f26932a = j10;
        this.f26933b = f1Var;
        this.f26934c = qVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            u0.v0.a(this.f26932a, ((nf) jVar2.f(of.f26647a)).f26550m, f1.c.b(1327513942, new r0(this.f26933b, this.f26934c), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
