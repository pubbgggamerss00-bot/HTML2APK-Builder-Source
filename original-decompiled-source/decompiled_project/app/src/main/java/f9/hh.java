package f9;

import java.io.File;
import java.io.IOException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$saveProject$cachedSourcePath$4", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class hh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f9776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f9777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(fg fgVar, File file, tg.e eVar) {
        super(2, eVar);
        this.f9776a = file;
        this.f9777b = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new hh(this.f9777b, this.f9776a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((hh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ah.l.r(this.f9776a, (String) this.f9777b.B.getValue(), mh.a.f18238b);
        return pg.f0.f21461a;
    }
}
