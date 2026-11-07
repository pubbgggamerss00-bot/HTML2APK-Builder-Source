package v;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o1 extends vg.i implements eh.p<s0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public s1 f30013a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f30014b;

    /* renamed from: c, reason: collision with root package name */
    public long f30015c;

    /* renamed from: d, reason: collision with root package name */
    public int f30016d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f30018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f30019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f30020h;

    public static final class a implements b1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f30021a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f30022b;

        public a(s0 s0Var, s1 s1Var) {
            this.f30021a = s1Var;
            this.f30022b = s0Var;
        }

        @Override // v.b1
        public final float e(float f10) {
            float fAbs = Math.abs(f10);
            s1 s1Var = this.f30021a;
            if (fAbs != CropImageView.DEFAULT_ASPECT_RATIO && ((f10 > CropImageView.DEFAULT_ASPECT_RATIO && !s1Var.f30067a.d()) || ((f10 < CropImageView.DEFAULT_ASPECT_RATIO && !s1Var.f30067a.b()) || !((Boolean) s1Var.f30073g.invoke()).booleanValue()))) {
                throw new a0("The fling animation was cancelled");
            }
            return s1Var.d(s1Var.g(this.f30022b.b(2, s1Var.e(s1Var.h(f10)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, kotlin.jvm.internal.f0 f0Var, long j10, tg.e<? super o1> eVar) {
        super(2, eVar);
        this.f30018f = s1Var;
        this.f30019g = f0Var;
        this.f30020h = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o1 o1Var = new o1(this.f30018f, this.f30019g, this.f30020h, eVar);
        o1Var.f30017e = obj;
        return o1Var;
    }

    @Override // eh.p
    public final Object invoke(s0 s0Var, tg.e<? super pg.f0> eVar) {
        return ((o1) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        s1 s1Var;
        kotlin.jvm.internal.f0 f0Var;
        long j10;
        s1 s1Var2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30016d;
        if (i10 == 0) {
            pg.q.b(obj);
            s0 s0Var = (s0) this.f30017e;
            s1Var = this.f30018f;
            a aVar2 = new a(s0Var, s1Var);
            z zVar = s1Var.f30069c;
            f0Var = this.f30019g;
            long j11 = f0Var.f16326a;
            t0 t0Var = s1Var.f30070d;
            t0 t0Var2 = t0.f30084b;
            long j12 = this.f30020h;
            float fD = s1Var.d(t0Var == t0Var2 ? f3.w.b(j12) : f3.w.c(j12));
            this.f30017e = s1Var;
            this.f30013a = s1Var;
            this.f30014b = f0Var;
            this.f30015c = j11;
            this.f30016d = 1;
            obj = zVar.a(aVar2, fD, this);
            if (obj == aVar) {
                return aVar;
            }
            j10 = j11;
            s1Var2 = s1Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f30015c;
            f0Var = this.f30014b;
            s1Var = this.f30013a;
            s1Var2 = (s1) this.f30017e;
            pg.q.b(obj);
        }
        float fD2 = s1Var2.d(((Number) obj).floatValue());
        f0Var.f16326a = s1Var.f30070d == t0.f30084b ? f3.w.a(fD2, CropImageView.DEFAULT_ASPECT_RATIO, 2, j10) : f3.w.a(CropImageView.DEFAULT_ASPECT_RATIO, fD2, 1, j10);
        return pg.f0.f21461a;
    }
}
