package s4;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f24208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1<Object> f24209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<Object, Throwable, pg.f0> f24210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d0 d0Var, e1 e1Var, eh.p pVar) {
        super(1);
        this.f24208a = d0Var;
        this.f24209b = e1Var;
        this.f24210c = pVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        pg.f0 f0Var;
        Throwable th3 = th2;
        this.f24208a.invoke(th3);
        rh.c cVar = this.f24209b.f24220c;
        cVar.n(false, th3);
        do {
            Object objA = rh.l.a(cVar.c());
            if (objA != null) {
                this.f24210c.invoke(objA, th3);
                f0Var = pg.f0.f21461a;
            } else {
                f0Var = null;
            }
        } while (f0Var != null);
        return pg.f0.f21461a;
    }
}
