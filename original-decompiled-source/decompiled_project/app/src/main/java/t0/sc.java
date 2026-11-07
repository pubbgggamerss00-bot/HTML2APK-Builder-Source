package t0;

@vg.e(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {432}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class sc extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f26983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.m2 f26985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(s.b bVar, boolean z10, s.m2 m2Var, tg.e eVar) {
        super(2, eVar);
        this.f26983b = bVar;
        this.f26984c = z10;
        this.f26985d = m2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new sc(this.f26983b, this.f26984c, this.f26985d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((sc) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26982a;
        if (i10 == 0) {
            pg.q.b(obj);
            Float f10 = new Float(this.f26984c ? 1.0f : 0.8f);
            this.f26982a = 1;
            if (s.b.c(this.f26983b, f10, this.f26985d, null, this, 12) == aVar) {
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
