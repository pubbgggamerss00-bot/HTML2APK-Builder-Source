package n8;

import com.basitce.htmltoapk.data.local.dao.ProjectDao;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ProjectDao f18583a;

    public s(ProjectDao projectDao) {
        this.f18583a = projectDao;
    }

    public final Object a(ProjectEntity projectEntity, vg.c cVar) {
        Object objDelete = this.f18583a.delete(projectEntity, cVar);
        return objDelete == ug.a.f29706a ? objDelete : pg.f0.f21461a;
    }

    public final sh.f<List<ProjectEntity>> b() {
        return this.f18583a.getAll();
    }

    public final Object c(ProjectEntity projectEntity, tg.e<? super pg.f0> eVar) {
        Object objUpdate = this.f18583a.update(projectEntity, eVar);
        return objUpdate == ug.a.f29706a ? objUpdate : pg.f0.f21461a;
    }
}
