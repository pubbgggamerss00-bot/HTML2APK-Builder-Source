package t0;

@vg.e(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", l = {1972}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ec extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hc f25815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.g f25816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(hc hcVar, androidx.compose.foundation.gestures.g gVar, tg.e eVar) {
        super(2, eVar);
        t.b1 b1Var = t.b1.f25167a;
        this.f25815b = hcVar;
        this.f25816c = gVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        t.b1 b1Var = t.b1.f25167a;
        return new ec(this.f25815b, this.f25816c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((ec) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        hc hcVar = this.f25815b;
        x0.x1 x1Var = hcVar.f26025j;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25814a;
        if (i10 == 0) {
            pg.q.b(obj);
            x1Var.setValue(Boolean.TRUE);
            t.d1 d1Var = hcVar.f26030o;
            fc fcVar = hcVar.f26029n;
            t.b1 b1Var = t.b1.f25168b;
            this.f25814a = 1;
            d1Var.getClass();
            if (ph.j0.c(new t.e1(b1Var, d1Var, this.f25816c, fcVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        x1Var.setValue(Boolean.FALSE);
        return pg.f0.f21461a;
    }
}
