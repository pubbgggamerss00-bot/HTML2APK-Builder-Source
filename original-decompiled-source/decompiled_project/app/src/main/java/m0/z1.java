package m0;

/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.s implements eh.l<z, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<z, pg.f0> f17603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(r1 r1Var, eh.l<? super z, pg.f0> lVar) {
        super(1);
        this.f17602a = r1Var;
        this.f17603b = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(z zVar) {
        z zVar2 = zVar;
        this.f17602a.m(zVar2);
        this.f17603b.invoke(zVar2);
        return pg.f0.f21461a;
    }
}
