package s;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {457}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g1 extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f23752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Object obj, z0 z0Var, y1 y1Var, tg.e eVar) {
        super(1, eVar);
        this.f23753b = z0Var;
        this.f23754c = obj;
        this.f23755d = y1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new g1(this.f23754c, this.f23753b, this.f23755d, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super pg.f0> eVar) {
        return ((g1) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23752a;
        y1<Object> y1Var = this.f23755d;
        if (i10 == 0) {
            pg.q.b(obj);
            o oVar = z0.f24046t;
            z0<Object> z0Var = this.f23753b;
            z0Var.i0();
            x0.x1 x1Var = z0Var.f24048b;
            z0Var.f24058m = Long.MIN_VALUE;
            z0Var.l0(CropImageView.DEFAULT_ASPECT_RATIO);
            Object value = z0Var.f24049c.getValue();
            Object obj2 = this.f23754c;
            float f10 = obj2.equals(value) ? -4.0f : obj2.equals(x1Var.getValue()) ? -5.0f : -3.0f;
            y1Var.p(obj2);
            y1Var.n(0L);
            x1Var.setValue(obj2);
            z0Var.l0(CropImageView.DEFAULT_ASPECT_RATIO);
            z0Var.Z(obj2);
            y1Var.j(f10);
            if (f10 == -3.0f) {
                this.f23752a = 1;
                if (z0.g0(z0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        y1Var.i();
        return pg.f0.f21461a;
    }
}
