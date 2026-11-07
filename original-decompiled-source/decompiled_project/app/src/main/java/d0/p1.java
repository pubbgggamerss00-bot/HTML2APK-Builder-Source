package d0;

@vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f7249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f7250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(n1 n1Var, int i10, tg.e<? super p1> eVar) {
        super(2, eVar);
        this.f7250b = n1Var;
        this.f7251c = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new p1(this.f7250b, this.f7251c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f7249a;
        if (i10 == 0) {
            pg.q.b(obj);
            m1 m1Var = this.f7250b.f7197r;
            this.f7249a = 1;
            if (m1Var.d(this.f7251c, this) == aVar) {
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
