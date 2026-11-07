package t0;

/* loaded from: classes.dex */
public final class bc extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hc f25544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(boolean z10, hc hcVar) {
        super(1);
        this.f25543a = z10;
        this.f25544b = hcVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        if (!this.f25543a) {
            kh.i<Object>[] iVarArr = q2.a0.f21754a;
            d0Var2.c(q2.w.f21828i, pg.f0.f21461a);
        }
        ac acVar = new ac(this.f25544b);
        kh.i<Object>[] iVarArr2 = q2.a0.f21754a;
        d0Var2.c(q2.k.f21780h, new q2.a(null, acVar));
        return pg.f0.f21461a;
    }
}
