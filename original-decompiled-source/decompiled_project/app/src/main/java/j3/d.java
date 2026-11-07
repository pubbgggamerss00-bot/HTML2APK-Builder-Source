package j3;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f15040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f15041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f15042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(eh.a aVar, d0 d0Var, f1.b bVar, int i10, int i11) {
        super(2);
        this.f15040a = aVar;
        this.f15041b = d0Var;
        this.f15042c = bVar;
        this.f15043d = i10;
        this.f15044e = i11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        j.a(this.f15040a, this.f15041b, this.f15042c, jVar, f3.i.n(this.f15043d | 1), this.f15044e);
        return pg.f0.f21461a;
    }
}
