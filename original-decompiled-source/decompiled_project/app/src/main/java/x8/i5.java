package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i5 implements qg.c0<ProjectEntity, String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable f32743a;

    public i5(List list) {
        this.f32743a = list;
    }

    @Override // qg.c0
    public final String a(ProjectEntity projectEntity) {
        return ProjectKind.INSTANCE.normalize(projectEntity.getKind());
    }

    @Override // qg.c0
    public final Iterator<ProjectEntity> b() {
        return this.f32743a.iterator();
    }
}
