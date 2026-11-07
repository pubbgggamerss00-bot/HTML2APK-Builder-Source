package t0;

@vg.e(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class zb extends vg.i implements eh.q<ph.i0, Float, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc f27601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(hc hcVar, tg.e<? super zb> eVar) {
        super(3, eVar);
        this.f27601a = hcVar;
    }

    @Override // eh.q
    public final Object b(ph.i0 i0Var, Float f10, tg.e<? super pg.f0> eVar) {
        f10.floatValue();
        return new zb(this.f27601a, eVar).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f27601a.f26026k.invoke();
        return pg.f0.f21461a;
    }
}
