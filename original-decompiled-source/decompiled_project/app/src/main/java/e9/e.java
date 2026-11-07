package e9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildOutputScreenKt$BuildOutputScreen$1$1", f = "BuildOutputScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f8421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j10, s0 s0Var, tg.e<? super e> eVar) {
        super(2, eVar);
        this.f8420a = j10;
        this.f8421b = s0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new e(this.f8420a, this.f8421b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        long j10 = this.f8420a;
        if (j10 != 0 && j10 > 0) {
            s0 s0Var = this.f8421b;
            ph.h.c(androidx.lifecycle.x0.a(s0Var), null, null, new u0(j10, s0Var, null), 3);
        }
        return pg.f0.f21461a;
    }
}
