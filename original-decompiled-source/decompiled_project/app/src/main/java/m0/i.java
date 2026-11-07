package m0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements eh.l<n1.g, n1.k> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f17352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Boolean> f17353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j10, eh.a<Boolean> aVar, boolean z10) {
        super(1);
        this.f17352a = j10;
        this.f17353b = aVar;
        this.f17354c = z10;
    }

    @Override // eh.l
    public final n1.k invoke(n1.g gVar) {
        n1.g gVar2 = gVar;
        return gVar2.m(new h(this.f17353b, this.f17354c, g.d(gVar2, Float.intBitsToFloat((int) (gVar2.f18310a.i() >> 32)) / 2.0f), new q1.p0(5, this.f17352a)));
    }
}
