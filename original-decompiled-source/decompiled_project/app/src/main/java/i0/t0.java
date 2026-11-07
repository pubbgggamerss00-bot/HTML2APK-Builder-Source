package i0;

@vg.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f13588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f13589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.e0 f13590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.o f13592f;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f13593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.n1 n1Var) {
            super(0);
            this.f13593a = n1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.a
        public final Boolean invoke() {
            Boolean bool = (Boolean) this.f13593a.getValue();
            bool.booleanValue();
            return bool;
        }
    }

    public static final class b<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i2 f13594a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y2.e0 f13595b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0.x2 f13596c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y2.o f13597d;

        public b(i2 i2Var, y2.e0 e0Var, m0.x2 x2Var, y2.o oVar) {
            this.f13594a = i2Var;
            this.f13595b = e0Var;
            this.f13596c = x2Var;
            this.f13597d = oVar;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            i2 i2Var = this.f13594a;
            if (zBooleanValue && i2Var.b()) {
                m0.x2 x2Var = this.f13596c;
                q1.f(this.f13595b, i2Var, x2Var.k(), this.f13597d, x2Var.f17548b);
            } else {
                q1.e(i2Var);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(i2 i2Var, x0.n1 n1Var, y2.e0 e0Var, m0.x2 x2Var, y2.o oVar, tg.e eVar) {
        super(2, eVar);
        this.f13588b = i2Var;
        this.f13589c = n1Var;
        this.f13590d = e0Var;
        this.f13591e = x2Var;
        this.f13592f = oVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t0(this.f13588b, this.f13589c, this.f13590d, this.f13591e, this.f13592f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f13587a;
        i2 i2Var = this.f13588b;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                sh.m0 m0VarL = bg.b.l(new a(this.f13589c));
                b bVar = new b(i2Var, this.f13590d, this.f13591e, this.f13592f);
                this.f13587a = 1;
                if (m0VarL.b(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            q1.e(i2Var);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            q1.e(i2Var);
            throw th2;
        }
    }
}
