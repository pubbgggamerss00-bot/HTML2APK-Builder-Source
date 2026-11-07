package t0;

/* loaded from: classes.dex */
public final class f5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.o0 f25869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f5(long j10, v0.o0 o0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, int i10) {
        super(2);
        this.f25868a = j10;
        this.f25869b = o0Var;
        this.f25870c = pVar;
        this.f25871d = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        h5.c(this.f25868a, this.f25869b, this.f25870c, jVar, f3.i.n(this.f25871d | 1));
        return pg.f0.f21461a;
    }
}
