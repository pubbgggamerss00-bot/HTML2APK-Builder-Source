package androidx.lifecycle;

/* loaded from: classes.dex */
public final class g1 implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.g f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f2281c;

    public g1(qh.g gVar, l lVar, h1 h1Var) {
        this.f2279a = gVar;
        this.f2280b = lVar;
        this.f2281c = h1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        qh.g gVar = this.f2279a;
        tg.i iVar = tg.i.f28768a;
        boolean zF0 = gVar.F0(iVar);
        h1 h1Var = this.f2281c;
        l lVar = this.f2280b;
        if (zF0) {
            gVar.D0(iVar, new f1(lVar, h1Var));
        } else {
            lVar.c(h1Var);
        }
        return pg.f0.f21461a;
    }
}
