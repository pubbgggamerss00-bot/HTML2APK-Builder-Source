package i0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0.w f13153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f13154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m0.w wVar, androidx.compose.ui.d dVar, long j10, int i10) {
        super(2);
        this.f13153a = wVar;
        this.f13154b = dVar;
        this.f13155c = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(1);
        h.a(this.f13153a, this.f13154b, this.f13155c, jVar, iN);
        return pg.f0.f21461a;
    }
}
