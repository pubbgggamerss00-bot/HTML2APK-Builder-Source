package d0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f7252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.e0<Float> f7254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f7255d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s.b<Float, s.o>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1.d f7256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f7257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1.d dVar, p pVar) {
            super(1);
            this.f7256a = dVar;
            this.f7257b = pVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(s.b<Float, s.o> bVar) {
            this.f7256a.f(bVar.d().floatValue());
            this.f7257b.f7218c.invoke();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, s.e0<Float> e0Var, t1.d dVar, tg.e<? super q> eVar) {
        super(2, eVar);
        this.f7253b = pVar;
        this.f7254c = e0Var;
        this.f7255d = dVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q(this.f7253b, this.f7254c, this.f7255d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f7252a;
        p pVar = this.f7253b;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = pVar.f7231p;
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                s.e0<Float> e0Var = this.f7254c;
                a aVar2 = new a(this.f7255d, pVar);
                this.f7252a = 1;
                if (s.b.c(bVar, f10, e0Var, aVar2, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            pVar.f7226k.setValue(Boolean.TRUE);
            pVar.e(false);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            int i11 = p.f7215t;
            pVar.e(false);
            throw th2;
        }
    }
}
