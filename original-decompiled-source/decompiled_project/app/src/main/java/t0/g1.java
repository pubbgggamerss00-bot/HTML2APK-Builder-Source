package t0;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f25903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f25904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f25905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f25906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.v f25907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b f25908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.compose.ui.d dVar, q1.f2 f2Var, y0 y0Var, c1 c1Var, t.v vVar, f1.b bVar, int i10) {
        super(2);
        this.f25903a = dVar;
        this.f25904b = f2Var;
        this.f25905c = y0Var;
        this.f25906d = c1Var;
        this.f25907e = vVar;
        this.f25908f = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(196615);
        d1.c(this.f25903a, this.f25904b, this.f25905c, this.f25906d, this.f25907e, this.f25908f, jVar, iN);
        return pg.f0.f21461a;
    }
}
