package t0;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb f26941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(hb hbVar, float f10, tg.e<? super s6> eVar) {
        super(2, eVar);
        this.f26941b = hbVar;
        this.f26942c = f10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s6(this.f26941b, this.f26942c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f26940a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f26940a = 1;
            u0.a0<ib> a0Var = this.f26941b.f26015b;
            T value = a0Var.f28947g.getValue();
            float fG = a0Var.g();
            float f10 = this.f26942c;
            Object objC = a0Var.c(fG, f10, value);
            if (((Boolean) a0Var.f28944d.invoke(objC)).booleanValue()) {
                objB = androidx.compose.material3.internal.a.b(a0Var, objC, f10, this);
                if (objB != obj2) {
                    objB = pg.f0.f21461a;
                }
            } else {
                objB = androidx.compose.material3.internal.a.b(a0Var, value, f10, this);
                if (objB != obj2) {
                    objB = pg.f0.f21461a;
                }
            }
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
