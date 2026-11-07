package x8;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$openFolder$1", f = "HomeScreen.kt", l = {276, 277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h5 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f32716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f32717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(s.b bVar, tg.e eVar, boolean z10) {
        super(2, eVar);
        this.f32716b = bVar;
        this.f32717c = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h5(this.f32716b, eVar, this.f32717c);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h5) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (s.b.c(r10.f32716b, r5, r6, null, r10, 12) == r0) goto L19;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32715a;
        if (i10 == 0) {
            pg.q.b(obj);
            Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
            this.f32715a = 1;
            if (this.f32716b.f(f10, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        Float f11 = new Float(1.0f);
        s.m2 m2VarD = s.m.d(this.f32717c ? 150 : 420, 0, s.d0.f23703a, 2);
        this.f32715a = 2;
    }
}
