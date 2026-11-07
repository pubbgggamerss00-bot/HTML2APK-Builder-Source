package v;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e1 extends vg.i implements eh.p<s0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29819a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f29821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f29823e;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<Float, Float, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.d0 f29824a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f29825b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s0 f29826c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.d0 d0Var, s1 s1Var, s0 s0Var) {
            super(2);
            this.f29824a = d0Var;
            this.f29825b = s1Var;
            this.f29826c = s0Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(Float f10, Float f11) {
            float fFloatValue = f10.floatValue();
            f11.floatValue();
            kotlin.jvm.internal.d0 d0Var = this.f29824a;
            float f12 = fFloatValue - d0Var.f16322a;
            s1 s1Var = this.f29825b;
            d0Var.f16322a += s1Var.d(s1Var.g(this.f29826c.a(s1Var.h(s1Var.d(f12)))));
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var, long j10, kotlin.jvm.internal.d0 d0Var, tg.e<? super e1> eVar) {
        super(2, eVar);
        this.f29821c = s1Var;
        this.f29822d = j10;
        this.f29823e = d0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e1 e1Var = new e1(this.f29821c, this.f29822d, this.f29823e, eVar);
        e1Var.f29820b = obj;
        return e1Var;
    }

    @Override // eh.p
    public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
        return ((e1) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29819a;
        if (i10 == 0) {
            pg.q.b(obj);
            s0 s0Var = (s0) this.f29820b;
            long j10 = this.f29822d;
            s1 s1Var = this.f29821c;
            float fG = s1Var.g(j10);
            a aVar2 = new a(this.f29823e, s1Var, s0Var);
            this.f29819a = 1;
            if (s.w1.c(CropImageView.DEFAULT_ASPECT_RATIO, fG, null, aVar2, this, 12) == aVar) {
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
