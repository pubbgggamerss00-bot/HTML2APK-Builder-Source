package u0;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.r<m, c0<Object>, Object, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29074a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ m f29075b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ c0 f29076c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f29079f;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<Float, Float, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f29080a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.d0 f29081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, kotlin.jvm.internal.d0 d0Var) {
            super(2);
            this.f29080a = mVar;
            this.f29081b = d0Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(Float f10, Float f11) {
            float fFloatValue = f10.floatValue();
            this.f29080a.a(fFloatValue, f11.floatValue());
            this.f29081b.f16322a = fFloatValue;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a0<Object> a0Var, float f10, tg.e<? super n> eVar) {
        super(4, eVar);
        this.f29078e = a0Var;
        this.f29079f = f10;
    }

    @Override // eh.r
    public final Object f(m mVar, c0<Object> c0Var, Object obj, tg.e<? super pg.f0> eVar) {
        n nVar = new n(this.f29078e, this.f29079f, eVar);
        nVar.f29075b = mVar;
        nVar.f29076c = c0Var;
        nVar.f29077d = obj;
        return nVar.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29074a;
        if (i10 == 0) {
            pg.q.b(obj);
            m mVar = this.f29075b;
            float fD = this.f29076c.d(this.f29077d);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0();
                a0<Object> a0Var = this.f29078e;
                float floatValue = Float.isNaN(a0Var.f28950j.getFloatValue()) ? CropImageView.DEFAULT_ASPECT_RATIO : a0Var.f28950j.getFloatValue();
                d0Var.f16322a = floatValue;
                s.l<Float> lVar = a0Var.f28943c;
                a aVar2 = new a(mVar, d0Var);
                this.f29075b = null;
                this.f29076c = null;
                this.f29074a = 1;
                if (s.w1.a(floatValue, fD, this.f29079f, lVar, aVar2, this) == aVar) {
                    return aVar;
                }
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
