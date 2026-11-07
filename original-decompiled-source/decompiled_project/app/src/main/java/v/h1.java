package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.j f29898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(androidx.compose.foundation.gestures.j jVar, long j10, tg.e<? super h1> eVar) {
        super(2, eVar);
        this.f29898b = jVar;
        this.f29899c = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h1(this.f29898b, this.f29899c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29897a;
        if (i10 == 0) {
            pg.q.b(obj);
            s1 s1Var = this.f29898b.G;
            this.f29897a = 1;
            if (s1Var.c(this.f29899c, true, this) == aVar) {
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
