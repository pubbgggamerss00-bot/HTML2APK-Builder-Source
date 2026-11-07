package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb f26506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(hb hbVar, tg.e<? super n6> eVar) {
        super(2, eVar);
        this.f26506b = hbVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n6(this.f26506b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f26505a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f26505a = 1;
            hb hbVar = this.f26506b;
            u0.c0<ib> c0VarE = hbVar.f26015b.e();
            ib ibVar = ib.f26110c;
            if (!c0VarE.e(ibVar)) {
                ibVar = ib.f26109b;
            }
            Object objA = hb.a(hbVar, ibVar, this);
            if (objA != obj2) {
                objA = pg.f0.f21461a;
            }
            if (objA == obj2) {
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
