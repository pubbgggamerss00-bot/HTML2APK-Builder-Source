package i0;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements eh.l<g2.v, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13267a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i2 i2Var) {
        super(1);
        this.f13267a = i2Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g2.v vVar) {
        g2.v vVar2 = vVar;
        l4 l4VarD = this.f13267a.d();
        if (l4VarD != null) {
            l4VarD.f13420c = vVar2;
        }
        return pg.f0.f21461a;
    }
}
