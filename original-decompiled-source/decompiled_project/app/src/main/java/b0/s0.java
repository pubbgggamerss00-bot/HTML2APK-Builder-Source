package b0;

import v.b1;

@vg.e(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s0 extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(m0 m0Var, int i10, int i11, tg.e<? super s0> eVar) {
        super(2, eVar);
        this.f3429a = m0Var;
        this.f3430b = i10;
        this.f3431c = i11;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s0(this.f3429a, this.f3430b, this.f3431c, eVar);
    }

    @Override // eh.p
    public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((s0) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f3429a.j(this.f3430b, this.f3431c);
        return pg.f0.f21461a;
    }
}
