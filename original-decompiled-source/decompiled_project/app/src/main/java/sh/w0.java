package sh;

@vg.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w0 extends vg.i implements eh.p<s0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25118a;

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w0 w0Var = new w0(2, eVar);
        w0Var.f25118a = obj;
        return w0Var;
    }

    @Override // eh.p
    public final Object invoke(s0 s0Var, tg.e<? super Boolean> eVar) {
        return ((w0) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return Boolean.valueOf(((s0) this.f25118a) != s0.f25088a);
    }
}
