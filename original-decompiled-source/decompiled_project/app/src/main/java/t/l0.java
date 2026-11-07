package t;

@vg.e(c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", f = "Focusable.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f25294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 j0Var, tg.e<? super l0> eVar) {
        super(2, eVar);
        this.f25294b = j0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new l0(this.f25294b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((l0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25293a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f25293a = 1;
            if (n2.c.a(this.f25294b, null, this) == aVar) {
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
