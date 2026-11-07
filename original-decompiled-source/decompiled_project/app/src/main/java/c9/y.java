package c9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5324a;

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f5324a;
        ((Integer) obj).intValue();
        switch (i10) {
            case 0:
                b page = (b) obj2;
                kotlin.jvm.internal.r.e(page, "page");
                return Long.valueOf(page.f5057a);
            default:
                ProjectEntity project = (ProjectEntity) obj2;
                kotlin.jvm.internal.r.e(project, "project");
                return Long.valueOf(project.getId());
        }
    }
}
