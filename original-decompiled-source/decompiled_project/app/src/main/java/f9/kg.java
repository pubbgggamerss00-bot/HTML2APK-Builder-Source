package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$createPlaceholderProject$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class kg extends vg.i implements eh.p<ph.i0, tg.e<? super Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f9961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(fg fgVar, tg.e<? super kg> eVar) {
        super(2, eVar);
        this.f9961a = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new kg(this.f9961a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Object> eVar) {
        return ((kg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            return Boolean.valueOf(ah.l.f(new File(this.f9961a.f9562f.getFilesDir(), "projects/draft")));
        } catch (Exception unused) {
            return pg.f0.f21461a;
        }
    }
}
