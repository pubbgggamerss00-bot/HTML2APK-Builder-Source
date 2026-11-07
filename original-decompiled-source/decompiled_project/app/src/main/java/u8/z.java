package u8;

import com.yalantis.ucrop.view.CropImageView;
import s.m2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$CatGameScreen$2$1", f = "CatGameScreen.kt", l = {203, 207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29627a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f29629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f29630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f29631e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$CatGameScreen$2$1$1", f = "CatGameScreen.kt", l = {198}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29632a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f29633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.b<Float, s.o> bVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f29633b = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f29633b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29632a;
            if (i10 == 0) {
                pg.q.b(obj);
                Float f10 = new Float(180.0f);
                m2 m2VarD = s.m.d(700, 0, s.d0.f23703a, 2);
                this.f29632a = 1;
                if (s.b.c(this.f29633b, f10, m2VarD, null, this, 12) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s.b<Float, s.o> bVar, s.b<Float, s.o> bVar2, s.b<Float, s.o> bVar3, tg.e<? super z> eVar) {
        super(2, eVar);
        this.f29629c = bVar;
        this.f29630d = bVar2;
        this.f29631e = bVar3;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z zVar = new z(this.f29629c, this.f29630d, this.f29631e, eVar);
        zVar.f29628b = obj;
        return zVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (s.b.c(r9.f29630d, r6, r7, null, r9, 12) == r0) goto L15;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z zVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29627a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.h.c((ph.i0) this.f29628b, null, null, new a(this.f29631e, null), 3);
            Float f10 = new Float(36.0f);
            m2 m2VarD = s.m.d(700, 0, s.d0.f23703a, 2);
            this.f29627a = 1;
            Object objC = s.b.c(this.f29629c, f10, m2VarD, null, this, 12);
            zVar = this;
            if (objC != aVar) {
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
        zVar = this;
        Float f11 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
        m2 m2VarD2 = s.m.d(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 0, s.d0.f23706d, 2);
        zVar.f29627a = 2;
    }
}
