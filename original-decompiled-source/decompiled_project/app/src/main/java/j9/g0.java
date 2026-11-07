package j9;

import q8.p2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesScreenKt$TemplateDetailScreen$3$1", f = "TemplatesScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f15403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f15404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x0.n1 n1Var, x1 x1Var, tg.e eVar) {
        super(2, eVar);
        this.f15403a = n1Var;
        this.f15404b = x1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g0(this.f15403a, this.f15404b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        String str = (String) this.f15403a.getValue();
        if (str != null) {
            this.f15404b.f15631n.setValue(null);
            p2.a(str, null, null);
        }
        return pg.f0.f21461a;
    }
}
