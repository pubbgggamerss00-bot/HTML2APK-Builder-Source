package x8;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$ProjectCard$1$1", f = "HomeScreen.kt", l = {1888, 1889}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k5 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f32874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(s.b bVar, tg.e eVar, boolean z10) {
        super(2, eVar);
        this.f32873b = z10;
        this.f32874c = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new k5(this.f32874c, eVar, this.f32873b);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k5) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32872a;
        if (i10 == 0) {
            pg.q.b(obj);
            if (this.f32873b) {
                Float f10 = new Float(1.0f);
                s.m2 m2VarD = s.m.d(150, 0, s.d0.f23703a, 2);
                this.f32872a = 1;
                obj = s.b.c(this.f32874c, f10, m2VarD, null, this, 12);
            } else {
                Float f11 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                s.l1 l1VarC = s.m.c(0.6f, 400.0f, null, 4);
                this.f32872a = 2;
                obj = s.b.c(this.f32874c, f11, l1VarC, null, this, 12);
            }
            return aVar;
        }
        if (i10 == 1) {
            pg.q.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
