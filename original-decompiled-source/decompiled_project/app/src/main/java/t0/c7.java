package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb f25586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(hb hbVar, tg.e<? super c7> eVar) {
        super(2, eVar);
        this.f25586b = hbVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c7(this.f25586b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f25585a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f25585a = 1;
            u0.a0<ib> a0Var = this.f25586b.f26015b;
            Object objB = androidx.compose.material3.internal.a.b(a0Var, ib.f26109b, a0Var.f28951k.getFloatValue(), this);
            if (objB != obj2) {
                objB = pg.f0.f21461a;
            }
            if (objB == obj2) {
                return obj2;
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
