package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final class r2 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f33117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33118b;

    public r2(j6 j6Var, ProjectEntity projectEntity) {
        this.f33117a = j6Var;
        this.f33118b = projectEntity;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f33117a.L(this.f33118b.getId(), null);
        return pg.f0.f21461a;
    }
}
