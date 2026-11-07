package t0;

/* loaded from: classes.dex */
public final class k7 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(long j10, eh.a<pg.f0> aVar, boolean z10, int i10) {
        super(2);
        this.f26235a = j10;
        this.f26236b = aVar;
        this.f26237c = z10;
        this.f26238d = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        p7.c(this.f26235a, this.f26236b, this.f26237c, jVar, f3.i.n(this.f26238d | 1));
        return pg.f0.f21461a;
    }
}
