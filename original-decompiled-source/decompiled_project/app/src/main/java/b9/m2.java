package b9;

/* loaded from: classes.dex */
public final class m2 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f3945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f3946c;

    public m2(y2 y2Var, j0 j0Var, eh.a<pg.f0> aVar) {
        this.f3944a = y2Var;
        this.f3945b = j0Var;
        this.f3946c = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        eh.a<pg.f0> aVar = this.f3946c;
        o1.f(this.f3944a, this.f3945b, aVar, jVar, 0);
        return pg.f0.f21461a;
    }
}
