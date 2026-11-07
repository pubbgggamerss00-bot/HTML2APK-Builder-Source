package t;

@vg.e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1298}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f25165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.i f25166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x.m mVar, x.i iVar, tg.e<? super b> eVar) {
        super(2, eVar);
        this.f25165b = mVar;
        this.f25166c = iVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b(this.f25165b, this.f25166c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25164a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f25164a = 1;
            if (this.f25165b.c(this.f25166c, this) == aVar) {
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
