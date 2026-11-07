package t0;

@vg.e(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class od extends vg.i implements eh.p<c2.j0, tg.e<? super pg.f0>, Object> {
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new od(2, eVar);
    }

    @Override // eh.p
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        return ((od) create(j0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return pg.f0.f21461a;
    }
}
