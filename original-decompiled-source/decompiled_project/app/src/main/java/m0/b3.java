package m0;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(x2 x2Var, tg.e<? super b3> eVar) {
        super(2, eVar);
        this.f17266a = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b3(this.f17266a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f17266a.d();
        return pg.f0.f21461a;
    }
}
