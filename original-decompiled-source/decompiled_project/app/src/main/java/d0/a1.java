package d0;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f7048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f7049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Object obj, int i10, c1 c1Var, f1.b bVar, int i11) {
        super(2);
        this.f7046a = obj;
        this.f7047b = i10;
        this.f7048c = c1Var;
        this.f7049d = bVar;
        this.f7050e = i11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        b1.a(this.f7046a, this.f7047b, this.f7048c, this.f7049d, jVar, f3.i.n(this.f7050e | 1));
        return pg.f0.f21461a;
    }
}
