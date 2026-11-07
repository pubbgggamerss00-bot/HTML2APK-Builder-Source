package j3;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f15117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f15118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f15119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f15120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o0 o0Var, eh.a aVar, p0 p0Var, f1.b bVar, int i10, int i11) {
        super(2);
        this.f15117a = o0Var;
        this.f15118b = aVar;
        this.f15119c = p0Var;
        this.f15120d = bVar;
        this.f15121e = i10;
        this.f15122f = i11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        k.a(this.f15117a, this.f15118b, this.f15119c, this.f15120d, jVar, f3.i.n(this.f15121e | 1), this.f15122f);
        return pg.f0.f21461a;
    }
}
