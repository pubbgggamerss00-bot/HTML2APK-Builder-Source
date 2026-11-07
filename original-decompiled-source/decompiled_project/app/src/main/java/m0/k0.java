package m0;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2.f2 f17386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.b f17387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j2.f2 f2Var, t2.b bVar, tg.e<? super k0> eVar) {
        super(2, eVar);
        this.f17386b = f2Var;
        this.f17387c = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new k0(this.f17386b, this.f17387c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f17385a;
        if (i10 == 0) {
            pg.q.b(obj);
            j2.e2 e2VarA = y.a.a(this.f17387c);
            this.f17385a = 1;
            if (this.f17386b.a(e2VarA) == aVar) {
                return aVar;
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
