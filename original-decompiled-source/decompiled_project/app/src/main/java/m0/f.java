package m0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f17312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, boolean z10, boolean z11) {
        super(1);
        this.f17312a = wVar;
        this.f17313b = z10;
        this.f17314c = z11;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        long jA = this.f17312a.a();
        d0Var2.c(h1.f17347c, new g1(this.f17313b ? i0.u1.f13616b : i0.u1.f13617c, jA, this.f17314c ? f1.f17320a : f1.f17322c, (9223372034707292159L & jA) != 9205357640488583168L));
        return pg.f0.f21461a;
    }
}
