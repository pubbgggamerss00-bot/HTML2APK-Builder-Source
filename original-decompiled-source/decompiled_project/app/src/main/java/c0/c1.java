package c0;

@vg.e(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c1 extends vg.i implements eh.p<v.b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f4358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(w0 w0Var, int i10, tg.e eVar) {
        super(2, eVar);
        this.f4358a = w0Var;
        this.f4359b = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c1(this.f4358a, this.f4359b, eVar);
    }

    @Override // eh.p
    public final Object invoke(v.b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((c1) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f4358a.k(this.f4359b, 0);
        return pg.f0.f21461a;
    }
}
