package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x6 extends vg.i implements eh.q<ph.i0, Float, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f27378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f27379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x6(eh.l<? super Float, pg.f0> lVar, tg.e<? super x6> eVar) {
        super(3, eVar);
        this.f27379b = lVar;
    }

    @Override // eh.q
    public final Object b(ph.i0 i0Var, Float f10, tg.e<? super pg.f0> eVar) {
        float fFloatValue = f10.floatValue();
        x6 x6Var = new x6(this.f27379b, eVar);
        x6Var.f27378a = fFloatValue;
        return x6Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f27379b.invoke(new Float(this.f27378a));
        return pg.f0.f21461a;
    }
}
