package s8;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$8$1", f = "AppNavigation.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f24742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(p5.s0 s0Var, String str, eh.a<pg.f0> aVar, tg.e<? super u1> eVar) {
        super(2, eVar);
        this.f24740b = s0Var;
        this.f24741c = str;
        this.f24742d = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u1(this.f24740b, this.f24741c, this.f24742d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24739a;
        if (i10 == 0) {
            pg.q.b(obj);
            p5.s0 s0Var = this.f24740b;
            p5.s sVarG = s0Var.f21304b.g();
            if (sVarG == null) {
                return pg.f0.f21461a;
            }
            String str = this.f24741c;
            if (str != null && !mh.x.A(str)) {
                p5.z zVar = new p5.z(1);
                this.f24739a = 1;
                obj = b2.b(s0Var, sVarG, str, zVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        if (((Boolean) obj).booleanValue()) {
            this.f24742d.invoke();
        }
        return pg.f0.f21461a;
    }
}
