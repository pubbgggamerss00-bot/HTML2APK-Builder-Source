package m0;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(x2 x2Var, tg.e<? super c3> eVar) {
        super(2, eVar);
        this.f17274a = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c3(this.f17274a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f17274a.m();
        return pg.f0.f21461a;
    }
}
