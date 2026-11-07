package j3;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f15082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f15083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.compose.ui.d dVar, eh.p pVar, int i10) {
        super(2);
        this.f15082a = dVar;
        this.f15083b = pVar;
        this.f15084c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(this.f15084c | 1);
        j.b(this.f15082a, this.f15083b, jVar, iN);
        return pg.f0.f21461a;
    }
}
