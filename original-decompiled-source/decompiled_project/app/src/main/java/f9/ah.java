package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$removeProjectFile$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ah extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f8986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectFile f8987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(fg fgVar, ProjectFile projectFile, tg.e<? super ah> eVar) {
        super(2, eVar);
        this.f8986a = fgVar;
        this.f8987b = projectFile;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new ah(this.f8986a, this.f8987b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((ah) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        fg fgVar = this.f8986a;
        ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
        new File(new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content"), this.f8987b.getRelativePath()).delete();
        return pg.f0.f21461a;
    }
}
