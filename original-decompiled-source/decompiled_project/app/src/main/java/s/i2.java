package s;

@vg.e(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public yh.c f23779a;

    /* renamed from: b, reason: collision with root package name */
    public c2.g0 f23780b;

    /* renamed from: c, reason: collision with root package name */
    public int f23781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.g0 f23782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(c2.g0 g0Var, tg.e<? super i2> eVar) {
        super(2, eVar);
        this.f23782d = g0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i2(this.f23782d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [S, java.lang.Object] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        yh.c cVar;
        c2.g0 g0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23781c;
        if (i10 == 0) {
            pg.q.b(obj);
            c2.g0 g0Var2 = this.f23782d;
            z0 z0Var = (z0) g0Var2;
            z0Var.getClass();
            ((h1.z) c2.f23680b.getValue()).d(z0Var, c2.f23679a, z0Var.f24053g);
            cVar = z0Var.f24056k;
            this.f23779a = cVar;
            this.f23780b = g0Var2;
            this.f23781c = 1;
            if (cVar.h(this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = this.f23780b;
            cVar = this.f23779a;
            pg.q.b(obj);
        }
        try {
            ((z0) g0Var).f24050d = g0Var.X();
            ph.m mVar = ((z0) g0Var).f24055j;
            if (mVar != null) {
                mVar.resumeWith(g0Var.X());
            }
            ((z0) g0Var).f24055j = null;
            pg.f0 f0Var = pg.f0.f21461a;
            cVar.l(null);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            cVar.l(null);
            throw th2;
        }
    }
}
