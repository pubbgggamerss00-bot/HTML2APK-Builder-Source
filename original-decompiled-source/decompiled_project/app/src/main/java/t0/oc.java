package t0;

/* loaded from: classes.dex */
public final class oc extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f26635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(ic icVar, androidx.compose.ui.d dVar, int i10) {
        super(2);
        f1.b bVar = m2.f26421a;
        this.f26635a = icVar;
        this.f26636b = dVar;
        this.f26637c = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        f1.b bVar = m2.f26421a;
        int iN = f3.i.n(this.f26637c | 1);
        tc.a(this.f26635a, this.f26636b, jVar, iN);
        return pg.f0.f21461a;
    }
}
