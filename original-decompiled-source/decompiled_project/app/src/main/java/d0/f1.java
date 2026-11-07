package d0;

import com.yalantis.ucrop.view.CropImageView;
import h1.h;
import org.bouncycastle.asn1.eac.EACTags;
import s.o2;
import s.p2;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public s.n<Float, s.o> f7122a;

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {68}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7123a;

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return f1.this.new a(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7123a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.n<Float, s.o> nVar = f1.this.f7122a;
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                s.l1 l1VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new Float(0.5f), 1);
                this.f7123a = 1;
                if (s.w1.f(nVar, f10, l1VarC, true, null, this, 8) == aVar) {
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

    @vg.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7125a;

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return f1.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f7125a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.n<Float, s.o> nVar = f1.this.f7122a;
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                s.l1 l1VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new Float(0.5f), 1);
                this.f7125a = 1;
                if (s.w1.f(nVar, f10, l1VarC, true, null, this, 8) == aVar) {
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

    public f1() {
        o2 o2Var = p2.f23868a;
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f7122a = new s.n<>(o2Var, fValueOf, (s.s) o2Var.f23857a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f10, f3.d dVar, ph.i0 i0Var) {
        if (f10 <= dVar.N0(g1.f7134a)) {
            return;
        }
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            float fFloatValue = ((Number) this.f7122a.f23843b.getValue()).floatValue();
            s.n<Float, s.o> nVar = this.f7122a;
            if (nVar.f23847f) {
                this.f7122a = o1.j.c(nVar, fFloatValue - f10, CropImageView.DEFAULT_ASPECT_RATIO, 30);
                ph.h.c(i0Var, null, null, new a(null), 3);
            } else {
                this.f7122a = new s.n<>(p2.f23868a, Float.valueOf(-f10), null, 60);
                ph.h.c(i0Var, null, null, new b(null), 3);
            }
            h.a.d(hVarA, hVarB, lVarE);
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }
}
