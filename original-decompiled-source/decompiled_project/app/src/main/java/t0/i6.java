package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb f26073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(hb hbVar, tg.e<? super i6> eVar) {
        super(2, eVar);
        this.f26073b = hbVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i6(this.f26073b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26072a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f26072a = 1;
            if (this.f26073b.b(this) == aVar) {
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
