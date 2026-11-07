package j9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesViewModel$useTemplateInternal$2", f = "TemplatesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a2 extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f15289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(File file, tg.e<? super a2> eVar) {
        super(2, eVar);
        this.f15289a = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a2(this.f15289a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
        return ((a2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return Boolean.valueOf(this.f15289a.delete());
    }
}
