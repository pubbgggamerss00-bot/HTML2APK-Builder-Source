package m0;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<p1.c, s.p> f17462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s.b<p1.c, s.p> bVar, long j10, tg.e<? super q1> eVar) {
        super(2, eVar);
        this.f17462b = bVar;
        this.f17463c = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q1(this.f17462b, this.f17463c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f17461a;
        if (i10 == 0) {
            pg.q.b(obj);
            p1.c cVar = new p1.c(this.f17463c);
            s.l1<p1.c> l1Var = m1.f17417d;
            this.f17461a = 1;
            if (s.b.c(this.f17462b, cVar, l1Var, null, this, 12) == aVar) {
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
