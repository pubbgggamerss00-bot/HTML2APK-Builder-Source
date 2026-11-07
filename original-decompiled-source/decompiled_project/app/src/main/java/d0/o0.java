package d0;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<g0> f7208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f7209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f7210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<q0, f3.b, g2.m0> f7211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(eh.a aVar, androidx.compose.ui.d dVar, d1 d1Var, eh.p pVar, int i10) {
        super(2);
        this.f7208a = aVar;
        this.f7209b = dVar;
        this.f7210c = d1Var;
        this.f7211d = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(1);
        p0.a(this.f7208a, this.f7209b, this.f7210c, this.f7211d, jVar, iN);
        return pg.f0.f21461a;
    }
}
