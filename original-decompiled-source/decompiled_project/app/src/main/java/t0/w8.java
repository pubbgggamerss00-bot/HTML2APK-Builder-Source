package t0;

/* loaded from: classes.dex */
public final class w8 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f27287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.u1 f27290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b f27291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(androidx.compose.ui.d dVar, long j10, long j11, z.u1 u1Var, f1.b bVar, int i10) {
        super(2);
        this.f27287a = dVar;
        this.f27288b = j10;
        this.f27289c = j11;
        this.f27290d = u1Var;
        this.f27291e = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(196615);
        j9.a(this.f27287a, this.f27288b, this.f27289c, this.f27290d, this.f27291e, jVar, iN);
        return pg.f0.f21461a;
    }
}
