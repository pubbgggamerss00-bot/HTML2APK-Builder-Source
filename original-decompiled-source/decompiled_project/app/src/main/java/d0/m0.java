package d0;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.s implements eh.p<g2.t1, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<q0, f3.b, g2.m0> f7194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(c0 c0Var, eh.p<? super q0, ? super f3.b, ? extends g2.m0> pVar) {
        super(2);
        this.f7193a = c0Var;
        this.f7194b = pVar;
    }

    @Override // eh.p
    public final g2.m0 invoke(g2.t1 t1Var, f3.b bVar) {
        long j10 = bVar.f8811a;
        return this.f7194b.invoke(new r0(this.f7193a, t1Var), new f3.b(j10));
    }
}
