package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import java.io.File;
import java.io.IOException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$updateProjectFileContent$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f10081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectFile f10082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(fg fgVar, ProjectFile projectFile, String str, tg.e<? super mh> eVar) {
        super(2, eVar);
        this.f10081a = fgVar;
        this.f10082b = projectFile;
        this.f10083c = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new mh(this.f10081a, this.f10082b, this.f10083c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((mh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        fg fgVar = this.f10081a;
        ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
        File file = new File(new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content"), this.f10082b.getRelativePath());
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        ah.l.r(file, this.f10083c, mh.a.f18238b);
        return pg.f0.f21461a;
    }
}
