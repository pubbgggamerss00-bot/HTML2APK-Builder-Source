package t0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", l = {1627}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class cc extends vg.i implements eh.p<c2.j0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25601a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hc f25603c;

    @vg.e(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<v.u0, p1.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ long f25604a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ hc f25605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hc hcVar, tg.e<? super a> eVar) {
            super(3, eVar);
            this.f25605b = hcVar;
        }

        @Override // eh.q
        public final Object b(v.u0 u0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
            long j10 = cVar.f21129a;
            a aVar = new a(this.f25605b, eVar);
            aVar.f25604a = j10;
            return aVar.invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            long j10 = this.f25604a;
            hc hcVar = this.f25605b;
            hcVar.f26028m.e((hcVar.f26022g ? hcVar.f26021f.g() - p1.c.d(j10) : p1.c.d(j10)) - hcVar.f26027l.getFloatValue());
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hc f25606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hc hcVar) {
            super(1);
            this.f25606a = hcVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(p1.c cVar) {
            long j10 = cVar.f21129a;
            hc hcVar = this.f25606a;
            hcVar.b(CropImageView.DEFAULT_ASPECT_RATIO);
            hcVar.f26026k.invoke();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(hc hcVar, tg.e<? super cc> eVar) {
        super(2, eVar);
        this.f25603c = hcVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        cc ccVar = new cc(this.f25603c, eVar);
        ccVar.f25602b = obj;
        return ccVar;
    }

    @Override // eh.p
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        return ((cc) create(j0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25601a;
        if (i10 == 0) {
            pg.q.b(obj);
            c2.j0 j0Var = (c2.j0) this.f25602b;
            hc hcVar = this.f25603c;
            a aVar2 = new a(hcVar, null);
            b bVar = new b(hcVar);
            this.f25601a = 1;
            if (v.t1.e(j0Var, aVar2, bVar, this, 3) == aVar) {
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
