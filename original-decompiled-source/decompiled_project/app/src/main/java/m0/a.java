package m0;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f17244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.d f17245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f17246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, j1.d dVar, f1.b bVar, int i10) {
        super(2);
        this.f17244a = wVar;
        this.f17245b = dVar;
        this.f17246c = bVar;
        this.f17247d = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f17247d | 1);
        g.a(this.f17244a, this.f17245b, this.f17246c, jVar, iN);
        return pg.f0.f21461a;
    }
}
