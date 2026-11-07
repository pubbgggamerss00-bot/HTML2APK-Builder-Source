package t;

@vg.e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1308}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f25172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.j f25173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x.m mVar, x.j jVar, tg.e<? super c> eVar) {
        super(2, eVar);
        this.f25172b = mVar;
        this.f25173c = jVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c(this.f25172b, this.f25173c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25171a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f25171a = 1;
            if (this.f25172b.c(this.f25173c, this) == aVar) {
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
