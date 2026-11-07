package t8;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$AiSessionScreen$1$1", f = "AiSessionScreen.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f28489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x0.n1 n1Var, b0.m0 m0Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f28488b = n1Var;
        this.f28489c = m0Var;
        this.f28490d = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v1(this.f28488b, this.f28489c, this.f28490d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28487a;
        if (i10 == 0) {
            pg.q.b(obj);
            if (this.f28488b.getValue().booleanValue()) {
                mh.k kVar = v2.f28495e;
                if (!((b3) this.f28490d.getValue()).f28111a.isEmpty()) {
                    b0.m0 m0Var = this.f28489c;
                    int iF = m0Var.i().f() - 1;
                    this.f28487a = 1;
                    Object objC = m0Var.c(t.b1.f25167a, new b0.n0(m0Var, iF, 1073741823, null), this);
                    if (objC != aVar) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
