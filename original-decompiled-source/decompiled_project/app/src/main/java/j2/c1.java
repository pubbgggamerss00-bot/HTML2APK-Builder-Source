package j2;

@vg.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c1 extends vg.i implements eh.p<b3, tg.e<?>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14673a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f14675c;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b3 f14676a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f14677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b3 b3Var, d1 d1Var) {
            super(1);
            this.f14676a = b3Var;
            this.f14677b = d1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            b3 b3Var = this.f14676a;
            synchronized (b3Var.f14663c) {
                try {
                    b3Var.f14665e = true;
                    z0.b<i2.s2<y2.s>> bVar = b3Var.f14664d;
                    i2.s2<y2.s>[] s2VarArr = bVar.f34700a;
                    int i10 = bVar.f34702c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        y2.s sVar = s2VarArr[i11].get();
                        if (sVar != null) {
                            sVar.a();
                        }
                    }
                    b3Var.f14664d.g();
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            y2.e0 e0Var = this.f14677b.f14695b;
            e0Var.f33705b.set(null);
            e0Var.f33704a.c();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, tg.e<? super c1> eVar) {
        super(2, eVar);
        this.f14675c = d1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c1 c1Var = new c1(this.f14675c, eVar);
        c1Var.f14674b = obj;
        return c1Var;
    }

    @Override // eh.p
    public final Object invoke(b3 b3Var, tg.e<?> eVar) {
        ((c1) create(b3Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14673a;
        if (i10 == 0) {
            pg.q.b(obj);
            b3 b3Var = (b3) this.f14674b;
            this.f14674b = b3Var;
            this.f14673a = 1;
            ph.m mVar = new ph.m(1, ah.p.c(this));
            mVar.p();
            d1 d1Var = this.f14675c;
            y2.e0 e0Var = d1Var.f14695b;
            y2.x xVar = e0Var.f33704a;
            xVar.a();
            e0Var.f33705b.set(new y2.n0(e0Var, xVar));
            mVar.s(new a(b3Var, d1Var));
            if (mVar.o() == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new pg.g();
    }
}
