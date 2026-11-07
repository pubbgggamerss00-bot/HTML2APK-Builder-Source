package s;

@vg.e(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b<Object, s> f23677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b<Object, s> bVar, tg.e<? super c> eVar) {
        super(1, eVar);
        this.f23677a = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new c(this.f23677a, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((c) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        b.b(this.f23677a);
        return pg.f0.f21461a;
    }
}
