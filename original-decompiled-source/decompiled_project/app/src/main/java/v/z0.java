package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z0 extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f30147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(kotlin.jvm.internal.d0 d0Var, float f10, tg.e<? super z0> eVar) {
        super(2, eVar);
        this.f30147b = d0Var;
        this.f30148c = f10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z0 z0Var = new z0(this.f30147b, this.f30148c, eVar);
        z0Var.f30146a = obj;
        return z0Var;
    }

    @Override // eh.p
    public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((z0) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f30147b.f16322a = ((b1) this.f30146a).e(this.f30148c);
        return pg.f0.f21461a;
    }
}
