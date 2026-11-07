package c;

import kotlin.jvm.internal.b0;
import pg.f0;
import ph.i0;

@vg.e(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public b0 f4313a;

    /* renamed from: b, reason: collision with root package name */
    public int f4314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<sh.f<b.c>, tg.e<? super f0>, Object> f4316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f4317e;

    @vg.e(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<sh.g<? super b.c>, Throwable, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f4318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, tg.e<? super a> eVar) {
            super(3, eVar);
            this.f4318a = b0Var;
        }

        @Override // eh.q
        public final Object b(sh.g<? super b.c> gVar, Throwable th2, tg.e<? super f0> eVar) {
            return new a(this.f4318a, eVar).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            this.f4318a.f16318a = true;
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, eh.p pVar, m mVar, tg.e eVar) {
        super(2, eVar);
        this.f4315c = nVar;
        this.f4316d = pVar;
        this.f4317e = mVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new l(this.f4315c, this.f4316d, this.f4317e, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((l) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f4314b;
        boolean z10 = true;
        if (i10 == 0) {
            pg.q.b(obj);
            if (this.f4315c.f3277a) {
                b0 b0Var2 = new b0();
                sh.m mVar = new sh.m(new sh.c(this.f4317e.f4320b, z10), new a(b0Var2, null));
                this.f4313a = b0Var2;
                this.f4314b = 1;
                if (this.f4316d.invoke(mVar, this) == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
            }
            return f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0Var = this.f4313a;
        pg.q.b(obj);
        if (!b0Var.f16318a) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return f0.f21461a;
    }
}
