package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$saveProject$cachedSplashPath$3$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ih extends vg.i implements eh.p<ph.i0, tg.e<? super Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f9830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(long j10, fg fgVar, tg.e eVar) {
        super(2, eVar);
        this.f9830a = fgVar;
        this.f9831b = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new ih(this.f9831b, this.f9830a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Object> eVar) {
        return ((ih) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            return Boolean.valueOf(ah.l.f(new File(this.f9830a.w(this.f9831b), "splash")));
        } catch (Exception unused) {
            return pg.f0.f21461a;
        }
    }
}
