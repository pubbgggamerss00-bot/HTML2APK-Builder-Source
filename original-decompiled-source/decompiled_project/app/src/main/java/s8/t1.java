package s8;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$7$1", f = "AppNavigation.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(p5.s0 s0Var, String str, tg.e<? super t1> eVar) {
        super(2, eVar);
        this.f24735b = s0Var;
        this.f24736c = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t1(this.f24735b, this.f24736c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24734a;
        if (i10 == 0) {
            pg.q.b(obj);
            p5.s0 s0Var = this.f24735b;
            p5.s sVarG = s0Var.f21304b.g();
            if (sVarG == null) {
                return pg.f0.f21461a;
            }
            String str = this.f24736c;
            if (str != null && !mh.x.A(str)) {
                s1 s1Var = new s1(0);
                this.f24734a = 1;
                if (b2.b(s0Var, sVarG, str, s1Var, this) == aVar) {
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
