package t0;

@vg.e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {538}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f27367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d4 f27368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4 f27369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(d4 d4Var, a4 a4Var, tg.e<? super x3> eVar) {
        super(2, eVar);
        this.f27368b = d4Var;
        this.f27369c = a4Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x3(this.f27368b, this.f27369c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f27367a;
        if (i10 == 0) {
            pg.q.b(obj);
            a4 a4Var = this.f27369c;
            float f10 = a4Var.f25450a;
            float f11 = a4Var.f25451b;
            float f12 = a4Var.f25453d;
            float f13 = a4Var.f25452c;
            this.f27367a = 1;
            d4 d4Var = this.f27368b;
            d4Var.f25641a = f10;
            d4Var.f25642b = f11;
            d4Var.f25643c = f12;
            d4Var.f25644d = f13;
            Object objB = d4Var.b(this);
            if (objB != aVar) {
                objB = pg.f0.f21461a;
            }
            if (objB == aVar) {
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
