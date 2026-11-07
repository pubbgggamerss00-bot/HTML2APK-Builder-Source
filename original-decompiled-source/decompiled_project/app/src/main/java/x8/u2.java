package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import s8.e2;

/* loaded from: classes.dex */
public final class u2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f33230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33231b;

    public u2(p5.x xVar, ProjectEntity projectEntity) {
        this.f33230a = xVar;
        this.f33231b = projectEntity;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        e2.c cVar = e2.c.f24633c;
        long id2 = this.f33231b.getId();
        cVar.getClass();
        p5.x.c("ai_session?prompt=&mode=chat&projectId=" + id2, this.f33230a);
        return pg.f0.f21461a;
    }
}
