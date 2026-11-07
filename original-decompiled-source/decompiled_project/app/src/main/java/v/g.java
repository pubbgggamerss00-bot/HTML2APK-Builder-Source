package v;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import v.o1;

@vg.e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements eh.p<ph.i0, tg.e<? super Float>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.d0 f29874a;

    /* renamed from: b, reason: collision with root package name */
    public s.n f29875b;

    /* renamed from: c, reason: collision with root package name */
    public int f29876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f29877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f29878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o1.a f29879f;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s.k<Float, s.o>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.d0 f29880a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o1.a f29881b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.d0 f29882c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.d0 d0Var, o1.a aVar, kotlin.jvm.internal.d0 d0Var2, h hVar) {
            super(1);
            this.f29880a = d0Var;
            this.f29881b = aVar;
            this.f29882c = d0Var2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final pg.f0 invoke(s.k<Float, s.o> kVar) {
            s.k<Float, s.o> kVar2 = kVar;
            float fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
            kotlin.jvm.internal.d0 d0Var = this.f29880a;
            float f10 = fFloatValue - d0Var.f16322a;
            float fE = this.f29881b.e(f10);
            d0Var.f16322a = ((Number) kVar2.f23791e.getValue()).floatValue();
            this.f29882c.f16322a = ((Number) kVar2.f23787a.b().invoke(kVar2.f23792f)).floatValue();
            if (Math.abs(f10 - fE) > 0.5f) {
                kVar2.a();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f10, h hVar, o1.a aVar, tg.e eVar) {
        super(2, eVar);
        this.f29877d = f10;
        this.f29878e = hVar;
        this.f29879f = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g(this.f29877d, this.f29878e, this.f29879f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Float> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        kotlin.jvm.internal.d0 d0Var;
        s.n nVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29876c;
        if (i10 == 0) {
            pg.q.b(obj);
            f10 = this.f29877d;
            if (Math.abs(f10) > 1.0f) {
                d0Var = new kotlin.jvm.internal.d0();
                d0Var.f16322a = f10;
                kotlin.jvm.internal.d0 d0Var2 = new kotlin.jvm.internal.d0();
                s.n nVarA = o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, f10, 28);
                try {
                    h hVar = this.f29878e;
                    s.y<Float> yVar = hVar.f29889a;
                    a aVar2 = new a(d0Var2, this.f29879f, d0Var, hVar);
                    this.f29874a = d0Var;
                    this.f29875b = nVarA;
                    this.f29876c = 1;
                    if (s.w1.d(nVarA, yVar, false, aVar2, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                    nVar = nVarA;
                    d0Var.f16322a = ((Number) nVar.c()).floatValue();
                    f10 = d0Var.f16322a;
                    return new Float(f10);
                }
                f10 = d0Var.f16322a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f29875b;
            d0Var = this.f29874a;
            try {
                pg.q.b(obj);
            } catch (CancellationException unused2) {
                d0Var.f16322a = ((Number) nVar.c()).floatValue();
                f10 = d0Var.f16322a;
                return new Float(f10);
            }
            f10 = d0Var.f16322a;
        }
        return new Float(f10);
    }
}
