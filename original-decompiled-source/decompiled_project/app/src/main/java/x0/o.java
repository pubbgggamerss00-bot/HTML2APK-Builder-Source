package x0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.s implements eh.p<j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1<Object> f31832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g1<Object> g1Var, Object obj) {
        super(2);
        this.f31832a = g1Var;
        this.f31833b = obj;
    }

    @Override // eh.p
    public final pg.f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f31832a.getClass();
            throw null;
        }
        jVar2.v();
        return pg.f0.f21461a;
    }
}
