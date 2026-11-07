package e0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {507}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a1 extends vg.i implements eh.p<v.b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b bVar, int i10, tg.e eVar) {
        super(2, eVar);
        this.f8118b = bVar;
        this.f8119c = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a1(this.f8118b, this.f8119c, eVar);
    }

    @Override // eh.p
    public final Object invoke(v.b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((a1) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8117a;
        b bVar = this.f8118b;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f8117a = 1;
            Object objA = bVar.f8165w.a(this);
            if (objA != aVar) {
                objA = pg.f0.f21461a;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        double d10 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (-0.5d > d10 || d10 > 0.5d) {
            y.c.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        bVar.t(bVar.i(this.f8119c), CropImageView.DEFAULT_ASPECT_RATIO, true);
        return pg.f0.f21461a;
    }
}
