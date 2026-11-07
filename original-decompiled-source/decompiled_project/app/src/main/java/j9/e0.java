package j9;

import android.content.Context;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesScreenKt$TemplateDetailScreen$1$1", f = "TemplatesScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f15355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x1 x1Var, Context context, tg.e<? super e0> eVar) {
        super(2, eVar);
        this.f15355a = x1Var;
        this.f15356b = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new e0(this.f15355a, this.f15356b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((e0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        this.f15355a.j(this.f15356b);
        return pg.f0.f21461a;
    }
}
