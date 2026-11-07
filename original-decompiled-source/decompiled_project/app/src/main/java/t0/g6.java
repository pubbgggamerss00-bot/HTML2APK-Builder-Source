package t0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f25928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(s.b<Float, s.o> bVar, tg.e<? super g6> eVar) {
        super(2, eVar);
        this.f25928b = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g6(this.f25928b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25927a;
        if (i10 == 0) {
            pg.q.b(obj);
            Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
            this.f25927a = 1;
            if (s.b.c(this.f25928b, f10, null, null, this, 14) == aVar) {
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
