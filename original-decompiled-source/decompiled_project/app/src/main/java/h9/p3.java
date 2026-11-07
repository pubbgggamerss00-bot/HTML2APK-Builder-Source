package h9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsScreenKt$SettingsScreen$7$1$2$1$1$1", f = "SettingsScreen.kt", l = {358}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f12759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l9.b f12760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(b4 b4Var, l9.b bVar, tg.e<? super p3> eVar) {
        super(2, eVar);
        this.f12759b = b4Var;
        this.f12760c = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new p3(this.f12759b, this.f12760c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12758a;
        if (i10 == 0) {
            pg.q.b(obj);
            String str = this.f12760c.f16781a;
            this.f12758a = 1;
            if (this.f12759b.f(str, this) == aVar) {
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
