package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k1 extends vg.i implements eh.p<p1.c, tg.e<? super p1.c>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29971a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f29972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.j f29973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.compose.foundation.gestures.j jVar, tg.e<? super k1> eVar) {
        super(2, eVar);
        this.f29973c = jVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        k1 k1Var = new k1(this.f29973c, eVar);
        k1Var.f29972b = ((p1.c) obj).f21129a;
        return k1Var;
    }

    @Override // eh.p
    public final Object invoke(p1.c cVar, tg.e<? super p1.c> eVar) {
        long j10 = cVar.f21129a;
        k1 k1Var = new k1(this.f29973c, eVar);
        k1Var.f29972b = j10;
        return k1Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29971a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        long j10 = this.f29972b;
        s1 s1Var = this.f29973c.G;
        this.f29971a = 1;
        Object objA = androidx.compose.foundation.gestures.i.a(s1Var, j10, this);
        return objA == aVar ? aVar : objA;
    }
}
