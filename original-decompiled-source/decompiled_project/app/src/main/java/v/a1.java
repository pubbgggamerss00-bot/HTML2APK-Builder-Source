package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a1 extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a1(2, eVar);
    }

    @Override // eh.p
    public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((a1) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return pg.f0.f21461a;
    }
}
