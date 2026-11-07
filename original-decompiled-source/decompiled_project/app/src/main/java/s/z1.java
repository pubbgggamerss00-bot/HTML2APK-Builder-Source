package s;

import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public float f24072a;

    /* renamed from: b, reason: collision with root package name */
    public int f24073b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f24075d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f24076a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f24077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y1<Object> y1Var, float f10) {
            super(1);
            this.f24076a = y1Var;
            this.f24077b = f10;
        }

        @Override // eh.l
        public final pg.f0 invoke(Long l10) {
            long jLongValue = l10.longValue();
            y1<Object> y1Var = this.f24076a;
            boolean zG = y1Var.g();
            x0.w1 w1Var = y1Var.f24007g;
            if (!zG) {
                if (w1Var.b() == Long.MIN_VALUE) {
                    w1Var.h(jLongValue);
                    ((x0.x1) y1Var.f24001a.f4646a).setValue(Boolean.TRUE);
                }
                long jB = jLongValue - w1Var.b();
                float f10 = this.f24077b;
                if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    jB = gh.a.c(jB / f10);
                }
                y1Var.n(jB);
                y1Var.h(jB, f10 == CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(y1<Object> y1Var, tg.e<? super z1> eVar) {
        super(2, eVar);
        this.f24075d = y1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z1 z1Var = new z1(this.f24075d, eVar);
        z1Var.f24074c = obj;
        return z1Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        float fH;
        ph.i0 i0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24073b;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var2 = (ph.i0) this.f24074c;
            fH = w1.h(i0Var2.getCoroutineContext());
            i0Var = i0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fH = this.f24072a;
            i0Var = (ph.i0) this.f24074c;
            pg.q.b(obj);
        }
        while (ph.j0.d(i0Var)) {
            a aVar2 = new a(this.f24075d, fH);
            this.f24074c = i0Var;
            this.f24072a = fH;
            this.f24073b = 1;
            if (x0.f1.a(getContext()).f0(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return pg.f0.f21461a;
    }
}
