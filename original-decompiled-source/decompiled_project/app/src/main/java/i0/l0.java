package i0;

@vg.e(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public x0.n1 f13404a;

    /* renamed from: b, reason: collision with root package name */
    public int f13405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<t2> f13406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(x0.n1<t2> n1Var, m0.x2 x2Var, tg.e<? super l0> eVar) {
        super(2, eVar);
        this.f13406c = n1Var;
        this.f13407d = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new l0(this.f13406c, this.f13407d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((l0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        x0.n1 n1Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f13405b;
        if (i10 == 0) {
            pg.q.b(obj);
            x0.n1<t2> n1Var2 = this.f13406c;
            this.f13404a = n1Var2;
            this.f13405b = 1;
            Object objC = s0.c(this.f13407d, this);
            if (objC == aVar) {
                return aVar;
            }
            n1Var = n1Var2;
            obj = objC;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1Var = this.f13404a;
            pg.q.b(obj);
        }
        n1Var.setValue(obj);
        return pg.f0.f21461a;
    }
}
