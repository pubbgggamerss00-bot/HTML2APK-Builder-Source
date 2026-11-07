package t0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class rc extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f26901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.m2 f26903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(s.b bVar, boolean z10, s.m2 m2Var, eh.a aVar, tg.e eVar) {
        super(2, eVar);
        this.f26901b = bVar;
        this.f26902c = z10;
        this.f26903d = m2Var;
        this.f26904e = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new rc(this.f26901b, this.f26902c, this.f26903d, this.f26904e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((rc) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        rc rcVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26900a;
        if (i10 == 0) {
            pg.q.b(obj);
            Float f10 = new Float(this.f26902c ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
            this.f26900a = 1;
            rcVar = this;
            if (s.b.c(this.f26901b, f10, this.f26903d, null, rcVar, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            rcVar = this;
        }
        rcVar.f26904e.invoke();
        return pg.f0.f21461a;
    }
}
