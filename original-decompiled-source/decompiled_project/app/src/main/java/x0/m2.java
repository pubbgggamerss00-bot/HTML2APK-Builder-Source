package x0;

import x0.k2;

@vg.e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m2 extends vg.i implements eh.p<k2.d, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31813a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        m2 m2Var = new m2(2, eVar);
        m2Var.f31813a = obj;
        return m2Var;
    }

    @Override // eh.p
    public final Object invoke(k2.d dVar, tg.e<? super Boolean> eVar) {
        return ((m2) create(dVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return Boolean.valueOf(((k2.d) this.f31813a) == k2.d.f31788a);
    }
}
